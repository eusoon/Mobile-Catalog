package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcProviderInfo extends IFXObject {
	SvcProviderName SvcProviderName;//URL	Required The Service Provider Name element is a globally unique identifier for a service provider.
	LegalName LegalName;//C-96	Optional Legal Name
	HoldCoIdent HoldCoIdent;//C-40	Optional SP Holding Company Identification
	Contact[] Contact;//Aggregate	 Optional Repeating Contact
	//begin-block Required Repeating 
	SvcRef[] svcRef;//Aggregate	Required Service Reference Aggregate
	SvcStatusDt[] svcStatusDt;//DateTime	Required Service Status Date
	//end-block
	public SvcProviderName getSvcProviderName() {
		return SvcProviderName;
	}
	public void setSvcProviderName(SvcProviderName svcProviderName) {
		SvcProviderName = svcProviderName;
	}
	public LegalName getLegalName() {
		return LegalName;
	}
	public void setLegalName(LegalName legalName) {
		LegalName = legalName;
	}
	public HoldCoIdent getHoldCoIdent() {
		return HoldCoIdent;
	}
	public void setHoldCoIdent(HoldCoIdent holdCoIdent) {
		HoldCoIdent = holdCoIdent;
	}
	public Contact[] getContact() {
		return Contact;
	}
	public void setContact(Contact[] contact) {
		Contact = contact;
	}
	public SvcRef[] getSvcRef() {
		return svcRef;
	}
	public void setSvcRef(SvcRef[] svcRef) {
		this.svcRef = svcRef;
	}
	public SvcStatusDt[] getSvcStatusDt() {
		return svcStatusDt;
	}
	public void setSvcStatusDt(SvcStatusDt[] svcStatusDt) {
		this.svcStatusDt = svcStatusDt;
	}

}
