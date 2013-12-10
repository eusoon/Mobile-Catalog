package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyStatusRec extends IFXObject {
	protected PartyStatusRec(){	
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
	public final native PartyStatus getPartyStatus() /*-{
		return $wnd.cleanObject(partyStatus);
	}-*/;
	public final native void setPartyStatus(PartyStatus partyStatus) /*-{
		this.partyStatus = partyStatus;
	}-*/;
}