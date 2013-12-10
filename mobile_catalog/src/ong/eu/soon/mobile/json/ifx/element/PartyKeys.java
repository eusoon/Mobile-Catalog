package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyKeys extends IFXObject {
	protected PartyKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native PartyId getPartyId() /*-{
		return $wnd.cleanObject(partyId);
	}-*/;
	public final native void setPartyId(PartyId partyId) /*-{
		this.partyId = partyId;
	}-*/;
	public final native LoginIdent getLoginIdent() /*-{
		return $wnd.cleanObject(loginIdent);
	}-*/;
	public final native void setLoginIdent(LoginIdent loginIdent) /*-{
		this.loginIdent = loginIdent;
	}-*/;
}