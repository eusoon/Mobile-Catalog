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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import my.com.infopro.ifx.element.AsyncRqUID;
import my.com.infopro.ifx.element.AsyncRsData;
import my.com.infopro.ifx.element.AvailDt;
import my.com.infopro.ifx.element.BirthPlace;
import my.com.infopro.ifx.element.Contact;
import my.com.infopro.ifx.element.ContactName;
import my.com.infopro.ifx.element.ContactType;
import my.com.infopro.ifx.element.ContextRqHdr;
import my.com.infopro.ifx.element.ContextRsHdr;
import my.com.infopro.ifx.element.CredentialsRqHdr;
import my.com.infopro.ifx.element.CredentialsRsHdr;
import my.com.infopro.ifx.element.CustPayeeId;
import my.com.infopro.ifx.element.CustPayeeInfo;
import my.com.infopro.ifx.element.CustPayeeRec;
import my.com.infopro.ifx.element.CustPayeeSel;
import my.com.infopro.ifx.element.CustPayeeStatus;
import my.com.infopro.ifx.element.CustPayeeStatusCode;
import my.com.infopro.ifx.element.Email;
import my.com.infopro.ifx.element.EmailAddr;
import my.com.infopro.ifx.element.EmailType;
import my.com.infopro.ifx.element.Environment;
import my.com.infopro.ifx.element.ExpDt;
import my.com.infopro.ifx.element.FSPayee;
import my.com.infopro.ifx.element.FamilyName;
import my.com.infopro.ifx.element.FullName;
import my.com.infopro.ifx.element.Gender;
import my.com.infopro.ifx.element.GivenName;
import my.com.infopro.ifx.element.IdentVerifyMethod;
import my.com.infopro.ifx.element.IssuedIdent;
import my.com.infopro.ifx.element.IssuedIdentType;
import my.com.infopro.ifx.element.IssuedIdentValue;
import my.com.infopro.ifx.element.Language;
import my.com.infopro.ifx.element.MaritalStat;
import my.com.infopro.ifx.element.MotherMaidenName;
import my.com.infopro.ifx.element.MsgRqHdr;
import my.com.infopro.ifx.element.MsgRsHdr;
import my.com.infopro.ifx.element.Name;
import my.com.infopro.ifx.element.OrgData;
import my.com.infopro.ifx.element.POSLocation;
import my.com.infopro.ifx.element.PartyData;
import my.com.infopro.ifx.element.PartyRef;
import my.com.infopro.ifx.element.PayeeType;
import my.com.infopro.ifx.element.PersonData;
import my.com.infopro.ifx.element.PersonName;
import my.com.infopro.ifx.element.PersonPartyInfo;
import my.com.infopro.ifx.element.PointOfServiceData;
import my.com.infopro.ifx.element.RqUID;
import my.com.infopro.ifx.element.SecToken;
import my.com.infopro.ifx.element.SecTokenLogin;
import my.com.infopro.ifx.element.SecTokenParty;
import my.com.infopro.ifx.element.ServerDt;
import my.com.infopro.ifx.element.SessKey;
import my.com.infopro.ifx.element.Severity;
import my.com.infopro.ifx.element.StartSession;
import my.com.infopro.ifx.element.Status;
import my.com.infopro.ifx.element.StatusCode;
import my.com.infopro.ifx.element.StatusDesc;
import my.com.infopro.ifx.element.StdPayeeInfo;
import my.com.infopro.ifx.element.StdPayeeRef;
import my.com.infopro.ifx.element.SubjectRole;
import my.com.infopro.ifx.element.SvcIdent;
import my.com.infopro.ifx.element.SvcName;
import my.com.infopro.ifx.element.SvcProviderName;
import my.com.infopro.ifx.element.XferPayee;
import my.com.infopro.ifx.payee.CustPayeeAddRq;
import my.com.infopro.ifx.payee.CustPayeeAddRs;
import my.com.infopro.ifx.payee.CustPayeeDelRq;
import my.com.infopro.ifx.payee.CustPayeeDelRs;
import my.com.infopro.ifx.payee.CustPayeeInqRq;
import my.com.infopro.ifx.payee.CustPayeeInqRs;
import my.com.infopro.ifx.payee.CustPayeeModRq;
import my.com.infopro.ifx.payee.CustPayeeModRs;

import ong.eu.soon.rest.sec.web.common.UriMappingConstants;
import ong.eu.soon.webservices.model.ContactVO;
import ong.eu.soon.webservices.model.MemberVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller which handles /contacts paths
 * 
 * @author luis
 */
@Controller
@RequestMapping(value = UriMappingConstants.CONTACTS)
public class ContactsRestController {

	/**
	 * JSON class which holds notes for contacts
	 * @author luis
	 */
	public static class ContactNotes {
		private String notes;

		public String getNotes() {
			return notes;
		}

		public void setNotes(final String notes) {
			this.notes = notes;
		}
	}

	/**
	 * Handles the contact list
	 */
	@RequestMapping(value = "contacts", method = RequestMethod.GET)
	@ResponseBody
	public List<ContactVO> listContacts() {
		List<ContactVO> list = new ArrayList<ContactVO>();
		return list;
	}

	private MsgRsHdr getMsgRsHdr(MsgRqHdr msgRqHdr, Status status) {
		MsgRsHdr msgRsHdr = new MsgRsHdr();
		// AsyncRsData
		AsyncRsData asyncRsData = new AsyncRsData();
		// AsyncRsData/AsyncRqUID
		AsyncRqUID asyncRqUID = msgRqHdr.getAsyncRqUID();
		asyncRsData.setAsyncRqUID(asyncRqUID);
		// AsyncRsData/AvailDt
		AvailDt availDt = new AvailDt();
		DateFormat df = new SimpleDateFormat("yyyy-mm-ddThh:mm:ss");// formatted
		// as per
		// ISO 8601
		String strDate = df.format(new Date());
		availDt.setString(strDate);
		asyncRsData.setAvailDt(availDt);
		msgRsHdr.setAsyncRsData(asyncRsData);

		// CredentialsRsHdr
		CredentialsRsHdr[] credentialsRsHdr_ = new CredentialsRsHdr[1];
		CredentialsRsHdr credentialsRsHdr = new CredentialsRsHdr();
		// CredentialsRsHdr/Status
		credentialsRsHdr.setStatus(status);
		// CredentialsRsHdr/SessionKey
		SessKey sessKey = new SessKey();
		sessKey.setString("OTP");
		credentialsRsHdr.setSessKey(sessKey);
		// //CredentialsRsHdr/SeqNum
		// credentialsRsHdr.setSeqNum(seqNum);
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
		return msgRsHdr;
	}

	private Status getStatus(String statuscode, Severity severity, String desc) {
		Status status = new Status();
		StatusCode statusCode = new StatusCode();
		statusCode.setString(statuscode);
		status.setStatusCode(statusCode);
		status.setSeverity(severity);
		StatusDesc statusDesc = new StatusDesc();
		statusDesc.setString(desc);
		status.setStatusDesc(statusDesc);
		return status;
	}

	private CustPayeeRec[] getCustPayeeRec(String name1, String username1,
			String email1, String groupid) {
		CustPayeeRec[] custPayeeRec = new CustPayeeRec[1];
		CustPayeeInfo custPayeeInfo = new CustPayeeInfo();
		Name name = new Name();
		name.setString(name1);
		custPayeeInfo.setName(name);
		StdPayeeRef stdPayeeRef = new StdPayeeRef();
		StdPayeeInfo stdPayeeInfo = new StdPayeeInfo();
		OrgData partyData = new OrgData();
		IssuedIdent[] issuedIdent = new IssuedIdent[2];
		issuedIdent[0].setIssuedIdentType(IssuedIdentType.MerchantId);
		IssuedIdentValue issuedIdentValue = new IssuedIdentValue();
		issuedIdentValue.setString(username1);
		issuedIdent[0].setIssuedIdentValue(issuedIdentValue);
		issuedIdent[1].setIssuedIdentType(IssuedIdentType.GroupId);
		issuedIdentValue.setString(groupid);
		issuedIdent[1].setIssuedIdentValue(issuedIdentValue);
		partyData.setIssuedIdent(issuedIdent);
		Contact[] contact = new Contact[1];
		contact[0].setContactType(ContactType.CustSvc);
		Email email = new Email();
		email.setEmailType(EmailType.Business);
		EmailAddr emailAddr = new EmailAddr();
		emailAddr.setString(email1);
		email.setEmailAddr(emailAddr);
		contact[0].setLocator(email);
		partyData.setContact(contact);
		stdPayeeInfo.setPartyData(partyData);
		stdPayeeRef.setStdPayeeInfo(stdPayeeInfo);
		custPayeeInfo.setStdPayeeRef(stdPayeeRef);
		custPayeeRec[0].setCustPayeeInfo(custPayeeInfo);
		return custPayeeRec;
	}

	/**
	 * Gets a contact by id
	 */
	@RequestMapping(value = "ifx/custPayeeInq/{id}", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeInqRs loadById(@RequestBody CustPayeeInqRq custPayeeInqRq,
			@PathVariable final Long id) {
		CustPayeeInqRs custPayeeInqRs = new CustPayeeInqRs();

		Status status = getStatus("0", Severity.Info, "Success");
		// Status
		custPayeeInqRs.setStatus(status);
		// RqUID
		custPayeeInqRs.setRqUID(custPayeeInqRq.getRqUID());
		// MsgRsHdr
		getMsgRsHdr(custPayeeInqRq.getMsgRqHdr(), status);
		// CustPayeeRec[]
		CustPayeeRec[] custPayeeRec = getCustPayeeRec("Mark Zuckerberg",
				"mark_z", "mark_zb@gmail.com", "2");
		custPayeeInqRs.setCustPayeeRec(custPayeeRec);
		return custPayeeInqRs;
	}

	@RequestMapping(value = "custPayeeInq/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ContactVO loadContactByid(CustPayeeInqRq custPayeeInqRq,
			final Long id) {
		CustPayeeInqRs custPayeeInqRs = this.loadById(custPayeeInqRq, id);

		ContactVO contactVO = new ContactVO();
		contactVO.setId(id);

		MemberVO member = new MemberVO();
		member.setId(id);
		CustPayeeInfo custPayeeInfo = custPayeeInqRs.getCustPayeeRec()[0]
				.getCustPayeeInfo();
		String name = custPayeeInfo.getName().getString();
		member.setName(name);
		PartyData partyData = custPayeeInfo.getStdPayeeRef().getStdPayeeInfo()
				.getPartyData();
		OrgData orgData = null;
		PersonData personData = null;

		if (partyData instanceof OrgData) {
			orgData = (OrgData) partyData;
			IssuedIdent[] issuedIdents = orgData.getIssuedIdent();
			Contact[] contacts = orgData.getContact();
			for (IssuedIdent issuedIdent : issuedIdents) {
				if (issuedIdent.getIssuedIdentType().equals(
						IssuedIdentType.MerchantId)) {
					String username = issuedIdent.getIssuedIdentValue()
							.getString();
					member.setUsername(username);
				}
				if (issuedIdent.getIssuedIdentType().equals(
						IssuedIdentType.GroupId)) {
					String grougId = issuedIdent.getIssuedIdentValue()
							.getString();
					member.setGroupId(Long.valueOf(grougId));
				}
			}

			for (Contact contact : contacts) {
				if (contact.getContactType().equals(ContactType.CustSvc)) {
					Email email = (Email) contact.getLocator();
					member.setEmail(email.getEmailAddr().getString());
				}
			}
		} else if (partyData instanceof PersonData) {
			personData = (PersonData) partyData;
			IssuedIdent[] issuedIdents = personData.getIssuedIdent();
			Contact[] contacts = personData.getContact();
			for (IssuedIdent issuedIdent : issuedIdents) {
				if (issuedIdent.getIssuedIdentType().equals(
						IssuedIdentType.MerchantId)) {
					//
					String username = issuedIdent.getIssuedIdentValue()
							.getString();
					member.setUsername(username);
				}
				if (issuedIdent.getIssuedIdentType().equals(
						IssuedIdentType.GroupId)) {
					String grougId = issuedIdent.getIssuedIdentValue()
							.getString();
					member.setGroupId(Long.valueOf(grougId));
				}
			}

			for (Contact contact : contacts) {
				if (contact.getContactType().equals(ContactType.CustSvc)) {
					Email email = (Email) contact.getLocator();
					member.setEmail(email.getEmailAddr().getString());
				}
			}
		}
		contactVO.setMember(member);
		contactVO.setNotes("");
		return contactVO;
	}

	private MsgRqHdr getMsgRqHdr(String svcName_, String svcProviderName_,
			String familyName_, String givenName_, String fullName_,
			String contactName_, String birthPlace_, String motherName_,
			Gender gender, MaritalStat maritalStat) {
		// Option
		MsgRqHdr _msgRqHdr = new MsgRqHdr();
		UUID asyncRqUID = UUID.randomUUID();
		AsyncRqUID _asyncRqUID = new AsyncRqUID();
		_asyncRqUID.setString(asyncRqUID.toString());
		_msgRqHdr.setAsyncRqUID(_asyncRqUID);

		SvcIdent svcIdent = new SvcIdent();
		SvcName svcName = new SvcName();
		svcName.setString(svcName_);
		svcIdent.setSvcName(svcName);
		SvcProviderName svcProviderName = new SvcProviderName();
		svcProviderName.setString(svcProviderName_);
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
		familyName1.setString(familyName_);
		familyName[0] = familyName1;
		personName.setFamilyName(familyName);
		GivenName[] givenNames = new GivenName[1];
		GivenName givenName1 = new GivenName();
		givenName1.setString(givenName_);
		givenNames[0] = givenName1;
		personName.setGivenName(givenNames);
		FullName fullName = new FullName();// Required
		fullName.setString(fullName_);
		personName.setFullName(fullName);
		personData.setPersonName(personName);
		Contact[] contact = new Contact[1];
		ContactName contactName = new ContactName();
		contactName.setString(contactName_);
		contact[0].setContactName(contactName);
		contact[0].setContactType(ContactType.Personal);
		personData.setContact(contact);
		secToken2.setPersonData(personData);
		SecToken[] secTokens = new SecToken[2];
		secTokens[0] = secToken2;

		PartyRef partyRef = new PartyRef();
		PersonPartyInfo personPartyInfo = new PersonPartyInfo();
		BirthPlace birthPlace = new BirthPlace();
		birthPlace.setString(birthPlace_);
		personPartyInfo.setBirthPlace(birthPlace);
		MotherMaidenName motherMaidenName = new MotherMaidenName();
		motherMaidenName.setString(motherName_);
		personPartyInfo.setMotherMaidenName(motherMaidenName);
		personPartyInfo.setPersonData(personData);
		personPartyInfo.setGender(gender);
		// MaritalStat maritalStat = MaritalStat.Married;
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
		return _msgRqHdr;
	}

	private RqUID getRqUID() {
		UUID rqUId = UUID.randomUUID();
		RqUID _rqUID = new RqUID();
		_rqUID.setString(rqUId.toString());
		return _rqUID;
	}
	/**
	 * Gets a contact by id
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public ContactVO loadById(@PathVariable final Long id) {
		ContactVO contactVO = new ContactVO();

		contactVO.setId(id);
		CustPayeeInqRq custPayeeInqRq = new CustPayeeInqRq();
		custPayeeInqRq.setRqUID(getRqUID());
		custPayeeInqRq.setMsgRqHdr(getMsgRqHdr("Contact Inquiry",// Service name
				"www.maybank2u.com.my", // Service provider name
				"Ong", // Family Name
				"Eu Soon", // Given Name
				"Ong Eu Soon",// Full Name
				"Ong Eu Soon",// Contact Name
				"Ipoh, Perak",// Birth Place
				"Mother Name",// Mother Name
				Gender.Male,//Gender
				MaritalStat.Married// Marital Status
				));
		contactVO = loadContactByid(custPayeeInqRq, id);
		// MemberVO member = new MemberVO();
		// member.setId(id);
		// member.setName("Mark Zuckerberg");
		// member.setUsername("mark_z");
		// member.setEmail("mark_zb@gmail.com");
		// member.setGroupId(Long.valueOf(2));
		// contactVO.setMember(member);
		// contactVO.setNotes("");

		return contactVO;
	}

	/**
	 * Saves a contact, finding the member by id
	 */
	@RequestMapping(value = "custPayeeInq/byMemberId/{memberId}", method = RequestMethod.GET)
	@ResponseBody
	public CustPayeeInqRs loadByMemberId(
			@RequestBody CustPayeeInqRq custPayeeInqRq,
			@PathVariable final Long memberId) {
		return getContactVO(custPayeeInqRq, memberId, null);
	}

	/**
	 * Saves a contact, finding the member by id
	 */
	@RequestMapping(value = "byMemberId/{memberId}", method = RequestMethod.GET)
	@ResponseBody
	public ContactVO loadByMemberId(@PathVariable final Long memberId) {
		return getContactVO(memberId, null);
	}

	/**
	 * Get a contact, finding the member by principal
	 */
	@RequestMapping(value = "custPayeeInq/byMemberPrincipal/{principal}", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeInqRs loadByMemberPrincipal(
			@RequestBody CustPayeeInqRq custPayeeInqRq,
			@PathVariable final String principal) {
		return getContactVO(custPayeeInqRq, null, principal);
	}


	/**
	 * Get a contact, finding the member by principal
	 */
	@RequestMapping(value = "byMemberPrincipal/{principal}", method = RequestMethod.GET)
	@ResponseBody
	public ContactVO loadByMemberPrincipal(@PathVariable final String principal) {
		return getContactVO(null, principal);
	}

	/**
	 * Removes a contact by id
	 */
	@RequestMapping(value = "custPayeeDel/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeById(@RequestBody CustPayeeDelRq custPayeeDelRq,
			@PathVariable final Long id) {
		//
	}

	/**
	 * Removes a contact by id
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeById(@PathVariable final Long id) {
		Contact contact = new Contact();

		remove(contact);
	}

	/**
	 * Removes a contact, finding the member by id
	 */
	@RequestMapping(value = "custPayeeDel/byMemberId/{memberId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeByMemberId(@RequestBody CustPayeeDelRq custPayeeDelRq,
			@PathVariable final Long memberId) {
		// Contact contact = getContact(memberId, null);
		// remove(contact);
	}

	/**
	 * Removes a contact, finding the member by id
	 */
	@RequestMapping(value = "byMemberId/{memberId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeByMemberId(@PathVariable final Long memberId) {
		// Contact contact = getContact(memberId, null);
		// remove(contact);
	}

	/**
	 * Removes a contact, finding the member by principal
	 */
	@RequestMapping(value = "custPayeeDel/byMemberPrincipal/{principal}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeByMemberPrincipal(
			@RequestBody CustPayeeDelRq custPayeeDelRq,
			@PathVariable final String principal) {
		// Contact contact = getContact(null, principal);
		// remove(contact);
	}

	/**
	 * Removes a contact, finding the member by principal
	 */
	@RequestMapping(value = "byMemberPrincipal/{principal}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeByMemberPrincipal(@PathVariable final String principal) {
		// Contact contact = getContact(null, principal);
		// remove(contact);
	}

	/**
	 * Saves a contact, finding the member by id
	 */
	@RequestMapping(value = "custPayeeAdd/byMemberId/{memberId}", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeAddRs addByMemberId(
			@RequestBody CustPayeeAddRq custPayeeAddRq,
			@PathVariable final Long memberId,
			@RequestBody final ContactNotes params) {
		return saveContact(custPayeeAddRq, memberId, null, getNotes(params));
	}

	private CustPayeeAddRs saveContact(CustPayeeAddRq custPayeeAddRq,
			Long memberId, String memberPrincipal, String notes) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Saves a contact, finding the member by id
	 */
	@RequestMapping(value = "custPayeeMod/byMemberId/{memberId}", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeModRs modByMemberId(
			@RequestBody CustPayeeModRq custPayeeModRq,
			@PathVariable final Long memberId,
			@RequestBody final ContactNotes params) {
		return saveContact(custPayeeModRq, memberId, null, getNotes(params));
	}

	private CustPayeeModRs saveContact(CustPayeeModRq custPayeeModRq,
			Long memberId, String memberPrincipal, String notes) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Saves a contact, finding the member by id
	 */
	@RequestMapping(value = "byMemberId/{memberId}", method = RequestMethod.POST)
	@ResponseBody
	public ContactVO saveByMemberId(@PathVariable final Long memberId, @RequestBody final ContactNotes params) {
		return saveContact(memberId, null, getNotes(params));
	}
	/**
	 * Saves a contact, finding the member by principal
	 */
	@RequestMapping(value = "custPayeeAdd/byMemberPrincipal/{principal}", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeAddRs saveByMemberPrincipal(
			@RequestBody CustPayeeAddRq custPayeeAddRq,
			@PathVariable final String principal,
			@RequestBody final ContactNotes params) {
		return saveContact(custPayeeAddRq, null, principal, getNotes(params));
	}
	/**
	 * Saves a contact, finding the member by principal
	 */
	@RequestMapping(value = "custPayeeMod/byMemberPrincipal/{principal}", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeModRs saveByMemberPrincipal(
			@RequestBody CustPayeeModRq custPayeeModRq,
			@PathVariable final String principal,
			@RequestBody final ContactNotes params) {
		return saveContact(custPayeeModRq, null, principal, getNotes(params));
	}

	/**
	 * Saves a contact, finding the member by principal
	 */
	@RequestMapping(value = "byMemberPrincipal/{principal}", method = RequestMethod.POST)
	@ResponseBody
	public ContactVO saveByMemberPrincipal(@PathVariable final String principal, @RequestBody final ContactNotes params) {
		return saveContact(null, principal, getNotes(params));
	}


	private Contact getContact(final Long memberId, final String memberPrincipal) {
		Contact contact = new Contact();
		return contact;
	}

	private ContactVO getContactVO(final Long memberId, final String memberPrincipal) {
		ContactVO contactVO = new ContactVO();
		return contactVO;
	}

	private CustPayeeInqRs getContactVO(CustPayeeInqRq custPayeeInqRq,
			final Long memberId,
			final String memberPrincipal) {
		// Contact contact = getContact(memberId, memberPrincipal);
		CustPayeeInqRs custPayeeInqRs = new CustPayeeInqRs();
		return custPayeeInqRs;
	}
	private String getNotes(final ContactNotes notes) {
		return notes == null ? null : notes.getNotes();
	}

	private void remove(final Contact contact) {
		//
	}

	private ContactVO saveContact(final Long memberId, final String memberPrincipal, final String notes) {
		ContactVO contactVO = new ContactVO();
		return contactVO;
	}

	@RequestMapping(value = "ifx/custPayeeInq", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeInqRs custPayeeInq(
			@RequestBody CustPayeeInqRq custPayeeInqRq) {
		CustPayeeInqRs custPayeeInqRs = new CustPayeeInqRs();
		custPayeeInqRs = getContactVO(custPayeeInqRq);
		return custPayeeInqRs;

	}

	private CustPayeeInqRs getContactVO(CustPayeeInqRq custPayeeInqRq) {
		CustPayeeSel[] custPayeeSels = custPayeeInqRq.getCustPayeeSel();
		CustPayeeRec[] custPayeeRec = new CustPayeeRec[custPayeeSels.length];
		int i = 0;
		CustPayeeInqRs custPayeeInqRs = new CustPayeeInqRs();
		for (CustPayeeSel custPayeeSel : custPayeeSels) {
			String memberId = custPayeeSel.getCustPayeeKeys().getCustPayeeId()
					.getString();
			CustPayeeId custPayeeId = new CustPayeeId();
			custPayeeId.setString(memberId);
			custPayeeRec[i++].setCustPayeeId(custPayeeId);
			PayeeType[] payeeTypes = custPayeeSel.getPayeeType();
			CustPayeeInfo custPayeeInfo = new CustPayeeInfo();
			for (PayeeType payeeType : payeeTypes) {
				String type = payeeType.name();
				if (payeeType.equals(PayeeType.Std)) {
					StdPayeeRef stdPayeeRef = new StdPayeeRef();
					// stdPayeeRef.setStdPayeeInfo(stdPayeeInfo);
					custPayeeInfo.setStdPayeeRef(stdPayeeRef);
				} else if (payeeType.equals(PayeeType.FSPayee)) {
					FSPayee fSPayee = new FSPayee();
					// fSPayee.setPartyData(partyData);
					custPayeeInfo.setFSPayee(fSPayee);
				} else if (payeeType.equals(PayeeType.Xfer)) {
					XferPayee xferPayee = new XferPayee();
					// xferPayee.setToAcctRef(toAcctRef);
					custPayeeInfo.setXferPayee(xferPayee);
				}
			}

			Name name = new Name();
			custPayeeInfo.setName(name);
			// custPayeeInfo.setLastPmtCurAmt(lastPmtCurAmt);
			// custPayeeInfo.setLastPmtDt(lastPmtDt);
			// custPayeeInfo.setNickname(nickname);
			// custPayeeInfo.setDfltPmtData(dfltPmtData);
			// custPayeeInfo.setPayeeAcctNum(payeeAcctNum);
			// custPayeeInfo.setPayerAcctNum(payerAcctNum);
			custPayeeRec[i++].setCustPayeeInfo(custPayeeInfo);
			CustPayeeStatus custPayeeStatus = new CustPayeeStatus();
			custPayeeStatus.setCustPayeeStatusCode(CustPayeeStatusCode.Active);
			// custPayeeStatus.setStatusDesc(statusDesc);
			// custPayeeStatus.setApprovalIdent(approvalIdent);
			// custPayeeStatus.setStatusModBy(statusModBy);
			// custPayeeStatus.setEffDt(effDt);
			custPayeeRec[i++].setCustPayeeStatus(custPayeeStatus);
		}
		custPayeeInqRs.setCustPayeeRec(custPayeeRec);
		return custPayeeInqRs;
	}

	@RequestMapping(value = "ifx/custPayeeAdd", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeAddRs custPayeeAdd(
			@RequestBody CustPayeeAddRq custPayeeAddRq) {
		CustPayeeAddRs custPayeeAddRs = new CustPayeeAddRs();
		return custPayeeAddRs;
	}

	@RequestMapping(value = "ifx/custPayeeMod", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeModRs custPayeeMod(
			@RequestBody CustPayeeModRq custPayeeModRq) {
		CustPayeeModRs custPayeeModRs = new CustPayeeModRs();
		return custPayeeModRs;
	}

	@RequestMapping(value = "ifx/custPayeeDel", method = RequestMethod.DELETE)
	@ResponseBody
	public CustPayeeDelRs custPayeeDel(
			@RequestBody CustPayeeDelRq custPayeeDelRq) {
		CustPayeeDelRs custPayeeDelRs = new CustPayeeDelRs();
		return custPayeeDelRs;
	}
}
