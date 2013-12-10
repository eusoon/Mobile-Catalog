package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.USA.TaxIdCert;

public class IssuedIdent extends IFXObject {
	IssuedIdentType issuedIdentType;//Open Enum	Required Issued Idententification Type Valid values include: AlnRegnNb, BEI, BIC, BirthCertificate, BkPtyId, DrvrsLicNb, DUNS, EANGLN, HealthCard, IBEI, IdntyCardNb, MerchantId, Military, MplyrIdNb, NINO, NRABusiness, NRAPersonal, Other, Passbook, PermanentResidence, PrtryId, PsptNb, Retirement, SclSctyNb, TaxIdNb, USCHU, VoterRegistration Default Value: Other
	IssuedIdentValue issuedIdentValue;//C-32	Required Issued Identification Value
	Issuer issuer;//NC-32	Optional Issuer
	IssueDt issueDt;//DateTime	OptionalIssue Date
	ExpDt expDt;//DateTime	Optional Expiration Date
	Desc desc;//C-80	Optional Description
	IdentImg identImg;//Aggregate	Optional Identification Image
	IdentReadMethod identReadMethod;//Open Enum	Optional Identification Read MethodValid values include: BarCode, Customer, ICC, MagStripe, Manual, NotSpecified, OCR, TerminalNotUsed
	IdentVerifyMethod identVerifyMethod;//Open Enum	Optional Identification Verify Method Valid values include: AddressVerification, Biometrics, CardVerificationValue, Certificate, DigitizedSignature, ICCSignature, None, OfflinePIN, OnlinePIN, PersonalInfoVerification, PictureID, Signature, TelephoneNumberVerification, Unknown
	IdentVerifyResults identVerifyResults;//Open Enum	Optional Identification Verify Results Valid values include: CVVInvalid, CVVValid, InProgress, NotVerified, PINInvalid, PINValid, SignatureInvalid, SignatureValid, Verified
	IssuedLoc issuedLoc;//C-80	Optional Issue Location
	GovIssuedIdent govIssuedIdent;//Aggregate	Optional Government Issued Identification
	TaxIdCert taxIdCert;//Aggregate	Optional USA Tax Identification Certification
	UpDt upDt;//Timestamp	Optional Update Date Time
	
	public IssuedIdentType getIssuedIdentType() {
		return issuedIdentType;
	}
	public void setIssuedIdentType(IssuedIdentType issuedIdentType) {
		this.issuedIdentType = issuedIdentType;
	}
	public IssuedIdentValue getIssuedIdentValue() {
		return issuedIdentValue;
	}
	public void setIssuedIdentValue(IssuedIdentValue issuedIdentValue) {
		this.issuedIdentValue = issuedIdentValue;
	}
	public Issuer getIssuer() {
		return issuer;
	}
	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}
	public IssueDt getIssueDt() {
		return issueDt;
	}
	public void setIssueDt(IssueDt issueDt) {
		this.issueDt = issueDt;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public IdentImg getIdentImg() {
		return identImg;
	}
	public void setIdentImg(IdentImg identImg) {
		this.identImg = identImg;
	}
	public IdentReadMethod getIdentReadMethod() {
		return identReadMethod;
	}
	public void setIdentReadMethod(IdentReadMethod identReadMethod) {
		this.identReadMethod = identReadMethod;
	}
	public IdentVerifyMethod getIdentVerifyMethod() {
		return identVerifyMethod;
	}
	public void setIdentVerifyMethod(IdentVerifyMethod identVerifyMethod) {
		this.identVerifyMethod = identVerifyMethod;
	}
	public IdentVerifyResults getIdentVerifyResults() {
		return identVerifyResults;
	}
	public void setIdentVerifyResults(IdentVerifyResults identVerifyResults) {
		this.identVerifyResults = identVerifyResults;
	}
	public IssuedLoc getIssuedLoc() {
		return issuedLoc;
	}
	public void setIssuedLoc(IssuedLoc issuedLoc) {
		this.issuedLoc = issuedLoc;
	}
	public GovIssuedIdent getGovIssuedIdent() {
		return govIssuedIdent;
	}
	public void setGovIssuedIdent(GovIssuedIdent govIssuedIdent) {
		this.govIssuedIdent = govIssuedIdent;
	}
	public TaxIdCert getTaxIdCert() {
		return taxIdCert;
	}
	public void setTaxIdCert(TaxIdCert taxIdCert) {
		this.taxIdCert = taxIdCert;
	}
	public UpDt getUpDt() {
		return upDt;
	}
	public void setUpDt(UpDt upDt) {
		this.upDt = upDt;
	}

}
