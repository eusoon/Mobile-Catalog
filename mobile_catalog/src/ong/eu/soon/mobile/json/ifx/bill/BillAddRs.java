package ong.eu.soon.mobile.json.ifx.bill;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.BillRec;
import ong.eu.soon.mobile.json.ifx.element.BillStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class BillAddRs extends IFXObject {
	protected BillAddRs(){	
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
	public final native BillRec getBillRec() /*-{
		return $wnd.cleanObject(billRec);
	}-*/;
	public final native void setBillRec(BillRec billRec) /*-{
		this.billRec = billRec;
	}-*/;
	public final native BillStatusRec getBillStatusRec() /*-{
		return $wnd.cleanObject(billStatusRec);
	}-*/;
	public final native void setBillStatusRec(BillStatusRec billStatusRec) /*-{
		this.billStatusRec = billStatusRec;
	}-*/;
	
}