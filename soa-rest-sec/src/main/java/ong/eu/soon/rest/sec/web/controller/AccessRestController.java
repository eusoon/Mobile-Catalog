/*
   This file is part of Cyclos.

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

import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import my.com.infopro.ibank.app.dto.KeyDto;
import my.com.infopro.ibank.app.ejb.SecretKeyServiceRemote;
import my.com.infopro.ibank.app.utility.ServiceLocator;
import my.com.infopro.ibank.exception.ServiceLocatorException;
import my.com.infopro.ifx.element.CryptType;

import ong.eu.soon.entities.settings.LocalSettings;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;
import ong.eu.soon.services.settings.SettingsService;
import ong.eu.soon.webservices.model.AccountTypeVO;
import ong.eu.soon.webservices.model.CurrencyVO;
import ong.eu.soon.webservices.model.MemberAccountVO;
import ong.eu.soon.webservices.model.MyProfileVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller which handles /access paths
 * 
 * @author luis
 */
@Controller
@RequestMapping(value = UriMappingConstants.ACCESS)
public class AccessRestController {

	public static class InitialData {
		private MyProfileVO           profile;
		private boolean               requireTransactionPassword;
		private List<MemberAccountVO> accounts;
		private boolean               canMakeMemberPayments;
		private boolean               canMakeSystemPayments;
		private int                   decimalCount;
		private char                  decimalSeparator;
		private CryptType cryptType;
		private String svcProviderName;
		private long keySerial;
		private String modulus;
		private String publicExponent;

		public List<MemberAccountVO> getAccounts() {
			return accounts;
		}

		public int getDecimalCount() {
			return decimalCount;
		}

		public char getDecimalSeparator() {
			return decimalSeparator;
		}

		public MyProfileVO getProfile() {
			return profile;
		}

		public boolean isCanMakeMemberPayments() {
			return canMakeMemberPayments;
		}

		public boolean isCanMakeSystemPayments() {
			return canMakeSystemPayments;
		}

		public boolean isRequireTransactionPassword() {
			return requireTransactionPassword;
		}

		public void setAccounts(final List<MemberAccountVO> accounts1) {
			accounts = accounts1;
		}

		public void setCanMakeMemberPayments(
				final boolean canMakeMemberPayments1) {
			canMakeMemberPayments = canMakeMemberPayments1;
		}

		public void setCanMakeSystemPayments(
				final boolean canMakeSystemPayments1) {
			canMakeSystemPayments = canMakeSystemPayments1;
		}

		public void setDecimalCount(final int decimalCount1) {
			decimalCount = decimalCount1;
		}

		public void setDecimalSeparator(final char decimalSeparator1) {
			decimalSeparator = decimalSeparator1;
		}

		public void setProfile(final MyProfileVO profile1) {
			profile = profile1;
		}

		public void setRequireTransactionPassword(
				final boolean requireTransactionPassword1) {
			requireTransactionPassword = requireTransactionPassword1;
		}

		@Override
		public String toString() {
			return "InitialData [profile=" + profile + ", requireTransactionPassword=" + requireTransactionPassword + ", accounts=" + accounts + ", canMakeMemberPayments=" + canMakeMemberPayments + ", canMakeSystemPayments=" + canMakeSystemPayments + ", decimalCount=" + decimalCount + ", decimalSeparator=" + decimalSeparator + "]";
		}

		public CryptType getCryptType() {
			return cryptType;
		}

		public void setCryptType(CryptType cryptType) {
			this.cryptType = cryptType;
		}

		public String getSvcProviderName() {
			return svcProviderName;
		}

		public void setSvcProviderName(String svcProviderName) {
			this.svcProviderName = svcProviderName;
		}

		public long getKeySerial() {
			return keySerial;
		}

		public void setKeySerial(long keySerial1) {
			keySerial = keySerial1;

		}

		public String getModulus() {
			return modulus;
		}

		public void setModulus(String modulus1) {
			modulus = modulus1;

		}

		public String getPublicExponent() {
			return publicExponent;
		}

		public void setPublicExponent(String publicExponent1) {
			publicExponent = publicExponent1;
		}

	}

	@Autowired
	private SettingsService settingsService;

	/**
	 * Returns general data about the authenticated user
	 */
	@RequestMapping(value = "initialData", method = RequestMethod.POST)
	@ResponseBody
	public InitialData getInitialData(@RequestBody final String encKey) {

		InitialData data = new InitialData();
		data.setProfile(getMyProfile());
		data.setCryptType(CryptType.None);
		data.setSvcProviderName("www.maybank4u.com.my");
		data.setAccounts(listAccounts());
		data.setRequireTransactionPassword(isRequireTransactionPassword());

		data.setCanMakeMemberPayments(true);
		data.setCanMakeSystemPayments(true);
		final LocalSettings localSettings = settingsService.getLocalSettings();
		data.setDecimalCount(localSettings.getPrecision().getValue());
		data.setDecimalSeparator(new DecimalFormatSymbols(localSettings
				.getNumberLocale()
				.getLocale()).getDecimalSeparator());
		try {

			SecretKeyServiceRemote secretKeyServiceRemote = (SecretKeyServiceRemote) ServiceLocator
					.getInstance().getLocalService(
							SecretKeyServiceRemote.JNDI_NAME);
			KeyDto rpk = secretKeyServiceRemote.getRandomPublicKey();
			data.setKeySerial(rpk.getKeySerial());
			data.setModulus(rpk.getModulus().trim());
			data.setPublicExponent(rpk.getPubExp().trim());

		} catch (ServiceLocatorException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}



	private List<MemberAccountVO> listAccounts() {
		List<MemberAccountVO> accounts = new ArrayList<MemberAccountVO>();
		MemberAccountVO memberAccountVO1 = new MemberAccountVO();
		memberAccountVO1.setId(new Long(1));
		memberAccountVO1.setDefault(true);
		memberAccountVO1.setAccountNo("4549681213");
		AccountTypeVO type1 = new AccountTypeVO();
		type1.setName("Saving Account");
		CurrencyVO currency1 = new CurrencyVO();
		currency1.setId(new Long(10));
		currency1.setName("Ringgit Malaysia");
		currency1.setSymbol("MYR");
		type1.setCurrency(currency1);

		type1.setId(Long.valueOf(1));
		memberAccountVO1.setType(type1);
		accounts.add(memberAccountVO1);
		MemberAccountVO memberAccountVO2 = new MemberAccountVO();
		memberAccountVO2.setId(Long.valueOf(2));
		memberAccountVO2.setDefault(false);
		memberAccountVO2.setAccountNo("7041123325");
		AccountTypeVO type2 = new AccountTypeVO();
		type2.setName("Current Account");
		type2.setCurrency(currency1);
		type2.setId(Long.valueOf(2));
		memberAccountVO2.setType(type2);
		accounts.add(memberAccountVO2);
		MemberAccountVO memberAccountVO3 = new MemberAccountVO();
		memberAccountVO3.setId(Long.valueOf(3));
		memberAccountVO3.setDefault(false);
		memberAccountVO3.setAccountNo("4563773020360023");
		AccountTypeVO type3 = new AccountTypeVO();
		type3.setName("Credit Card Account");
		type3.setCurrency(currency1);
		type3.setId(Long.valueOf(3));
		memberAccountVO3.setType(type3);
		accounts.add(memberAccountVO3);
		return accounts;
	}

	private MyProfileVO getMyProfile() {
		MyProfileVO myProfileVO = new MyProfileVO();
		myProfileVO.setEmail("esong@infopro.com.my");
		myProfileVO.setGroupId(new Long(123));
		myProfileVO.setName("Ong Eu Soon");
		myProfileVO.setUsername("toledo");
		myProfileVO.setId(new Long(1));
		return myProfileVO;
	}

	@RequestMapping(value = "requireTransactionPassword", method = RequestMethod.GET)
	@ResponseBody
	public boolean isRequireTransactionPassword() {
		// TODO
		return true;
	}



}
