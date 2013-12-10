package ong.eu.soon.mobile.json.ifx.transfer;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.XferRec;
import ong.eu.soon.mobile.json.ifx.element.XferStatusRec;

public class XferAdviseRq extends IFXObject {
	protected XferAdviseRq(){	
	}
	public final native  RqUID getRqUID()/*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native  void setRqUID(RqUID rqUID)/*-{
		this.rqUID = rqUID;
	}-*/;
	public final native  MsgRqHdr getMsgRqHdr()/*-{
		return $wnd.cleanObject(this.msgRqHdr);
	}-*/;
	public final native  void setMsgRqHdr(MsgRqHdr msgRqHdr)/*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native  XferRec getXferRec()/*-{
		return $wnd.cleanObject(this.xferRec);
	}-*/;
	public final native  void setXferRec(XferRec xferRec)/*-{
		this.xferRec = xferRec;
	}-*/;
	public final native  XferStatusRec getXferStatusRec()/*-{
		return $wnd.cleanObject(this.xferStatusRec);
	}-*/;
	public final native  void setXferStatusRec(XferStatusRec xferStatusRec)/*-{
		this.xferStatusRec = xferStatusRec;
	}-*/;
}
