package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class OrgIdent extends IFXObject {
	protected OrgIdent(){	
	}
	public final native RegistrationAuthority getRegistrationAuthority() /*-{
		return $wnd.cleanObject(registrationAuthority);
	}-*/;
	public final native void setRegistrationAuthority(RegistrationAuthority registrationAuthority) /*-{
		this.registrationAuthority = registrationAuthority;
	}-*/;
	public final native RegistrationNumber getRegistrationNumber() /*-{
		return $wnd.cleanObject(registrationNumber);
	}-*/;
	public final native void setRegistrationNumber(RegistrationNumber registrationNumber) /*-{
		this.registrationNumber = registrationNumber;
	}-*/;
}