package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OrgIdent extends IFXObject {
	RegistrationAuthority registrationAuthority;	 //	Open Enum	 Required	 Registration AuthorityValid values include: DunAndBradstreet, OrgSpecific, USA.TaxId
	RegistrationNumber registrationNumber;	 //	Identifier	 Required	 Registration Number
	
	public RegistrationAuthority getRegistrationAuthority() {
		return registrationAuthority;
	}
	public void setRegistrationAuthority(RegistrationAuthority registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}
	public RegistrationNumber getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(RegistrationNumber registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}
