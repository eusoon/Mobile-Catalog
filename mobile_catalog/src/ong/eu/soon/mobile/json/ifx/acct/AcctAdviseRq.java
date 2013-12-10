package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctRec;
import ong.eu.soon.mobile.json.ifx.element.AcctStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class AcctAdviseRq extends IFXObject {
	protected AcctAdviseRq(){	
	}
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRqHdr getMsgRqHdr() /*-{
		return $wnd.cleanObject(this.msgRqHdr);
	}-*/;
	public final native void setMsgRqHdr(MsgRqHdr msgRqHdr) /*-{
		this.msgRqHdr = msgRqHdr;
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