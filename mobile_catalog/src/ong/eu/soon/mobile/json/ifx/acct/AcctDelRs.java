package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctRec;
import ong.eu.soon.mobile.json.ifx.element.AcctStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class AcctDelRs extends IFXObject {
	
	protected AcctDelRs(){	
	}
	
	public final native Status getStatus() /*-{
		return $wnd.cleanObject(this.status);
	}-*/;
	public final native void setStatus(Status status) /*-{
		this.status = status;
	}-*/;
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRsHdr getMsgRsHdr() /*-{
		return $wnd.cleanObject(this.msgRsHdr);
	}-*/;
	public final native void setMsgRsHdr(MsgRsHdr msgRsHdr) /*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;
	public final native AcctRec getAcctRec() /*-{
		return $wnd.cleanObject(this.acctRec);
	}-*/;
	public final native void setAcctRec(AcctRec acctRec) /*-{
		this.acctRec = acctRec;
	}-*/;
	public final native AcctStatusRec getAcctStatusRec() /*-{
		return $wnd.cleanObject(this.acctStatusRec);
	}-*/;
	public final native void setAcctStatusRec(AcctStatusRec acctStatusRec) /*-{
		this.acctStatusRec = acctStatusRec;
	}-*/;
}