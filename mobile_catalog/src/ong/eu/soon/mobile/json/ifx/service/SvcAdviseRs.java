package ong.eu.soon.mobile.json.ifx.service;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;
import ong.eu.soon.mobile.json.ifx.element.SvcRec;
import ong.eu.soon.mobile.json.ifx.element.SvcStatusRec;

public class SvcAdviseRs extends IFXObject {
	protected SvcAdviseRs(){	
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
	public final native SvcRec getSvcRec() /*-{
		return $wnd.cleanObject(svcRec);
	}-*/;
	public final native void setSvcRec(SvcRec svcRec) /*-{
		this.svcRec = svcRec;
	}-*/;
	public final native SvcStatusRec getSvcStatusRec() /*-{
		return $wnd.cleanObject(SvcStatusRec);
	}-*/;
	public final native void setSvcStatusRec(SvcStatusRec svcStatusRec) /*-{
		SvcStatusRec = svcStatusRec;
	}-*/;

}