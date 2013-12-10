package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyRec extends IFXObject {
	protected PartyRec(){	
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
	public final native PartyInfo getPartyInfo() /*-{
		return $wnd.cleanObject(partyInfo);
	}-*/;
	public final native void setPartyInfo(PartyInfo partyInfo) /*-{
		this.partyInfo = partyInfo;
	}-*/;
	public final native PartyEnvr getPartyEnvr() /*-{
		return $wnd.cleanObject(partyEnvr);
	}-*/;
	public final native void setPartyEnvr(PartyEnvr partyEnvr) /*-{
		this.partyEnvr = partyEnvr;
	}-*/;
	public final native PartyAuth getPartyAuth() /*-{
		return $wnd.cleanObject(partyAuth);
	}-*/;
	public final native void setPartyAuth(PartyAuth partyAuth) /*-{
		this.partyAuth = partyAuth;
	}-*/;
	public final native PartyStatus getPartyStatus() /*-{
		return $wnd.cleanObject(partyStatus);
	}-*/;
	public final native void setPartyStatus(PartyStatus partyStatus) /*-{
		this.partyStatus = partyStatus;
	}-*/;




}