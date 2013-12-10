package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PartyAuth;
import ong.eu.soon.mobile.json.ifx.element.PartyInfo;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class PartyAddRq extends IFXObject {
	protected PartyAddRq(){	
	}
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRqHdr getMsgRqHdr() /*-{
		return $wnd.cleanObject(msgRqHdr);
	}-*/;
	public final native void setMsgRqHdr(MsgRqHdr msgRqHdr) /*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native PartyInfo getPartyInfo() /*-{
		return $wnd.cleanObject(partyInfo);
	}-*/;
	public final native void setPartyInfo(PartyInfo partyInfo) /*-{
		this.partyInfo = partyInfo;
	}-*/;
	public final native PartyAuth getPartyAuth() /*-{
		return $wnd.cleanObject(partyAuth);
	}-*/;
	public final native void setPartyAuth(PartyAuth partyAuth) /*-{
		this.partyAuth = partyAuth;
	}-*/;
}