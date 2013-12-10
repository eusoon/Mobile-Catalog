package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.PartyStatusRec;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class PartyStatusModRs extends IFXObject {
	protected PartyStatusModRs(){	
	}
	public final native Status getStatus() /*-{
		return $wnd.cleanObject(status);
	}-*/;
	public final native void setStatus(Status status) /*-{
		this.status = status;
	}-*/;
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRsHdr getMsgRsHdr() /*-{
		return $wnd.cleanObject(msgRsHdr);
	}-*/;
	public final native void setMsgRsHdr(MsgRsHdr msgRsHdr) /*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;
	public final native PartyStatusRec getPartyStatusRec() /*-{
		return $wnd.cleanObject(partyStatusRec);
	}-*/;
	public final native void setPartyStatusRec(PartyStatusRec partyStatusRec) /*-{
		this.partyStatusRec = partyStatusRec;
	}-*/;
	
	
}