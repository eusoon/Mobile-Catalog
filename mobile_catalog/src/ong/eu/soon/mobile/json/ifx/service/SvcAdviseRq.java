package ong.eu.soon.mobile.json.ifx.service;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.SvcRec;
import ong.eu.soon.mobile.json.ifx.element.SvcStatusRec;

public class SvcAdviseRq extends IFXObject {
	protected SvcAdviseRq(){	
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