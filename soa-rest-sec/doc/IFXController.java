package ong.eu.soon.rest.sec.web.controller;

import ong.eu.soon.ifx.acct.AcctInqRq;
import ong.eu.soon.ifx.acct.AcctInqRs;
import ong.eu.soon.ifx.payee.CustPayeeAddRq;
import ong.eu.soon.ifx.payee.CustPayeeAddRs;
import ong.eu.soon.ifx.payee.CustPayeeDelRq;
import ong.eu.soon.ifx.payee.CustPayeeDelRs;
import ong.eu.soon.ifx.payee.CustPayeeInqRq;
import ong.eu.soon.ifx.payee.CustPayeeInqRs;
import ong.eu.soon.ifx.payment.PmtAddRq;
import ong.eu.soon.ifx.payment.PmtAddRs;
import ong.eu.soon.ifx.payment.PmtInqRq;
import ong.eu.soon.ifx.payment.PmtInqRs;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;
import ong.eu.soon.rest.sec.web.controller.exception.NotImplementedException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SuppressWarnings("unused")
@Controller
@RequestMapping(value = UriMappingConstants.IFX)
public class IFXController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	// 4.4.2 Signon
	/*
	 * The Signon message is used to authenticate an IFX client. Unlike other
	 * IFX messages, the <SignonRs> does not echo all elements of the request,
	 * for security reasons. Also, because there must be only one <SignonRq> per
	 * IFX block, there is no <RqUID> in either the request or the response. If
	 * none of the optional signon methods are provided, the signon is
	 * anonymous. Customer authentication is between the IFX client and the IFX
	 * server. Other providers behind the IFX server are expected to rely on the
	 * authentication performed by the initial IFX server (note this does not
	 * apply if the client is redirected, or handed off, to another CSP).
	 * Intermediate elements, such as HTTP proxies, do not participate in the
	 * customer authentication exchange. The IFX server may rely on a different
	 * server to actually verify the customer password, but this is a local
	 * matter.
	 */
	@RequestMapping(value = "Signon", method = RequestMethod.POST)
	@ResponseBody
	public SignonRs signon(@RequestBody final SignonRq signonRq) {

		try {
			return ifxSignon(signonRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSignon-this method is not implemented yet");
		}
		return null;
	}

	private SignonRs ifxSignon(SignonRq signonRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSignon method");
	}

	// 4.4.3 Signoff
	/*
	 * A client that has no further messages to perform should send a
	 * <SignoffRq> to indicate to the CSP that no more messages will be sent in
	 * this session and server resources may be freed and reallocated to other
	 * customers. The client may begin another session whenever it has new
	 * messages to perform by using the <SignonRq>. Because there may be only
	 * one <SignoffRq> per IFX block, there is no <RqUID> in either the request
	 * or the response.
	 */
	@RequestMapping(value = "Signoff", method = RequestMethod.POST)
	@ResponseBody
	public SignoffRs signoff(@RequestBody final SignoffRq signoffRq) {

		try {
			return ifxSignoff(signoffRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSignoff-this method is not implemented yet");
		}
		return null;
	}

	private SignoffRs ifxSignoff(SignoffRq signoffRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSignoff method");
	}

	// 5 The Base Service <BaseSvc>
	/*
	 * The Base Service in IFX includes messages that perform basic
	 * communication functions that must take place between parties (client and
	 * server or between different service providers). These messages are
	 * grouped into functions including Service Profile, Customer
	 * Authentication, Customer Profile, General Email, and Customer Service.
	 * IFX uses Service Profile messages to communicate information about a
	 * Service Provider’s services and configuration to a client. Customer
	 * Profile Messages provide for the registration of Customers with Service
	 * Providers, and the maintenance of that information. Customer Service
	 * messages provide administrative functions to assist Customer Service
	 * Representatives in serving customers
	 */
	// 5.1 Base Service Message Summary
	// 5.2 Base Service Common Elements and Aggregates
	// 5.2.1 Service Profile Common Elements
	// 5.2.2 Service Profile Common Aggregates
	// 5.2.3 Customer Profile Common Aggregates
	// 5.2.4 Party Account Relationship Info <PartyAcctRelInfo>
	// 5.2.5 Card Preference Record Aggregate <CardPrefRec>
	// 5.2.6 Card Preference Status Aggregate <CardPrefStatus>
	// 5.2.7 Card Preference Information Aggregate <CardPrefInfo>
	// 5.2.8 Card Preference Aggregate <CardPref>
	// 5.2.9 Card Preference Withdrawal Aggregate <CardPrefMisc>
	// 5.2.10 Card Preference Withdrawal Aggregate <CardPrefWithdrawal>
	// 5.2.11 Card Preference Deposit Aggregate <CardPrefDeposit>
	// 5.2.12 Card Preference Message Request Information Aggregate
	// <CardPrefMsgRqInfo>
	// 5.2.13 Card Preference Message Record Aggregate <CardPrefMsgRec>
	// 5.2.14 Posting Session Record Aggregate <PostingSessionRec>
	// 5.2.15 Session Totals Record Aggregate <SessionTotalsRec>
	// 5.3 Service Profile
	// 5.3.1 Description
	/*
	 * The Service Profile has two messages, a Service Profile Inquiry message,
	 * and a Holiday Inquiry message. The Holiday Inquiry Message allows a
	 * client to retrieve a list of Bank Holidays observed by a Financial
	 * Institution or Service Provider. The Service Profile Inquiry Message
	 * allows a client to retrieve the Service Profile from a Financial
	 * Institution, CSP, or other Service Provider. The Service Profile contains
	 * the following information about the Customer’s Service Provider: •
	 * Services Supported—Services are collections of messages that are
	 * functionally related. Each Service is designed with a corresponding
	 * section in the Service Profile to allow each Service Provider to inform
	 * clients as to which messages, functions, and options of the service
	 * supported. • Signon Realms—Signon Realms provide a mechanism for a
	 * Service Provider to manage customer authentication across services.
	 * Service Providers may choose not to support IFX authentication when
	 * communicating to other service providers. Server-to-server authentication
	 * may take place in some other way. • Service Provider Information—Provides
	 * the legal name of the SP, the SP address, the SP’s Customer Service
	 * telephone number, and other useful information for that service provider.
	 * Each time a client authenticates with a Signon Realm, the time and date
	 * of the current Service Profile is returned by the server. If the client
	 * does not have a copy of the current Service Profile, it should perform a
	 * Service Profile Inquiry message to retrieve the current Service Profile.
	 * This mechanism is used to inform clients of changes in server
	 * capabilities.
	 */
	// 5.3.2 Service Profile Inquiry Message
	/*
	 * The client submits a <SvcProfInqRq> that optionally includes a Timestamp
	 * value <UpDt> for the last Service Profile received from the server.
	 * <UpDt> indicates when the Service Profile was last updated on the server.
	 * If <CustId> is not available (because of an anonymous login, for
	 * example), a generic profile must be returned. If <CustId> is available,
	 * then a custom profile for that customer may be returned. This capability
	 * allows the SP to support capabilities such as: (1) providing different
	 * contact information for preferred customers or (2) providing information
	 * specific to service providers for this particular customer when the SP
	 * has relationships with multiple service providers for the same service.
	 */
	@RequestMapping(value = "SvcProfInq", method = RequestMethod.POST)
	@ResponseBody
	public SvcProfInqRs svcProfInquiry(
			@RequestBody final SvcProfInqRq svcProfInqRq) {

		try {
			return ifxSvcProfInquiry(svcProfInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcProfInquiry-this method is not implemented yet");
		}
		return null;
	}

	private SvcProfInqRs ifxSvcProfInquiry(SvcProfInqRq svcProfInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcProfInquiry method");
	}

	// 5.3.3 Holiday Inquiry Message
	/*
	 * The Holiday Inquiry message allows a client to retrieve a list of Bank
	 * Holidays observed by the Service Provider. The list of holidays is
	 * typically used to adjust the processing date for a scheduled payment or
	 * transfer.
	 */
	@RequestMapping(value = "HolInq", method = RequestMethod.POST)
	@ResponseBody
	public HolInqRs HolInquiry(@RequestBody final HolInqRq holInqRq) {

		try {
			return ifxHolInquiry(holInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxHolInquiry-this method is not implemented yet");
		}
		return null;
	}

	private HolInqRs ifxHolInquiry(HolInqRq holInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxHolInquiry method");
	}

	// 5.4 Customer Profile
	// 5.4.1 Description
	// 5.4.2 Customer
	// 5.4.2.1 Customer Add Message
	/*
	 * The Customer Add message is used to add a Customer record at a Service
	 * Provider. It also allows an individual to submit enough personal
	 * information to be identified to a Customer Service Provider. If the CSP
	 * supports customer self-enrollment using IFX, it may elect to return a
	 * login ID and password to the customer. Alternatively, the CSP may collect
	 * the customer’s information and use a separate process (possibly a mailing
	 * or a customer service telephone call) to provide the customer with a
	 * login and password. A CSP may choose not to support the Customer Add
	 * functionality defined in IFX for enrollment, and may provide a customized
	 * World Wide Web (WWW) page or some other means to support its own
	 * enrollment process. In this case, the CSP may communicate the URL for
	 * this page in the Service Profile. A short note about an alternative
	 * enrollment process may also be provided to the client through the Service
	 * Profile.
	 */
	@RequestMapping(value = "CustAdd", method = RequestMethod.POST)
	@ResponseBody
	public CustAddRs custAdd(@RequestBody final CustAddRq custAddRq) {

		try {
			return ifxCustAdd(custAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustAdd-this method is not implemented yet");
		}
		return null;
	}

	private CustAddRs ifxCustAdd(CustAddRq custAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustAdd method");
	}

	// 5.4.2.2 Customer Modify Message
	/*
	 * A client may use the Customer Modify message to update his or her name,
	 * address, or contact details in the SP’s records. For information on
	 * Conventions for Modification of Server-Based Data, see Section 2.4.3.2
	 */
	@RequestMapping(value = "CustMod", method = RequestMethod.POST)
	@ResponseBody
	public CustModRs custModify(@RequestBody final CustModRq custModRq) {

		try {
			return ifxCustModify(custModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustModify-this method is not implemented yet");
		}
		return null;
	}

	private CustModRs ifxCustModify(CustModRq custModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustModify method");
	}

	// 5.4.2.3 Customer Password Modify Message
	/*
	 * A client may use the Modify Customer Password message to change the
	 * password. The new Customer Password must follow the password rules
	 * established in the <SignonInfo> aggregate, and must be encrypted if the
	 * Signon Realm requires it.
	 */
	@RequestMapping(value = "CustPswdMod", method = RequestMethod.POST)
	@ResponseBody
	public CustPswdModRs custPswdModify(
			@RequestBody final CustPswdModRq custPswdModRq) {

		try {
			return ifxCustPswdModify(custPswdModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPswdModify-this method is not implemented yet");
		}
		return null;
	}

	private CustPswdModRs ifxCustPswdModify(CustPswdModRq custPswdModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPswdModify method");
	}

	// 5.4.2.4 Customer Authentication Modify Message
	/*
	 * A client may use the Customer Authentication Modify message to change the
	 * authentication value (e.g. password, certificate, PIN). This may occur
	 * with a customer login or a CSR login, as a CSR may need to change the
	 * customer’s password (e.g., when the customer has forgotten the password).
	 */
	@RequestMapping(value = "CustAuthMod", method = RequestMethod.POST)
	@ResponseBody
	public CustAuthModRs custAuthModModify(
			@RequestBody final CustAuthModRq custAuthModRq) {

		try {
			return ifxCustAuthModify(custAuthModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustAuthModify-this method is not implemented yet");
		}
		return null;
	}

	private CustAuthModRs ifxCustAuthModify(CustAuthModRq custAuthModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustAuthModify method");
	}

	// 5.4.2.5 Customer Authentication Reversal Message
	@RequestMapping(value = "CustAuthRev", method = RequestMethod.POST)
	@ResponseBody
	public CustAuthRevRs custAuthReversal(
			@RequestBody final CustAuthRevRq custAuthRevRq) {

		try {
			return ifxCustAuthReversal(custAuthRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustAuthReversal-this method is not implemented yet");
		}
		return null;
	}

	private CustAuthRevRs ifxCustAuthReversal(CustAuthRevRq custAuthRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustAuthReversal method");
	}

	// 5.4.2.6 Customer Status Modify Message
	/*
	 * The Customer Status Modify Message may be used to modify the status.
	 */
	@RequestMapping(value = "CustStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public CustStatusModRs custStatusModify(
			@RequestBody final CustStatusModRq custStatusModRq) {

		try {
			return ifxCustStatusModify(custStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustStatusModify-this method is not implemented yet");
		}
		return null;
	}

	private CustStatusModRs ifxCustStatusModify(CustStatusModRq custStatusModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustStatusModify method");
	}

	// 5.4.2.7 Customer Delete Message
	/*
	 * A client may use the Customer Delete message to unenroll
	 */
	@RequestMapping(value = "CustDel", method = RequestMethod.POST)
	@ResponseBody
	public CustDelRs custDelete(@RequestBody final CustDelRq custDelRq) {

		try {
			return ifxCustDelete(custDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustDelete-this method is not implemented yet");
		}
		return null;
	}

	private CustDelRs ifxCustDelete(CustDelRq custDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustDelete method");
	}

	// 5.4.2.8 Customer Inquiry Message
	/*
	 * If <UpDt> is equal the server’s date of last update, a <Status> code of 1
	 * is returned, and the profile is not returned in the response. This is the
	 * newest <CustRec> <UpDt> received by the client. If this information is
	 * absent, or does not match the server’s date of last update, the server
	 * must send all data in the response.
	 */
	@RequestMapping(value = "CustInq", method = RequestMethod.POST)
	@ResponseBody
	public CustInqRs custInquiry(@RequestBody final CustInqRq custInqRq) {

		try {
			return ifxCustInquiry(custInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustInquiry-this method is not implemented yet");
		}
		return null;
	}

	private CustInqRs ifxCustInquiry(CustInqRq custInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustInquiry method");
	}

	// 5.4.2.9 Customer Identifier Inquiry Message
	/*
	 * The client must specify either the Customer Permanent identifier, or the
	 * Customer Login identifier.
	 */
	@RequestMapping(value = "CustIdInq", method = RequestMethod.POST)
	@ResponseBody
	public CustIdInqRs CustIdInquiry(@RequestBody final CustIdInqRq custIdInqRq) {

		try {
			return ifxCustIdInquiry(custIdInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustIdInquiry-this method is not implemented yet");
		}
		return null;
	}

	private CustIdInqRs ifxCustIdInquiry(CustIdInqRq custIdInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustIdInquiry method");
	}

	// 5.4.2.10 Customer Audit Message
	/*
	 * The Customer Audit Message allows the client to audit Customer
	 * Add/Modify/Delete messages. When the Cust object changes, the server must
	 * generate an Rs message to the Rq that created the pending state.
	 */
	@RequestMapping(value = "CustAud", method = RequestMethod.POST)
	@ResponseBody
	public CustAudRs custAudit(@RequestBody final CustAudRq custAudRq) {

		try {
			return ifxCustAudit(custAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustAudit-this method is not implemented yet");
		}
		return null;
	}

	private CustAudRs ifxCustAudit(CustAudRq custAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustAudit method");
	}

	// 5.4.2.11 Customer Sync Message
	/*
	 * The Customer Sync Message allows the client to synchronize on Customer
	 * Add/Modify/Delete messages. When the Cust object changes, the server must
	 * generate an Rs message to the Rq that created the pending state
	 */
	@RequestMapping(value = "CustSync", method = RequestMethod.POST)
	@ResponseBody
	public CustSyncRs custSync(@RequestBody final CustSyncRq custSyncRq) {

		try {
			return ifxCustSync(custSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSync-this method is not implemented yet");
		}
		return null;
	}

	private CustSyncRs ifxCustSync(CustSyncRq custSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSync method");
	}

	// 5.4.3 Customer/Service Link
	// 5.4.3.1 Customer/Service Link Add
	/*
	 * A client uses the <CustSvcAddRq> message to request that a service be
	 * enabled. If the <SvcName> value is Pay, then this message indicates
	 * enabling the Pay service, and should be sent from the CSP to the CPP;
	 * likewise, if the <SvcName> is Pres, then it should be sent to a BSP. The
	 * fee account should be passed to Service Providers who are actually
	 * charging for the service
	 */
	@RequestMapping(value = "CustSvcAdd", method = RequestMethod.POST)
	@ResponseBody
	public CustSvcAddRs custSvcAdd(@RequestBody final CustSvcAddRq custSvcAddRq) {

		try {
			return ifxCustSvcAdd(custSvcAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSvcAdd-this method is not implemented yet");
		}
		return null;
	}

	private CustSvcAddRs ifxCustSvcAdd(CustSvcAddRq custSvcAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSvcAdd method");
	}

	// 5.4.3.2 Customer/Service Link Modify
	/*
	 * The <CustSvcModRq> allows a customer to modify specific information about
	 * a customer/service link. This capability is currently limited to
	 * modifying the fee account.
	 */
	@RequestMapping(value = "CustSvcMod", method = RequestMethod.POST)
	@ResponseBody
	public CustSvcModRs custSvcModify(
			@RequestBody final CustSvcModRq custSvcModRq) {

		try {
			return ifxCustSvcModify(custSvcModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSvcModify-this method is not implemented yet");
		}
		return null;
	}

	private CustSvcModRs ifxCustSvcModify(CustSvcModRq custSvcModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSvcModify method");
	}

	// 5.4.3.3 Customer/Service Link Status Modify
	/*
	 * The <CustSvcStatusModRq> allows a Service Provider to temporarily change
	 * the customer’s service status. For example, this function is used in the
	 * Presentment Service to notify a BSP that the CSP is unable to deliver
	 * bills or other material to a customer and to notify the BSP that reverse
	 * sthe notification. This may occur when there is a potential
	 * security/fraud problem or when a technical problem precludes the
	 * customer’s access to his/her account with the CSP. The BSP may need to
	 * notify the Biller to send paper bills, depending on regulatory or
	 * business practices, to ensure the customer’s billing is not interrupted.
	 */
	@RequestMapping(value = "CustSvcStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public CustSvcStatusModRs custSvcStatusModify(
			@RequestBody final CustSvcStatusModRq custSvcStatusModRq) {

		try {
			return ifxCustSvcStatusModify(custSvcStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSvcStatusModify-this method is not implemented yet");
		}
		return null;
	}

	private CustSvcStatusModRs ifxCustSvcStatusModify(
			CustSvcStatusModRq custSvcStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSvcStatusModify method");
	}

	// 5.4.3.4 Customer/Service Link Delete
	/*
	 * The <CustSvcDelRq> allows a customer to disable a service offered by a
	 * specified service provider. A customer may initiate the process by
	 * sending the <CustSvcDelRq> to the CSP. The CSP may then send a
	 * <CustSvcDelRq> message to a BSP to disable, for example, Bill Presentment
	 * Service for a particular customer at the BSP.
	 */
	@RequestMapping(value = "CustSvcDel", method = RequestMethod.POST)
	@ResponseBody
	public CustSvcDelRs custSvcDelete(
			@RequestBody final CustSvcDelRq custSvcDelRq) {

		try {
			return ifxCustSvcDelete(custSvcDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSvcDelete-this method is not implemented yet");
		}
		return null;
	}

	private CustSvcDelRs ifxCustSvcDelete(CustSvcDelRq custSvcDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSvcDelete method");
	}

	// 5.4.3.5 Customer/Service Link Audit
	/*
	 * Allows client to audit Customer/Service Link Add/Modify/Delete messages
	 * associated with the current customer. When the <CustSvcStatus> changes,
	 * the server must generate an Rs message corresponding to the Rq that
	 * created the pending state. The <Status> <Severity> must always be Info.
	 * The <StatusDesc> is used to supply the details of a rejection.
	 */
	@RequestMapping(value = "CustSvcAud", method = RequestMethod.POST)
	@ResponseBody
	public CustSvcAudRs custSvcAudit(
			@RequestBody final CustSvcAudRq custSvcAudRq) {

		try {
			return ifxCustSvcAud(custSvcAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSvcAud-this method is not implemented yet");
		}
		return null;
	}

	private CustSvcAudRs ifxCustSvcAud(CustSvcAudRq custSvcAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSvcAud method");
	}

	// 5.4.3.6 Customer/Service Link Sync
	/*
	 * Allows client to synchronize Customer/Service Link Add/Modify/Delete
	 * messages associated with the current customer. When the <CustSvcStatus>
	 * changes, the server must generate an Rs message corresponding to the Rq
	 * that created the pending state. The <Status> <Severity> must always be
	 * Info. The <StatusDesc> is used to supply the details of a rejection.
	 */
	@RequestMapping(value = "CustSvcSync", method = RequestMethod.POST)
	@ResponseBody
	public CustSvcSyncRs custSvcSync(
			@RequestBody final CustSvcSyncRq custSvcSyncRq) {

		try {
			return ifxCustSvcSync(custSvcSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustSvcSync-this method is not implemented yet");
		}
		return null;
	}

	private CustSvcSyncRs ifxCustSvcSync(CustSvcSyncRq custSvcSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustSvcSync method");
	}

	// 5.4.4 Service/Account Link
	/*
	 * When activating an account for Bill Presentment Service, the customer
	 * and/or CSP must send secrets as requested by the Biller, names and
	 * addresses as known to the Biller to be associated with the account, and
	 * the customer account with the Biller <BillingAcct>, in order for a BSP or
	 * a Biller to correctly identify which customer and account to activate.
	 * The Customer name and address at the CSP may be used to assist a BSP or
	 * Biller in matching the correct customer with the account to be activated
	 */
	// 5.4.4.2 Account specific disclosures
	/*
	 * Note that if the Service Provider (e.g., CSP, CPP, or BSP) has
	 * account-specific disclosures that were not displayed in the service
	 * activation process, the Service Provider must send disclosure text with
	 * the <SvcAcctAddRs> when an account is being activated. If presentation of
	 * terms and conditions is required prior to account activation, Disclosure
	 * Record Aggregates must be returned in the response. If acceptance is
	 * required, and the customer does not accept, the account activation may
	 * not be sent to the BSP. If the customer does accept, the client may use
	 * <CustDiscStatusModRq>.
	 */
	// 5.4.4.3 Service/Account Link Add Message
	/*
	 * A client uses the <SvcAcctAddRq> message to request that a particular
	 * account be activated for an enabled service, e.g., a long distance
	 * telephone account for a bill presentment service. Multiple accounts may
	 * be activated by sending a separate <SvcAcctAddRq> for each account to be
	 * activated.
	 */
	@RequestMapping(value = "SvcAcctAdd", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctAddRs svcAcctAdd(@RequestBody final SvcAcctAddRq svcAcctAddRq) {

		try {
			return ifxSvcAcctAdd(svcAcctAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctAdd-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctAddRs ifxSvcAcctAdd(SvcAcctAddRq svcAcctAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctAdd method");
	}

	// 5.4.4.4 Service/Account Link Modify Message
	/*
	 * The <SvcAcctModRq> allows a customer to modify specific information about
	 * an account. This message is currently limited to modifying (1) a Pay
	 * funding account, and (2) the account Nickname.
	 */
	@RequestMapping(value = "SvcAcctMod", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctModRs svcAcctModify(
			@RequestBody final SvcAcctModRq svcAcctModRq) {

		try {
			return ifxSvcAcctModify(svcAcctModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctModify-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctModRs ifxSvcAcctModify(SvcAcctModRq svcAcctModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctModify method");
	}

	// 5.4.4.5 Service/Account Link Status Modify
	/*
	 * The <SvcAcctStatusModRq> allows a Service Provider to temporarily change
	 * the customer’s service/account link status
	 */
	@RequestMapping(value = "SvcAcctStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctStatusModRs svcAcctStatusModify(
			@RequestBody final SvcAcctStatusModRq svcAcctStatusModRq) {

		try {
			return ifxSvcAcctStatusModify(svcAcctStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctStatusModify-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctStatusModRs ifxSvcAcctStatusModify(
			SvcAcctStatusModRq svcAcctStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctStatusModify method");
	}

	// 5.4.4.6 Service/Account Link Identifier Modify Message
	/*
	 * The <SvcAcctIdModRq> allows a customer or CSP to change the identifier
	 * associated with a particular Service Account Link. For example, in the
	 * Pay service, the <SvcAcctIdModRq> would change all pending payments
	 * against a particular funding account to be applied against a new funding
	 * account.
	 */
	@RequestMapping(value = "SvcAcctIdMod", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctIdModRs svcAcctIdModify(
			@RequestBody final SvcAcctIdModRq svcAcctIdModRq) {

		try {
			return ifxSvcAcctIdModify(svcAcctIdModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctIdModify-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctIdModRs ifxSvcAcctIdModify(SvcAcctIdModRq svcAcctIdModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctIdModify method");
	}

	// 5.4.4.7 Service/Account Link Delete Message
	/*
	 * The <SvcAcctDelRq> allows a customer or CSP to deactivate a specific
	 * account for the specified service. Note that deactivating an account in
	 * IFX refers to a service provider removing the linkage between the account
	 * and the service, and does not impact the status of the actual account,
	 * e.g. suspending an electronic billing account should not be confused with
	 * halting the actual service, such as turning off the electricity.
	 */
	@RequestMapping(value = "SvcAcctDel", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctDelRs svcAcctDelete(
			@RequestBody final SvcAcctDelRq svcAcctDelRq) {

		try {
			return ifxSvcAcctDel(svcAcctDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctDel-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctDelRs ifxSvcAcctDel(SvcAcctDelRq svcAcctDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctDel method");
	}

	// 5.4.4.8 Service/Account Link Inquiry Message
	/*
	 * If <UpDt> is equal the server’s date of last update, a <Status> code of 1
	 * is returned, and the profile is not returned in the response. This is the
	 * last <NewUpDt> received by the client. If this information is absent, or
	 * does not match the server’s date of last update, the server must send all
	 * data in the response
	 */
	@RequestMapping(value = "SvcAcctInq", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctInqRs svcAcctInquiry(
			@RequestBody final SvcAcctInqRq svcAcctInqRq) {

		try {
			return ifxSvcAcctInq(svcAcctInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctInq-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctInqRs ifxSvcAcctInq(SvcAcctInqRq svcAcctInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctInq method");
	}

	// 5.4.4.9 Service/Account Link Audit Message
	/*
	 * Allows client to audit Service/Account Link Add/Modify/Delete messages
	 * associated with the current customer and the current customer’s accounts.
	 * When the <SvcAcctStatus> changes, the server must generate an Rs message
	 * corresponding to the Rq that created the pending state. The <Status>
	 * <Severity> must always be Info. The <StatusDesc> is used to supply the
	 * details of a rejection.
	 */
	@RequestMapping(value = "SvcAcctAud", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctAudRs svcAcctAudit(
			@RequestBody final SvcAcctAudRq svcAcctAudRq) {

		try {
			return ifxSvcAcctAudit(svcAcctAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctAudit-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctAudRs ifxSvcAcctAudit(SvcAcctAudRq svcAcctAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctAudit method");
	}

	// 5.4.4.10 Service/Account Link Sync Message
	/*
	 * Allows client to synchronize Service/Account Link Add/Modify/Delete
	 * messages associated with the current customer and the current customer’s
	 * accounts. When the <SvcAcctStatus> changes, the server must generate an
	 * Rs message to the Rq that created the pending state. The <Status>
	 * <Severity> must be Info. The <StatusDesc> is used to supply the details
	 * of a rejection.
	 */
	@RequestMapping(value = "SvcAcctSync", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctSyncRs svcAcctSync(
			@RequestBody final SvcAcctSyncRq svcAcctSyncRq) {

		try {
			return ifxSvcAcctSync(svcAcctSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctSync-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctSyncRs ifxSvcAcctSync(SvcAcctSyncRq svcAcctSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctSync method");
	}

	// 5.4.4.11 Service Account Reversal
	@RequestMapping(value = "SvcAcctRev", method = RequestMethod.POST)
	@ResponseBody
	public SvcAcctRevRs svcAcctReversal(
			@RequestBody final SvcAcctRevRq svcAcctRevRq) {

		try {
			return ifxSvcAcctReversal(svcAcctRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSvcAcctReversal-this method is not implemented yet");
		}
		return null;
	}

	private SvcAcctRevRs ifxSvcAcctReversal(SvcAcctRevRq svcAcctRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSvcAcctReversal method");
	}

	// 5.4.5 Disclosure
	// 5.4.5.1 Disclosure Inquiry Message
	/*
	 * A customer or CSP may make a query about disclosure terms and conditions
	 * for a given service.
	 */
	@RequestMapping(value = "DiscInq", method = RequestMethod.POST)
	@ResponseBody
	public DiscInqRs DiscInquiry(@RequestBody final DiscInqRq discInqRq) {

		try {
			return ifxDiscInquiry(discInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxDiscInquiry-this method is not implemented yet");
		}
		return null;
	}

	private DiscInqRs ifxDiscInquiry(DiscInqRq discInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDiscInquiry method");
	}

	// 5.4.6 Customer/Disclosure Link
	// 5.4.6.1 Customer/Disclosure Link Status Modify Message
	/*
	 * A customer uses the Customer/Disclosure Link Status Modify Message to
	 * accept or reject a disclosure received via various messages
	 */
	@RequestMapping(value = "CustDiscStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public CustDiscStatusModRs custDiscStatusModify(
			@RequestBody final CustDiscStatusModRq custDiscStatusModRq) {

		try {
			return ifxCustDiscStatusModiy(custDiscStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustDiscStatusModiy-this method is not implemented yet");
		}
		return null;
	}

	private CustDiscStatusModRs ifxCustDiscStatusModiy(
			CustDiscStatusModRq custDiscStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustDiscStatusModiy method");
	}

	// 5.4.6.2 Customer/Disclosure Link Inquiry Message
	/*
	 * A customer or CSP may make a query about the status of a disclosure for a
	 * given consumer, and optionally include the associated disclosure itself.
	 */
	@RequestMapping(value = "CustDiscInq", method = RequestMethod.POST)
	@ResponseBody
	public CustDiscInqRs custDiscInquiry(
			@RequestBody final CustDiscInqRq custDiscInqRq) {

		try {
			return ifxCustDiscInquiry(custDiscInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustDiscInquiry-this method is not implemented yet");
		}
		return null;
	}

	private CustDiscInqRs ifxCustDiscInquiry(CustDiscInqRq custDiscInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustDiscInquiry method");
	}

	// 5.5 Security Object
	/*
	 * The Security Object messages are intended to allow security objects to be
	 * transported for use within IFX transactions. Security objects include
	 * items such as DES/3DES keys used for PIN encryption, Digital Certificates
	 * used for identification and public keys used for data encryption using
	 * asynchronous encryption techniques. A unique feature of the security
	 * object is the requirement for the object to physically exist at each
	 * end-point involved in the encryption process. Unlike a transaction
	 * (withdrawal, bill pay, etc) or customer information for which the system
	 * of record is in a single location, security objects must exist and be
	 * tracked in more than one location and be kept in sync. Note: None of the
	 * security object messages contain any of the IFX asynchronous element
	 * (AsyncRqUID). This is due to the fact that the exchange of security
	 * object information is expected to occur in a synchronous manner.
	 */
	// 5.5.1 Security Object Add
	/*
	 * The Security Object Add message is used to create an instance of a
	 * security object.
	 */
	@RequestMapping(value = "SecObjAdd", method = RequestMethod.POST)
	@ResponseBody
	public SecObjAddRs secObjAdd(@RequestBody final SecObjAddRq secObjAddRq) {

		try {
			return ifxSecObjAdd(secObjAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSecObjAdd-this method is not implemented yet");
		}
		return null;
	}

	private SecObjAddRs ifxSecObjAdd(SecObjAddRq secObjAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSecObjAdd method");
	}

	// 5.5.2 Security Object Modify
	/*
	 * The Security Object Modify message provides a mechanism to modify a
	 * particular instance of a security object.
	 */
	@RequestMapping(value = "SecObjMod", method = RequestMethod.POST)
	@ResponseBody
	public SecObjModRs secObjModify(@RequestBody final SecObjModRq secObjModRq) {

		try {
			return ifxSecObjModify(secObjModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSecObjModify-this method is not implemented yet");
		}
		return null;
	}

	private SecObjModRs ifxSecObjModify(SecObjModRq secObjModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSecObjModify method");
	}

	// 5.5.3 Security Object Inquiry
	/*
	 * This message is sent to request information on a particular security
	 * object. Information returned is based on thetype of security object. For
	 * symmetric keys, the Key Check information is returned. For Public Keys or
	 * Digital certificate, the actual Public Key or Digital Certificate is
	 * returned.
	 */
	@RequestMapping(value = "SecObjInq", method = RequestMethod.POST)
	@ResponseBody
	public SecObjInqRs secObjInquiry(@RequestBody final SecObjInqRq secObjInqRq) {

		try {
			return ifxSecObjInquiry(secObjInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSecObjInquiry-this method is not implemented yet");
		}
		return null;
	}

	private SecObjInqRs ifxSecObjInquiry(SecObjInqRq secObjInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSecObjInquiry method");
	}

	// 5.5.4 Security Object Delete
	/*
	 * This message is sent to delete a particular instance of a security
	 * object.
	 */
	@RequestMapping(value = "SecObjDel", method = RequestMethod.POST)
	@ResponseBody
	public SecObjDelRs secObjDelete(@RequestBody final SecObjDelRq secObjDelRq) {

		try {
			return ifxSecObjDelete(secObjDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSecObjDelete-this method is not implemented yet");
		}
		return null;
	}

	private SecObjDelRs ifxSecObjDelete(SecObjDelRq secObjDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSecObjDelete method");
	}

	// 5.5.5 Security Object Advise
	/*
	 * The Advise method can be used as a means of either triggering the remote
	 * key load process in an ATM or POS System or as a means of providing the
	 * server with information on a security object that was loaded into the
	 * client via an out of band method (manually loaded, injected from another
	 * system, etc.). This method is sent from the Server to the ATM with the
	 * <SecObjInitRemKey> tag set to “True” to request the client to initiate
	 * the Remote Key Load process. If the ATM is in a state that would allow it
	 * to initiate a remote key load process, the Advise will be responded to
	 * with a status code of “0” (OK). If the device is not in a state to
	 * initiate a remote key load process, then the Advise will be responded to
	 * with an information status code of 3760 and will initiate Remote Key Load
	 * process as soon as the state of the device will allow. If the device does
	 * not support Remote Key Load, then an error code of 3770 will be returned.
	 * If a security object is loaded into the client via an out-of-band method,
	 * the client can notify the server of the security object’s <SecObjId> as
	 * well as the object’s characteristics via the inclusion of the <SecObjRec>
	 * aggregate.
	 */
	@RequestMapping(value = "SecObjAdvise", method = RequestMethod.POST)
	@ResponseBody
	public SecObjAdviseRs secObjAdvise(
			@RequestBody final SecObjAdviseRq secObjAdviseRq) {

		try {
			return ifxSecObjAdvise(secObjAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSecObjAdvise-this method is not implemented yet");
		}
		return null;
	}

	private SecObjAdviseRs ifxSecObjAdvise(SecObjAdviseRq secObjAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSecObjAdvise method");
	}

	// 5.5.6 Security Object Sync
	/*
	 * The sync method can be used as a means of synchronization of the security
	 * objects known by either party. Note that actual security objects are not
	 * sent as part of this exchange unless the security object is not of a
	 * sensitive nature (Module ID, Public Key, etc.). If during this process,
	 * it is discovered that one party is missing a security object, an
	 * appropriate Security Object Add request should be issued.
	 */
	@RequestMapping(value = "SecObjSync", method = RequestMethod.POST)
	@ResponseBody
	public SecObjSyncRs secObjSync(@RequestBody final SecObjSyncRq secObjSyncRq) {

		try {
			return ifxSecObjSync(secObjSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSecObjSync-this method is not implemented yet");
		}
		return null;
	}

	private SecObjSyncRs ifxSecObjSync(SecObjSyncRq secObjSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSecObjSync method");
	}

	// 5.6 Party to Account Relationship
	/*
	 * The party to account relationship messages are used to associate a party
	 * (i.e., customer, prospect) to and account. This association could be as
	 * an owner or non-owner, and is also used to indicate the primary contact
	 * and tax responsible parties
	 */
	// 5.6.1 Party to Account Relationship Add
	/*
	 * This message is used to add a relationship between a pre-existing party
	 * (i.e., customer or prospect) and a pre-existing account. This message may
	 * be used to add additional “owners” to an account to satisfy the
	 * requirements of a legal decision (power of attorney), or to instantiate a
	 * new “joint” owner to an account that has been modified to allow joint
	 * accounts.
	 */
	@RequestMapping(value = "PartyAcctRelAdd", method = RequestMethod.POST)
	@ResponseBody
	public PartyAcctRelAddRs partyAcctRelAdd(
			@RequestBody final PartyAcctRelAddRq partyAcctRelAddRq) {

		try {
			return ifxPartyAcctRelAdd(partyAcctRelAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPartyAcctRelAdd-this method is not implemented yet");
		}
		return null;
	}

	private PartyAcctRelAddRs ifxPartyAcctRelAdd(
			PartyAcctRelAddRq partyAcctRelAddRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPartyAcctRelAdd method");
	}

	// 5.6.2 Party to Account Relationship Delete
	/*
	 * The PartyAcctRelDel will delete the relationship between the party and
	 * the account. This will not delete either the party or the account from
	 * the system. Under no circumstances will the deletion request delete the
	 * last party to account relationship
	 */
	@RequestMapping(value = "PartyAcctRelDel", method = RequestMethod.POST)
	@ResponseBody
	public PartyAcctRelDelRs PartyAcctRelDelete(
			@RequestBody final PartyAcctRelDelRq partyAcctRelDelRq) {

		try {
			return ifxPartyAcctRelDelete(partyAcctRelDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPartyAcctRelDelete-this method is not implemented yet");
		}
		return null;
	}

	private PartyAcctRelDelRs ifxPartyAcctRelDelete(
			PartyAcctRelDelRq partyAcctRelDelRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPartyAcctRelDelete method");
	}

	// 5.6.3 Party to Account Relationship Inquiry
	/*
	 * The PartyAcctRelInq will inquire on all parties related to a specific
	 * account, or inquire on all accounts related to a specific party. If the
	 * <DepAcctId>, <CardAcctId>, or the <LoanAcctId> is used in the request,
	 * the return base will be all the relationships associated to the account.
	 * If none of these three aggregates are present, the return base will be
	 * all the accounts related to the party represented within the <CustId>. If
	 * both are present, the only search criteria used will be the account
	 * information, and the customer Id will represent the customer the request
	 * is being acted on behalf of.
	 */
	@RequestMapping(value = "PartyAcctRelInq", method = RequestMethod.POST)
	@ResponseBody
	public PartyAcctRelInqRs PartyAcctRelInquiry(
			@RequestBody final PartyAcctRelInqRq partyAcctRelInqRq) {

		try {
			return ifxPartyAcctRelInquiry(partyAcctRelInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPartyAcctRelInquiry-this method is not implemented yet");
		}
		return null;
	}

	private PartyAcctRelInqRs ifxPartyAcctRelInquiry(
			PartyAcctRelInqRq partyAcctRelInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPartyAcctRelInquiry method");
	}

	// 5.6.4 Party to Account Relationship Modify
	/*
	 * The PartyAcctRelMod will modify existing relationships, but not add or
	 * delete relationships, associated with a specific account. Multiple
	 * relationships for one party may be modified with one PartyAcctRelMod
	 * message. However, in order to modify relationships for multiple parties,
	 * one PartyAcctRelMod message will need to be sent for each party.
	 */
	@RequestMapping(value = "PartyAcctRelMod", method = RequestMethod.POST)
	@ResponseBody
	public PartyAcctRelModRs PartyAcctRelModify(
			@RequestBody final PartyAcctRelModRq partyAcctRelModRq) {

		try {
			return ifxPartyAcctRelModify(partyAcctRelModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPartyAcctRelModify-this method is not implemented yet");
		}
		return null;
	}

	private PartyAcctRelModRs ifxPartyAcctRelModify(
			PartyAcctRelModRq partyAcctRelModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPartyAcctRelModify method");
	}

	// 5.7 EMV Card Object
	/*
	 * This is a transient object, which only exists temporarily at a terminal
	 * while an Integrated Circuit Card is used at the terminal to authorize
	 * transactions. The object is created implicitly and destroyed at the end
	 * of the transaction or sequence of transactions. This object holds the
	 * Data associated with the card and is used to advise the card issuer of
	 * changes to the card related data. The primary purpose of this object is
	 * to advise a card issuer of Issuer Script Results and Cryptogram
	 * Information Data after a transaction has been successfully concluded.
	 */
	// 5.7.1 EMV Card Record Aggregate <EMVCardRec>
	// 5.7.2 EMV Card Info Aggregate <EMVCardInfo>
	// 5.7.3 EMV Card Advice Request <EMVCardAdviseRq>
	@RequestMapping(value = "EMVCardAdvise", method = RequestMethod.POST)
	@ResponseBody
	public EMVCardAdviseRs EMVCardAdvise(
			@RequestBody final EMVCardAdviseRq EMVCardAdviseRq) {

		try {
			return ifxEMVCardAdvise(EMVCardAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxEMVCardAdvise-this method is not implemented yet");
		}
		return null;
	}

	private EMVCardAdviseRs ifxEMVCardAdvise(EMVCardAdviseRq EMVCardAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxEMVCardAdvise method");
	}

	// 5.8 Card Preference
	// 5.8.1 Card Preference Add Message
	/*
	 * The Card Preference Add message is used to add a card preference object.
	 * This is not used if a card preference relationship has already been
	 * established between a card and a business function.
	 */
	@RequestMapping(value = "CardPrefAdd", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefAddRs cardPrefAdd(
			@RequestBody final CardPrefAddRq cardPrefAddRq) {

		try {
			return ifxCardPrefAdd(cardPrefAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefAdd-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefAddRs ifxCardPrefAdd(CardPrefAddRq cardPrefAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefAdd method");
	}

	// 5.8.2 Card Preference Modify Message
	/*
	 * The Card Preference Modify message is used to modify a card preference
	 * object – to alter the preferred account type, amount, or receipt printing
	 * option.
	 */
	@RequestMapping(value = "CardPrefMod", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefModRs cardPrefModify(
			@RequestBody final CardPrefModRq cardPrefModRq) {

		try {
			return ifxCardPrefMod(cardPrefModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefMod-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefModRs ifxCardPrefMod(CardPrefModRq cardPrefModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefMod method");
	}

	// 5.8.3 Card Preference Inquiry Message
	/*
	 * The Card Preference Inquiry message is used to inquire on a Card
	 * Preference object
	 */
	@RequestMapping(value = "CardPrefInq", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefInqRs cardPrefInquiry(
			@RequestBody final CardPrefInqRq cardPrefInqRq) {

		try {
			return ifxCardPrefInquiry(cardPrefInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefInquiry-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefInqRs ifxCardPrefInquiry(CardPrefInqRq cardPrefInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefInquiry method");
	}

	// 5.8.4 Card Preference Delete Message
	/*
	 * The Card Preference Delete message is used to delete a Card Preference
	 * object
	 */
	@RequestMapping(value = "CardPrefDel", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefDelRs cardPrefDelete(
			@RequestBody final CardPrefDelRq cardPrefDelRq) {

		try {
			return ifxCardPrefDelete(cardPrefDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefDelete-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefDelRs ifxCardPrefDelete(CardPrefDelRq cardPrefDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefDelete method");
	}

	// 5.8.5 Card Preference Audit Message
	/*
	 * The Card Preference Audit message is used to audit changes made to a Card
	 * Preference object.
	 */
	@RequestMapping(value = "CardPrefAud", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefAudRs cardPrefAudit(
			@RequestBody final CardPrefAudRq cardPrefAudRq) {

		try {
			return ifxCardPrefAudit(cardPrefAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefAudit-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefAudRs ifxCardPrefAudit(CardPrefAudRq cardPrefAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefAudit method");
	}

	// 5.8.6 Card Preference Sync Message
	/*
	 * The Card Preference Sync message is used to synchronize changes made to a
	 * Card Preference object.
	 */
	@RequestMapping(value = "CardPrefSync", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefSyncRs cardPrefSync(
			@RequestBody final CardPrefSyncRq cardPrefSyncRq) {

		try {
			return ifxCardPrefSync(cardPrefSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefSync-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefSyncRs ifxCardPrefSync(CardPrefSyncRq cardPrefSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefSync method");
	}

	// 5.8.7 Card Preference Reversal Message
	/*
	 * The Card Preference Reversal message is used to reverse on operation
	 * performed on a Card Preference object.
	 */
	@RequestMapping(value = "CardPrefRev", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefRevRs cardPrefReversal(
			@RequestBody final CardPrefRevRq cardPrefRevRq) {

		try {
			return ifxCardPrefReversal(cardPrefRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefReversal-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefRevRs ifxCardPrefReversal(CardPrefRevRq cardPrefRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefReversal method");
	}

	// 5.8.8 Card Preference Status Modify Message
	/*
	 * The Card Preference Status Modify message is used to update the status of
	 * the Card Preference object.
	 */
	@RequestMapping(value = "CardPrefStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public CardPrefStatusModRs cardPrefStatusModify(
			@RequestBody final CardPrefStatusModRq cardPrefStatusModRq) {

		try {
			return ifxCardPrefStatusModify(cardPrefStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCardPrefStatusModify-this method is not implemented yet");
		}
		return null;
	}

	private CardPrefStatusModRs ifxCardPrefStatusModify(
			CardPrefStatusModRq cardPrefStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCardPrefStatusModify method");
	}

	// 5.9 Posting Session
	/*
	 * The Posting Session messages are used to control the session parameters
	 * for a branch teller, CSR or operator. Once a session is established, the
	 * teller, CSR or operator will continue to have a valid session until a
	 * Posting Session Status Modification has changed the status to “Closed
	 * Final”. A session may optionally be closed and reestablished with a
	 * PostingSessionStatusMod any number of times, until a
	 * PostingSessionStatusMod has been sent with a PostingSessionStatusCode of
	 * CloseFinal. The implementation of the PostingSessionModRq at the server
	 * may control if certain parameters cannot be different than the original
	 * parameters and may decline the modification if this is the case. A
	 * Posting Session will be considered Closed when either the posting session
	 * status is updated to “Closed” or to “Closed Final”. Updating the session
	 * status to “Closed” will limit transactions for that session to inquiries
	 * only. Changing the status to “Closed Final” will permanently lock the
	 * record and no further updates will be allowed. The session details will
	 * be contained in the PostingSessionInfo aggregate. A server may optionally
	 * retain session totals for the Posting Sessions. The Session Totals
	 * inquiry will obtain the totals for either all existing sessions or for a
	 * given session. These inquiry messages are being proposed in such a manner
	 * as to allow the reuse for other session types beyond posting sessions.
	 * These messages are intended to be used within the Bank Services. A
	 * posting session identifier may be sent with each teller, CSR or operator
	 * transaction to associate the transaction with the given session on the
	 * server. This posting session identifier will be contained in the
	 * MsgRqHdr. The assumption in these messages is that the person performing
	 * the transaction (whether an operator, supervisor, teller) will be
	 * identified in the SignOnRq that accompanies the message. If the person
	 * performing the transaction differs from the operator to which the posting
	 * session is attached, the operator id will be included with the
	 * transaction message as the CustId. Eg., If the supervisor is signing on,
	 * on behalf of the teller, then the supervisor logon id would be in the
	 * SignOnRq while the teller logon id would be in the CustId of the
	 * transaction message. Note: reversals of a posting session add, modify,
	 * modify status or cancel are not supported.
	 */
	// 5.9.2 Posting Session Add
	/*
	 * The Posting Session Add message is used to establish a Posting Session on
	 * the server. The Posting Session Add will not have any effect on any
	 * Posting Session totals kept at the server.
	 */
	@RequestMapping(value = "PostingSessionAdd", method = RequestMethod.POST)
	@ResponseBody
	public PostingSessionAddRs postingSessionAdd(
			@RequestBody final PostingSessionAddRq postingSessionAddRq) {

		try {
			return ifxPostingSessionAdd(postingSessionAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPostingSessionAdd-this method is not implemented yet");
		}
		return null;
	}

	private PostingSessionAddRs ifxPostingSessionAdd(
			PostingSessionAddRq postingSessionAddRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPostingSessionAdd method");
	}

	// 5.9.3 Posting Session Modify
	/*
	 * The Posting Session Modify message is used to modify an existing Posting
	 * Session’s parameters. The Posting Session Mod will not have any effect on
	 * any Posting Session totals kept on the server.
	 */
	@RequestMapping(value = "PostingSessionMod", method = RequestMethod.POST)
	@ResponseBody
	public PostingSessionModRs postingSessionModify(
			@RequestBody final PostingSessionModRq postingSessionModRq) {

		try {
			return ifxPostingSessionModify(postingSessionModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPostingSessionModify-this method is not implemented yet");
		}
		return null;
	}

	private PostingSessionModRs ifxPostingSessionModify(
			PostingSessionModRq postingSessionModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPostingSessionModify method");
	}

	// 5.9.4 Posting Session Inquiry
	/*
	 * The Posting Session Inquiry messages will return the current session
	 * parameters on the server.
	 */
	@RequestMapping(value = "PostingSessionInq", method = RequestMethod.POST)
	@ResponseBody
	public PostingSessionInqRs postingSessionInquiry(
			@RequestBody final PostingSessionInqRq postingSessionInqRq) {

		try {
			return ifxPostingSessionInquiry(postingSessionInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPostingSessionInquiry-this method is not implemented yet");
		}
		return null;
	}

	private PostingSessionInqRs ifxPostingSessionInquiry(
			PostingSessionInqRq postingSessionInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPostingSessionInquiry method");
	}

	// 5.9.5 Posting Session Audit
	/*
	 * The Posting Session Audit Message allows the client to audit Posting
	 * Session Add/Modify/StatusMod messages
	 */
	@RequestMapping(value = "PostingSessionAud", method = RequestMethod.POST)
	@ResponseBody
	public PostingSessionAudRs postingSessionAudit(
			@RequestBody final PostingSessionAudRq postingSessionAudRq) {

		try {
			return ifxPostingSessionAudit(postingSessionAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPostingSessionAudit-this method is not implemented yet");
		}
		return null;
	}

	private PostingSessionAudRs ifxPostingSessionAudit(
			PostingSessionAudRq postingSessionAudRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPostingSessionAudit method");
	}

	// 5.9.6 Posting Session Status Modify
	/*
	 * The Posting Session Status Modify messages will modify the status of a
	 * particular session. A teller, CSR or operator may want to perform this
	 * when they want to temporarily suspend the session if they are leaving the
	 * workstation. Similarly, they may want to reactivate the session when they
	 * want to continue the session upon their return. This could be done by
	 * setting PostingSessionStatusModCode to
	 */
	@RequestMapping(value = "PostingSessionStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public PostingSessionStatusModRs postingSessionStatusModify(
			@RequestBody final PostingSessionStatusModRq postingSessionStatusModRq) {

		try {
			return ifxPostingSessionStatusModify(postingSessionStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPostingSessionStatusModify-this method is not implemented yet");
		}
		return null;
	}

	private PostingSessionStatusModRs ifxPostingSessionStatusModify(
			PostingSessionStatusModRq postingSessionStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPostingSessionStatusModify method");
	}

	// 5.9.7 Session Totals Inquiry
	/*
	 * The Session Totals Inquiry will return information on a specific session
	 * type. If a session identifier is provided, the totals returned will be
	 * for the given session only. If no session identifier is provided, the
	 * totals returned will be for all sessions on the server
	 */
	@RequestMapping(value = "SessionTotalsInq", method = RequestMethod.POST)
	@ResponseBody
	public SessionTotalsInqRs sessionTotalsInquiry(
			@RequestBody final SessionTotalsInqRq sessionTotalsInqRq) {

		try {
			return ifxSessionTotalsInquiry(sessionTotalsInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxSessionTotalsInquiry-this method is not implemented yet");
		}
		return null;
	}

	private SessionTotalsInqRs ifxSessionTotalsInquiry(
			SessionTotalsInqRq sessionTotalsInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxSessionTotalsInquiry method");
	}

	//
	// 5.10 Base Service Profile <BaseSvcProfInfo>
	/*
	 * The Base Service Profile functions the same way as all other services;
	 * therefore, it contains a Profile description for that service. Profiles
	 * for other services may be found at the end of each chapter of this
	 * document. A SP must return a complete set of Profiles for the services
	 * that it supports in response to a customer-initiated Service Profile
	 * Inquiry <SvcProfInqRq>. The Base Service Profile is defined below. This
	 * information is returned to the client in the Service Profile Inquiry
	 * message and provides information on how the client should use the Base
	 * Service
	 */
	// 5.10.1 Signon Information Aggregate <SignonInfo>
	// 5.10.2 Enroll Profile Aggregate <EnrollProf>

	// API

	// 6.4.1 Balance Inquiry
	@RequestMapping(value = "BalInq", method = RequestMethod.POST)
	@ResponseBody
	public BalInqRs balanceInquiry(@RequestBody final BalInqRq balInqRq) {

		try {
			return ifxBalanceInquiry(balInqRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;
	}

	private BalInqRs ifxBalanceInquiry(BalInqRq balInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBalanceInquiry method");
	}

	// 6.4.2 Balance Reversal
	@RequestMapping(value = "BalRev", method = RequestMethod.POST)
	@ResponseBody
	public BalRevRs balanceReversal(@RequestBody final BalRevRq balRevRq) {

		try {
			return ifxBalanceReversal(balRevRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;
	}

	private BalRevRs ifxBalanceReversal(BalRevRq balRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBalanceReversal method");
	}

	// 6.4.3 Account Inquiry
	/*
	 * A client uses the Account Inquiry Message to retrieve more detailed
	 * information about a bank account than that provided by the Balance
	 * Inquiry Message. Much of the information is returned in an aggregate that
	 * is specific to each Account Type.
	 */

	@RequestMapping(value = "AcctInq", method = RequestMethod.POST)
	@ResponseBody
	public AcctInqRs accInquiry(@RequestBody final AcctInqRq acctInqRq) {
		try {
			return ifxAccInquiry(acctInqRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;

	}

	private AcctInqRs ifxAccInquiry(AcctInqRq acctInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxAccInquiry method");
	}

	// 6.4.4 Account Reversal
	@RequestMapping(value = "AcctRev", method = RequestMethod.POST)
	@ResponseBody
	public AcctRevRs accReversal(@RequestBody final AcctRevRq acctRevRq) {
		try {
			return ifxAccReversal(acctRevRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;

	}

	private AcctRevRs ifxAccReversal(AcctRevRq acctRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxAccReversal method");
	}

	// 6.4.5 Deposit Account Statement Inquiry
	@RequestMapping(value = "DepAcctStmtInq", method = RequestMethod.POST)
	@ResponseBody
	public DepAcctStmtInqRs depAcctStmtInquiry(
			@RequestBody final DepAcctStmtInqRq depAcctStmtInqRq) {
		try {
			return ifxDepAcctStmtInquiry(depAcctStmtInqRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;

	}

	private DepAcctStmtInqRs ifxDepAcctStmtInquiry(
			DepAcctStmtInqRq depAcctStmtInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDepAcctStmtInquiry method");
	}

	// 6.4.6 Deposit Account Statement Reversal
	@RequestMapping(value = "DepAcctStmtRev", method = RequestMethod.POST)
	@ResponseBody
	public DepAcctStmtRevRs depAcctStmtReversal(
			@RequestBody final DepAcctStmtRevRq depAcctStmtRevRq) {
		try {
			return ifxDepAcctStmtReversal(depAcctStmtRevRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;

	}

	private DepAcctStmtRevRs ifxDepAcctStmtReversal(
			DepAcctStmtRevRq depAcctStmtRevRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDepAcctStmtReversal method");
	}

	// 6.4.7 Deposit Account Statement Advise
	@RequestMapping(value = "DepAcctStmtAdvise", method = RequestMethod.POST)
	@ResponseBody
	public DepAcctStmtAdviseRs depAcctStmtAdvise(
			@RequestBody final DepAcctStmtAdviseRq depAcctStmtAdviseRq) {
		try {
			return ifxDepAcctStmtAdvise(depAcctStmtAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("this method is not implemented yet");
		}
		return null;

	}

	private DepAcctStmtAdviseRs ifxDepAcctStmtAdvise(
			DepAcctStmtAdviseRq depAcctStmtAdviseRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDepAcctStmtAdvise method");
	}

	// 6.4.8 Credit Card Statement Inquiry
	@RequestMapping(value = "CCAcctStmtInq", method = RequestMethod.POST)
	@ResponseBody
	public CCAcctStmtInqRs ccAcctStmtInquiry(
			@RequestBody final CCAcctStmtInqRq ccAcctStmtInqRq) {
		try {
			return ifxCCAcctStmtInquiry(ccAcctStmtInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCCAcctStmtInq- this method is not implemented yet");
		}
		return null;

	}

	private CCAcctStmtInqRs ifxCCAcctStmtInquiry(CCAcctStmtInqRq ccAcctStmtInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCCAcctStmtInquiry method");
	}

	// 6.4.9 Credit Card Statement Inquiry Reversal
	@RequestMapping(value = "CCAcctStmtRev", method = RequestMethod.POST)
	@ResponseBody
	public CCAcctStmtRevRs ccAcctStmtReversal(
			@RequestBody final CCAcctStmtRevRq ccAcctStmtRevRq) {
		try {
			return ifxCCAcctStmtReversal(ccAcctStmtRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCCAcctStmtReversal- this method is not implemented yet");
		}
		return null;

	}

	private CCAcctStmtRevRs ifxCCAcctStmtReversal(
			CCAcctStmtRevRq ccAcctStmtRevRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCCAcctStmtReversal method");
	}

	// 6.4.10 Deposit Account Transaction Inquiry
	@RequestMapping(value = "DepAcctTrnInq", method = RequestMethod.POST)
	@ResponseBody
	public DepAcctTrnInqRs DepAcctTrnInquiry(
			@RequestBody final DepAcctTrnInqRq depAcctTrnInqRq) {
		try {
			return ifxDepAcctTrnInquiry(depAcctTrnInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxDepAcctTrnInquiry- this method is not implemented yet");
		}
		return null;

	}

	private DepAcctTrnInqRs ifxDepAcctTrnInquiry(DepAcctTrnInqRq depAcctTrnInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDepAcctTrnInquiry method");
	}

	// 6.4.11 Deposit Account Transaction Advise
	@RequestMapping(value = "DepAcctTrnAdvise", method = RequestMethod.POST)
	@ResponseBody
	public DepAcctTrnAdviseRs DepAcctTrnAdvise(
			@RequestBody final DepAcctTrnAdviseRq depAcctTrnAdviseRq) {
		try {
			return ifxDepAcctTrnAdvise(depAcctTrnAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxDepAcctTrnAdvise- this method is not implemented yet");
		}
		return null;

	}

	private DepAcctTrnAdviseRs ifxDepAcctTrnAdvise(
			DepAcctTrnAdviseRq depAcctTrnAdviseRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDepAcctTrnAdvise method");
	}

	// 6.4.12 Deposit Account Transaction Reversal
	@RequestMapping(value = "DepAcctTrnRev", method = RequestMethod.POST)
	@ResponseBody
	public DepAcctTrnRevRs DepAcctTrnReversal(
			@RequestBody final DepAcctTrnRevRq depAcctTrnRevRq) {
		try {
			return ifxDepAcctTrnReversal(depAcctTrnRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxDepAcctTrnReversal- this method is not implemented yet");
		}
		return null;

	}

	private DepAcctTrnRevRs ifxDepAcctTrnReversal(
			DepAcctTrnRevRq depAcctTrnRevRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDepAcctTrnReversal method");
	}

	// 6.4.13 Credit Card Account Transaction Inquiry
	/*
	 * A client uses the Credit Card Account Transaction Inquiry to retrieve
	 * transaction detail for a given account. A variety of selection criteria
	 * are supported.
	 */
	@RequestMapping(value = "CCAcctTrnInq", method = RequestMethod.POST)
	@ResponseBody
	public CCAcctTrnInqRs ccAcctTrnInquiry(
			@RequestBody final CCAcctTrnInqRq ccAcctTrnInqRq) {
		try {
			return ifxCCAcctTrnInquiry(ccAcctTrnInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCCAcctTrnInquiry- this method is not implemented yet");
		}
		return null;

	}

	private CCAcctTrnInqRs ifxCCAcctTrnInquiry(CCAcctTrnInqRq ccAcctTrnInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCCAcctTrnInquiry method");
	}

	// 6.4.14 Credit Card Account Transaction Reversal
	@RequestMapping(value = "CCAcctTrnRev", method = RequestMethod.POST)
	@ResponseBody
	public CCAcctTrnRevRs ccAcctTrnReversal(
			@RequestBody final CCAcctTrnRevRq ccAcctTrnRevRq) {
		try {
			return ifxCCAcctTrnReversal(ccAcctTrnRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCCAcctTrnReversal- this method is not implemented yet");
		}
		return null;

	}

	private CCAcctTrnRevRs ifxCCAcctTrnReversal(CCAcctTrnRevRq ccAcctTrnRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCCAcctTrnReversal method");
	}

	// 6.4.15 Bank Account Transaction Image Inquiry
	/*
	 * The Bank Account Transaction Image Order Message allows a client to
	 * request a copy of a check or sales slip. Note: The client may specify a
	 * delivery method picked from those supported in the Service Profile.
	 */
	@RequestMapping(value = "BankAcctTrnImgInq", method = RequestMethod.POST)
	@ResponseBody
	public BankAcctTrnImgInqRs BankAcctTrnImgInquiry(
			@RequestBody final BankAcctTrnImgInqRq bankAcctTrnImgInqRq) {
		try {
			return ifxBankAcctTrnImgInquiry(bankAcctTrnImgInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBankAcctTrnImgInquiry- this method is not implemented yet");
		}
		return null;

	}

	private BankAcctTrnImgInqRs ifxBankAcctTrnImgInquiry(
			BankAcctTrnImgInqRq bankAcctTrnImgInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCCAcctTrnReversal method");
	}

	// 6.4.16 Bank Account Transaction Image Reversal
	@RequestMapping(value = "BankAcctTrnImgRev", method = RequestMethod.POST)
	@ResponseBody
	public BankAcctTrnImgRevRs BankAcctTrnImgReversal(
			@RequestBody final BankAcctTrnImgRevRq BankAcctTrnImgRevRq) {
		try {
			return ifxBankAcctTrnImgReversal(BankAcctTrnImgRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBankAcctTrnImgReversal- this method is not implemented yet");
		}
		return null;

	}

	private BankAcctTrnImgRevRs ifxBankAcctTrnImgReversal(
			BankAcctTrnImgRevRq BankAcctTrnImgRevRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBankAcctTrnImgReversal method");
	}

	// 6.4.19 Bank Account Taxation Inquiry
	/*
	 * The client must specify a client identifier, the account identifier, and
	 * tax details.
	 */
	@RequestMapping(value = "BankAcctTaxInq", method = RequestMethod.POST)
	@ResponseBody
	public BankAcctTaxInqRs BankAcctTaxInquiry(
			@RequestBody final BankAcctTaxInqRq bankAcctTaxInqRq) {
		try {
			return ifxBankAcctTaxInquiry(bankAcctTaxInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBankAcctTaxInquiry- this method is not implemented yet");
		}
		return null;

	}

	private BankAcctTaxInqRs ifxBankAcctTaxInquiry(
			BankAcctTaxInqRq bankAcctTaxInqRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBankAcctTaxInquiry method");
	}

	// 6.4.20 Foreign Exchange Rate Inquiry
	/*
	 * A client may request an exchange rate or a committed exchange rate for a
	 * future message. The Financial Institution may quote the current rate or
	 * may commit a rate for some time period. If a commitment is made to honor
	 * a rate until a future date, the Financial Institution must return a
	 * commitment identifier, which is provided in the <ForExRateId> in the
	 * <ForExRateRec>.
	 */
	@RequestMapping(value = "ForExRateInq", method = RequestMethod.POST)
	@ResponseBody
	public ForExRateInqRs ForExRateInquiry(
			@RequestBody final ForExRateInqRq forExRateInqRq) {
		try {
			return ifxForExRateInquiry(forExRateInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExRateInquiry- this method is not implemented yet");
		}
		return null;

	}

	private ForExRateInqRs ifxForExRateInquiry(ForExRateInqRq forExRateInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExRateInquiry method");
	}

	// 6.4.21 Foreign Exchange Rate Reversal
	@RequestMapping(value = "ForExRateRev", method = RequestMethod.POST)
	@ResponseBody
	public ForExRateRevRs ForExRateReversal(
			@RequestBody final ForExRateRevRq forExRateRevRq) {
		try {
			return ifxForExRateReversal(forExRateRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExRateReversal- this method is not implemented yet");
		}
		return null;

	}

	private ForExRateRevRs ifxForExRateReversal(ForExRateRevRq forExRateRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExRateReversal method");
	}

	// 6.5 Foreign Exchange Deal Elements
	// 6.5.2 Foreign Exchange Deal Add
	/*
	 * A client may purchase foreign exchange currency using the
	 * <ForExDealAddRq> and later make a single or installment payment on this
	 * purchase using the associated <SPRefId> or <ForExDealId> as a reference
	 * identifier in a payment or funds transfer message.
	 */
	@RequestMapping(value = "ForExDealAdd", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealAddRs ForExDealAdd(
			@RequestBody final ForExDealAddRq forExDealAddRq) {
		try {
			return ifxForExDealAdd(forExDealAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealAdd- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealAddRs ifxForExDealAdd(ForExDealAddRq forExDealAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealAdd method");
	}

	// 6.5.3 Foreign Exchange Deal Modify
	/*
	 * The Foreign Exchange Deal Modify messages provide support to modify a
	 * particular Foreign Exchange Deal.
	 */
	@RequestMapping(value = "ForExDealMod", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealModRs ForExDealModify(
			@RequestBody final ForExDealModRq forExDealModRq) {
		try {
			return ifxForExDealModify(forExDealModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealModify- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealModRs ifxForExDealModify(ForExDealModRq forExDealModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealModify method");
	}

	// 6.5.4 Foreign Exchange Deal Inquiry
	/*
	 * The Foreign Exchange Deal Inquiry allows for a client to inquire on
	 * foreign exchange deal(s) based upon the supplied search criteria.
	 */
	@RequestMapping(value = "ForExDealInquiry", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealInqRs ForExDealInquiry(
			@RequestBody final ForExDealInqRq forExDealInqRq) {
		try {
			return ifxForExDealInquiry(forExDealInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealInquiry- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealInqRs ifxForExDealInquiry(ForExDealInqRq forExDealInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealInquiry method");
	}

	// 6.5.5 Foreign Exchange Deal Cancel
	/*
	 * The Foreign Exchange Deal Cancel message will cancel an existing pending
	 * deal.
	 */
	@RequestMapping(value = "ForExDealCan", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealCanRs ForExDealCancel(
			@RequestBody final ForExDealCanRq forExDealCanRq) {
		try {
			return ifxForExDealCancel(forExDealCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealCancel- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealCanRs ifxForExDealCancel(ForExDealCanRq forExDealCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealCancel method");
	}

	// 6.5.6 Foreign Exchange Deal Audit
	/*
	 * The Foreign Exchange Deal Audit message supports the ability for the
	 * client to trace the message history for all changes impacting the
	 * specified foreign exchange deal.
	 */
	@RequestMapping(value = "ForExDealAud", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealAudRs forExDealAudit(
			@RequestBody final ForExDealAudRq forExDealAudRq) {
		try {
			return ifxForExDealAudit(forExDealAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealAudit- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealAudRs ifxForExDealAudit(ForExDealAudRq forExDealAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealAudit method");
	}

	// 6.5.7 Foreign Exchange Deal Sync
	/*
	 * The Foreign Exchange Deal Sync messages provide the ability for a client
	 * device to be brought up to date on changes made to the specified Foreign
	 * Exchange Deal object.
	 */
	@RequestMapping(value = "ForExDealSync", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealSyncRs forExDealSync(
			@RequestBody final ForExDealSyncRq forExDealSyncRq) {
		try {
			return ifxForExDealSync(forExDealSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealSync- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealSyncRs ifxForExDealSync(ForExDealSyncRq forExDealSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealSync method");
	}

	// 6.5.8 Foreign Exchange Deal Reversal
	/*
	 * The Foreign Exchange Deal Reversal message supports only a reversal on a
	 * <ForExDealAddRq> message.
	 */
	@RequestMapping(value = "ForExDealRev", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealRevRs ForExDealReversal(
			@RequestBody final ForExDealRevRq forExDealRevRq) {
		try {
			return ifxForExDealReversal(forExDealRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealReversal- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealRevRs ifxForExDealReversal(ForExDealRevRq forExDealRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealReversal method");
	}

	// 6.5.9 Foreign Exchange Deal Status Modify
	/*
	 * The Foreign Exchange Deal Status Modify message allows for the
	 * modification of the status of a Foreign Exchange Deal.
	 */
	@RequestMapping(value = "ForExDealStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealStatusModRs forExDealStatusModify(
			@RequestBody final ForExDealStatusModRq forExDealStatusModRq) {
		try {
			return ifxForExDealStatusModify(forExDealStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealStatusModify- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealStatusModRs ifxForExDealStatusModify(
			ForExDealStatusModRq forExDealStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealStatusModify method");
	}

	// 6.5.10 Foreign Exchange Deal Status Inquiry
	@RequestMapping(value = "ForExDealStatusInq", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealStatusInqRs forExDealStatusInquiry(
			@RequestBody final ForExDealStatusInqRq forExDealStatusInqRq) {
		try {
			return ifxForExDealStatusInquiry(forExDealStatusInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealStatusInquiry- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealStatusInqRs ifxForExDealStatusInquiry(
			ForExDealStatusInqRq forExDealStatusInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealStatusInquiry method");
	}

	// 6.5.11 Foreign Exchange Deal Advise
	@RequestMapping(value = "ForExDealAdvise", method = RequestMethod.POST)
	@ResponseBody
	public ForExDealAdviseRs forExDealAdvise(
			@RequestBody final ForExDealAdviseRq forExDealAdviseRq) {
		try {
			return ifxForExDealAdvise(forExDealAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxForExDealAdvise- this method is not implemented yet");
		}
		return null;

	}

	private ForExDealAdviseRs ifxForExDealAdvise(
			ForExDealAdviseRq forExDealAdviseRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxForExDealAdvise method");
	}
	// 6.6 Stop Check
	// 6.6.1 Stop Check Add
	/*
	 * The client sends a <StopChkAddRq> message to request that a check be
	 * stopped. The minimum function server must support identification of the
	 * check via check number <ChkNum> within <StopChkInfo>. The server stores
	 * the additional data elements within <StopChkInfo> (payee name and amount)
	 * to help identify the stop check request for future reference. They are
	 * not used to identify the check to be stopped.
	 */
	@RequestMapping(value = "StopChkAdd", method = RequestMethod.POST)
	@ResponseBody
	public StopChkAddRs stopChkAdd(@RequestBody final StopChkAddRq stopChkAddRq) {
		try {
			return ifxStopChkAdd(stopChkAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkAdd- this method is not implemented yet");
		}
		return null;

	}

	private StopChkAddRs ifxStopChkAdd(StopChkAddRq stopChkAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkAdd method");
	}

	// 6.6.2 Stop Check Cancel
	/*
	 * A client may cancel a Stop Check Payment Request with a Financial
	 * Institution
	 */
	@RequestMapping(value = "StopChkCan", method = RequestMethod.POST)
	@ResponseBody
	public StopChkCanRs stopChkCancel(
			@RequestBody final StopChkCanRq stopChkCanRq) {
		try {
			return ifxStopChkCan(stopChkCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkCan- this method is not implemented yet");
		}
		return null;

	}

	private StopChkCanRs ifxStopChkCan(StopChkCanRq stopChkCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkCan method");
	}

	// 6.6.3 Stop Check Inquiry
	/*
	 * The Stop Check Inquiry message allows a client to retrieve records of
	 * both current and completed stopped checks. Since volume of stopped checks
	 * is expected to be relatively low on a per-customer basis, there is not a
	 * separate Stop Check History Inquiry
	 */

	@RequestMapping(value = "StopChkInq", method = RequestMethod.POST)
	@ResponseBody
	public StopChkInqRs stopChkInquiry(
			@RequestBody final StopChkInqRq stopChkInqRq) {
		try {
			return ifxStopChkInquiry(stopChkInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkInquiry- this method is not implemented yet");
		}
		return null;

	}

	private StopChkInqRs ifxStopChkInquiry(StopChkInqRq stopChkInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkInquiry method");
	}

	// 6.6.4 Stop Check Audit
	@RequestMapping(value = "StopChkAud", method = RequestMethod.POST)
	@ResponseBody
	public StopChkAudRs stopChkAudit(
			@RequestBody final StopChkAudRq stopChkAudRq) {
		try {
			return ifxStopChkAudit(stopChkAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkAudit- this method is not implemented yet");
		}
		return null;

	}

	private StopChkAudRs ifxStopChkAudit(StopChkAudRq stopChkAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkAudit method");
	}

	// 6.6.5 Stop Check Sync
	@RequestMapping(value = "StopChkSync", method = RequestMethod.POST)
	@ResponseBody
	public StopChkSyncRs stopChkSync(
			@RequestBody final StopChkSyncRq stopChkSyncRq) {
		try {
			return ifxStopChkSync(stopChkSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkSync- this method is not implemented yet");
		}
		return null;

	}

	private StopChkSyncRs ifxStopChkSync(StopChkSyncRq stopChkSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkSync method");
	}

	// 6.6.6 Stop Check Advise
	@RequestMapping(value = "StopChkAdvise", method = RequestMethod.POST)
	@ResponseBody
	public StopChkAdviseRs stopChkAdvise(
			@RequestBody final StopChkAdviseRq stopChkAdviseRq) {
		try {
			return ifxStopChkAdvise(stopChkAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkAdvise- this method is not implemented yet");
		}
		return null;

	}

	private StopChkAdviseRs ifxStopChkAdvise(StopChkAdviseRq stopChkAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkAdvise method");
	}

	// 6.6.7 Stop Check Reversal
	@RequestMapping(value = "StopChkRev", method = RequestMethod.POST)
	@ResponseBody
	public StopChkRevRs stopChkReversal(
			@RequestBody final StopChkRevRq stopChkRevRq) {
		try {
			return ifxStopChkReversal(stopChkRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStopChkReversal- this method is not implemented yet");
		}
		return null;

	}

	private StopChkRevRs ifxStopChkReversal(StopChkRevRq StopChkRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStopChkReversal method");
	}

	// 6.7 Funds Transfer
	/*
	 * This section contains web services for transferring money between
	 * accounts within one Financial Institution, or among service providers.
	 */
	// 6.7.1 Funds Transfer Add
	@RequestMapping(value = "XferAdd", method = RequestMethod.POST)
	@ResponseBody
	public XferAddRs xferAdd(@RequestBody final XferAddRq xferAddRq) {
		try {
			return ifxXferAdd(xferAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferAdd- this method is not implemented yet");
		}
		return null;

	}

	private XferAddRs ifxXferAdd(XferAddRq xferAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferAdd method");
	}

	// 6.7.2 Funds Transfer Modify
	@RequestMapping(value = "XferMod", method = RequestMethod.POST)
	@ResponseBody
	public XferModRs XferModify(@RequestBody final XferModRq xferModRq) {
		try {
			return ifxXferModify(xferModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferModify- this method is not implemented yet");
		}
		return null;

	}

	private XferModRs ifxXferModify(XferModRq xferModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferModify method");
	}

	// 6.7.3 Funds Transfer Status Modify
	@RequestMapping(value = "XferStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public XferStatusModRs xferStatusModify(
			@RequestBody final XferStatusModRq xferStatusModRq) {
		try {
			return ifxXferStatusMod(xferStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferStatusMod- this method is not implemented yet");
		}
		return null;

	}

	private XferStatusModRs ifxXferStatusMod(XferStatusModRq xferStatusModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferStatusMod method");
	}

	// 6.7.4 Funds Transfer Cancel
	@RequestMapping(value = "XferCan", method = RequestMethod.POST)
	@ResponseBody
	public XferCanRs xferCancel(@RequestBody final XferCanRq xferCanRq) {
		try {
			return ifxXferCancel(xferCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferCancel- this method is not implemented yet");
		}
		return null;

	}

	private XferCanRs ifxXferCancel(XferCanRq xferCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferCancel method");
	}

	// 6.7.5 Funds Transfer Inquiry
	@RequestMapping(value = "XferInq", method = RequestMethod.POST)
	@ResponseBody
	public XferInqRs XferInquiry(@RequestBody final XferInqRq xferInqRq) {
		try {
			return ifxXferInquiry(xferInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferInquiry- this method is not implemented yet");
		}
		return null;

	}

	private XferInqRs ifxXferInquiry(XferInqRq xferInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferInquiry method");
	}

	// 6.7.6 Funds Transfer Audit
	@RequestMapping(value = "XferAud", method = RequestMethod.POST)
	@ResponseBody
	public XferAudRs xferAudit(@RequestBody final XferAudRq xferAudRq) {
		try {
			return ifxXferAudit(xferAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferAudit- this method is not implemented yet");
		}
		return null;

	}

	private XferAudRs ifxXferAudit(XferAudRq xferAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferAudit method");
	}

	// 6.7.7 Funds Transfer Sync
	@RequestMapping(value = "XferSync", method = RequestMethod.POST)
	@ResponseBody
	public XferSyncRs xferSync(@RequestBody final XferSyncRq xferSyncRq) {
		try {
			return ifxXferSync(xferSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferSync- this method is not implemented yet");
		}
		return null;

	}

	private XferSyncRs ifxXferSync(XferSyncRq xferSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferSync method");
	}

	// 6.7.8 Funds Transfer Advise
	/*
	 * The Xfer Advise message is used to notify interested parties that an Xfer
	 * object was created or modified. This message will be used to notify an
	 * account owning organization of transactions authorized on their behalf.
	 */
	@RequestMapping(value = "XferAdvise", method = RequestMethod.POST)
	@ResponseBody
	public XferAdviseRs xferAdvise(@RequestBody final XferAdviseRq xferAdviseRq) {
		try {
			return ifxXferAdvise(xferAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferAdvise- this method is not implemented yet");
		}
		return null;

	}

	private XferAdviseRs ifxXferAdvise(XferAdviseRq xferAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferAdvise method");
	}

	// 6.7.9 Funds Transfer Reversal
	@RequestMapping(value = "XferRev", method = RequestMethod.POST)
	@ResponseBody
	public XferRevRs xferReversal(@RequestBody final XferRevRq xferRevRq) {
		try {
			return ifxXferReversal(xferRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxXferReversal- this method is not implemented yet");
		}
		return null;

	}

	private XferRevRs ifxXferReversal(XferRevRq xferRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxXferReversal method");
	}

	// 6.8 Recurring Transfer Model
	// 6.8.1 Recurring Transfer Model Add
	@RequestMapping(value = "RecXferAdd", method = RequestMethod.POST)
	@ResponseBody
	public RecXferAddRs recXferAdd(@RequestBody final RecXferAddRq recXferAddRq) {
		try {
			return ifxRecXferAdd(recXferAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferAdd- this method is not implemented yet");
		}
		return null;

	}

	private RecXferAddRs ifxRecXferAdd(RecXferAddRq recXferAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferAdd method");
	}

	// 6.8.2 Recurring Transfer Model Modify
	@RequestMapping(value = "RecXferMod", method = RequestMethod.POST)
	@ResponseBody
	public RecXferModRs recXferModify(
			@RequestBody final RecXferModRq recXferModRq) {
		try {
			return ifxRecXferModify(recXferModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferModify- this method is not implemented yet");
		}
		return null;

	}

	private RecXferModRs ifxRecXferModify(RecXferModRq recXferModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferModify method");
	}

	// 6.8.3 Recurring Transfer Model Cancel
	@RequestMapping(value = "RecXferCan", method = RequestMethod.POST)
	@ResponseBody
	public RecXferCanRs recXferCancel(
			@RequestBody final RecXferCanRq recXferCanRq) {
		try {
			return ifxRecXferCancel(recXferCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferCancel- this method is not implemented yet");
		}
		return null;

	}

	private RecXferCanRs ifxRecXferCancel(RecXferCanRq recXferCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferCancel method");
	}

	// 6.8.4 Recurring Transfer Model Inquiry
	@RequestMapping(value = "RecXferInq", method = RequestMethod.POST)
	@ResponseBody
	public RecXferInqRs recXferInquiry(
			@RequestBody final RecXferInqRq recXferInqRq) {
		try {
			return ifxRecXferInquiry(recXferInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferInquiry- this method is not implemented yet");
		}
		return null;

	}

	private RecXferInqRs ifxRecXferInquiry(RecXferInqRq recXferInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferInquiry method");
	}

	// 6.8.5 Recurring Transfer Model Audit
	@RequestMapping(value = "RecXferAud", method = RequestMethod.POST)
	@ResponseBody
	public RecXferAudRs recXferAudit(
			@RequestBody final RecXferAudRq recXferAudRq) {
		try {
			return ifxRecXferAudit(recXferAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferAudit- this method is not implemented yet");
		}
		return null;

	}

	private RecXferAudRs ifxRecXferAudit(RecXferAudRq recXferAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferAudit method");
	}

	// 6.8.6 Recurring Transfer Model Sync
	@RequestMapping(value = "RecXferSync", method = RequestMethod.POST)
	@ResponseBody
	public RecXferSyncRs recXferSync(
			@RequestBody final RecXferSyncRq recXferSyncRq) {
		try {
			return ifxRecXferSync(recXferSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferSync- this method is not implemented yet");
		}
		return null;

	}

	private RecXferSyncRs ifxRecXferSync(RecXferSyncRq recXferSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferSync method");
	}

	// 6.8.7 Recurring Transfer Reversal
	@RequestMapping(value = "RecXferRev", method = RequestMethod.POST)
	@ResponseBody
	public RecXferRevRs recXferReversal(
			@RequestBody final RecXferRevRq recXferRevRq) {
		try {
			return ifxRecXferReversal(recXferRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecXferReversal- this method is not implemented yet");
		}
		return null;

	}

	private RecXferRevRs ifxRecXferReversal(RecXferRevRq recXferRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecXferReversal method");
	}

	// 6.9 Customer Communications
	// 6.9.1 Check Order
	// 6.9.1.1 Check Order Add
	/*
	 * The client sends a <ChkOrdAddRq> to place a new check order.. Note: The
	 * customer must determine the supported values for <Count> and
	 * <ChkBkStyleId> through an out-of-band process.
	 */
	@RequestMapping(value = "ChkOrdAdd", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdAddRs chkOrdAdd(@RequestBody final ChkOrdAddRq chkOrdAddRq) {
		try {
			return ifxChkOrdAdd(chkOrdAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdAdd- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdAddRs ifxChkOrdAdd(ChkOrdAddRq chkOrdAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdAdd method");
	}

	// 6.9.1.2 Check Order Modification
	/*
	 * Check Order Modification Request message modifies a previously added
	 * check order record.
	 */
	@RequestMapping(value = "ChkOrdMod", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdModRs chkOrdModify(@RequestBody final ChkOrdModRq chkOrdModRq) {
		try {
			return ifxChkOrdModify(chkOrdModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdModify- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdModRs ifxChkOrdModify(ChkOrdModRq chkOrdModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdModify method");
	}

	// 6.9.1.3 Check Order Cancellation
	/*
	 * Check Order Cancellation Request message cancels a previously added check
	 * order record.
	 */
	@RequestMapping(value = "ChkOrdCan", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdCanRs chkOrdCancel(@RequestBody final ChkOrdCanRq chkOrdCanRq) {
		try {
			return ifxChkOrdCancel(chkOrdCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdCancel- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdCanRs ifxChkOrdCancel(ChkOrdCanRq chkOrdCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdCancel method");
	}

	// 6.9.1.4 Check Order Inquiry
	/*
	 * Check Order Inquiry Request message retrieves check order records based
	 * on selection criteria provided.
	 */
	@RequestMapping(value = "ChkOrdInq", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdInqRs chkOrdInquiry(@RequestBody final ChkOrdInqRq chkOrdInqRq) {
		try {
			return ifxChkOrdInquiry(chkOrdInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdInquiry- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdInqRs ifxChkOrdInquiry(ChkOrdInqRq chkOrdInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdInquiry method");
	}

	// 6.9.1.5 Check Order Audit
	@RequestMapping(value = "ChkOrdAud", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdAudRs chkOrdAudit(@RequestBody final ChkOrdAudRq chkOrdAudRq) {
		try {
			return ifxChkOrdAudit(chkOrdAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdAudit- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdAudRs ifxChkOrdAudit(ChkOrdAudRq chkOrdAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdAudit method");
	}

	// 6.9.1.6 Check Order Synchronization
	@RequestMapping(value = "ChkOrdSync", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdSyncRs chkOrdSync(@RequestBody final ChkOrdSyncRq chkOrdSyncRq) {
		try {
			return ifxChkOrdSync(chkOrdSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdSync- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdSyncRs ifxChkOrdSync(ChkOrdSyncRq chkOrdSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdSync method");
	}

	// 6.9.1.7 Check Order Advise
	/*
	 * The ChkOrd Advise message is used to notify interested parties that a
	 * ChkOrd object was created or modified. This message will be used to
	 * notify an account owning organization of transactions authorized on their
	 * behalf.
	 */
	@RequestMapping(value = "ChkOrdAdvise", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdAdviseRs chkOrdAdvise(
			@RequestBody final ChkOrdAdviseRq chkOrdAdviseRq) {
		try {
			return ifxChkOrdAdvise(chkOrdAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdAdvise- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdAdviseRs ifxChkOrdAdvise(ChkOrdAdviseRq chkOrdAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdAdvise method");
	}

	// 6.9.1.8 Check Order Reversal
	/*
	 * 
	 */
	@RequestMapping(value = "ChkOrdRev", method = RequestMethod.POST)
	@ResponseBody
	public ChkOrdRevRs chkOrdReversal(@RequestBody final ChkOrdRevRq chkOrdRevRq) {
		try {
			return ifxChkOrdReversal(chkOrdRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChkOrdReversal- this method is not implemented yet");
		}
		return null;

	}

	private ChkOrdRevRs ifxChkOrdReversal(ChkOrdRevRq chkOrdRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChkOrdReversal method");
	}

	// 6.9.2 Recurring Check Order
	// 6.9.2.1 Recurring Check Order Add
	/*
	 * The Recurring Check Order Model Add message allows a client to set-up a
	 * recurring or repeating check order.
	 */
	@RequestMapping(value = "RecChkOrdAdd", method = RequestMethod.POST)
	@ResponseBody
	public RecChkOrdAddRs recChkOrdAdd(
			@RequestBody final RecChkOrdAddRq recChkOrdAddRq) {
		try {
			return ifxRecChkOrdAdd(recChkOrdAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecChkOrdAdd- this method is not implemented yet");
		}
		return null;
	}

	private RecChkOrdAddRs ifxRecChkOrdAdd(RecChkOrdAddRq recChkOrdAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecChkOrdAdd method");
	}

	// 6.9.2.2 Recurring Check Order Modification
	/*
	 * The Recurring Check Order Model Modification message allows a client to
	 * modify a previously added recurring or repeating check order.
	 */
	@RequestMapping(value = "RecChkOrdMod", method = RequestMethod.POST)
	@ResponseBody
	public RecChkOrdModRs recChkOrdMod(
			@RequestBody final RecChkOrdModRq recChkOrdModRq) {
		try {
			return ifxRecChkOrdMod(recChkOrdModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecChkOrdMod- this method is not implemented yet");
		}
		return null;

	}

	private RecChkOrdModRs ifxRecChkOrdMod(RecChkOrdModRq recChkOrdModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecChkOrdMod method");
	}

	// 6.9.2.3 Recurring Check Order Cancellation
	/*
	 * Recurring Check Order Cancellation Request message cancels a previously
	 * added recurring check order record.
	 */
	@RequestMapping(value = "RecChkOrdCan", method = RequestMethod.POST)
	@ResponseBody
	public RecChkOrdCanRs recChkOrdCan(
			@RequestBody final RecChkOrdCanRq recChkOrdCanRq) {
		try {
			return ifxRecChkOrdCan(recChkOrdCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecChkOrdCan- this method is not implemented yet");
		}
		return null;
	}

	private RecChkOrdCanRs ifxRecChkOrdCan(RecChkOrdCanRq recChkOrdCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecChkOrdCan method");
	}

	// 6.9.2.4 Recurring Check Order Inquiry


	// 7.4 Standard Payee
	// 7.4.1 Standard Payee Inquiry
	/*
	 * The Standard Payee Inquiry message may be used to assist customers in
	 * selecting payees to be added to the customer’s personal payee list
	 * <CustPayeeId>. The response returns one or more well-known payees that
	 * match the selection criteria of the request.
	 */
	@RequestMapping(value = "StdPayeeInq", method = RequestMethod.POST)
	@ResponseBody
	public StdPayeeInqRs stdPayeeInq(
			@RequestBody final StdPayeeInqRq stdPayeeInqRq) {
		try {
			return ifxStdPayeeInq(stdPayeeInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStdPayeeInq- this method is not implemented yet");
		}
		return null;
	}

	private StdPayeeInqRs ifxStdPayeeInq(StdPayeeInqRq stdPayeeInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStdPayeeInq method");
	}


	// 7.4.2 Standard Payee Reversal
	@RequestMapping(value = "StdPayeeRev", method = RequestMethod.POST)
	@ResponseBody
	public StdPayeeRevRs stdPayeeReversal(
			@RequestBody final StdPayeeRevRq stdPayeeRevRq) {
		try {
			return ifxStdPayeeRev(stdPayeeRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxStdPayeeRev- this method is not implemented yet");
		}
		return null;
	}

	private StdPayeeRevRs ifxStdPayeeRev(StdPayeeRevRq stdPayeeRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxStdPayeeRev method");
	}


	// 7.5 Customer Payee
	// 7.5.1 Customer Payee Add
	/*
	 * The client uses the Customer Payee Add message to add a Payee to a
	 * Customer Payee list on the Pay provider’s server.
	 */
	@RequestMapping(value = "CustPayeeAdd", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeAddRs CustPayeeAdd(
			@RequestBody final CustPayeeAddRq custPayeeAddRq) {
		try {
			return ifxCustPayeeAdd(custPayeeAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPayeeAdd- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeAddRs ifxCustPayeeAdd(CustPayeeAddRq custPayeeAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPayeeAdd method");
	}


	// 7.5.2 Customer Payee Modify
	/*
	 * The Modify Payee message allows a client to change information about a
	 * payee on a customer’s Payee list on the Pay provider’s server.
	 */
	@RequestMapping(value = "CustPayeeMod", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeModRs custPayeeMod(
			@RequestBody final CustPayeeModRq custPayeeModRq) {
		try {
			return ifxCustPayeeMod(custPayeeModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPayeeMod- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeModRs ifxCustPayeeMod(CustPayeeModRq custPayeeModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPayeeMod method");
	}


	// 7.5.3 Customer Payee Type Modify
	/*
	 * A user with special authorization, typically a CSR, may send a request to
	 * the Payment Service Provider to change the payee type.
	 */
	@RequestMapping(value = "CustPayeeTypeMod", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeTypeModRs custPayeeTypeMod(
			@RequestBody final CustPayeeTypeModRq custPayeeTypeModRq) {
		try {
			return ifxCustPayeeTypeMod(custPayeeTypeModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPayeeTypeMod- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeTypeModRs ifxCustPayeeTypeMod(
			CustPayeeTypeModRq custPayeeTypeModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPayeeTypeMod method");
	}


	// 7.5.4 Customer Payee Delete
	/*
	 * A client uses the Customer Payee Delete message to delete a Payee from a
	 * Customer Payee list on the server. If the <CascadeDel> element is not set
	 * to True, an error must be returned if a payee delete is attempted when
	 * payments are still pending. If this error is returned, the types of
	 * dependent objects must be communicated to the client in the response
	 * message.
	 */
	@RequestMapping(value = "CustPayeeDel", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeDelRs custPayeeDelete(
			@RequestBody final CustPayeeDelRq custPayeeDelRq) {
		try {
			return ifxCustPayeeDelete(custPayeeDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPayeeDelete- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeDelRs ifxCustPayeeDelete(CustPayeeDelRq custPayeeDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPayeeDelete method");
	}


	// 7.5.5 Customer Payee Inquiry
	/*
	 * A client uses the Payee Inquiry message to obtain records from the
	 * Customer Payee list on a server. Clients that store a local copy of a
	 * Customer Payee list may use this message to “refresh” the Payee list.
	 */
	@RequestMapping(value = "CustPayeeInq", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeInqRs custPayeeInquiry(
			@RequestBody final CustPayeeInqRq custPayeeInqRq) {
		try {
			return ifxCustPayeeInquiry(custPayeeInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPayeeInquiry- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeInqRs ifxCustPayeeInquiry(CustPayeeInqRq custPayeeInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPayeeInquiry method");
	}


	// 7.5.6 Customer Payee Audit

	@RequestMapping(value = "CustPayeeAud", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeAudRs custPayeeAudit(
			@RequestBody final CustPayeeAudRq custPayeeAudRq) {
		try {
			return ifxCustPayeeAudit(custPayeeAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCustPayeeAudit- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeAudRs ifxCustPayeeAudit(CustPayeeAudRq custPayeeAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCustPayeeAudit method");
	}


	// 7.5.7 Customer Payee Synchronization
	/*
	 * The Customer Payee Synchronization message is used by a client for
	 * retrieving a list of changes to a customer’s Payee list. This message may
	 * be used by clients that keep local copies of a customer’s Payee messages
	 * to synchronize their local databases of Payee messages against the
	 * databases of Payee messages kept by Pay providers. Typically results of
	 * this message tells a client what the customer has done using other
	 * clients since they last used this one, but it may also inform a client
	 * about changes the Pay provider made (e.g., converted a Payee from a
	 * Fully-Specified Payee to a Biller).
	 */

	@RequestMapping(value = "CustPayeeSync", method = RequestMethod.POST)
	@ResponseBody
	public CustPayeeSyncRs custPayeeSync(
			@RequestBody final CustPayeeSyncRq custPayeeSyncRq) {
		try {
			return ifxcustPayeeSync(custPayeeSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxcustPayeeSync- this method is not implemented yet");
		}
		return null;
	}

	private CustPayeeSyncRs ifxcustPayeeSync(CustPayeeSyncRq custPayeeSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxcustPayeeSync method");
	}


	// 7.6 Single Payment
	// 7.6.1 Payment Add
	/*
	 * The Payment Add message allows a client to schedule a single payment,
	 * where the amount is input by the customer or from a presented bill. The
	 * Payment Add message may reference an existing payee or add a new one, by
	 * specifying the information within <RemitInfo> <PayeeInfo>. If the Payment
	 * service provider supports <CustPayeeId>, the client must specify an
	 * existing <CustPayeeId> or include the <CustPayeeInfo> aggregate, but not
	 * both. Whether or not the Payment service provider supports <CustPayeeId>,
	 * the <CustPayeeInfo> aggregate may specify an existing standard payee or
	 * create a new fully specified or transfer payee. It is not possible to
	 * modify an existing payee within an Add Payment message. The customer may
	 * modify a payee via <CustPayeeModRq>.
	 */
	@RequestMapping(value = "PmtAdd", method = RequestMethod.POST)
	@ResponseBody
	public PmtAddRs pmtAdd(@RequestBody final PmtAddRq pmtAddRq) {
		try {
			return ifxPmtAdd(pmtAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAdd- this method is not implemented yet");
		}
		return null;
	}

	private PmtAddRs ifxPmtAdd(PmtAddRq pmtAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAdd method");
	}


	// 7.6.2 Payment Modify
	/*
	 * The Payment Modify message allows a client to modify the current
	 * information about a Payment that was set up using the Payment Add message
	 * or a Payment that was generated from a Recurring Payment Model. For
	 * information on Conventions for Modification of Server-Based Data, see
	 * Chapter 2. The Payment Modify message may neither add a new payee nor
	 * modify the definition of an existing payee. The client may change the
	 * previously defined payee, to whom the payment is intended, by using
	 * either the <CustPayeeId>, if the Payment service provider supports its
	 * use, or the <StdPayeeId> within <CustPayeeInfo> within <PmtInfo>.
	 */
	@RequestMapping(value = "PmtMod", method = RequestMethod.POST)
	@ResponseBody
	public PmtModRs pmtMod(@RequestBody final PmtModRq pmtModRq) {
		try {
			return ifxPmtMod(pmtModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtMod- this method is not implemented yet");
		}
		return null;
	}

	private PmtModRs ifxPmtMod(PmtModRq pmtModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtMod method");
	}


	// 7.6.3 Payment Status Modify
	/*
	 * A user with special authorisation, typically a CSR, may send a request to
	 * the SP Server to modify the payment status of a specific payment
	 * instance. Customers may also send a request to the SP Server to modify
	 * the payment status in order to undo a Skip applied to one or more
	 * payments. The only fields that may be changed are within the payment
	 * status aggregate <PmtStatus>.
	 */
	@RequestMapping(value = "PmtStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public PmtStatusModRs pmtStatusMod(
			@RequestBody final PmtStatusModRq pmtStatusModRq) {
		try {
			return ifxPmtStatusMod(pmtStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtStatusMod- this method is not implemented yet");
		}
		return null;
	}

	private PmtStatusModRs ifxPmtStatusMod(PmtStatusModRq pmtStatusModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtStatusMod method");
	}


	// 7.6.4 Payment Status Advise
	/*
	 * PmtStatusAdvise message is used to advise an entity of a change in
	 * Payment Status. For every status change in the life cycle of a payment, a
	 * PmtStatusAdvise messages may be sent.
	 */
	@RequestMapping(value = "PmtStatusAdvise", method = RequestMethod.POST)
	@ResponseBody
	public PmtStatusAdviseRs pmtStatusAdvise(
			@RequestBody final PmtStatusAdviseRq pmtStatusAdviseRq) {
		try {
			return ifxPmtStatusAdvise(pmtStatusAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtStatusAdvise- this method is not implemented yet");
		}
		return null;
	}

	private PmtStatusAdviseRs ifxPmtStatusAdvise(
			PmtStatusAdviseRq pmtStatusAdviseRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtStatusAdvise method");
	}


	// 7.6.5 Payment Cancel
	/*
	 * The Cancel Payment message allows a client to cancel a Payment that was
	 * set up using the Payment Add message or generated from a Recurring
	 * Payment Model.
	 */
	@RequestMapping(value = "PmtCan", method = RequestMethod.POST)
	@ResponseBody
	public PmtCanRs pmtCancel(@RequestBody final PmtCanRq pmtCanRq) {
		try {
			return ifxPmtCancel(pmtCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtCancel- this method is not implemented yet");
		}
		return null;
	}

	private PmtCanRs ifxPmtCancel(PmtCanRq pmtCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtCancel method");
	}


	// 7.6.6 Payment Inquiry
	/*
	 * The Payment Inquiry message allows a client to get a list of the
	 * customer’s pending, completed, or failed payments on the CPP’s server.
	 * The client may select on a number of criteria. Clients that keep local
	 * copies of a customer’s payments may use this message to “refresh” their
	 * payment list. This message must not return a customer’s recurring payment
	 * models but must return any pending, completed, or failed payments that
	 * were generated from recurring payment models. The <FIDebitTrcNum> and
	 * <FICreditTrcNum> elements exist to support the case where the CPP submits
	 * a payment request to the FI (or CSP) that actually sends the payment
	 * messages. For example, a CPP may send a file of ACH-style messages that
	 * the FI forwards as actual ACH messages. The FI/CSP may edit the file;
	 * e.g., process their in-house messages and forward the rest. As part of
	 * this process the FI/CSP may assign reference numbers that correlate the
	 * messages to their system of record. There are both credit and debit
	 * fields to handle cases like “US on US” where two messages are spawned by
	 * the same payment request. Note that the debit and credit trace numbers
	 * are received offline but are added to support message histories. Also
	 * note that in this scenario all 4 message IDs are used: <SPRefId> is the
	 * Pay engine (CPP) reference to the payment and <CSPRefId> is the FI/CSP
	 * reference to the payment. One or both were probably returned to the
	 * client as confirmation number(s) when the payment was added or modified.
	 * <FIDebitTrcNum> and <FICreditTrcNum> are references to the messages that
	 * actually move funds to and from accounts.
	 */
	@RequestMapping(value = "PmtInq", method = RequestMethod.POST)
	@ResponseBody
	public PmtInqRs pmtInquiry(@RequestBody final PmtInqRq pmtInqRq) {
		try {
			return ifxPmtInquiry(pmtInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtInquiry- this method is not implemented yet");
		}
		return null;
	}

	private PmtInqRs ifxPmtInquiry(PmtInqRq pmtInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtInquiry method");
	}


	// 7.6.7 Payment Reversal

	@RequestMapping(value = "PmtRev", method = RequestMethod.POST)
	@ResponseBody
	public PmtRevRs pmtReversal(@RequestBody final PmtRevRq pmtRevRq) {
		try {
			return ifxPmtReversal(pmtRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtReversal- this method is not implemented yet");
		}
		return null;
	}

	private PmtRevRs ifxPmtReversal(PmtRevRq pmtRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtReversal method");
	}


	// 7.6.8 Payment Status Inquiry

	@RequestMapping(value = "PmtStatusInq", method = RequestMethod.POST)
	@ResponseBody
	public PmtStatusInqRs pmtStatusInquiry(
			@RequestBody final PmtStatusInqRq pmtStatusInqRq) {
		try {
			return ifxPmtStatusInquiry(pmtStatusInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtStatusInquiry- this method is not implemented yet");
		}
		return null;
	}

	private PmtStatusInqRs ifxPmtStatusInquiry(PmtStatusInqRq pmtStatusInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtStatusInquiry method");
	}


	// 7.6.9 Payment Audit

	@RequestMapping(value = "PmtAud", method = RequestMethod.POST)
	@ResponseBody
	public PmtAudRs pmtAudit(@RequestBody final PmtAudRq pmtAudRq) {
		try {
			return ifxPmtAudit(pmtAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAudit- this method is not implemented yet");
		}
		return null;
	}

	private PmtAudRs ifxPmtAudit(PmtAudRq pmtAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAudit method");
	}

	// 7.6.10 Payment Synchronization
	/*
	 * A client uses the Payment Sync message to retrieve a list of changes that
	 * have occurred to a customer’s payments. This message may be used to
	 * enable a client that keeps local copies of a customer’s payment messages
	 * to synchronize its local database with the Pay provider. The results of
	 * this message tell a client what the customer has done using other clients
	 * since they last used this one. It may also inform a client about changes
	 * the Pay provider made (i.e., generated another payment instance for a
	 * recurring payment model, completed a payment or rejected a payment). Some
	 * examples of changes the Pay provider would communicate to a customer
	 * include: • New pending payment generated from a Recurring Payment
	 * Model—returned with a <PmtAddRs>; • Successful payment
	 * processing—returned with <PmtModRs> with new <PmtStatus> indicating
	 * success; • Unsuccessful payment processing—returned with <PmtModRs> with
	 * new <PmtStatus> indicating status and reason for failure, if available; •
	 * Payment assigned a check number—returned with <PmtModRs> with new
	 * <PmtStatus> including <ChkNum>; and • Payment check cleared—returned with
	 * <PmtModRs> with new <PmtStatus> indicating status.
	 */

	@RequestMapping(value = "PmtSync", method = RequestMethod.POST)
	@ResponseBody
	public PmtSyncRs pmtSync(@RequestBody final PmtSyncRq pmtSyncRq) {
		try {
			return ifxPmtSync(pmtSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtSync- this method is not implemented yet");
		}
		return null;
	}

	private PmtSyncRs ifxPmtSync(PmtSyncRq pmtSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtSync method");
	}

	// 7.7 Payment Authorization
	// 7.7.1 Payment Authorization Add

	@RequestMapping(value = "PmtAuthAdd", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthAddRs pmtAuthAdd(@RequestBody final PmtAuthAddRq pmtAuthAddRq) {
		try {
			return ifxPmtAuthAdd(pmtAuthAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthAdd- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthAddRs ifxPmtAuthAdd(PmtAuthAddRq pmtAuthAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthAdd method");
	}

	// 7.7.2 Payment Authorization Modify

	@RequestMapping(value = "PmtAuthMod", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthModRs pmtAuthMod(@RequestBody final PmtAuthModRq pmtAuthModRq) {
		try {
			return ifxPmtAuthMod(pmtAuthModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthMod- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthModRs ifxPmtAuthMod(PmtAuthModRq pmtAuthModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthMod method");
	}


	// 7.7.3 Payment Authorization Cancel

	@RequestMapping(value = "PmtAuthCan", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthCanRs pmtAuthCancel(
			@RequestBody final PmtAuthCanRq pmtAuthCanRq) {
		try {
			return ifxPmtAuthCancel(pmtAuthCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthCancel- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthCanRs ifxPmtAuthCancel(PmtAuthCanRq pmtAuthCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthCancel method");
	}


	// 7.7.4 Payment Authorization Inquiry

	@RequestMapping(value = "PmtAuthInq", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthInqRs pmtAuthInquiry(
			@RequestBody final PmtAuthInqRq pmtAuthInqRq) {
		try {
			return ifxPmtAuthInquiry(pmtAuthInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthInquiry- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthInqRs ifxPmtAuthInquiry(PmtAuthInqRq pmtAuthInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthInquiry method");
	}

	// 7.7.5 Payment Authorization Audit

	@RequestMapping(value = "PmtAuthAud", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthAudRs pmtAuthAudit(
			@RequestBody final PmtAuthAudRq pmtAuthAudRq) {
		try {
			return ifxPmtAuthAudit(pmtAuthAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthAudit- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthAudRs ifxPmtAuthAudit(PmtAuthAudRq pmtAuthAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthAudit method");
	}

	// 7.7.6 Payment Authorization Synchronization

	@RequestMapping(value = "PmtAuthSync", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthSyncRs pmtAuthSync(
			@RequestBody final PmtAuthSyncRq pmtAuthSyncRq) {
		try {
			return ifxPmtAuthSync(pmtAuthSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthSync- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthSyncRs ifxPmtAuthSync(PmtAuthSyncRq pmtAuthSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthSync method");
	}

	// 7.7.7 Payment Authorization Reversal

	@RequestMapping(value = "PmtAuthRev", method = RequestMethod.POST)
	@ResponseBody
	public PmtAuthRevRs pmtAuthReversal(
			@RequestBody final PmtAuthRevRq pmtAuthRevRq) {
		try {
			return ifxPmtAuthReversal(pmtAuthRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAuthReversal- this method is not implemented yet");
		}
		return null;
	}

	private PmtAuthRevRs ifxPmtAuthReversal(PmtAuthRevRq pmtAuthRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAuthReversal method");
	}

	// 7.8 Remittance
	// 7.8.1 Remittance Add
	/*
	 * The Remittance Add message allows a client to transmit a remittance
	 * advice to a BPP or BSP for posting.
	 */
	@RequestMapping(value = "RemitAdd", method = RequestMethod.POST)
	@ResponseBody
	public RemitAddRs remitAdd(@RequestBody final RemitAddRq remitAddRq) {
		try {
			return ifxRemitAdd(remitAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitAdd- this method is not implemented yet");
		}
		return null;
	}

	private RemitAddRs ifxRemitAdd(RemitAddRq remitAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitAdd method");
	}

	// 7.8.2 Remittance Modify
	/*
	 * The Remittance Modify message allows a client to modify the current
	 * information about a Remittance that was set up using the Remittance Add
	 * message.
	 */
	@RequestMapping(value = "RemitMod", method = RequestMethod.POST)
	@ResponseBody
	public RemitModRs remitModify(@RequestBody final RemitModRq remitModRq) {
		try {
			return ifxRemitModify(remitModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitModify- this method is not implemented yet");
		}
		return null;
	}

	private RemitModRs ifxRemitModify(RemitModRq remitModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitModify method");
	}

	// 7.8.3 Remittance Status Modify

	@RequestMapping(value = "RemitStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public RemitStatusModRs remitStatusMod(
			@RequestBody final RemitStatusModRq remitStatusModRq) {
		try {
			return ifxRemitStatusMod(remitStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitStatusMod- this method is not implemented yet");
		}
		return null;
	}

	private RemitStatusModRs ifxRemitStatusMod(RemitStatusModRq remitStatusModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitStatusMod method");
	}

	// 7.8.4 Remittance Delete
	/*
	 * The Delete Remittance message allows a client to delete a Remittance that
	 * was set up using the Remittance Add message.
	 */
	@RequestMapping(value = "RemitDel", method = RequestMethod.POST)
	@ResponseBody
	public RemitDelRs remitDelete(@RequestBody final RemitDelRq remitDelRq) {
		try {
			return ifxRemitDelete(remitDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitDelete- this method is not implemented yet");
		}
		return null;
	}

	private RemitDelRs ifxRemitDelete(RemitDelRq remitDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitDelete method");
	}

	// 7.8.5 Remittance Inquiry

	@RequestMapping(value = "RemitInq", method = RequestMethod.POST)
	@ResponseBody
	public RemitInqRs remitInquiry(@RequestBody final RemitInqRq remitInqRq) {
		try {
			return ifxRemitInquiry(remitInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitInquiry- this method is not implemented yet");
		}
		return null;
	}

	private RemitInqRs ifxRemitInquiry(RemitInqRq remitInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitInquiry method");
	}

	// 7.8.6 Remittance Audit
	/*
	 * Remittance Audit allows a client to audit Remittance Add/Modify/Delete
	 * messages associated with the current customer. When the <RemitStatus>
	 * changes, the server must generate an Rs message to the Rq that created
	 * the pending state. The <Status> <Severity> must always be Info.
	 */

	@RequestMapping(value = "RemitAud", method = RequestMethod.POST)
	@ResponseBody
	public RemitAudRs remitAudit(@RequestBody final RemitAudRq remitAudRq) {
		try {
			return ifxRemitAudit(remitAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitAudit- this method is not implemented yet");
		}
		return null;
	}

	private RemitAudRs ifxRemitAudit(RemitAudRq remitAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitAudit method");
	}

	// 7.8.7 Remittance Synchronization
	/*
	 * A client uses the Remittance Synchronization message to retrieve a list
	 * of changes that have occurred to a client’s remittance. This message will
	 * commonly be used to enable a client to synchronize with the server to get
	 * up-to-date status information about a remittance. The results of this
	 * message typically will status change of a remittance advice.
	 */
	@RequestMapping(value = "RemitSync", method = RequestMethod.POST)
	@ResponseBody
	public RemitSyncRs remitSync(@RequestBody final RemitSyncRq remitSyncRq) {
		try {
			return ifxRemitSync(remitSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitSync- this method is not implemented yet");
		}
		return null;
	}

	private RemitSyncRs ifxRemitSync(RemitSyncRq remitSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitSync method");
	}

	// 7.8.8 Remittance Reversal

	@RequestMapping(value = "RemitRev", method = RequestMethod.POST)
	@ResponseBody
	public RemitRevRs remitReversal(@RequestBody final RemitRevRq remitRevRq) {
		try {
			return ifxRemitReversal(remitRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRemitReversal- this method is not implemented yet");
		}
		return null;
	}

	private RemitRevRs ifxRemitReversal(RemitRevRq remitRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRemitReversal method");
	}

	// 7.9 Recurring Payment Model
	// 7.9.1 Recurring Payment Model Add
	/*
	 * The Recurring Payment Model Add message allows a client to set up a
	 * recurring or repeating payment where the payment amount is the same.
	 * Examples of these types of payments are mortgages, car loans, equity
	 * loans, etc. The initial and/or final payment amount may be different from
	 * the normal recurring payment amount if supported by the Pay provider.
	 */
	@RequestMapping(value = "RecPmtAdd", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtAddRs recPmtAdd(@RequestBody final RecPmtAddRq recPmtAddRq) {
		try {
			return ifxRecPmtAdd(recPmtAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtAdd- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtAddRs ifxRecPmtAdd(RecPmtAddRq recPmtAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtAdd method");
	}

	// 7.9.2 Recurring Payment Instance Add
	/*
	 * The Recurring Payment Instance Add message allows a client to manually
	 * trigger the spawning of a payment instance from a Recurring Payment Model
	 * that has its frequency value defined as “Manually”. This message is
	 * particularly useful when payments to a specific payee need to occur on an
	 * irregular frequency basis or perhaps when a client desires direct control
	 * of the spawning to manually override certain elements of each payment
	 * instance. Values provided within <DueDt>, <CurAmt>, <RemitInstruction>,
	 * <RemitDetail>, and <PmtLegalRpt> override the values already specified
	 * within the recurring payment model specified by <RecPmtId>.
	 */
	@RequestMapping(value = "RecPmtInstAdd", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtInstAddRs recPmtInstAdd(
			@RequestBody final RecPmtInstAddRq recPmtInstAddRq) {
		try {
			return ifxRecPmtInstAdd(recPmtInstAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtInstAdd- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtInstAddRs ifxRecPmtInstAdd(RecPmtInstAddRq recPmtInstAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtInstAdd method");
	}

	// 7.9.3 Recurring Payment Model Modify
	/*
	 * The Modify Recurring Payment Model message allows a client to modify the
	 * current definition of a recurring or repeating payment. Whether a
	 * modification to the model affects any current pending payment instance(s)
	 * from the model depends on profile settings and the message contents.
	 */
	@RequestMapping(value = "RecPmtMod", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtModRs recPmtMod(@RequestBody final RecPmtModRq recPmtModRq) {
		try {
			return ifxRecPmtMod(recPmtModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtMod- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtModRs ifxRecPmtMod(RecPmtModRq recPmtModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtMod method");
	}

	// 7.9.4 Recurring Payment Model Cancel
	/*
	 * The Recurring Payment Model Cancel message allows a client to cancel a
	 * customer’s Recurring Payment Model. Cancellation of a Recurring Payment
	 * Model always also cancels any pending Payments that were generated from
	 * that model.
	 */
	@RequestMapping(value = "RecPmtCan", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtCanRs recPmtCancel(@RequestBody final RecPmtCanRq recPmtCanRq) {
		try {
			return ifxRecPmtCancel(recPmtCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtCancel- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtCanRs ifxRecPmtCancel(RecPmtCanRq recPmtCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtCancel method");
	}

	// 7.9.5 Recurring Payment Model Inquiry
	/*
	 * The Recurring Payment Inquiry message allows a client to get a list of
	 * the current Recurring Payment Models. Clients that keep local copies of a
	 * customer’s Recurring Payment Models may use this message to “refresh”
	 * their copies of the customer’s Recurring Payment Models.
	 */
	@RequestMapping(value = "RecPmtInq", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtInqRs recPmtInquiry(@RequestBody final RecPmtInqRq recPmtInqRq) {
		try {
			return ifxRecPmtInquiry(recPmtInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtInquiry- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtInqRs ifxRecPmtInquiry(RecPmtInqRq recPmtInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtInquiry method");
	}

	// 7.9.6 Recurring Payment Model Audit

	@RequestMapping(value = "RecPmtAud", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtAudRs recPmtAudit(@RequestBody final RecPmtAudRq recPmtAudRq) {
		try {
			return ifxRecPmtAudit(recPmtAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtAudit- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtAudRs ifxRecPmtAudit(RecPmtAudRq recPmtAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtAudit method");
	}

	// 7.9.7 Recurring Payment Model Sync
	/*
	 * The Recurring Payment Model Sync message allows clients to retrieve a
	 * list of changes that have occurred to a customer’s Recurring Payment
	 * Models. This message may be used to enable a client that keeps local
	 * copies of a customer’s Recurring Payment messages to synchronize its
	 * database against the one kept by the Pay provider. The results of this
	 * message tell a client what the customer has done using other clients
	 * since they last used this one.
	 */
	@RequestMapping(value = "RecPmtSync", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtSyncRs recPmtSync(@RequestBody final RecPmtSyncRq recPmtSyncRq) {
		try {
			return ifxRecPmtSync(recPmtSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtSync- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtSyncRs ifxRecPmtSync(RecPmtSyncRq recPmtSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtSync method");
	}

	// 7.9.8 Recurring Payment Model Reversal

	@RequestMapping(value = "RecPmtRev", method = RequestMethod.POST)
	@ResponseBody
	public RecPmtRevRs recPmtReversal(@RequestBody final RecPmtRevRq recPmtRevRq) {
		try {
			return ifxRecPmtReversal(recPmtRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxRecPmtReversal- this method is not implemented yet");
		}
		return null;
	}

	private RecPmtRevRs ifxRecPmtReversal(RecPmtRevRq recPmtRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxRecPmtReversal method");
	}

	// 7.10 Payment Acknowledgement
	// 7.10.1 Payment Acknowledgment Inquiry
	/*
	 * A customer may send a request to the CPP inquiring about the consolidated
	 * summary of a single or group of payments submitted for processing.
	 */
	@RequestMapping(value = "PmtAckInq", method = RequestMethod.POST)
	@ResponseBody
	public PmtAckInqRs pmtAckInquiry(@RequestBody final PmtAckInqRq pmtAckInqRq) {
		try {
			return ifxPmtAckInquiry(pmtAckInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAckInquiry- this method is not implemented yet");
		}
		return null;
	}

	private PmtAckInqRs ifxPmtAckInquiry(PmtAckInqRq pmtAckInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAckInquiry method");
	}

	// 7.10.2 Payment Acknowledgment Reversal

	@RequestMapping(value = "PmtAckRev", method = RequestMethod.POST)
	@ResponseBody
	public PmtAckRevRs pmtAckReversal(@RequestBody final PmtAckRevRq pmtAckRevRq) {
		try {
			return ifxPmtAckReversal(pmtAckRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAckReversal- this method is not implemented yet");
		}
		return null;
	}

	private PmtAckRevRs ifxPmtAckReversal(PmtAckRevRq pmtAckRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAckReversal method");
	}

	// 7.10.3 Payment Acknowledgment Advise
	/*
	 * PmtAckAdvise message is used to acknowledge the receipt and application
	 * processing of a single or group of payments processed within the Pay
	 * Service.
	 */
	@RequestMapping(value = "PmtAckAdvise", method = RequestMethod.POST)
	@ResponseBody
	public PmtAckAdviseRs pmtAckAdvise(
			@RequestBody final PmtAckAdviseRq pmtAckAdviseRq) {
		try {
			return ifxPmtAckAdvise(pmtAckAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtAckAdvise- this method is not implemented yet");
		}
		return null;
	}

	private PmtAckAdviseRs ifxPmtAckAdvise(PmtAckAdviseRq pmtAckAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtAckAdvise method");
	}

	// 7.11 Batch Checksum
	// 7.11.1 Checksum Add
	/*
	 * The Checksum Add message allows a client to provide a chechsum record
	 * against which the server can verify scheduled payments, where the control
	 * data such as sum amount and count are provided to the server. The
	 * Checksum Add message can be sent together with or separate from the
	 * payment messages within a pay service to facilitate both cases where the
	 * control record is sent via the same or different routes due to
	 * authorization and segregation reasons.
	 */
	@RequestMapping(value = "ChksumAdd", method = RequestMethod.POST)
	@ResponseBody
	public ChksumAddRs chksumAdd(@RequestBody final ChksumAddRq chksumAddRq) {
		try {
			return ifxChksumAdd(chksumAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumAdd- this method is not implemented yet");
		}
		return null;
	}

	private ChksumAddRs ifxChksumAdd(ChksumAddRq chksumAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumAdd method");
	}

	// 7.11.2 Checksum Modify

	@RequestMapping(value = "ChksumMod", method = RequestMethod.POST)
	@ResponseBody
	public ChksumModRs chksumMod(@RequestBody final ChksumModRq chksumModRq) {
		try {
			return ifxChksumMod(chksumModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumMod- this method is not implemented yet");
		}
		return null;
	}

	private ChksumModRs ifxChksumMod(ChksumModRq chksumModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumMod method");
	}

	// 7.11.3 Checksum Status Modify

	@RequestMapping(value = "ChksumStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public ChksumStatusModRs chksumStatusMod(
			@RequestBody final ChksumStatusModRq chksumStatusModRq) {
		try {
			return ifxChksumStatusMod(chksumStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumStatusMod- this method is not implemented yet");
		}
		return null;
	}

	private ChksumStatusModRs ifxChksumStatusMod(
			ChksumStatusModRq chksumStatusModRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumStatusMod method");
	}

	// 7.11.4 Checksum Delete

	@RequestMapping(value = "ChksumDel", method = RequestMethod.POST)
	@ResponseBody
	public ChksumDelRs chksumDelete(@RequestBody final ChksumDelRq chksumDelRq) {
		try {
			return ifxChksumDelete(chksumDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumDelete- this method is not implemented yet");
		}
		return null;
	}

	private ChksumDelRs ifxChksumDelete(ChksumDelRq chksumDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumDelete method");
	}

	// 7.11.5 Checksum Inquiry

	@RequestMapping(value = "ChksumInq", method = RequestMethod.POST)
	@ResponseBody
	public ChksumInqRs chksumInquiry(@RequestBody final ChksumInqRq chksumInqRq) {
		try {
			return ifxChksumInquiry(chksumInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumInquiry- this method is not implemented yet");
		}
		return null;
	}

	private ChksumInqRs ifxChksumInquiry(ChksumInqRq chksumInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumInquiry method");
	}

	// 7.11.6 Checksum Audit

	@RequestMapping(value = "ChksumAud", method = RequestMethod.POST)
	@ResponseBody
	public ChksumAudRs chksumAudit(@RequestBody final ChksumAudRq chksumAudRq) {
		try {
			return ifxChksumAudit(chksumAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumAudit- this method is not implemented yet");
		}
		return null;
	}

	private ChksumAudRs ifxChksumAudit(ChksumAudRq chksumAudRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumAudit method");
	}

	// 7.11.7 Checksum Synchronization

	@RequestMapping(value = "ChksumSync", method = RequestMethod.POST)
	@ResponseBody
	public ChksumSyncRs chksumSync(@RequestBody final ChksumSyncRq chksumSyncRq) {
		try {
			return ifxChksumSync(chksumSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumSync- this method is not implemented yet");
		}
		return null;
	}

	private ChksumSyncRs ifxChksumSync(ChksumSyncRq chksumSyncRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumSync method");
	}

	// 7.11.8 Checksum Advise
	/*
	 * ChksumAdvise message is used to advise an entity of the processing status
	 * of a batch of transactions. This message would subsequently be sent in
	 * response to the ChksumAdd message set.
	 */

	@RequestMapping(value = "ChksumAdvise", method = RequestMethod.POST)
	@ResponseBody
	public ChksumAdviseRs chksumAdvise(
			@RequestBody final ChksumAdviseRq chksumAdviseRq) {
		try {
			return ifxChksumAdvise(chksumAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxChksumAdvise- this method is not implemented yet");
		}
		return null;
	}

	private ChksumAdviseRs ifxChksumAdvise(ChksumAdviseRq chksumAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxChksumAdvise method");
	}

	// 7.12 Comprehensible Remittance
	// 7.12.1 Comprehensible Remittance Statement Add
	/*
	 * The Comprehensible Remittance Statement Add message allows a financial
	 * institution to transmit lockbox remittance information along with
	 * electronic payment remittance information (ACH, low value, wires, or high
	 * value) to a client for posting.
	 */

	@RequestMapping(value = "CompRemitStmtAdd", method = RequestMethod.POST)
	@ResponseBody
	public CompRemitStmtAddRs compRemitStmtAdd(
			@RequestBody final CompRemitStmtAddRq compRemitStmtAddRq) {
		try {
			return ifxCompRemitStmtAdd(compRemitStmtAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCompRemitStmtAdd- this method is not implemented yet");
		}
		return null;
	}

	private CompRemitStmtAddRs ifxCompRemitStmtAdd(
			CompRemitStmtAddRq compRemitStmtAddRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCompRemitStmtAdd method");
	}

	// 7.12.2 Comprehensible Remittance Statement Inquiry
	/*
	 * The Comprehensible Remittance Statement Inquiry message allows a customer
	 * to inquiry about remittance information on a specific lockbox or deposit
	 * account.
	 */

	@RequestMapping(value = "CompRemitStmtInq", method = RequestMethod.POST)
	@ResponseBody
	public CompRemitStmtInqRs compRemitStmtInq(
			@RequestBody final CompRemitStmtInqRq compRemitStmtInqRq) {
		try {
			return ifxCompRemitStmtInq(compRemitStmtInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCompRemitStmtInq- this method is not implemented yet");
		}
		return null;
	}

	private CompRemitStmtInqRs ifxCompRemitStmtInq(
			CompRemitStmtInqRq compRemitStmtInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCompRemitStmtInq method");
	}

	// 7.12.3 Comprehensible Remittance Statement Audit
	/*
	 * A customer originates a Comprehensible Remittance Statement audit request
	 * to obtain all changes related to a particular comprehensible remittance
	 * addition by the FI.
	 */

	@RequestMapping(value = "CompRemitStmtAud", method = RequestMethod.POST)
	@ResponseBody
	public CompRemitStmtAudRs compRemitStmtAudit(
			@RequestBody final CompRemitStmtAudRq compRemitStmtAudRq) {
		try {
			return ifxCompRemitStmtAudit(compRemitStmtAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCompRemitStmtAudit- this method is not implemented yet");
		}
		return null;
	}

	private CompRemitStmtAudRs ifxCompRemitStmtAudit(
			CompRemitStmtAudRq compRemitStmtAudRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCompRemitStmtAudit method");
	}

	// 7.12.4 Comprehensible Remittance Statement Synchronization

	@RequestMapping(value = "CompRemitStmtSync", method = RequestMethod.POST)
	@ResponseBody
	public CompRemitStmtSyncRs CompRemitStmtSync(
			@RequestBody final CompRemitStmtSyncRq compRemitStmtSyncRq) {
		try {
			return ifxCompRemitStmtSync(compRemitStmtSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxCompRemitStmtSync- this method is not implemented yet");
		}
		return null;
	}

	private CompRemitStmtSyncRs ifxCompRemitStmtSync(
			CompRemitStmtSyncRq compRemitStmtSyncRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxCompRemitStmtSync method");
	}

	// 7.14 Payment Batch
	// 7.14.1 PmtBatch Add
	/*
	 * The Payment Batch Add request message allows a client to transmit a batch
	 * of ISO 20022 defined payments along with remittance information. The
	 * payment batch will typically include one of more individual payments that
	 * are requests to move funds from a debtor to a creditor. Payment Batch Add
	 * messages are sent from an initiating party or forwarding institution to
	 * another forwarding institution, a settlement organization, or final
	 * agent. The element content and definition is contained within the schema
	 * and handbook located at ISO 20022 website. The IFX defined remittance
	 * detail can reside as an optional complex type within the payment
	 * transaction.
	 */
	@RequestMapping(value = "PmtBatchAdd", method = RequestMethod.POST)
	@ResponseBody
	public PmtBatchAddRs pmtBatchAdd(
			@RequestBody final PmtBatchAddRq pmtBatchAddRq) {
		try {
			return ifxPmtBatchAdd(pmtBatchAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtBatchAdd- this method is not implemented yet");
		}
		return null;
	}

	private PmtBatchAddRs ifxPmtBatchAdd(PmtBatchAddRq pmtBatchAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtBatchAdd method");
	}

	// 7.14.2 PmtBatch Cancel
	/*
	 * Provide description of the functionality of this message (request and
	 * response). The Payment Batch Cancel message allows for the initiating
	 * organization to cancel an entire batch of payments with one message. It
	 * will contain a reference to the original PmtBatchAddRq previously
	 * submitted.
	 */
	@RequestMapping(value = "PmtBatchCan", method = RequestMethod.POST)
	@ResponseBody
	public PmtBatchCanRs pmtBatchCancel(
			@RequestBody final PmtBatchCanRq pmtBatchCanRq) {
		try {
			return ifxPmtBatchCancel(pmtBatchCanRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtBatchCancel- this method is not implemented yet");
		}
		return null;
	}

	private PmtBatchCanRs ifxPmtBatchCancel(PmtBatchCanRq pmtBatchCanRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtBatchCancel method");
	}

	// 7.14.3 PmtBatch Status Inquiry
	/*
	 * Provide description of the functionality of this message (request and
	 * response). The Payment Batch Status message can request status to be
	 * reported on at the Group level only or for each individual payment within
	 * the Group(s). Selection of either <PmtBatchStatusCode> or <PmtStatusCode>
	 * will determine the level of status information that would be contained in
	 * the response message.
	 */
	@RequestMapping(value = "PmtBatchStatusInq", method = RequestMethod.POST)
	@ResponseBody
	public PmtBatchStatusInqRs pmtBatchStatusInq(
			@RequestBody final PmtBatchStatusInqRq pmtBatchStatusInqRq) {
		try {
			return ifxPmtBatchStatusInq(pmtBatchStatusInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtBatchStatusInq- this method is not implemented yet");
		}
		return null;
	}

	private PmtBatchStatusInqRs ifxPmtBatchStatusInq(
			PmtBatchStatusInqRq pmtBatchStatusInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtBatchStatusInq method");
	}

	// 7.14.4 PmtBatch Status Advise
	/*
	 * Provide description of the functionality of this message (request and
	 * response). The Payment Batch Status Advise message allows for the service
	 * provider to push status information to the originator of the Payment
	 * Batch Add Request without any action necessary by the originator. Only a
	 * server response is necessary to confirm receipt of the advice message.
	 */
	@RequestMapping(value = "PmtBatchStatusAdvise", method = RequestMethod.POST)
	@ResponseBody
	public PmtBatchStatusAdviseRs pmtBatchStatusAdvise(
			@RequestBody final PmtBatchStatusAdviseRq pmtBatchStatusAdviseRq) {
		try {
			return ifxPmtBatchStatusAdvise(pmtBatchStatusAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxPmtBatchStatusAdvise- this method is not implemented yet");
		}
		return null;
	}

	private PmtBatchStatusAdviseRs ifxPmtBatchStatusAdvise(
			PmtBatchStatusAdviseRq pmtBatchStatusAdviseRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxPmtBatchStatusAdvise method");
	}

	// 8.4 Presentment Service Message Detail
	// 8.4.1 Biller Inquiry
	/*
	 * The Biller Inquiry message enables a client to retrieve a list of all
	 * Billers known to the BSP that meets certain selection criteria. Note that
	 * the Biller directory timestamp <UpDt> selection criterion allows the CSP
	 * to request all directory entries that have been added or changed since a
	 * point in time.
	 */
	@RequestMapping(value = "BillerInq", method = RequestMethod.POST)
	@ResponseBody
	public BillerInqRs billerInq(@RequestBody final BillerInqRq billerInqRq) {
		try {
			return ifxBillerInq(billerInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBillerInq- this method is not implemented yet");
		}
		return null;
	}

	private BillerInqRs ifxBillerInq(BillerInqRq billerInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBillerInq method");
	}

	// 8.4.2 Biller Inquiry Reversal

	@RequestMapping(value = "BillerRev", method = RequestMethod.POST)
	@ResponseBody
	public BillerRevRs billerReversal(@RequestBody final BillerRevRq billerRevRq) {
		try {
			return ifxBillerReversal(billerRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBillerReversal- this method is not implemented yet");
		}
		return null;
	}

	private BillerRevRs ifxBillerReversal(BillerRevRq billerRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBillerReversal method");
	}

	// 8.4.3 Bill Inquiry
	/*
	 * <BillInqRq> retrieves bills or counts of bills from the BSP. The BSP
	 * returns a <BillInqRs> that contains a list of zero or more bills, or
	 * counts of bills that match specific selection criteria. The client
	 * requests bills from a BSP by using one or more selection criteria,
	 * including bill creation date range. To specify the date range, clients
	 * use <StartDt> and <EndDt>, which the server compares to <BillDt> within
	 * the <BillRec> aggregate. The BSP returns information sufficient to
	 * identify the biller and provide the amount due, due date, and remittance
	 * information so that a payment may be made to the biller. The BSP does not
	 * provide a viewable form of the bill but may return a URL to an HTML
	 * rendering of the bill.
	 */
	@RequestMapping(value = "BillInq", method = RequestMethod.POST)
	@ResponseBody
	public BillInqRs billInq(@RequestBody final BillInqRq billInqRq) {
		try {
			return ifxBillInq(billInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBillInq- this method is not implemented yet");
		}
		return null;
	}

	private BillInqRs ifxBillInq(BillInqRq billInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBillInq method");
	}

	// 8.4.4 Bill Reversal

	@RequestMapping(value = "BillRev", method = RequestMethod.POST)
	@ResponseBody
	public BillRevRs billReversal(@RequestBody final BillRevRq billRevRq) {
		try {
			return ifxBillReversal(billRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBillReversal- this method is not implemented yet");
		}
		return null;
	}

	private BillRevRs ifxBillReversal(BillRevRq billRevRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBillReversal method");
	}

	// 8.4.5 Bill Status Modify
	/*
	 * The BSP may request the client to send notifications of various state
	 * changes for the bill of the associated payment by setting <NotifyReqd> =
	 * True in the <BillRec> aggregate (see Section 15.3.2), if the client has
	 * indicated that it is capable of sending notifications; i.e.,
	 * <NotifyWilling> = True within <BillInqRq>. The following table indicates
	 * which entity(s) sets each bill and bill payment status. New BSP/Biller
	 * (initially) Delivered BSP/Biller Viewed Customer or CSP by inference
	 * Retired Customer Withdrawn BSP/Biller Undeliverable CSP
	 * <BillPmtStatusCode> (Status of a bill payment) None BSP/Biller AutoPay
	 * BSP/Biller Scheduled CSP/CPP Processed CSP/CPP Posted BSP/Biller
	 * PaidOutOfBand Customer or CSP/CPP Cancelled Customer or CSP/CPP Unpayable
	 * CSP/CPP
	 * 
	 * Setting <BillStatusCode>=Viewed tells the BSP that the CSP has presented
	 * the specified bills to the customer. This is a stronger statement than
	 * acknowledging that the client has received the bills
	 * <BillStatusCode>=Delivered, specifically when the client software
	 * implements the pre-fetching (i.e. pull) model. However, IFX does not
	 * define the meaning of “presenting to the customer.” In particular,
	 * receipt of a <BillStatusCode>=Viewed by the BSP is not intended to have
	 * any legal significance. The specification also does not define the
	 * maximum elapsed time between the presentation of the bill and sending a
	 * notification.
	 */
	@RequestMapping(value = "BillStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public BillStatusModRs billStatusMod(
			@RequestBody final BillStatusModRq billStatusModRq) {
		try {
			return ifxBillStatusMod(billStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxBillStatusMod- this method is not implemented yet");
		}
		return null;
	}

	private BillStatusModRs ifxBillStatusMod(BillStatusModRq billStatusModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxBillStatusMod method");
	}

	// 9.4 Media Account Adjust
	// 9.4.1 Media Account Adjust Add
	/*
	 * A client uses the Media Account Adjust Add message to inform the server
	 * of a media account adjustment, due to either a dispense, deposit, or a
	 * replenishment action.
	 */
	@RequestMapping(value = "MediaAcctAdjAdd", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctAdjAddRs mediaAcctAdjAdd(
			@RequestBody final MediaAcctAdjAddRq mediaAcctAdjAddRq) {
		try {
			return ifxMediaAcctAdjAdd(mediaAcctAdjAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctAdjAdd- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctAdjAddRs ifxMediaAcctAdjAdd(
			MediaAcctAdjAddRq mediaAcctAdjAddRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctAdjAdd method");
	}

	// 9.4.2 Media Account Adjust Inquiry
	/*
	 * A client can use the Media Account Adjust Inquiry message to get a list
	 * of transactions that have occurred on Media Accounts.
	 */
	@RequestMapping(value = "MediaAcctAdjInq", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctAdjInqRs mediaAcctAdjInq(
			@RequestBody final MediaAcctAdjInqRq mediaAcctAdjInqRq) {
		try {
			return ifxMediaAcctAdjInq(mediaAcctAdjInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctAdjInq- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctAdjInqRs ifxMediaAcctAdjInq(
			MediaAcctAdjInqRq mediaAcctAdjInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctAdjInq method");
	}

	// 9.4.3 Media Account Adjust Audit
	/*
	 * A client can use the Media Account Adjust Audit message to audit Media
	 * Account Adjust Add messages. When the Media Account object changes, the
	 * server must generate an Rs message corresponding to the Rq that created
	 * the pending state.
	 */
	@RequestMapping(value = "MediaAcctAdjAud", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctAdjAudRs mediaAcctAdjAudit(
			@RequestBody final MediaAcctAdjAudRq mediaAcctAdjAudRq) {
		try {
			return ifxMediaAcctAdjAudit(mediaAcctAdjAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctAdjAudit- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctAdjAudRs ifxMediaAcctAdjAudit(
			MediaAcctAdjAudRq mediaAcctAdjAudRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctAdjAudit method");
	}

	// 9.4.4 Media Account Adjust Synchronization
	/*
	 * A client can use the Media Account Adjust Synchronization message to
	 * synchronize on Media Account Adjust Add messages. When the Media Account
	 * object changes, the server must generate a response message to the
	 * request that created the pending state.
	 */
	@RequestMapping(value = "MediaAcctAdjSync", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctAdjSyncRs mediaAcctAdjSync(
			@RequestBody final MediaAcctAdjSyncRq mediaAcctAdjSyncRq) {
		try {
			return ifxMediaAcctAdjSync(mediaAcctAdjSyncRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctAdjSync- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctAdjSyncRs ifxMediaAcctAdjSync(
			MediaAcctAdjSyncRq mediaAcctAdjSyncRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctAdjSync method");
	}

	// 9.4.5 Media Account Adjust Reversal

	@RequestMapping(value = "MediaAcctAdjRev", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctAdjRevRs mediaAcctAdjReversal(
			@RequestBody final MediaAcctAdjRevRq mediaAcctAdjRevRq) {
		try {
			return ifxMediaAcctAdjReversal(mediaAcctAdjRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctAdjReversal- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctAdjRevRs ifxMediaAcctAdjReversal(
			MediaAcctAdjRevRq mediaAcctAdjRevRq) throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctAdjReversal method");
	}

	// 9.5 Media Account Inventory
	// 9.5.1 Media Account Inventory Inquiry
	/*
	 * A client may use the Media Account Inventory Inquiry message to retrieve
	 * the inventory balance of a media account.
	 */
	@RequestMapping(value = "MediaAcctInventoryInq", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctInventoryInqRs mediaAcctInventoryInq(
			@RequestBody final MediaAcctInventoryInqRq mediaAcctInventoryInqRq) {
		try {
			return ifxMediaAcctInventoryInq(mediaAcctInventoryInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctInventoryInq- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctInventoryInqRs ifxMediaAcctInventoryInq(
			MediaAcctInventoryInqRq mediaAcctInventoryInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctInventoryInq method");
	}

	// 9.5.2 Media Account Inventory Reversal

	@RequestMapping(value = "MediaAcctInventoryRev", method = RequestMethod.POST)
	@ResponseBody
	public MediaAcctInventoryRevRs mediaAcctInventoryRev(
			@RequestBody final MediaAcctInventoryRevRq mediaAcctInventoryRevRq) {
		try {
			return ifxMediaAcctInventoryReversal(mediaAcctInventoryRevRq);
		} catch (NotImplementedException e) {
			logger.error("ifxMediaAcctInventoryReversal- this method is not implemented yet");
		}
		return null;
	}

	private MediaAcctInventoryRevRs ifxMediaAcctInventoryReversal(
			MediaAcctInventoryRevRq mediaAcctInventoryRevRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxMediaAcctInventoryReversal method");
	}

	// 10.4 Terminal Object
	// 10.4.1 Terminal Object Add Message
	/*
	 * An IFX client uses the <TerminalObjAddRq> message to add a Terminal
	 * object. Typically the term “client” is associated with a Terminal and
	 * “server” is associated with a Host (e.g. CSP, SP). However, since the
	 * Terminal object resides on the Terminal, the IFX client that will use
	 * this message will be a Host (e.g. CSP, SP).
	 */
	@RequestMapping(value = "TerminalObjAdd", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjAddRs terminalObjAdd(
			@RequestBody final TerminalObjAddRq terminalObjAddRq) {
		try {
			return ifxTerminalObjAdd(terminalObjAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjAdd- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjAddRs ifxTerminalObjAdd(TerminalObjAddRq terminalObjAddRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjAdd method");
	}

	// 10.4.2 Terminal Object Modify
	/*
	 * An IFX client uses the <TerminalObjModRq> message to modify a Terminal
	 * object. Typically the term “client” is associated with a Terminal and
	 * “server” is associated with a Host (e.g. CSP, SP). However, since the
	 * Terminal object resides on the Terminal, the IFX client that will use
	 * this message will be a Host (e.g. CSP, SP).
	 */
	@RequestMapping(value = "TerminalObjMod", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjModRs terminalObjMod(
			@RequestBody final TerminalObjModRq terminalObjModRq) {
		try {
			return ifxTerminalObjMod(terminalObjModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjMod- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjModRs ifxTerminalObjMod(TerminalObjModRq terminalObjModRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjMod method");
	}

	// 10.4.3 Terminal Object Inquiry
	/*
	 * An IFX client uses the <TerminalObjInqRq> message to retrieve Terminal
	 * objects. Typically the term “client” is associated with a Terminal and
	 * “server” is associated with a Host (e.g. CSP, SP). However, since the
	 * Terminal object resides on the Terminal, the IFX client that will use
	 * this message will be a Host (e.g. CSP, SP).
	 */
	@RequestMapping(value = "TerminalObjInq", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjInqRs terminalObjInq(
			@RequestBody final TerminalObjInqRq terminalObjInqRq) {
		try {
			return ifxTerminalObjInq(terminalObjInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjInq- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjInqRs ifxTerminalObjInq(TerminalObjInqRq terminalObjInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjInq method");
	}

	// 10.4.4 Terminal Object Delete
	/*
	 * An IFX client uses the <TerminalObjDelRq> message to delete a Terminal
	 * object. Typically the term “client” is associated with a Terminal and
	 * “server” is associated with a Host (e.g. CSP, SP). However, since the
	 * Terminal object resides on the Terminal, the IFX client that will use
	 * this message will be a Host (e.g. CSP, SP).
	 */
	@RequestMapping(value = "TerminalObjDel", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjDelRs terminalObjDel(
			@RequestBody final TerminalObjDelRq terminalObjDelRq) {
		try {
			return ifxTerminalObjDel(terminalObjDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjDel- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjDelRs ifxTerminalObjDel(TerminalObjDelRq terminalObjDelRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjDel method");
	}

	// 10.4.5 Terminal Object Audit
	/*
	 * An IFX client uses the <TerminalObjAudRq> message to audit messages
	 * associated with a particular Terminal object. Typically the term “client”
	 * is associated with a Terminal and “server” is associated with a Host
	 * (e.g. CSP, SP). However, since the Terminal object resides on the
	 * Terminal, the IFX client that will use this message will be a Host (e.g.
	 * CSP, SP).
	 */
	@RequestMapping(value = "TerminalObjAud", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjAudRs terminalObjAudit(
			@RequestBody final TerminalObjAudRq terminalObjAudRq) {
		try {
			return ifxTerminalObjAudit(terminalObjAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjAudit- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjAudRs ifxTerminalObjAudit(
			TerminalObjAudRq terminalObjAudRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjAudit method");
	}

	// 10.4.6 Terminal Object Status Modify
	/*
	 * An IFX client uses the <TerminalObjStatusModRq> message to modify the
	 * status of a particular Terminal object. Typically the term “client” is
	 * associated with a Terminal and “server” is associated with a Host (e.g.
	 * CSP, SP). However, since the Terminal object resides on the Terminal, the
	 * IFX client that will use this message will be a Host (e.g. CSP, SP).
	 */
	@RequestMapping(value = "TerminalObjStatusMod", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjStatusModRs terminalObjAudit(
			@RequestBody final TerminalObjStatusModRq terminalObjStatusModRq) {
		try {
			return ifxTerminalObjStatusMod(terminalObjStatusModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjStatusMod- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjStatusModRs ifxTerminalObjStatusMod(
			TerminalObjStatusModRq terminalObjStatusModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjStatusMod method");
	}

	// 10.4.7 Terminal Object Advise
	/*
	 * Since the Terminal object resides on the Terminal, the Terminal will use
	 * the <TerminalObjAdviseRq> message to inform other IFX entities (e.g.
	 * Hosts, CSP, SP) of changes to the Terminal object. If it is not necessary
	 * to Advise of changes to the data elements in the <TerminalObjInfo>
	 * aggregate then the <TerminalObjId> and <TerminalObjStatus> would be sent
	 * in the request. Otherwise, the entire <TerminalObjRec> aggregate should
	 * be sent.
	 */
	@RequestMapping(value = "TerminalObjAdvise", method = RequestMethod.POST)
	@ResponseBody
	public TerminalObjAdviseRs terminalObjAdvise(
			@RequestBody final TerminalObjAdviseRq terminalObjAdviseRq) {
		try {
			return ifxTerminalObjAdvise(terminalObjAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalObjAdvise- this method is not implemented yet");
		}
		return null;
	}

	private TerminalObjAdviseRs ifxTerminalObjAdvise(
			TerminalObjAdviseRq terminalObjAdviseRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalObjAdvise method");
	}

	// 10.5 Terminal Service Provider Object
	// 10.5.1 Terminal Service Provider Object Add Message
	/*
	 * An IFX client uses the <TerminalSPObjAddRq> message to add a Terminal
	 * Service Provider object.
	 */
	@RequestMapping(value = "TerminalSPObjAdd", method = RequestMethod.POST)
	@ResponseBody
	public TerminalSPObjAddRs terminalSPObjAdd(
			@RequestBody final TerminalSPObjAddRq terminalSPObjAddRq) {
		try {
			return ifxTerminalSPObjAdd(terminalSPObjAddRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalSPObjAdd - this method is not implemented yet");
		}
		return null;
	}

	private TerminalSPObjAddRs ifxTerminalSPObjAdd(
			TerminalSPObjAddRq terminalSPObjAddRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalSPObjAdd method");
	}

	// 10.5.2 Terminal Service Provider Object Modify
	/*
	 * An IFX client uses the <TerminalSPObjModRq> message to modify a Terminal
	 * Service Provider object.
	 */
	@RequestMapping(value = "TerminalSPObjMod", method = RequestMethod.POST)
	@ResponseBody
	public TerminalSPObjModRs terminalSPObjMod(
			@RequestBody final TerminalSPObjModRq terminalSPObjModRq) {
		try {
			return ifxTerminalSPObjMod(terminalSPObjModRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalSPObjMod - this method is not implemented yet");
		}
		return null;
	}

	private TerminalSPObjModRs ifxTerminalSPObjMod(
			TerminalSPObjModRq terminalSPObjModRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalSPObjMod method");
	}

	// 10.5.3 Terminal Service Provider Object Inquiry
	/*
	 * An IFX client uses the <TerminalSPObjInqRq> message to retrieve Terminal
	 * Service Provider objects.
	 */
	@RequestMapping(value = "TerminalSPObjInq", method = RequestMethod.POST)
	@ResponseBody
	public TerminalSPObjInqRs terminalSPObjInq(
			@RequestBody final TerminalSPObjInqRq terminalSPObjInqRq) {
		try {
			return ifxTerminalSPObjInq(terminalSPObjInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalSPObjInq - this method is not implemented yet");
		}
		return null;
	}

	private TerminalSPObjInqRs ifxTerminalSPObjInq(
			TerminalSPObjInqRq terminalSPObjInqRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalSPObjInq method");
	}

	// 10.5.4 Terminal Service Provider Object Delete
	/*
	 * An IFX client uses the <TerminalSPObjDelRq> message to delete a Terminal
	 * Service Provider object.
	 */
	@RequestMapping(value = "TerminalSPObjDel", method = RequestMethod.POST)
	@ResponseBody
	public TerminalSPObjDelRs terminalSPObjDel(
			@RequestBody final TerminalSPObjDelRq terminalSPObjDelRq) {
		try {
			return ifxTerminalSPObjDel(terminalSPObjDelRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalSPObjDel - this method is not implemented yet");
		}
		return null;
	}

	private TerminalSPObjDelRs ifxTerminalSPObjDel(
			TerminalSPObjDelRq terminalSPObjDelRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalSPObjDel method");
	}

	// 10.5.5 Terminal Service Provider Object Audit
	/*
	 * An IFX client uses the <TerminalSPObjAudRq> message to audit messages
	 * associated with a particular Terminal Service Provider object.
	 */
	@RequestMapping(value = "TerminalSPObjAud", method = RequestMethod.POST)
	@ResponseBody
	public TerminalSPObjAudRs terminalSPObjAudit(
			@RequestBody final TerminalSPObjAudRq terminalSPObjAudRq) {
		try {
			return ifxTerminalSPObjAudit(terminalSPObjAudRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalSPObjAudit - this method is not implemented yet");
		}
		return null;
	}

	private TerminalSPObjAudRs ifxTerminalSPObjAudit(
			TerminalSPObjAudRq terminalSPObjAudRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalSPObjAudit method");
	}

	// 10.5.6 Terminal Service Provider Object Advise
	/*
	 * The <TerminalSPObjAdvise> message is used by a Service Provider to inform
	 * a Terminal that a change has occurred in the Terminal Service Provider
	 * Object. The primary use of the message is to inform a Terminal that
	 * service is available/unavailable from the Service Provider. Service is
	 * defined as a collection of one or more messages. If it is not necessary
	 * to Advise of changes to the data elements in the <TerminalSPObjInfo>
	 * aggregate then the <TerminalSPObjId> and <TerminalSPObjStatus> would be
	 * sent in the request. Otherwise, the entire <TerminalSPObjRec> aggregate
	 * should be sent.
	 */
	@RequestMapping(value = "TerminalSPObjAdvise", method = RequestMethod.POST)
	@ResponseBody
	public TerminalSPObjAdviseRs terminalSPObjAdvise(
			@RequestBody final TerminalSPObjAdviseRq terminalSPObjAdviseRq) {
		try {
			return ifxTerminalSPObjAdvise(terminalSPObjAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxTerminalSPObjAdvise - this method is not implemented yet");
		}
		return null;
	}

	private TerminalSPObjAdviseRs ifxTerminalSPObjAdvise(
			TerminalSPObjAdviseRq terminalSPObjAdviseRq)
					throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxTerminalSPObjAdvise method");
	}

	// 10.6 Device Messages
	// 10.6.1 Device Inquiry

	@RequestMapping(value = "DevInq", method = RequestMethod.POST)
	@ResponseBody
	public DevInqRs devInquiry(@RequestBody final DevInqRq devInqRq) {
		try {
			return ifxDevInquiry(devInqRq);
		} catch (NotImplementedException e) {
			logger.error("ifxDevInquiry - this method is not implemented yet");
		}
		return null;
	}

	private DevInqRs ifxDevInquiry(DevInqRq devInqRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDevInquiry method");
	}

	// 10.6.2 Device Advise
	/*
	 * An IFX Terminal uses the <DevAdviseRq> message to inform other IFX
	 * entities (e.g. Hosts, CSP, SP) of a change in the status of a device at
	 * the Terminal. It is expected the <DevAdviseRq> message will be sent to
	 * indicate both device faults, and when device faults have been resolved.
	 * If one transaction causes multiple device faults, then one <DevAdviseRq>
	 * message will be transmitted for each device fault.
	 */
	@RequestMapping(value = "DevAdvise", method = RequestMethod.POST)
	@ResponseBody
	public DevAdviseRs devAdvise(@RequestBody final DevAdviseRq devAdviseRq) {
		try {
			return ifxDevAdvise(devAdviseRq);
		} catch (NotImplementedException e) {
			logger.error("ifxDevAdvise - this method is not implemented yet");
		}
		return null;
	}

	private DevAdviseRs ifxDevAdvise(DevAdviseRq devAdviseRq)
			throws NotImplementedException {
		throw new NotImplementedException(
				"Please implement the ifxDevAdvise method");
	}

}
