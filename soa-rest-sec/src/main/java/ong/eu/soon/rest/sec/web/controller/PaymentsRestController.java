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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;


import ong.eu.soon.entities.accounts.AccountOwner;
import ong.eu.soon.entities.accounts.SystemAccountOwner;
import ong.eu.soon.entities.members.Member;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;
import ong.eu.soon.services.transactions.exceptions.MaxAmountPerDayExceededException;
import ong.eu.soon.services.transactions.exceptions.NotEnoughCreditsException;
import ong.eu.soon.services.transactions.exceptions.PaymentException;
import ong.eu.soon.services.transactions.exceptions.TransferMinimumPaymentException;
import ong.eu.soon.services.transactions.exceptions.UpperCreditLimitReachedException;
import ong.eu.soon.webservices.model.AccountTypeVO;
import ong.eu.soon.webservices.model.CurrencyVO;
import ong.eu.soon.webservices.model.FieldValueVO;
import ong.eu.soon.webservices.model.MemberVO;
import ong.eu.soon.webservices.model.ServerErrorVO;
import ong.eu.soon.webservices.model.TransactionFeeVO;
import ong.eu.soon.webservices.model.TransferTypeVO;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Controller which handles /payments paths
 * 
 * @author luis
 */
@Controller
@RequestMapping(value = UriMappingConstants.PAYMENTS)
public class PaymentsRestController {

	/**
	 * Result after doing a payment confirmation
	 * @author jcomas
	 */
	public static class ConfirmPaymentResult {
		private Long    id;
		private boolean pending;

		public Long getId() {
			return id;
		}

		public boolean isPending() {
			return pending;
		}

		public void setId(final Long id) {
			this.id = id;
		}

		public void setPending(final boolean pending) {
			this.pending = pending;
		}
	}

	/**
	 * Parameters for doing a payment to a member
	 * @author luis
	 */
	public static class DoMemberPaymentParameters extends DoPaymentParameters {
		private Long     toMemberId;
		private String   toMemberPrincipal;
		private Integer  installments = 0;
		private Calendar firstInstallmentDate;

		public Calendar getFirstInstallmentDate() {
			return firstInstallmentDate;
		}

		public int getInstallments() {
			return installments;
		}

		public Long getToMemberId() {
			return toMemberId;
		}

		public String getToMemberPrincipal() {
			return toMemberPrincipal;
		}

		public void setFirstInstallmentDate(final Calendar firstInstallmentDate) {
			this.firstInstallmentDate = firstInstallmentDate;
		}

		public void setInstallments(final int installments) {
			this.installments = installments;
		}

		public void setToMemberId(final Long toMemberId) {
			this.toMemberId = toMemberId;
		}

		public void setToMemberPrincipal(final String toMemberPrincipal) {
			this.toMemberPrincipal = toMemberPrincipal;
		}
	}

	/**
	 * Parameters for doing a payment to system
	 * @author luis
	 */
	public static class DoPaymentParameters {
		private Long               currencyId;
		private String             currencySymbol;
		private Long               transferTypeId;
		private BigDecimal         amount;
		private String             description;
		private String             transactionPassword;
		private List<FieldValueVO> customValues;

		public BigDecimal getAmount() {
			return amount;
		}

		public Long getCurrencyId() {
			return currencyId;
		}

		public String getCurrencySymbol() {
			return currencySymbol;
		}

		public List<FieldValueVO> getCustomValues() {
			return customValues;
		}

		public String getDescription() {
			return description;
		}

		public String getTransactionPassword() {
			return transactionPassword;
		}

		public Long getTransferTypeId() {
			return transferTypeId;
		}

		public void setAmount(final BigDecimal amount) {
			this.amount = amount;
		}

		public void setCurrencyId(final Long currencyId) {
			this.currencyId = currencyId;
		}

		public void setCurrencySymbol(final String currencySymbol) {
			this.currencySymbol = currencySymbol;
		}

		public void setCustomValues(final List<FieldValueVO> customValues) {
			this.customValues = customValues;
		}

		public void setDescription(final String description) {
			this.description = description;
		}

		public void setTransactionPassword(final String transactionPassword) {
			this.transactionPassword = transactionPassword;
		}

		public void setTransferTypeId(final Long transferTypeId) {
			this.transferTypeId = transferTypeId;
		}

		@Override
		public String toString() {
			return "DoPaymentParameters [currencyId=" + currencyId + ", currencySymbol=" + currencySymbol + ", transferTypeId=" + transferTypeId + ", amount=" + amount + ", description=" + description + ", transactionPassword=" + transactionPassword + ", customValues=" + customValues + "]";
		}

	}

	/**
	 * Result after doing a payment
	 * @author luis
	 */
	public static class DoPaymentResult {
		private boolean                wouldRequireAuthorization;
		private MemberVO               from;
		private MemberVO               to;
		private BigDecimal             finalAmount;
		private String                 formattedFinalAmount;
		private List<TransactionFeeVO> fees;
		private TransferTypeVO         transferType;
		private Map<String, String>    customValues;

		public Map<String, String> getCustomValues() {
			return customValues;
		}

		public List<TransactionFeeVO> getFees() {
			return fees;
		}

		public BigDecimal getFinalAmount() {
			return finalAmount;
		}

		public String getFormattedFinalAmount() {
			return formattedFinalAmount;
		}

		public MemberVO getFrom() {
			return from;
		}

		public MemberVO getTo() {
			return to;
		}

		public TransferTypeVO getTransferType() {
			return transferType;
		}

		public boolean isWouldRequireAuthorization() {
			return wouldRequireAuthorization;
		}

		public void setCustomValues(final Map<String, String> customValues) {
			this.customValues = customValues;
		}

		public void setFees(final List<TransactionFeeVO> fees) {
			this.fees = fees;
		}

		public void setFinalAmount(final BigDecimal finalAmount) {
			this.finalAmount = finalAmount;
		}

		public void setFormattedFinalAmount(final String formattedFinalAmount) {
			this.formattedFinalAmount = formattedFinalAmount;
		}

		public void setFrom(final MemberVO from) {
			this.from = from;
		}

		public void setTo(final MemberVO to) {
			this.to = to;
		}

		public void setTransferType(final TransferTypeVO transferType) {
			this.transferType = transferType;
		}

		public void setWouldRequireAuthorization(final boolean wouldRequireAuthorization) {
			this.wouldRequireAuthorization = wouldRequireAuthorization;
		}

	}

	private static final String         BLOCKED_TRANSACTION_PASSWORD_ERROR  = "BLOCKED_TRANSACTION_PASSWORD";
	private static final String         INVALID_TRANSACTION_PASSWORD_ERROR  = "INVALID_TRANSACTION_PASSWORD";
	private static final String         MISSING_TRANSACTION_PASSWORD_ERROR  = "MISSING_TRANSACTION_PASSWORD";
	private static final String         INACTIVE_TRANSACTION_PASSWORD_ERROR = "INACTIVE_TRANSACTION_PASSWORD";
	private static final String         NO_POSSIBLE_TRANSFER_TYPES_ERROR    = "NO_POSSIBLE_TRANSFER_TYPES";

	private static final String         INVALID_AMOUNT_ERROR                = "INVALID_AMOUNT";

	private static final String         MAX_AMOUNT_PER_DAY_EXCEEDED         = "MAX_AMOUNT_PER_DAY_EXCEEDED";
	private static final String         NOT_ENOUGH_CREDITS                  = "NOT_ENOUGH_FUNDS";
	private static final String         UPPER_CREDIT_LIMIT_REACHED          = "UPPER_CREDIT_LIMIT_REACHED";
	protected static final String       TRANSFER_MINIMUM_PAYMENT            = "TRANSFER_MINIMUM_PAYMENT";
	protected static final String       UNKNOWN_PAYMENT_ERROR               = "UNKNOWN_PAYMENT_ERROR";



	/**
	 * Confirms a payment to another member
	 */
	@RequestMapping(value = "confirmMemberPayment", method = RequestMethod.POST)
	@ResponseBody
	public ConfirmPaymentResult confirmPaymentToMember(@RequestBody final DoMemberPaymentParameters params) {

		Member toMember = new Member();

		return confirmPayment(params, toMember);
	}

	/**
	 * Confirms a payment to a system account
	 */
	@RequestMapping(value = "confirmSystemPayment", method = RequestMethod.POST)
	@ResponseBody
	public ConfirmPaymentResult confirmPaymentToSystem(@RequestBody final DoPaymentParameters params) {
		return confirmPayment(params, SystemAccountOwner.instance());
	}

	/**
	 * Performs a payment between accounts
	 */
	// TODO not possible now because transfer types with context self payment cannot have channels. Should we change this?
	// @RequestMapping(value = "payments/selfPayment", method = RequestMethod.POST)
	// @ResponseBody
	// public DoPaymentResult doPaymentToSelf(@RequestBody final DoPaymentParameters params) {
	// return doPayment(params, LoggedUser.member());
	// }

	/**
	 * Performs a payment to another member
	 */
	@RequestMapping(value = "memberPayment", method = RequestMethod.POST)
	@ResponseBody
	public DoPaymentResult doPaymentToMember(@RequestBody final DoMemberPaymentParameters params) {

		Member to = new Member();
		return doPayment(params, to);
	}

	/**
	 * Performs a payment to a system account
	 */
	@RequestMapping(value = "systemPayment", method = RequestMethod.POST)
	@ResponseBody
	public DoPaymentResult doPaymentToSystem(@RequestBody final DoPaymentParameters params) {
		return doPayment(params, SystemAccountOwner.instance());
	}



	/**
	 * Handles {@link PaymentException}s
	 */
	@ExceptionHandler(PaymentException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.METHOD_FAILURE)
	public ServerErrorVO handlePaymentException(final PaymentException ex) {
		String errorCode = UNKNOWN_PAYMENT_ERROR;
		if (ex instanceof MaxAmountPerDayExceededException) {
			errorCode = MAX_AMOUNT_PER_DAY_EXCEEDED;
		} else if (ex instanceof NotEnoughCreditsException) {
			errorCode = NOT_ENOUGH_CREDITS;
		} else if (ex instanceof TransferMinimumPaymentException) {
			errorCode = TRANSFER_MINIMUM_PAYMENT;
		} else if (ex instanceof UpperCreditLimitReachedException) {
			errorCode = UPPER_CREDIT_LIMIT_REACHED;
		}

		return new ServerErrorVO(errorCode, null);
	}




	/*
	 * 
	 * private List<ScheduledPaymentDTO> buildInstallments(final DoPaymentParameters params, final Member loggedMember, final BigDecimal amount, final
	 * TransferType transferType) { List<ScheduledPaymentDTO> installments = null; if (params instanceof DoMemberPaymentParameters) {
	 * DoMemberPaymentParameters mp = (DoMemberPaymentParameters) params; Integer installmentCount = mp.getInstallments(); if (installmentCount !=
	 * null && installmentCount > 0) { Calendar firstDate = mp.getFirstInstallmentDate(); if (firstDate == null) { firstDate = Calendar.getInstance();
	 * } ProjectionDTO projection = new ProjectionDTO(); projection.setAmount(amount); projection.setFrom(loggedMember);
	 * projection.setRecurrence(TimePeriod.ONE_MONTH); projection.setTransferType(transferType); projection.setFirstExpirationDate(firstDate);
	 * projection.setPaymentCount(installmentCount); installments = paymentService.calculatePaymentProjection(projection); } } return installments; }
	 */

	private ConfirmPaymentResult confirmPayment(final DoPaymentParameters params, final AccountOwner toOwner) {

		ConfirmPaymentResult result = new ConfirmPaymentResult();


		return result;
	}

	private DoPaymentResult doPayment(final DoPaymentParameters params, final AccountOwner to) {

		DoPaymentResult result = new DoPaymentResult();

		TransferTypeVO transferTypeVO = new TransferTypeVO();

		transferTypeVO.setId(params.getTransferTypeId());

		transferTypeVO.setName("");
		AccountTypeVO from1 = new AccountTypeVO();
		from1.setId(Long.valueOf(1));
		from1.setName("");
		CurrencyVO currency1 = new CurrencyVO();
		currency1.setId(params.getCurrencyId());
		currency1.setSymbol(params.getCurrencySymbol());
		from1.setCurrency(currency1);
		transferTypeVO.setFrom(from1);

		AccountTypeVO to1 = new AccountTypeVO();
		to1.setId(Long.valueOf(2));
		to1.setName("");
		CurrencyVO currency2 = new CurrencyVO();
		currency2.setId(params.getCurrencyId());
		currency2.setSymbol(params.getCurrencySymbol());
		to1.setCurrency(currency2);
		transferTypeVO.setTo(to1);

		result.setTransferType(transferTypeVO);

		final boolean wouldRequireAuthorization = true;
		result.setWouldRequireAuthorization(wouldRequireAuthorization);

		MemberVO fromMember = new MemberVO();
		// fromMember.setId(id);
		// fromMember.setEmail(email);
		// fromMember.setGroupId(groupId);
		// fromMember.setName(name);
		// fromMember.setUsername(username);
		result.setFrom(fromMember);

		MemberVO toMember = new MemberVO();
		// toMember.setId(id);
		// toMember.setEmail(email);
		// toMember.setGroupId(groupId);
		// toMember.setName(name);
		// toMember.setUsername(username);
		result.setTo(toMember);

		// Store the transaction fees

		result.setFinalAmount(params.getAmount());


		String formattedAmount = "";

		List<TransactionFeeVO> fees = new ArrayList<TransactionFeeVO>();
		TransactionFeeVO fee1 = new TransactionFeeVO();
		// fee1.setName(name);
		// fee1.setAmount(amount);
		fee1.setFormattedAmount(formattedAmount);
		fees.add(fee1);
		result.setFees(fees);
		result.setFormattedFinalAmount(formattedAmount);

		return result;

	}


}
