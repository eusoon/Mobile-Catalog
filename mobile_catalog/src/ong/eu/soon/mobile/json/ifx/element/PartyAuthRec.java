package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyAuthRec extends IFXObject {
	protected PartyAuthRec(){	
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
	public final native PartyAuth getPartyAuth() /*-{
		return $wnd.cleanObject(partyAuth);
	}-*/;
	public final native void setPartyAuth(PartyAuth partyAuth) /*-{
		this.partyAuth = partyAuth;
	}-*/;
}