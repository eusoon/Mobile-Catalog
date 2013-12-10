/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package ong.eu.soon.rest.sec.web.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;


import ong.eu.soon.entities.settings.LocalSettings;
import ong.eu.soon.ifx.acct.AcctInqRq;
import ong.eu.soon.ifx.acct.AcctInqRs;
import ong.eu.soon.ifx.acct.AcctTrnInqRq;
import ong.eu.soon.ifx.acct.AcctTrnInqRs;
import ong.eu.soon.ifx.element.*;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;
import ong.eu.soon.utils.Amount;
import ong.eu.soon.utils.Amount.Type;
import ong.eu.soon.webservices.accounts.AccountHistoryResultPage;
import ong.eu.soon.webservices.accounts.ScheduledPaymentsResultPage;
import ong.eu.soon.webservices.model.AccountHistoryTransferVO;
import ong.eu.soon.webservices.model.AccountStatusVO;
import ong.eu.soon.webservices.model.AccountTypeVO;
import ong.eu.soon.webservices.model.CurrencyVO;
import ong.eu.soon.webservices.model.MemberAccountVO;
import ong.eu.soon.webservices.model.MemberAccountWithStatusVO;
import ong.eu.soon.webservices.model.MemberVO;
import ong.eu.soon.webservices.model.PaymentFilterVO;
import ong.eu.soon.webservices.model.PaymentStatusVO;
import ong.eu.soon.webservices.model.ScheduledPaymentVO;
import ong.eu.soon.webservices.model.SearchParameters;
import ong.eu.soon.webservices.model.TransferDataVO;
import ong.eu.soon.webservices.model.TransferTypeVO;
import ong.eu.soon.webservices.payments.AccountHistoryParams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller which handles /accounts paths
 * 
 * @author luis
 */
@Controller
@RequestMapping(value = UriMappingConstants.ACCOUNTS)
public class AccountsRestController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * Parameters for searching scheduled payments
	 * 
	 * @author luis
	 */
	public static class SearchScheduledPaymentParams extends SearchParameters {
		private static final long serialVersionUID = 1L;
		private String memberPrincipal;
		private java.lang.Long memberId;
		private Calendar beginDate;
		private Calendar endDate;
		private java.lang.Boolean incoming = false;
		private SearchScheduledPaymentStatus status;

		public Calendar getBeginDate() {
			return beginDate;
		}

		public Calendar getEndDate() {
			return endDate;
		}

		public boolean getIncoming() {
			return incoming;
		}

		public java.lang.Long getMemberId() {
			return memberId;
		}

		public String getMemberPrincipal() {
			return memberPrincipal;
		}

		public SearchScheduledPaymentStatus getStatus() {
			return status;
		}

		public void setBeginDate(final Calendar beginDate1) {
			beginDate = beginDate1;
		}

		public void setEndDate(final Calendar endDate1) {
			endDate = endDate1;
		}

		public void setIncoming(final boolean incoming1) {
			incoming = incoming1;
		}

		public void setMemberId(final java.lang.Long memberId1) {
			memberId = memberId1;
		}

		public void setMemberPrincipal(final String memberPrincipal1) {
			memberPrincipal = memberPrincipal1;
		}

		public void setStatus(final SearchScheduledPaymentStatus status1) {
			status = status1;
		}
	}

	public static enum SearchScheduledPaymentStatus {
		OPEN, CLOSED_WITHOUT_ERRORS, CLOSED_WITH_ERRORS;
	}

	/**
	 * Loads data for an account by id. The account must belong to the
	 * authenticated user.
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public MemberAccountVO loadAccount(@PathVariable final java.lang.Long id) {

		AcctInqRq accInqRq = new AcctInqRq();
		accInqRq.setRqUID(getRqUID());
		accInqRq.setMsgRqHdr(getMsgRqHdr());

		AcctSel[] acctSel = new AcctSel[1];
		AcctKeys acctKeys = new AcctKeys();
		AcctId acctId = new AcctId();
		acctId.setString(java.lang.Long.toString(id));
		acctKeys.setAcctId(acctId);
		acctSel[0].setAcctKeys(acctKeys);
		accInqRq.setAcctSel(acctSel);

		AcctInqRs acctInqRs = accInquiry(accInqRq, id);

		MemberAccountVO memberAccountVO1 = new MemberAccountVO();
		AcctRec[] acctRecs = acctInqRs.getAcctRec();
		for (AcctRec acctRec : acctRecs) {
			memberAccountVO1.setId(java.lang.Long.valueOf(acctRec.getAcctId()
					.getString()));
			String accountNo = acctRec.getAcctInfo().getAcctIdent()[0]
					.getAcctIdentValue().getString();
			memberAccountVO1.setAccountNo(accountNo);

			if (memberAccountVO1.getAccountNo().equalsIgnoreCase("4549681213"))
				memberAccountVO1.setDefault(true);

			AccountTypeVO type1 = new AccountTypeVO();

			String accountName = acctRec.getAcctInfo().getAcctType()
					.getAcctTypeValue().name();

			type1.setName(accountName);
			CurrencyVO currency1 = new CurrencyVO();
			currency1.setId(new java.lang.Long(1));
			String currencySymbol = acctRec.getAcctInfo().getCurCode()
					.getCurCodeValue().name();
			currency1.setSymbol(currencySymbol);
			type1.setCurrency(currency1);
			type1.setId(java.lang.Long.valueOf(1));
			memberAccountVO1.setType(type1);

		}

		return memberAccountVO1;
	}

	/**
	 * Returns the authenticated user's accounts
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<MemberAccountVO> listAccounts() {

		AcctType[] acctTypes = new AcctType[2];
		acctTypes[0].setAcctTypeValue(AcctTypeValue.SDA);
		acctTypes[1].setAcctTypeValue(AcctTypeValue.CCA);
		AcctInqRs acctInqRs = acctInqByAccountType(acctTypes);

		List<MemberAccountVO> accounts = new ArrayList<MemberAccountVO>();

		AcctRec[] acctRecs = acctInqRs.getAcctRec();
		int i = 0;
		for (AcctRec acctRec : acctRecs) {
			MemberAccountVO memberAccountVO1 = new MemberAccountVO();
			memberAccountVO1.setId(new java.lang.Long(i++));
			if (memberAccountVO1.getAccountNo().equalsIgnoreCase("4549681213"))
				memberAccountVO1.setDefault(true);
			else
				memberAccountVO1.setDefault(false);
			String accountNo = acctRec.getAcctId().getString();
			memberAccountVO1.setAccountNo(accountNo);
			AccountTypeVO type1 = new AccountTypeVO();

			String accountName = acctRec.getAcctInfo().getAcctType()
					.getAcctTypeValue().name();

			type1.setName(accountName);
			CurrencyVO currency1 = new CurrencyVO();
			currency1.setId(new java.lang.Long(1));
			String currencySymbol = acctRec.getAcctInfo().getCurCode()
					.getCurCodeValue().name();
			currency1.setSymbol(currencySymbol);
			type1.setCurrency(currency1);
			type1.setId(java.lang.Long.valueOf(1));
			memberAccountVO1.setType(type1);
			accounts.add(memberAccountVO1);

		}
		return accounts;
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	@ResponseBody
	public List<MemberAccountWithStatusVO> getAccountsInfo() {
		LocalSettings localSettings = new LocalSettings();

		AcctType[] acctTypes = new AcctType[2];
		acctTypes[0].setAcctTypeValue(AcctTypeValue.SDA);
		acctTypes[1].setAcctTypeValue(AcctTypeValue.CCA);
		AcctInqRs acctInqRs = acctInqByAccountType(acctTypes);

		List<MemberAccountWithStatusVO> accounts = new ArrayList<MemberAccountWithStatusVO>();

		AcctRec[] acctRecs = acctInqRs.getAcctRec();
		int i = 0;
		for (AcctRec acctRec : acctRecs) {
			MemberAccountVO memberAccountVO1 = new MemberAccountVO();
			memberAccountVO1.setId(java.lang.Long.valueOf(acctRec.getAcctId()
					.getString()));
			memberAccountVO1
			.setAccountNo(acctRec.getAcctInfo().getAcctIdent()[0]
					.getAcctIdentValue().getString());
			if (memberAccountVO1.getAccountNo().equalsIgnoreCase("4549681213"))
				memberAccountVO1.setDefault(true);
			else
				memberAccountVO1.setDefault(false);
			String accountNo = acctRec.getAcctId().getString();
			memberAccountVO1.setAccountNo(accountNo);
			AccountTypeVO type1 = new AccountTypeVO();

			String accountName = acctRec.getAcctInfo().getAcctType()
					.getAcctTypeValue().name();

			type1.setName(accountName);
			CurrencyVO currency1 = new CurrencyVO();
			currency1.setId(new java.lang.Long(1));
			String currencySymbol = acctRec.getAcctInfo().getCurCode()
					.getCurCodeValue().name();
			currency1.setSymbol(currencySymbol);
			type1.setCurrency(currency1);
			type1.setId(java.lang.Long.valueOf(1));
			memberAccountVO1.setType(type1);

			AccountStatusVO accountStatusVO1 = new AccountStatusVO();
			AcctBal[] acctBalList = acctRec.getAcctInfo().getAcctBal();
			for (AcctBal acctBal : acctBalList) {
				if (acctBal.getBalType().getBalTypeValues()
						.equals(BalTypeValues.Avail)) {
					String availBalance = acctBal.getCurAmt().getAmt()
							.getString();
					BigDecimal availableBalance = new BigDecimal(availBalance);
					accountStatusVO1.setAvailableBalance(availableBalance);

					Amount amount = new Amount();
					amount.setValue(availableBalance);
					amount.setType(Type.FIXED);

					String value = localSettings.getAmountConverter().toString(
							amount);
					accountStatusVO1.setFormattedAvailableBalance(value);

				} else if (acctBal.getBalType().getBalTypeValues()
						.equals(BalTypeValues.Current)) {
					String currentBalance = acctBal.getCurAmt().getAmt()
							.getString();
					BigDecimal balance = new BigDecimal(currentBalance);
					accountStatusVO1.setBalance(balance);
					Amount amount = new Amount();
					amount.setValue(balance);
					amount.setType(Type.FIXED);

					String value = localSettings.getAmountConverter().toString(
							amount);
					accountStatusVO1.setFormattedBalance(value);
				} else if (acctBal.getBalType().getBalTypeValues()
						.equals(BalTypeValues.Outstanding)) {
					String outstandingBalance = acctBal.getCurAmt().getAmt()
							.getString();
					BigDecimal balance = new BigDecimal(outstandingBalance);
					accountStatusVO1.setBalance(balance);
					Amount amount = new Amount();
					amount.setValue(balance);
					amount.setType(Type.FIXED);

					String value = localSettings.getAmountConverter().toString(
							amount);
					accountStatusVO1.setFormattedBalance(value);
				} else if (acctBal.getBalType().getBalTypeValues()
						.equals(BalTypeValues.CreditLimit)) {
					String creditLimit = acctBal.getCurAmt().getAmt()
							.getString();
					BigDecimal balance = new BigDecimal(creditLimit);
					accountStatusVO1.setBalance(balance);
					Amount amount = new Amount();
					amount.setValue(balance);
					amount.setType(Type.FIXED);

					String value = localSettings.getAmountConverter().toString(
							amount);
					accountStatusVO1.setFormattedCreditLimit(value);
				}
				MemberAccountWithStatusVO memberAccountWithStatusVO1 = new MemberAccountWithStatusVO(
						memberAccountVO1, accountStatusVO1);
				accounts.add(memberAccountWithStatusVO1);
			}
		}
		return accounts;
	}

	/**
	 * Loads data for an account by id. The account must belong to the
	 * authenticated user.
	 */
	@RequestMapping(value = "default", method = RequestMethod.GET)
	@ResponseBody
	public MemberAccountVO loadDefaultAccount() {
		return loadAccount(getDefaultAccountId());
	}

	/**
	 * Returns the account status for the given account.
	 */
	@RequestMapping(value = "{id}/status", method = RequestMethod.GET)
	@ResponseBody
	public AccountStatusVO getStatus(@PathVariable final java.lang.Long id) {
		AcctInqRq acctInqRq = new AcctInqRq();
		acctInqRq.setRqUID(getRqUID());
		acctInqRq.setMsgRqHdr(getMsgRqHdr());

		AcctSel[] acctSel = new AcctSel[1];
		AcctKeys acctKeys = new AcctKeys();
		AcctId acctId = new AcctId();
		acctId.setString(java.lang.Long.toString(id));
		acctKeys.setAcctId(acctId);
		acctSel[0].setAcctKeys(acctKeys);
		acctInqRq.setAcctSel(acctSel);
		AcctInqRs acctInqRs = accInquiry(acctInqRq, id);

		AcctRec[] acctRecs = acctInqRs.getAcctRec();
		int i = 0;
		for (AcctRec acctRec : acctRecs) {
			MemberAccountVO memberAccountVO1 = new MemberAccountVO();
			memberAccountVO1.setId(new java.lang.Long(i++));
			if (memberAccountVO1.getAccountNo().equalsIgnoreCase("4549681213")) {
				memberAccountVO1.setDefault(true);

				String accountNo = acctRec.getAcctId().getString();
				memberAccountVO1.setAccountNo(accountNo);
				AccountTypeVO type1 = new AccountTypeVO();

				String accountName = acctRec.getAcctInfo().getAcctType()
						.getAcctTypeValue().name();

				type1.setName(accountName);
				CurrencyVO currency1 = new CurrencyVO();
				currency1.setId(new java.lang.Long(1));
				String currencySymbol = acctRec.getAcctInfo().getCurCode()
						.getCurCodeValue().name();
				currency1.setSymbol(currencySymbol);
				type1.setCurrency(currency1);
				type1.setId(java.lang.Long.valueOf(1));
				memberAccountVO1.setType(type1);
				LocalSettings localSettings = new LocalSettings();
				AccountStatusVO accountStatusVO1 = new AccountStatusVO();
				AcctBal[] acctBalList = acctRec.getAcctInfo().getAcctBal();
				for (AcctBal acctBal : acctBalList) {

					if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.Avail)) {
						String availBalance = acctBal.getCurAmt().getAmt()
								.getString();
						BigDecimal availableBalance = new BigDecimal(
								availBalance);
						accountStatusVO1.setAvailableBalance(availableBalance);

						Amount amount = new Amount();
						amount.setValue(availableBalance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedAvailableBalance(value);

					} else if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.Current)) {
						String currentBalance = acctBal.getCurAmt().getAmt()
								.getString();
						BigDecimal balance = new BigDecimal(currentBalance);
						accountStatusVO1.setBalance(balance);
						Amount amount = new Amount();
						amount.setValue(balance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedBalance(value);
					} else if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.Outstanding)) {
						String outstandingBalance = acctBal.getCurAmt()
								.getAmt().getString();
						BigDecimal balance = new BigDecimal(outstandingBalance);
						accountStatusVO1.setBalance(balance);
						Amount amount = new Amount();
						amount.setValue(balance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedBalance(value);
					} else if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.CreditLimit)) {
						String creditLimit = acctBal.getCurAmt().getAmt()
								.getString();
						BigDecimal balance = new BigDecimal(creditLimit);
						accountStatusVO1.setBalance(balance);
						Amount amount = new Amount();
						amount.setValue(balance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedCreditLimit(value);
					}

				}
			}
		}
		return null;
	}

	/**
	 * Returns the account status for the default account.
	 */
	@RequestMapping(value = "default/status", method = RequestMethod.GET)
	@ResponseBody
	public AccountStatusVO getDefaultStatus() {
		LocalSettings localSettings = new LocalSettings();
		MemberAccountWithStatusVO memberAccountWithStatusVO1 = null;

		AcctType[] acctTypes = new AcctType[2];
		acctTypes[0].setAcctTypeValue(AcctTypeValue.SDA);
		acctTypes[1].setAcctTypeValue(AcctTypeValue.CCA);
		AcctInqRs acctInqRs = acctInqByAccountType(acctTypes);

		List<MemberAccountWithStatusVO> accounts = new ArrayList<MemberAccountWithStatusVO>();

		AcctRec[] acctRecs = acctInqRs.getAcctRec();
		int i = 0;
		for (AcctRec acctRec : acctRecs) {
			MemberAccountVO memberAccountVO1 = new MemberAccountVO();
			memberAccountVO1.setId(new java.lang.Long(i++));
			if (memberAccountVO1.getAccountNo().equalsIgnoreCase("4549681213")) {
				memberAccountVO1.setDefault(true);

				String accountNo = acctRec.getAcctId().getString();
				memberAccountVO1.setAccountNo(accountNo);
				AccountTypeVO type1 = new AccountTypeVO();

				String accountName = acctRec.getAcctInfo().getAcctType()
						.getAcctTypeValue().name();

				type1.setName(accountName);
				CurrencyVO currency1 = new CurrencyVO();
				currency1.setId(new java.lang.Long(1));
				String currencySymbol = acctRec.getAcctInfo().getCurCode()
						.getCurCodeValue().name();
				currency1.setSymbol(currencySymbol);
				type1.setCurrency(currency1);
				type1.setId(java.lang.Long.valueOf(1));
				memberAccountVO1.setType(type1);

				AccountStatusVO accountStatusVO1 = new AccountStatusVO();
				AcctBal[] acctBalList = acctRec.getAcctInfo().getAcctBal();
				for (AcctBal acctBal : acctBalList) {
					if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.Avail)) {
						String availBalance = acctBal.getCurAmt().getAmt()
								.getString();
						BigDecimal availableBalance = new BigDecimal(
								availBalance);
						accountStatusVO1.setAvailableBalance(availableBalance);

						Amount amount = new Amount();
						amount.setValue(availableBalance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedAvailableBalance(value);

					} else if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.Current)) {
						String currentBalance = acctBal.getCurAmt().getAmt()
								.getString();
						BigDecimal balance = new BigDecimal(currentBalance);
						accountStatusVO1.setBalance(balance);
						Amount amount = new Amount();
						amount.setValue(balance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedBalance(value);
					} else if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.Outstanding)) {
						String outstandingBalance = acctBal.getCurAmt()
								.getAmt().getString();
						BigDecimal balance = new BigDecimal(outstandingBalance);
						accountStatusVO1.setBalance(balance);
						Amount amount = new Amount();
						amount.setValue(balance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedBalance(value);
					} else if (acctBal.getBalType().getBalTypeValues()
							.equals(BalTypeValues.CreditLimit)) {
						String creditLimit = acctBal.getCurAmt().getAmt()
								.getString();
						BigDecimal balance = new BigDecimal(creditLimit);
						accountStatusVO1.setBalance(balance);
						Amount amount = new Amount();
						amount.setValue(balance);
						amount.setType(Type.FIXED);

						String value = localSettings.getAmountConverter()
								.toString(amount);
						accountStatusVO1.setFormattedCreditLimit(value);
					}
					memberAccountWithStatusVO1 = new MemberAccountWithStatusVO(
							memberAccountVO1, accountStatusVO1);

				}
			}
		}
		return memberAccountWithStatusVO1.getStatus();
	}

	/**
	 * Loads a transfer by id and return it with the list of payment custom
	 * fields of the transfer type.
	 */
	@RequestMapping(value = "transferData/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TransferDataVO loadTransferData(@PathVariable final java.lang.Long id) {

		AccountHistoryTransferVO accountHistoryTransferVO1 = new AccountHistoryTransferVO();
		boolean canAddRelatedMemberAsContact = false;
		if (id == 1) {
			accountHistoryTransferVO1.setId(java.lang.Long.valueOf(12));
			accountHistoryTransferVO1.setAmount(new BigDecimal(100));
			accountHistoryTransferVO1.setFormattedAmount("100");

			accountHistoryTransferVO1.setDescription("Fund Transfer");

			Calendar date = Calendar.getInstance();
			date.set(2013, 04, 23);
			accountHistoryTransferVO1.setDate(date);
			accountHistoryTransferVO1.setFormattedDate("23-4-2013");

			Calendar processDate = Calendar.getInstance();
			processDate.set(2013, 04, 24);
			accountHistoryTransferVO1.setProcessDate(processDate);
			accountHistoryTransferVO1.setFormattedProcessDate("24-4-2013");

			MemberVO member = new MemberVO();
			member.setId(java.lang.Long.valueOf(1));
			member.setName("Ong Eu Soon");
			member.setUsername("esong");
			member.setEmail("esong@infopro.com.my");
			accountHistoryTransferVO1.setMember(member);

			MemberVO fromMember = new MemberVO();
			fromMember.setId(java.lang.Long.valueOf(3));
			fromMember.setName("Kelvin Goh");
			fromMember.setUsername("kelvingoh");
			fromMember.setGroupId(java.lang.Long.valueOf(123));
			fromMember.setEmail("kelvingoh@example.com");
			accountHistoryTransferVO1.setFromMember(fromMember);

			TransferTypeVO transferType = new TransferTypeVO();
			transferType.setId(java.lang.Long.valueOf(1234));
			transferType.setName("ABC");

			AccountTypeVO from = new AccountTypeVO();
			from.setId(java.lang.Long.valueOf(121));
			from.setName("4549681222");
			CurrencyVO currency1 = new CurrencyVO();
			currency1.setId(new java.lang.Long(10));
			currency1.setName("Ringgit Malaysia");
			currency1.setSymbol("MYR");
			from.setCurrency(currency1);
			transferType.setFrom(from);

			AccountTypeVO to = new AccountTypeVO();
			to.setId(new java.lang.Long(1));
			to.setName("4549681213");
			from.setCurrency(currency1);
			transferType.setTo(to);

			accountHistoryTransferVO1.setTransferType(transferType);
			accountHistoryTransferVO1.setFromSystemAccountName("4549681222");
			accountHistoryTransferVO1.setStatus(PaymentStatusVO.PROCESSED);
			accountHistoryTransferVO1.setTransactionNumber("12345");
			accountHistoryTransferVO1.setTraceNumber("123456");

		}
		TransferDataVO transferDataVO = new TransferDataVO(
				accountHistoryTransferVO1, canAddRelatedMemberAsContact);

		return transferDataVO;
	}

	/**
	 * Loads a transfer by id
	 */
	@RequestMapping(value = "transfer/{id}", method = RequestMethod.GET)
	@ResponseBody
	public AccountHistoryTransferVO loadTransfer(
			@PathVariable final java.lang.Long id) {
		return null;
	}

	/**
	 * Searches for account history entries on the given account
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "{id}/history", method = RequestMethod.GET)
	@ResponseBody
	public AccountHistoryResultPage searchAccountHistory(
			@PathVariable final java.lang.Long id,
			final AccountHistoryParams params, final HttpServletRequest request)
					throws ParseException {

		String accountNo = "4549681213";

		UUID sessionId = UUID.randomUUID();

		AcctTrnInqRq acctTrnInqRq = getAcctTrnInqRq(java.lang.Long.toString(id));

		AcctTrnInqRs acctTrnInqRs = acctTrnInq(acctTrnInqRq,
				java.lang.Long.toString(id), accountNo);

		LocalSettings localSettings = new LocalSettings();

		AcctType[] acctTypes = new AcctType[2];
		acctTypes[0].setAcctTypeValue(AcctTypeValue.SDA);
		acctTypes[1].setAcctTypeValue(AcctTypeValue.CCA);
		AcctInqRs acctInqRs = acctInqByAccountType(acctTypes);
		AccountStatusVO accountStatusVO = new AccountStatusVO();
		AcctBal[] acctBalList = acctInqRs.getAcctRec()[0].getAcctInfo()
				.getAcctBal();
		AccountHistoryResultPage accountHistoryResultPage = new AccountHistoryResultPage();
		for (AcctBal acctBal : acctBalList) {
			if (acctBal.getBalType().getBalTypeValues()
					.equals(BalTypeValues.Avail)) {
				String availBalance = acctBal.getCurAmt().getAmt().getString();
				BigDecimal availableBalance = new BigDecimal(availBalance);
				accountStatusVO.setAvailableBalance(availableBalance);

				Amount amount = new Amount();
				amount.setValue(availableBalance);
				amount.setType(Type.FIXED);

				String value = localSettings.getAmountConverter().toString(
						amount);
				accountStatusVO.setFormattedAvailableBalance(value);

			} else if (acctBal.getBalType().getBalTypeValues()
					.equals(BalTypeValues.Current)) {
				String currentBalance = acctBal.getCurAmt().getAmt()
						.getString();
				BigDecimal balance = new BigDecimal(currentBalance);
				accountStatusVO.setBalance(balance);
				Amount amount = new Amount();
				amount.setValue(balance);
				amount.setType(Type.FIXED);

				String value = localSettings.getAmountConverter().toString(
						amount);
				accountStatusVO.setFormattedBalance(value);
			}

			accountHistoryResultPage.setAccountStatus(accountStatusVO);
			List<AccountHistoryTransferVO> transfers = new ArrayList<AccountHistoryTransferVO>();
			AcctTrnRec[] acctTrnRecList = acctTrnInqRs.getAcctTrnRec();

			for (AcctTrnRec acctTrnRec : acctTrnRecList) {
				AccountHistoryTransferVO accountHistoryTransferVO1 = new AccountHistoryTransferVO();
				accountHistoryTransferVO1.setId(java.lang.Long
						.valueOf(acctTrnRec.getAcctTrnId().getString()));

				AcctTrnInfo acctTrnInfo = acctTrnRec.getAcctTrnInfo();
				TotalCurAmt curAmt = acctTrnInfo.getTotalCurAmt();
				BigDecimal transferAmount = new BigDecimal(curAmt.getAmt()
						.getString());
				accountHistoryTransferVO1.setAmount(transferAmount);
				Amount amount1 = new Amount();
				amount1.setValue(transferAmount);
				amount1.setType(Type.FIXED);
				String value = localSettings.getAmountConverter().toString(
						amount1);
				accountHistoryTransferVO1.setFormattedAmount(value);

				accountHistoryTransferVO1.setDescription("Fund Transfer");
				DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");// formatted
				// as
				// per
				// ISO
				// 8601
				String strDate = acctTrnInfo.getOrigDt().getString();
				Calendar date = Calendar.getInstance();
				date.setTime(df.parse(strDate));
				accountHistoryTransferVO1.setDate(date);
				accountHistoryTransferVO1.setFormattedDate(strDate);

				strDate = acctTrnInfo.getPostedDt().getString();
				Calendar processDate = Calendar.getInstance();
				processDate.setTime(df.parse(strDate));
				accountHistoryTransferVO1.setProcessDate(processDate);
				accountHistoryTransferVO1.setFormattedProcessDate(strDate);

				CustPayeeInfo custPayeeInfo = acctTrnInfo.getCustPayeeInfo();
				StdPayeeRec stdPayeeRec = custPayeeInfo.getStdPayeeRef()
						.getStdPayeeRec();

				PartyData partyData = custPayeeInfo.getStdPayeeRef()
						.getStdPayeeRec().getStdPayeeInfo().getPartyData();
				MemberVO member = new MemberVO();
				member.setName(custPayeeInfo.getName().getString());

				if (stdPayeeRec
						.getStdPayeeId()
						.getString()
						.equalsIgnoreCase(
								java.lang.Long.toString(params.getMemberId()))) {
					member.setId(java.lang.Long.parseLong(stdPayeeRec
							.getStdPayeeId().getString()));
					Contact[] contactList = partyData.getContact();
					for (Contact contact : contactList) {
						if (contact.getLocator() instanceof Email) {
							Email email = (Email) contact.getLocator();
							member.setEmail(email.getEmailAddr().getString());

						}
					}
				}

				// member.setUsername(username);
				accountHistoryTransferVO1.setMember(member);

				PayeeAcctNum payeeAcctNum = custPayeeInfo.getPayeeAcctNum();
				PayerAcctNum payerAcctNum = custPayeeInfo.getPayerAcctNum();

				InvoiceData invoiceData = acctTrnInfo.getInvoiceData();

				CounterpartyData counterpartyData = acctTrnInfo
						.getCounterpartyData();
				MemberVO fromMember = new MemberVO();
				fromMember.setName(counterpartyData.getLegalName().getString());
				fromMember.setId(java.lang.Long.valueOf(counterpartyData
						.getRefData().getRefIdent().getString()));
				SecToken[] secTokenList = acctTrnInqRq.getMsgRqHdr()
						.getCredentialsRqHdr()[0].getSecToken();
				for (SecToken secToken : secTokenList) {
					if (secToken instanceof SecTokenLogin) {
						//
						fromMember.setUsername(((SecTokenLogin) secToken)
								.getLoginName().getString());
						// fromMember.setGroupId(java.lang.Long.valueOf(123));
					} else if (secToken instanceof SecTokenParty) {
						//
						Email email1 = (Email) ((SecTokenParty) secToken)
								.getPersonData().getContact()[0].getLocator();
						fromMember.setEmail(email1.getEmailAddr().getString());
					}
				}
				accountHistoryTransferVO1.setFromMember(fromMember);

				TransferTypeVO transferType = new TransferTypeVO();
				transferType.setId(java.lang.Long.valueOf(invoiceData
						.getInvoiceNum().getString()));

				transferType.setName(acctTrnInfo.getTrnType().getTrnTypeValue()
						.name());
				AcctRec acctRec = custPayeeInfo.getDfltPmtData()
						.getFromAcctRef().getAcctRec();
				AcctInfo acctInfo = acctRec.getAcctInfo();
				AcctId acctId = acctRec.getAcctId();
				AccountTypeVO from = new AccountTypeVO();
				from.setId(java.lang.Long.parseLong(acctId.getString()));
				from.setName(payerAcctNum.getString());
				CurCode curCode = acctInfo.getCurCode();
				CurrencyVO currency1 = new CurrencyVO();
				// currency1.setId(new java.lang.Long(10));
				// currency1.setName("Ringgit Malaysia");
				currency1.setSymbol(curCode.getCurCodeValue().name());
				from.setCurrency(currency1);
				transferType.setFrom(from);

				AccountTypeVO to = new AccountTypeVO();
				to.setId(params.getMemberAccountId());
				to.setName(payeeAcctNum.getString());
				from.setCurrency(currency1);
				transferType.setTo(to);

				accountHistoryTransferVO1.setTransferType(transferType);
				accountHistoryTransferVO1.setFromSystemAccountName(payeeAcctNum
						.getString());
				accountHistoryTransferVO1.setStatus(PaymentStatusVO.PROCESSED);
				accountHistoryTransferVO1.setTransactionNumber(acctTrnRec
						.getAcctTrnId().getString());
				accountHistoryTransferVO1.setTraceNumber(acctTrnInfo
						.getPmtKeys().getPmtId().getString());
				transfers.add(accountHistoryTransferVO1);
			}
			accountHistoryResultPage.setTransfers(transfers);
		}
		accountHistoryResultPage.setTotalCount(1);
		accountHistoryResultPage.setCurrentPage(1);
		accountHistoryResultPage.setPageSize(5);
		return accountHistoryResultPage;
	}

	/**
	 * Searches for account history entries on the default account
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "default/history", method = RequestMethod.GET)
	@ResponseBody
	public AccountHistoryResultPage searchDefaultAccountHistory(
			final AccountHistoryParams params, final HttpServletRequest request)
					throws ParseException {

		String accountNo = "4549681213";

		UUID sessionId = UUID.randomUUID();

		java.lang.Long id = java.lang.Long.valueOf(123);
		AcctTrnInqRq acctTrnInqRq = getAcctTrnInqRq(java.lang.Long.toString(id));

		AcctTrnInqRs acctTrnInqRs = acctTrnInq(acctTrnInqRq,
				java.lang.Long.toString(id), accountNo);

		LocalSettings localSettings = new LocalSettings();

		AcctType[] acctTypes = new AcctType[2];
		acctTypes[0].setAcctTypeValue(AcctTypeValue.SDA);
		acctTypes[1].setAcctTypeValue(AcctTypeValue.CCA);
		AcctInqRs acctInqRs = acctInqByAccountType(acctTypes);
		AccountStatusVO accountStatusVO = new AccountStatusVO();
		AcctBal[] acctBalList = acctInqRs.getAcctRec()[0].getAcctInfo()
				.getAcctBal();
		AccountHistoryResultPage accountHistoryResultPage = new AccountHistoryResultPage();
		for (AcctBal acctBal : acctBalList) {
			if (acctBal.getBalType().getBalTypeValues()
					.equals(BalTypeValues.Avail)) {
				String availBalance = acctBal.getCurAmt().getAmt().getString();
				BigDecimal availableBalance = new BigDecimal(availBalance);
				accountStatusVO.setAvailableBalance(availableBalance);

				Amount amount = new Amount();
				amount.setValue(availableBalance);
				amount.setType(Type.FIXED);

				String value = localSettings.getAmountConverter().toString(
						amount);
				accountStatusVO.setFormattedAvailableBalance(value);

			} else if (acctBal.getBalType().getBalTypeValues()
					.equals(BalTypeValues.Current)) {
				String currentBalance = acctBal.getCurAmt().getAmt()
						.getString();
				BigDecimal balance = new BigDecimal(currentBalance);
				accountStatusVO.setBalance(balance);
				Amount amount = new Amount();
				amount.setValue(balance);
				amount.setType(Type.FIXED);

				String value = localSettings.getAmountConverter().toString(
						amount);
				accountStatusVO.setFormattedBalance(value);
			}

			accountHistoryResultPage.setAccountStatus(accountStatusVO);
			List<AccountHistoryTransferVO> transfers = new ArrayList<AccountHistoryTransferVO>();
			AcctTrnRec[] acctTrnRecList = acctTrnInqRs.getAcctTrnRec();

			for (AcctTrnRec acctTrnRec : acctTrnRecList) {
				AccountHistoryTransferVO accountHistoryTransferVO1 = new AccountHistoryTransferVO();
				accountHistoryTransferVO1.setId(java.lang.Long
						.valueOf(acctTrnRec.getAcctTrnId().getString()));

				AcctTrnInfo acctTrnInfo = acctTrnRec.getAcctTrnInfo();
				TotalCurAmt curAmt = acctTrnInfo.getTotalCurAmt();
				BigDecimal transferAmount = new BigDecimal(curAmt.getAmt()
						.getString());
				accountHistoryTransferVO1.setAmount(transferAmount);
				Amount amount1 = new Amount();
				amount1.setValue(transferAmount);
				amount1.setType(Type.FIXED);
				String value = localSettings.getAmountConverter().toString(
						amount1);
				accountHistoryTransferVO1.setFormattedAmount(value);

				accountHistoryTransferVO1.setDescription("Fund Transfer");
				DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");// formatted
				// as
				// per
				// ISO
				// 8601
				String strDate = acctTrnInfo.getOrigDt().getString();
				Calendar date = Calendar.getInstance();
				date.setTime(df.parse(strDate));
				accountHistoryTransferVO1.setDate(date);
				accountHistoryTransferVO1.setFormattedDate(strDate);

				strDate = acctTrnInfo.getPostedDt().getString();
				Calendar processDate = Calendar.getInstance();
				processDate.setTime(df.parse(strDate));
				accountHistoryTransferVO1.setProcessDate(processDate);
				accountHistoryTransferVO1.setFormattedProcessDate(strDate);

				CustPayeeInfo custPayeeInfo = acctTrnInfo.getCustPayeeInfo();
				StdPayeeRec stdPayeeRec = custPayeeInfo.getStdPayeeRef()
						.getStdPayeeRec();

				PartyData partyData = custPayeeInfo.getStdPayeeRef()
						.getStdPayeeRec().getStdPayeeInfo().getPartyData();
				MemberVO member = new MemberVO();
				member.setName(custPayeeInfo.getName().getString());

				if (stdPayeeRec
						.getStdPayeeId()
						.getString()
						.equalsIgnoreCase(
								java.lang.Long.toString(params.getMemberId()))) {
					member.setId(java.lang.Long.parseLong(stdPayeeRec
							.getStdPayeeId().getString()));
					Contact[] contactList = partyData.getContact();
					for (Contact contact : contactList) {
						if (contact.getLocator() instanceof Email) {
							Email email = (Email) contact.getLocator();
							member.setEmail(email.getEmailAddr().getString());

						}
					}
				}

				// member.setUsername(username);
				accountHistoryTransferVO1.setMember(member);

				PayeeAcctNum payeeAcctNum = custPayeeInfo.getPayeeAcctNum();
				PayerAcctNum payerAcctNum = custPayeeInfo.getPayerAcctNum();

				InvoiceData invoiceData = acctTrnInfo.getInvoiceData();

				CounterpartyData counterpartyData = acctTrnInfo
						.getCounterpartyData();
				MemberVO fromMember = new MemberVO();
				fromMember.setName(counterpartyData.getLegalName().getString());
				fromMember.setId(java.lang.Long.valueOf(counterpartyData
						.getRefData().getRefIdent().getString()));
				SecToken[] secTokenList = acctTrnInqRq.getMsgRqHdr()
						.getCredentialsRqHdr()[0].getSecToken();
				for (SecToken secToken : secTokenList) {
					if (secToken instanceof SecTokenLogin) {
						//
						fromMember.setUsername(((SecTokenLogin) secToken)
								.getLoginName().getString());
						// fromMember.setGroupId(java.lang.Long.valueOf(123));
					} else if (secToken instanceof SecTokenParty) {
						//
						Email email1 = (Email) ((SecTokenParty) secToken)
								.getPersonData().getContact()[0].getLocator();
						fromMember.setEmail(email1.getEmailAddr().getString());
					}
				}
				accountHistoryTransferVO1.setFromMember(fromMember);

				TransferTypeVO transferType = new TransferTypeVO();
				transferType.setId(java.lang.Long.valueOf(invoiceData
						.getInvoiceNum().getString()));

				transferType.setName(acctTrnInfo.getTrnType().getTrnTypeValue()
						.name());
				AcctRec acctRec = custPayeeInfo.getDfltPmtData()
						.getFromAcctRef().getAcctRec();
				AcctInfo acctInfo = acctRec.getAcctInfo();
				AcctId acctId = acctRec.getAcctId();
				AccountTypeVO from = new AccountTypeVO();
				from.setId(java.lang.Long.parseLong(acctId.getString()));
				from.setName(payerAcctNum.getString());
				CurCode curCode = acctInfo.getCurCode();
				CurrencyVO currency1 = new CurrencyVO();
				// currency1.setId(new java.lang.Long(10));
				// currency1.setName("Ringgit Malaysia");
				currency1.setSymbol(curCode.getCurCodeValue().name());
				from.setCurrency(currency1);
				transferType.setFrom(from);

				AccountTypeVO to = new AccountTypeVO();
				to.setId(params.getMemberAccountId());
				to.setName(payeeAcctNum.getString());
				from.setCurrency(currency1);
				transferType.setTo(to);

				accountHistoryTransferVO1.setTransferType(transferType);
				accountHistoryTransferVO1.setFromSystemAccountName(payeeAcctNum
						.getString());
				accountHistoryTransferVO1.setStatus(PaymentStatusVO.PROCESSED);
				accountHistoryTransferVO1.setTransactionNumber(acctTrnRec
						.getAcctTrnId().getString());
				accountHistoryTransferVO1.setTraceNumber(acctTrnInfo
						.getPmtKeys().getPmtId().getString());
				transfers.add(accountHistoryTransferVO1);
			}
			accountHistoryResultPage.setTransfers(transfers);
		}
		accountHistoryResultPage.setTotalCount(1);
		accountHistoryResultPage.setCurrentPage(1);
		accountHistoryResultPage.setPageSize(5);
		return accountHistoryResultPage;
	}

	/**
	 * Loads a scheduled payment by id
	 */
	@RequestMapping(value = "scheduledPayment/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ScheduledPaymentVO loadScheduledPayment(
			@PathVariable final java.lang.Long id) {
		return null;
	}

	/**
	 * Searches for scheduled payments on the given account
	 */
	@RequestMapping(value = "{id}/scheduledPayments", method = RequestMethod.GET)
	@ResponseBody
	public ScheduledPaymentsResultPage searchScheduledPayments(
			@PathVariable final java.lang.Long id,
			final SearchScheduledPaymentParams params) {

		return null;
	}

	/**
	 * Searches for scheduled payments on the default account
	 */
	@RequestMapping(value = "default/scheduledPayments", method = RequestMethod.GET)
	@ResponseBody
	public ScheduledPaymentsResultPage searchDefaultScheduledPayments(
			final SearchScheduledPaymentParams params) {

		return null;
	}

	/**
	 * Returns the available payment filters for an specific account
	 */
	@RequestMapping(value = "{id}/paymentFilters", method = RequestMethod.GET)
	@ResponseBody
	public List<PaymentFilterVO> listPaymentFilters(
			@PathVariable final java.lang.Long id) {
		PaymentFilterVO paymentFilterVO = new PaymentFilterVO();
		paymentFilterVO.setId(id);
		String name1 = "xxx";
		paymentFilterVO.setName(name1);
		return null;
	}

	/**
	 * Returns the available payment filters for an specific account
	 */
	@RequestMapping(value = "default/paymentFilters", method = RequestMethod.GET)
	@ResponseBody
	public List<PaymentFilterVO> listDefaultPaymentFilters() {
		List<PaymentFilterVO> defaultPaymentFilters = new ArrayList<PaymentFilterVO>();
		PaymentFilterVO paymentFilterVO = new PaymentFilterVO();
		java.lang.Long id = new java.lang.Long(1);
		paymentFilterVO.setId(id);
		String name1 = "";
		paymentFilterVO.setName(name1);
		defaultPaymentFilters.add(paymentFilterVO);
		return defaultPaymentFilters;
	}

	/**
	 * Returns the IFX account inquiry response
	 */
	@RequestMapping(value = "acctInq/{id}", method = RequestMethod.POST)
	@ResponseBody
	public AcctInqRs loadAccount(@RequestBody final AcctInqRq acctInqRq,
			@PathVariable final java.lang.Long id) {

		return accInquiry(acctInqRq, id);
	}

	/**
	 * Returns the IFX account inquiry response
	 */
	@RequestMapping(value = "acctInq", method = RequestMethod.POST)
	@ResponseBody
	public AcctInqRs listAccounts(@RequestBody final AcctInqRq acctInqRq) {
		AcctInqRs acctInqRs = acctInq(acctInqRq);
		return acctInqRs;
	}

	/**
	 * Returns the IFX account inquiry response
	 */
	@RequestMapping(value = "acctInq/info", method = RequestMethod.POST)
	@ResponseBody
	public AcctInqRs getAccountsInfo(@RequestBody final AcctInqRq acctInqRq) {
		AcctInqRs acctInqRs = acctInq(acctInqRq);
		return acctInqRs;
	}

	/**
	 * Returns the account status for the given account.
	 */
	@RequestMapping(value = "acctInq/{id}/status", method = RequestMethod.GET)
	@ResponseBody
	public AcctInqRs getStatus(@RequestBody AcctInqRq acctInqRq,
			@PathVariable final java.lang.Long id) {
		return accInquiry(acctInqRq, id);
	}

	/**
	 * Returns the account status for the default account.
	 * 
	 * @param acctInqRq
	 */
	@RequestMapping(value = "/acctInq/default/status", method = RequestMethod.GET)
	@ResponseBody
	public AcctInqRs getDefaultStatus(@RequestBody AcctInqRq acctInqRq) {

		java.lang.Long id = getDefaultAccountId();
		return accInquiry(acctInqRq, id);
	}

	private RqUID getRqUID() {
		UUID uId = UUID.randomUUID();
		RqUID rqUID = new RqUID();
		rqUID.setString(uId.toString());
		return rqUID;
	}

	private MsgRqHdr getMsgRqHdr() {
		// Option
		MsgRqHdr msgRqHdr = new MsgRqHdr();

		SvcIdent svcIdent = new SvcIdent();
		SvcName svcName = new SvcName();
		svcName.setString("Account Inquiry");
		svcIdent.setSvcName(svcName);

		SvcProviderName svcProviderName = new SvcProviderName();
		svcProviderName.setString("www.maybank2u.com.my");
		svcIdent.setSvcProviderName(svcProviderName);
		msgRqHdr.setSvcIdent(svcIdent);

		CredentialsRqHdr[] credentialsRqHdr = new CredentialsRqHdr[1];

		SubjectRole subjectRole = SubjectRole.Party;

		SecTokenLogin secToken1 = new SecTokenLogin();
		LoginName loginName = new LoginName();
		secToken1.setLoginName(loginName);
		SubjectPswd subjectPswd = new SubjectPswd();
		if (subjectPswd.getCryptType().equals(CryptType.None)) {
			Pswd pswd = new Pswd();
			subjectPswd.setPswd(pswd);
		} else {
			CryptPswd cryptPswd = new CryptPswd();
			subjectPswd.setCryptPswd(cryptPswd);
		}
		secToken1.setSubjectPswd(subjectPswd);

		SecToken[] secTokens = new SecToken[1];
		secTokens[0] = secToken1;
		credentialsRqHdr[0].setSubjectRole(subjectRole);
		credentialsRqHdr[0].setSecToken(secTokens);
		msgRqHdr.setCredentialsRqHdr(credentialsRqHdr);

		ContextRqHdr contextRqHdr = new ContextRqHdr();
		PointOfServiceData pointOfServiceData = new PointOfServiceData();
		pointOfServiceData.setEnvironment(Environment.MCommerce);
		pointOfServiceData.setPOSLocation(POSLocation.Customer);
		contextRqHdr.setPointOfServiceData(pointOfServiceData);
		ClientDt clientDt = new ClientDt();
		DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");
		// formatted as per ISO 8601
		String strDate = df.format(new Date());
		clientDt.setString(strDate);
		contextRqHdr.setClientDt(clientDt);
		ClientApp clientApp = new ClientApp();
		Name name = new Name();
		name.setString("INFOPRO Mobile Payment");
		clientApp.setName(name);
		Org org = new Org();
		org.setString("INFOPRO");
		clientApp.setOrg(org);
		Version version = new Version();
		version.setString("1.0");
		clientApp.setVersion(version);
		contextRqHdr.setClientApp(clientApp);
		msgRqHdr.setContextRqHdr(contextRqHdr);
		return msgRqHdr;
	}

	private AcctInqRs acctInqByAccountType(AcctType[] acctTypes) {
		AcctInqRq acctInqRq = new AcctInqRq();

		// Mandatory
		acctInqRq.setRqUID(getRqUID());
		acctInqRq.setMsgRqHdr(getMsgRqHdr());

		RecSelect[] recSelect = new RecSelect[acctTypes.length];
		int i = 0;
		for (AcctType acctType : acctTypes) {
			recSelect[i++]
					.setString("/AcctRec/AcctInfo/AcctType[AcctTypeValue='"
							+ acctType.getAcctTypeValue().name() + "']");
		}

		acctInqRq.setRecSelect(recSelect);
		AcctInqRs acctInqRs = accInquiry(acctInqRq, java.lang.Long.valueOf(-1));
		// Creating inquiry response
		return acctInqRs;
	}

	private AcctInqRs acctInq(java.lang.Long id) {
		AcctInqRq acctInqRq = new AcctInqRq();

		// Mandatory
		acctInqRq.setRqUID(getRqUID());
		acctInqRq.setMsgRqHdr(getMsgRqHdr());

		AcctSel[] acctSel = new AcctSel[1];
		AcctSel acctSel1 = new AcctSel();
		AcctKeys acctKeys1 = new AcctKeys();

		AcctIdent acctIdent = new AcctIdent();
		acctIdent.setAcctIdentType(AcctIdentType.AcctNum);
		AcctIdentValue acctIdentValue = new AcctIdentValue();
		acctIdentValue.setString("4549681213");
		acctIdent.setAcctIdentValue(acctIdentValue);
		acctKeys1.setAcctIdent(acctIdent);

		// id
		AcctId acctId = new AcctId();
		acctId.setString(java.lang.Long.toString(id));
		acctKeys1.setAcctId(acctId);

		acctSel1.setAcctKeys(acctKeys1);
		acctSel[0] = acctSel1;

		acctInqRq.setAcctSel(acctSel);

		AcctInqRs acctInqRs = accInquiry(acctInqRq, java.lang.Long.valueOf(id));
		// Creating inquiry response
		return acctInqRs;
	}

	private Status getStatus(String statusCode1, Severity severity1,
			String statusDesc1) {
		// Status
		Status status = new Status();
		StatusCode statusCode = new StatusCode();
		statusCode.setString(statusCode1);
		status.setStatusCode(statusCode);
		status.setSeverity(severity1);
		StatusDesc statusDesc = new StatusDesc();
		statusDesc.setString(statusDesc1);
		status.setStatusDesc(statusDesc);
		return status;
	}

	public AcctInqRs accInquiry(final AcctInqRq acctInqRq,
			final java.lang.Long id) {

		AcctInqRs acctInqRs = new AcctInqRs();
		Status status = this.getStatus("0", Severity.Info, "Success");
		acctInqRs.setStatus(status);
		acctInqRs.setRqUID(acctInqRq.getRqUID());

		// MsgRsHdr
		MsgRsHdr msgRsHdr = new MsgRsHdr();
		// AsyncRsData
		// AsyncRsData asyncRsData=new AsyncRsData();
		// AsyncRsData/AsyncRqUID
		// AsyncRqUID asyncRqUID=acctInqRq.getMsgRqHdr().getAsyncRqUID();
		// asyncRsData.setAsyncRqUID(asyncRqUID);
		// AsyncRsData/AvailDt
		// AvailDt availDt=new AvailDt();
		DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");// formatted
		// as per
		// ISO 8601

		String strDate = df.format(new Date());
		// availDt.setString(strDate);
		// asyncRsData.setAvailDt(availDt);
		// msgRsHdr.setAsyncRsData(asyncRsData);

		// CredentialsRsHdr
		CredentialsRsHdr[] credentialsRsHdr_ = new CredentialsRsHdr[1];
		CredentialsRsHdr credentialsRsHdr = new CredentialsRsHdr();
		// CredentialsRsHdr/Status
		credentialsRsHdr.setStatus(status);
		// CredentialsRsHdr/SessionKey
		SessKey sessKey = new SessKey();
		sessKey.setString("OTP");
		credentialsRsHdr.setSessKey(sessKey);

		// CredentialsRsHdr/ExpDt
		ExpDt expDt = new ExpDt();
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		if (now.getMinutes() + 15 < 60)
			cal.set(now.getYear(), now.getMonth(), now.getDate(),
					now.getHours(), now.getMinutes() + 15);
		else
			cal.set(now.getYear(), now.getMonth(), now.getDate(),
					now.getHours() + 1, now.getMinutes() + 15 - 60);
		String expDate = df.format(cal.getTime());
		expDt.setString(expDate);
		credentialsRsHdr.setExpDt(expDt);

		credentialsRsHdr_[0] = credentialsRsHdr;
		msgRsHdr.setCredentialsRsHdr(credentialsRsHdr_);

		// ContextRsHdr
		ContextRsHdr contextRsHdr = new ContextRsHdr();
		// ContextRsHdr/ServerDt
		ServerDt serverDt = new ServerDt();
		serverDt.setString(strDate);
		contextRsHdr.setServerDt(serverDt);
		// ContextRsHdr/Language
		Language language = new Language();
		language.setString("en-US");
		contextRsHdr.setLanguage(language);

		// contextRsHdr.setMsgAuthCode(msgAuthCode);
		msgRsHdr.setContextRsHdr(contextRsHdr);

		acctInqRs.setMsgRsHdr(msgRsHdr);

		// AcctRec
		AcctRec[] acctRec = new AcctRec[1];
		AcctInfo acctInfo1 = getAcctInfo(AcctTypeValue.SDA, "4549681213",
				CurCodeValue.MYR);
		AcctBal[] acctBal = new AcctBal[2];
		AcctBal acctBal1 = getAcctBal(BalTypeValues.Current, CurCodeValue.MYR,
				"10000", "");

		AcctBal acctBal2 = getAcctBal(BalTypeValues.Avail, CurCodeValue.MYR,
				"10000", "");

		acctBal[0] = acctBal1;
		acctBal[1] = acctBal2;
		acctInfo1.setAcctBal(acctBal);

		String partyId1 = "123";
		String loginName1 = "toledo";
		AcctEnvr acctEnvr1=getAcctEnvr(partyId1, loginName1);
		AcctStatus acctStatus1=null;
		acctRec[1] = getAcctRec(id, acctInfo1, acctEnvr1, acctStatus1);

		acctInqRs.setAcctRec(acctRec);

		return acctInqRs;
	}

	private AcctRec getAcctRec(java.lang.Long id, AcctInfo acctInfo,
			AcctEnvr acctEnvr, AcctStatus acctStatus) {
		AcctRec acctRec = new AcctRec();
		AcctId aacctId = new AcctId();
		aacctId.setString(java.lang.Long.toString(id));
		acctRec.setAcctId(aacctId);
		acctRec.setAcctInfo(acctInfo);
		acctRec.setAcctEnvr(acctEnvr);
		acctRec.setAcctStatus(acctStatus);
		return acctRec;
	}
	private AcctInfo getAcctInfo(AcctTypeValue acctTypeValue, String accountNo,
			CurCodeValue curCodeValue) {
		AcctInfo acctInfo = new AcctInfo();
		AcctType acctType = new AcctType();
		acctType.setAcctTypeValue(acctTypeValue);
		acctInfo.setAcctType(acctType);

		AcctIdent[] acctIdent = new AcctIdent[1];
		acctIdent[0].setAcctIdentType(AcctIdentType.AcctNum);
		AcctIdentValue acctIdentValue = new AcctIdentValue();
		acctIdentValue.setString(accountNo);
		acctIdent[0].setAcctIdentValue(acctIdentValue);
		acctInfo.setAcctIdent(acctIdent);
		CurCode curCode = new CurCode();
		curCode.setCurCodeValue(curCodeValue);
		acctInfo.setCurCode(curCode);
		return acctInfo;
	}
	private AcctEnvr getAcctEnvr(String partyId1, String loginName1) {
		AcctEnvr acctEnvr = new AcctEnvr();
		PartyKeys partyKeys = new PartyKeys();
		PartyId partyId = new PartyId();
		partyId.setString(partyId1);
		partyKeys.setPartyId(partyId);
		LoginIdent loginIdent = new LoginIdent();
		LoginName loginName = new LoginName();
		loginName.setString(loginName1);
		loginIdent.setLoginName(loginName);
		partyKeys.setLoginIdent(loginIdent);
		acctEnvr.setPartyKeys(partyKeys);
		return acctEnvr;
	}

	private AcctBal getAcctBal(BalTypeValues balTypeValue,
			CurCodeValue curCodeValue, String amtValue,
			String desc1) {
		AcctBal acctBal = new AcctBal();
		BalType balType = new BalType();
		balType.setBalTypeValues(balTypeValue);
		acctBal.setBalType(balType);
		CurAmt curAmt = new CurAmt();
		Amt amt = new Amt();
		amt.setString(amtValue);
		curAmt.setAmt(amt);
		CurCode curCode = new CurCode();
		curCode.setCurCodeValue(curCodeValue);
		curAmt.setCurCode(curCode);
		acctBal.setCurAmt(curAmt);
		Desc desc = new Desc();
		desc.setString(desc1);
		acctBal.setDesc(desc);
		return acctBal;
	}
	/**
	 * Returns the IFX account inquiry response
	 */
	@RequestMapping(value = "ifx/acctInq", method = RequestMethod.POST)
	@ResponseBody
	public AcctInqRs acctInq(AcctInqRq acctInqRq) {

		AcctInqRs acctInqRs = accInquiry(acctInqRq, java.lang.Long.valueOf(-1));// Creating
		// inquiry
		// response
		return acctInqRs;
	}

	/**
	 * Attempts to load a currency by either id or symbol
	 */
	public Currency loadCurrencyByIdOrSymbol(final java.lang.Long id,
			final String symbol) {
		return null;
	}

	private java.lang.Long getDefaultAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	private AcctTrnInqRq getAcctTrnInqRq(String accountNo) {

		AcctTrnInqRq acctTrnInqRq = new AcctTrnInqRq();
		UUID rqUId = UUID.randomUUID();
		RqUID _rqUID = new RqUID();
		_rqUID.setString(rqUId.toString());
		acctTrnInqRq.setRqUID(_rqUID);

		MsgRqHdr _msgRqHdr = new MsgRqHdr();
		UUID asyncRqUID = UUID.randomUUID();
		AsyncRqUID _asyncRqUID = new AsyncRqUID();
		_asyncRqUID.setString(asyncRqUID.toString());
		_msgRqHdr.setAsyncRqUID(_asyncRqUID);

		SvcIdent svcIdent = new SvcIdent();
		SvcName svcName = new SvcName();
		svcName.setString("Account Inquiry");
		svcIdent.setSvcName(svcName);
		SvcProviderName svcProviderName = new SvcProviderName();
		svcProviderName.setString("www.maybank2u.com.my");
		svcIdent.setSvcProviderName(svcProviderName);
		_msgRqHdr.setSvcIdent(svcIdent);

		CredentialsRqHdr _credentialsRqHdr = new CredentialsRqHdr();
		StartSession startSession = new StartSession();
		startSession.setString("True");
		_credentialsRqHdr.setStartSession(startSession);
		SubjectRole subjectRole = SubjectRole.Party;
		_credentialsRqHdr.setSubjectRole(subjectRole);
		SecTokenLogin secToken1 = new SecTokenLogin();
		// secToken1.setLoginName(loginName);
		// secToken1.setSubjectPswd(subjectPswd);
		SecTokenParty secToken2 = new SecTokenParty();
		IdentVerifyMethod identVerifyMethod = IdentVerifyMethod.PersonalInfoVerification;
		secToken2.setIdentVerifyMethod(identVerifyMethod);
		PersonData personData = new PersonData();
		PersonName personName = new PersonName();
		FamilyName[] familyName = new FamilyName[1];
		FamilyName familyName1 = new FamilyName();
		familyName1.setString("Ong");
		familyName[0] = familyName1;
		personName.setFamilyName(familyName);
		GivenName[] givenNames = new GivenName[1];
		GivenName givenName1 = new GivenName();
		givenName1.setString("Eu Soon");
		givenNames[0] = givenName1;
		personName.setGivenName(givenNames);
		FullName fullName = new FullName();// Required
		fullName.setString("Ong Eu Soon");
		personName.setFullName(fullName);
		personData.setPersonName(personName);
		Contact[] contact = new Contact[1];
		ContactName contactName = new ContactName();
		contactName.setString("Ong Eu Soon");
		contact[0].setContactName(contactName);
		contact[0].setContactType(ContactType.Personal);
		personData.setContact(contact);
		secToken2.setPersonData(personData);
		SecToken[] secTokens = new SecToken[2];
		secTokens[0] = secToken1;

		PartyRef partyRef = new PartyRef();
		PersonPartyInfo personPartyInfo = new PersonPartyInfo();
		BirthPlace birthPlace = new BirthPlace();
		birthPlace.setString("Ipoh, Perak");
		personPartyInfo.setBirthPlace(birthPlace);
		MotherMaidenName motherMaidenName = new MotherMaidenName();
		motherMaidenName.setString("Mother Name");
		personPartyInfo.setMotherMaidenName(motherMaidenName);
		personPartyInfo.setPersonData(personData);
		Gender gender = Gender.Male;
		personPartyInfo.setGender(gender);
		MaritalStat maritalStat = MaritalStat.Married;
		personPartyInfo.setMaritalStat(maritalStat);
		partyRef.setPartyInfo(personPartyInfo);
		_credentialsRqHdr.setPartyRef(partyRef);

		_credentialsRqHdr.setSecToken(secTokens);
		CredentialsRqHdr[] credentialsRqHdr_ = new CredentialsRqHdr[1];
		credentialsRqHdr_[0] = _credentialsRqHdr;
		_msgRqHdr.setCredentialsRqHdr(credentialsRqHdr_);

		ContextRqHdr _contextRqHdr = new ContextRqHdr();
		PointOfServiceData pointOfServiceData = new PointOfServiceData();
		pointOfServiceData.setEnvironment(Environment.MCommerce);
		pointOfServiceData.setPOSLocation(POSLocation.Customer);
		_contextRqHdr.setPointOfServiceData(pointOfServiceData);
		_msgRqHdr.setContextRqHdr(_contextRqHdr);
		acctTrnInqRq.setMsgRqHdr(_msgRqHdr);

		AcctTrnSel[] acctTrnSel = new AcctTrnSel[1];
		AcctKeys acctKeys = new AcctKeys();
		AcctIdent acctIdent = new AcctIdent();
		acctIdent.setAcctIdentType(AcctIdentType.AcctNum);
		AcctIdentValue acctIdentValue = new AcctIdentValue();
		acctIdentValue.setString(accountNo);
		acctIdent.setAcctIdentValue(acctIdentValue);
		acctKeys.setAcctIdent(acctIdent);
		acctTrnSel[0].setAcctKeys(acctKeys);
		acctTrnInqRq.setAcctTrnSel(acctTrnSel);

		// RecSelect recSelect=new RecSelect();
		// recSelect.setString("AcctTrnRec/AcctTrnInfo/AcctRef/AcctIdent[AcctIdentValue='"+accountNo+"']");
		// acctTrnInqRq.setRecSelect(recSelect);

		return acctTrnInqRq;
	}

	private AcctTrnInqRs acctTrnInq(AcctTrnInqRq acctTrnInqRq, String id,
			String accountNo) {

		AcctTrnInqRs acctTrnInqRs = new AcctTrnInqRs();

		Status _status = new Status();
		StatusCode _statusCode = new StatusCode();
		_statusCode.setString("0");
		_status.setStatusCode(_statusCode);
		_status.setSeverity(Severity.Info);

		StatusDesc _statusDesc = new StatusDesc();
		_statusDesc.setString("Success");
		_status.setStatusDesc(_statusDesc);
		acctTrnInqRs.setStatus(_status);

		acctTrnInqRs.setRqUID(acctTrnInqRq.getRqUID());
		MsgRqHdr msgRqHdr = acctTrnInqRq.getMsgRqHdr();
		MsgRsHdr msgRsHdr = new MsgRsHdr();
		AsyncRsData asyncRsData = new AsyncRsData();
		asyncRsData.setAsyncRqUID(msgRqHdr.getAsyncRqUID());
		AvailDt availDt = new AvailDt();
		DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");// formatted
		// as per
		// ISO 8601
		String strDate = df.format(new Date());
		availDt.setString(strDate);
		asyncRsData.setAvailDt(availDt);
		msgRsHdr.setAsyncRsData(asyncRsData);

		CredentialsRsHdr credentialsRsHdr = new CredentialsRsHdr();
		credentialsRsHdr.setStatus(_status);
		if (msgRqHdr.getCredentialsRqHdr()[0].getStartSession().getString()
				.equalsIgnoreCase("True")) {
			SessKey sessKey = new SessKey();
			UUID sessionId = UUID.randomUUID();
			sessKey.setString(sessionId.toString());
			credentialsRsHdr.setSessKey(sessKey);
		}
		// credentialsRsHdr.setSeqNum(seqNum);
		ExpDt expDt = new ExpDt();
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		if (now.getMinutes() + 15 < 60)
			cal.set(now.getYear(), now.getMonth(), now.getDate(),
					now.getHours(), now.getMinutes() + 15);
		else
			cal.set(now.getYear(), now.getMonth(), now.getDate(),
					now.getHours() + 1, now.getMinutes() + 15 - 60);
		String expDate = df.format(cal.getTime());
		expDt.setString(expDate);
		credentialsRsHdr.setExpDt(expDt);
		CredentialsRsHdr[] credentialsRsHdr_ = new CredentialsRsHdr[1];
		credentialsRsHdr_[0] = credentialsRsHdr;
		msgRsHdr.setCredentialsRsHdr(credentialsRsHdr_);

		ContextRsHdr contextRsHdr = new ContextRsHdr();
		ServerDt serverDt = new ServerDt();
		serverDt.setString(strDate);
		contextRsHdr.setServerDt(serverDt);

		Language language = new Language();
		language.setString("en-US");
		contextRsHdr.setLanguage(language);

		// contextRsHdr.setMsgAuthCode(msgAuthCode);
		msgRsHdr.setContextRsHdr(contextRsHdr);
		acctTrnInqRs.setMsgRsHdr(msgRsHdr);

		AcctTrnRec[] acctTrnRec = new AcctTrnRec[3];
		AcctTrnRec acctTrnRec1 = new AcctTrnRec();
		AcctTrnId acctTrnId = new AcctTrnId();
		acctTrnId.setString("123");
		acctTrnRec1.setAcctTrnId(acctTrnId);
		AcctTrnInfo acctTrnInfo1 = new AcctTrnInfo();
		TrnType trnType = new TrnType();
		trnType.setTrnTypeValue(TrnTypeValue.Payment);
		acctTrnInfo1.setTrnType(trnType);
		PostedDt postedDt = new PostedDt();
		postedDt.setString("12/05/2013");
		acctTrnInfo1.setPostedDt(postedDt);

		TotalCurAmt totalCurAmt = new TotalCurAmt();
		Amt amt1 = new Amt();
		amt1.setString("10001");
		CurCode curCode1 = new CurCode();
		curCode1.setCurCodeValue(CurCodeValue.MYR);
		totalCurAmt.setAmt(amt1);
		totalCurAmt.setCurCode(curCode1);
		acctTrnInfo1.setTotalCurAmt(totalCurAmt);

		InvoiceData invoiceData = new InvoiceData();
		InvoiceNum invoiceNum = new InvoiceNum();
		invoiceNum.setString("INV123");
		invoiceData.setInvoiceNum(invoiceNum);
		invoiceData.setInvoiceType(InvoiceType.Invoice);
		BillInvoiceDt billInvoiceDt = new BillInvoiceDt();
		billInvoiceDt.setString("12/05/2013");
		invoiceData.setBillInvoiceDt(billInvoiceDt);
		invoiceData.setTotalCurAmt(totalCurAmt);
		PaidCurAmt paidCurAmt = new PaidCurAmt();
		paidCurAmt.setAmt(amt1);
		paidCurAmt.setCurCode(curCode1);
		invoiceData.setPaidCurAmt(paidCurAmt);
		InvoicePremium invoicePremium = new InvoicePremium();
		Amt amt2 = new Amt();
		amt2.setString("10000");
		invoicePremium.setAmt(amt1);
		invoicePremium.setCurCode(curCode1);
		invoiceData.setInvoicePremium(invoicePremium);

		Fee[] fee = new Fee[1];
		Fee fee1 = new Fee();
		fee1.setFeeType(FeeType.Purchase);
		CurAmt feeCurAmt = new CurAmt();
		Amt feeAmt1 = new Amt();
		feeAmt1.setString("1");
		CurCode feeCurCode1 = new CurCode();
		feeCurCode1.setCurCodeValue(CurCodeValue.MYR);
		feeCurAmt.setAmt(feeAmt1);
		feeCurAmt.setCurCode(feeCurCode1);
		fee1.setCurAmt(feeCurAmt);
		invoiceData.setFee(fee);
		acctTrnInfo1.setInvoiceData(invoiceData);

		CustPayeeInfo custPayeeInfo = new CustPayeeInfo();
		Name name = new Name();
		name.setString("eBay");
		custPayeeInfo.setName(name);
		PayeeAcctNum payeeAcctNum = new PayeeAcctNum();
		custPayeeInfo.setPayeeAcctNum(payeeAcctNum);
		PayerAcctNum payerAcctNum = new PayerAcctNum();
		custPayeeInfo.setPayerAcctNum(payerAcctNum);

		StdPayeeRef stdPayeeRef = new StdPayeeRef();
		StdPayeeRec stdPayeeRec = new StdPayeeRec();
		StdPayeeId stdPayeeId = new StdPayeeId();
		stdPayeeId.setString("123");
		stdPayeeRec.setStdPayeeId(stdPayeeId);
		StdPayeeInfo stdPayeeInfo = new StdPayeeInfo();
		PartyData partyData = new PartyData();
		Contact[] contact = new Contact[0];
		contact[1] = new Contact();
		ContactName contactName = new ContactName();
		contactName.setString("eBay");
		contact[1].setContactName(contactName);
		Email email = new Email();
		EmailAddr emailAddr = new EmailAddr();
		emailAddr.setString("billing@ebay.com");
		email.setEmailAddr(emailAddr);
		contact[1].setLocator(email);
		partyData.setContact(contact);
		stdPayeeInfo.setPartyData(partyData);
		stdPayeeRec.setStdPayeeInfo(stdPayeeInfo);
		stdPayeeRef.setStdPayeeRec(stdPayeeRec);
		custPayeeInfo.setStdPayeeRef(stdPayeeRef);
		acctTrnInfo1.setCustPayeeInfo(custPayeeInfo);

		CounterpartyData counterpartyData = new CounterpartyData();
		LegalName legalName = new LegalName();
		legalName.setString("Ong Eu Soon");
		counterpartyData.setLegalName(legalName);
		AcctKeys acctKeys = new AcctKeys();
		AcctId acctId = new AcctId();
		acctId.setString(id);
		acctKeys.setAcctId(acctId);
		AcctType acctType = new AcctType();
		acctType.setAcctTypeValue(AcctTypeValue.SDA);
		acctKeys.setAcctType(acctType);
		AcctIdent acctIdent = new AcctIdent();
		acctIdent.setAcctIdentType(AcctIdentType.AcctNum);
		AcctIdentValue AcctIdentValue = new AcctIdentValue();
		AcctIdentValue.setString(accountNo);
		acctIdent.setAcctIdentValue(AcctIdentValue);
		acctKeys.setAcctIdent(acctIdent);
		counterpartyData.setAcctKeys(acctKeys);
		RefData refData = new RefData();
		refData.setRefType(RefType.CustomerNum);
		RefIdent refIdent = new RefIdent();
		refIdent.setString("126");
		refData.setRefIdent(refIdent);
		counterpartyData.setRefData(refData);

		acctTrnInfo1.setCounterpartyData(counterpartyData);

		acctTrnRec1.setAcctTrnInfo(acctTrnInfo1);
		acctTrnInqRs.setAcctTrnRec(acctTrnRec);

		return acctTrnInqRs;
	}

	/**
	 * Searches for account history entries on the given account
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "ifx/acctTrnInq", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody
	public AcctTrnInqRs acctTrnInq(AcctTrnInqRq acctTrnInqRq) {
		AcctTrnInqRs acctTrnInqRs = new AcctTrnInqRs();

		return acctTrnInqRs;
	}

	public AcctTrnInqRs acctTrnInq(AcctTrnInqRq acctTrnInqRq,
			AccountHistoryParams params) {
		DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");// formatted
		// as per
		// ISO 8601
		String startDate = df.format(params.getBeginDate());
		AcctTrnSel[] acctTrnSel = new AcctTrnSel[1];
		if (startDate != null) {
			String endDate = df.format(params.getEndDate());
			DtRange dtRange = new DtRange();
			StartDt startDt = new StartDt();
			startDt.setString(startDate);
			dtRange.setStartDt(startDt);
			EndDt endDt = new EndDt();
			endDt.setString(endDate);
			dtRange.setEndDt(endDt);
			acctTrnSel[1].setDtRange(dtRange);
		}

		java.lang.Long id = params.getMemberAccountId();
		if (id != -1) {
			acctTrnSel[1].getAcctKeys().getAcctId()
			.setString(java.lang.Long.toString(id));
		}

		acctTrnInqRq.setAcctTrnSel(acctTrnSel);

		return acctTrnInq(acctTrnInqRq);
	}

	/**
	 * Searches for account history entries on the given account
	 */
	@RequestMapping(value = "acctTrnInq/{id}/history", method = RequestMethod.POST)
	@ResponseBody
	public AcctTrnInqRs searchAccountHistory(
			@PathVariable final java.lang.Long id,
			final AcctTrnInqRq acctTrnInqRq, final AccountHistoryParams params) {
		AccountHistoryParams params1 = params;
		params1.setMemberAccountId(id);
		return acctTrnInq(acctTrnInqRq, params1);
	}

	/**
	 * Searches for account history entries on the default account
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "acctTrnInq/default/history", method = RequestMethod.GET)
	@ResponseBody
	public AcctTrnInqRs searchDefaultAccountHistory(
			final AccountHistoryParams params, final AcctTrnInqRq acctTrnInqRq) {
		java.lang.Long id = java.lang.Long.valueOf(1);
		return this.searchAccountHistory(id, acctTrnInqRq, params);

	}

}
