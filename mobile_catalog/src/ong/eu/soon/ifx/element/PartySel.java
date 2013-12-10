package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartySel extends IFXObject {
	//begin-xor	Required Repeating
	PartyKeys[] partyKeys;	 //	Aggregate	 Required	 Party Keys Aggregate
	//begin-block	Required
	PersonIndicator[] personIndicator;	 //	Boolean	 Optional	 Person Indicator
	IssuedIdentValue[] issuedIdentValue;	 //	C-32	 Optional	 Issued Identification Value
	IssuedIdentType[] issuedIdentType;	 //	Open Enum	 Optional	 Issued Idententification TypeValid values include: AlnRegnNb, BEI, BIC, BirthCertificate, BkPtyId, DrvrsLicNb, DUNS, EANGLN, HealthCard, IBEI, IdntyCardNb, MerchantId, Military, MplyrIdNb, NINO, NRABusiness, NRAPersonal, Other, Passbook, PermanentResidence, PrtryId, PsptNb, Retirement, SclSctyNb, TaxIdNb, USCHU, VoterRegistrationDefault Value: Other
	FullName[] fullName;	 //	C-96	 Optional	 Full Name
	Addr1[] addr1;	 //	C-64	 Optional	 Address Line 1
	PostalCode[] postalCode;	 //	C-11	 Optional	 Postal Code
	BirthDt[] birthDt;	 //	Date	 Optional	 Date of Birth
	Phone[] phone;	 //	Phone Number	 Optional	 Telephone number
	EmailAddr[] emailAddr;	 //	NC-128	 Optional	 Email Address
	//end-block
	//end-xor
	
	public PartyKeys[] getPartyKeys() {
		return partyKeys;
	}
	public void setPartyKeys(PartyKeys[] partyKeys) {
		this.partyKeys = partyKeys;
	}
	public PersonIndicator[] getPersonIndicator() {
		return personIndicator;
	}
	public void setPersonIndicator(PersonIndicator[] personIndicator) {
		this.personIndicator = personIndicator;
	}
	public IssuedIdentValue[] getIssuedIdentValue() {
		return issuedIdentValue;
	}
	public void setIssuedIdentValue(IssuedIdentValue[] issuedIdentValue) {
		this.issuedIdentValue = issuedIdentValue;
	}
	public IssuedIdentType[] getIssuedIdentType() {
		return issuedIdentType;
	}
	public void setIssuedIdentType(IssuedIdentType[] issuedIdentType) {
		this.issuedIdentType = issuedIdentType;
	}
	public FullName[] getFullName() {
		return fullName;
	}
	public void setFullName(FullName[] fullName) {
		this.fullName = fullName;
	}
	public Addr1[] getAddr1() {
		return addr1;
	}
	public void setAddr1(Addr1[] addr1) {
		this.addr1 = addr1;
	}
	public PostalCode[] getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(PostalCode[] postalCode) {
		this.postalCode = postalCode;
	}
	public BirthDt[] getBirthDt() {
		return birthDt;
	}
	public void setBirthDt(BirthDt[] birthDt) {
		this.birthDt = birthDt;
	}
	public Phone[] getPhone() {
		return phone;
	}
	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}
	public EmailAddr[] getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(EmailAddr[] emailAddr) {
		this.emailAddr = emailAddr;
	}
	
	
}
