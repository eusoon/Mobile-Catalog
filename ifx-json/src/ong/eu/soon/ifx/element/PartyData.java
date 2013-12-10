package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyData extends IFXObject {
	Contact[] contact;//Aggregate	Optional Repeating Contact
	IssuedIdent[] issuedIdent;//Aggregate	Optional Repeating Issued Identification
	public Contact[] getContact() {
		return contact;
	}
	public void setContact(Contact[] contact) {
		this.contact = contact;
	}
	public IssuedIdent[] getIssuedIdent() {
		return issuedIdent;
	}
	public void setIssuedIdent(IssuedIdent[] issuedIdent) {
		this.issuedIdent = issuedIdent;
	}

}
