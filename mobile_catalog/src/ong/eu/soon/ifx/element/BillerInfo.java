package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillerInfo extends IFXObject {

	Name name;	 //	C-40	 Required	 Biller Name. Assigned by the service provider. Cannot be changed by the client.
	CreditorData creditorData;	 //	Aggregate	 Optional	 Creditor Data
	//begin-block	Optional Repeating
	SecretPrompt[] secretPrompt;	 //	Aggregate	 Required	 Secret Prompt Aggregate.If omitted, the biller does not require the customer to enter any secrets for client enrollment.
	CryptType[] cryptType;	 //	Open Enum	 Required	 Encryption type to indicate encryption used for transmitting authentication information. The Biller may specify one or more encryption types that it accepts.Defined values: None, PKCS#1, PKCS#7, PKCS#10, ECB, CBC, CFB, OFB, TECB, TCBC, TCBC-I, TCFB, TCFB-P, TOFB, TOFB-I, AECB, ACBC, ACFB, AOFB, ACM
	//end-block
	HistRetentionDays histRetentionDays;	 //	Long	 Optional	 Number of days that Bill Summary and Bill Detail information is available for inquiries. The Bill Detail information may be available for a longer period of time.
	CSPCustInfoReq cSPCustInfoReq;	 //	Boolean	 Optional	 CSP Customer name and address information Required. If True, the Biller requires that the Customer name and address be sent with an account activation. IF False or omitted, the customer name and address are not required in the account activation.
	BillerPayData billerPayData;	 //	Aggregate	 Optional	 Biller Pay Information Aggregate.
	LogoURL logoURL;	 //	URL	 Optional	 Logo URL.URL of the biller's logo.
	Logo logo;	 //	Aggregate	 Optional	 Biller Logo. If the client requested images, the logo should be included here in this response.
	BillerEnrollURL billerEnrollURL;	 //	URL	 Optional	 Biller Information URL. URL of human-readable description of additional information the biller would like the customer to have with regard to signing up. The resource may also include an interactive session to verify a customer's identity and eligiblity to receive bills for an account. If successful, the session results in a security token or password that the customer may use in response to a SecretPrompt when activating the account for bill presentment.
	BillerAcctIdSpec billerAcctIdSpec;	 //	Aggregate	 Optional	 Biller Account Identification Specification
	DiscReqd discReqd;	 //	Boolean	 Optional	 Disclosure Required. If True, the biller requires that their disclosure be presented to the customer prior to account activation. If False, the presentment of the disclosure is not required prior to the account activation request. This may be False if no disclosure is required or when the biller wishes to return the disclosure in the account activation response.
	DiscRef discRef;	 //	Aggregate	 Optional	 Disclosure Identifier. The identifier of the disclosure associated with this biller. The associated with this identifier can be obtained by performing a Disclosure Inquiry.
	DiscDt discDt;	 //	Date	 Optional	 Date Last Disclosure Change.
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public CreditorData getCreditorData() {
		return creditorData;
	}
	public void setCreditorData(CreditorData creditorData) {
		this.creditorData = creditorData;
	}
	public SecretPrompt[] getSecretPrompt() {
		return secretPrompt;
	}
	public void setSecretPrompt(SecretPrompt[] secretPrompt) {
		this.secretPrompt = secretPrompt;
	}
	public CryptType[] getCryptType() {
		return cryptType;
	}
	public void setCryptType(CryptType[] cryptType) {
		this.cryptType = cryptType;
	}
	public HistRetentionDays getHistRetentionDays() {
		return histRetentionDays;
	}
	public void setHistRetentionDays(HistRetentionDays histRetentionDays) {
		this.histRetentionDays = histRetentionDays;
	}
	public CSPCustInfoReq getcSPCustInfoReq() {
		return cSPCustInfoReq;
	}
	public void setcSPCustInfoReq(CSPCustInfoReq cSPCustInfoReq) {
		this.cSPCustInfoReq = cSPCustInfoReq;
	}
	public BillerPayData getBillerPayData() {
		return billerPayData;
	}
	public void setBillerPayData(BillerPayData billerPayData) {
		this.billerPayData = billerPayData;
	}
	public LogoURL getLogoURL() {
		return logoURL;
	}
	public void setLogoURL(LogoURL logoURL) {
		this.logoURL = logoURL;
	}
	public Logo getLogo() {
		return logo;
	}
	public void setLogo(Logo logo) {
		this.logo = logo;
	}
	public BillerEnrollURL getBillerEnrollURL() {
		return billerEnrollURL;
	}
	public void setBillerEnrollURL(BillerEnrollURL billerEnrollURL) {
		this.billerEnrollURL = billerEnrollURL;
	}
	public BillerAcctIdSpec getBillerAcctIdSpec() {
		return billerAcctIdSpec;
	}
	public void setBillerAcctIdSpec(BillerAcctIdSpec billerAcctIdSpec) {
		this.billerAcctIdSpec = billerAcctIdSpec;
	}
	public DiscReqd getDiscReqd() {
		return discReqd;
	}
	public void setDiscReqd(DiscReqd discReqd) {
		this.discReqd = discReqd;
	}
	public DiscRef getDiscRef() {
		return discRef;
	}
	public void setDiscRef(DiscRef discRef) {
		this.discRef = discRef;
	}
	public DiscDt getDiscDt() {
		return discDt;
	}
	public void setDiscDt(DiscDt discDt) {
		this.discDt = discDt;
	}
	
}
