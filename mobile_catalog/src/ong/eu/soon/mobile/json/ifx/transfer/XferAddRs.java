package ong.eu.soon.mobile.json.ifx.transfer;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;
import ong.eu.soon.mobile.json.ifx.element.XferRec;
import ong.eu.soon.mobile.json.ifx.element.XferStatusRec;

public class XferAddRs extends IFXObject {
	protected XferAddRs(){	
	}
	public final native  Status getStatus()/*-{
		return $wnd.cleanObject(status);
	}-*/;
	public final native  void setStatus(Status status)/*-{
		this.status = status;
	}-*/;
	public final native  RqUID getRqUID()/*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native  void setRqUID(RqUID rqUID)/*-{
		this.rqUID = rqUID;
	}-*/;
	public final native  MsgRsHdr getMsgRsHdr()/*-{
		return $wnd.cleanObject(msgRsHdr);
	}-*/;
	public final native  void setMsgRsHdr(MsgRsHdr msgRsHdr)/*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;
	public final native  XferRec getXferRec()/*-{
		return $wnd.cleanObject(xferRec);
	}-*/;
	public final native  void setXferRec(XferRec xferRec)/*-{
		this.xferRec = xferRec;
	}-*/;
	public final native  XferStatusRec getXferStatusRec()/*-{
		return $wnd.cleanObject(xferStatusRec);
	}-*/;
	public final native  void setXferStatusRec(XferStatusRec xferStatusRec)/*-{
		this.xferStatusRec = xferStatusRec;
	}-*/;

}
