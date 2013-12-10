package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PartyAuthRec;
import ong.eu.soon.mobile.json.ifx.element.PartyRec;
import ong.eu.soon.mobile.json.ifx.element.PartyStatusRec;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class PartyAdviseRq extends IFXObject {
	protected PartyAdviseRq(){	
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
	public final native PartyRec getPartyRec() /*-{
		return $wnd.cleanObject(partyRec);
	}-*/;
	public final native void setPartyRec(PartyRec partyRec) /*-{
		this.partyRec = partyRec;
	}-*/;
	public final native PartyStatusRec getPartyStatusRec() /*-{
		return $wnd.cleanObject(partyStatusRec);
	}-*/;
	public final native void setPartyStatusRec(PartyStatusRec partyStatusRec) /*-{
		this.partyStatusRec = partyStatusRec;
	}-*/;
	public final native PartyAuthRec getPartyAuthRec() /*-{
		return $wnd.cleanObject(partyAuthRec);
	}-*/;
	public final native void setPartyAuthRec(PartyAuthRec partyAuthRec) /*-{
		this.partyAuthRec = partyAuthRec;
	}-*/;
}