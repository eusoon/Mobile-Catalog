package ong.eu.soon.mobile.json.ifx.transfer;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.XferKeys;
import ong.eu.soon.mobile.json.ifx.element.XferStatus;

public class XferStatusModRq extends IFXObject {
	protected XferStatusModRq(){	
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
	public final native  XferKeys getXferKeys()/*-{
		return $wnd.cleanObject(this.xferKeys);
	}-*/;
	public final native  void setXferKeys(XferKeys xferKeys)/*-{
		this.xferKeys = xferKeys;
	}-*/;
	public final native  XferStatus getXferStatus()/*-{
		return $wnd.cleanObject(this.xferStatus);
	}-*/;
	public final native  void setXferStatus(XferStatus xferStatus)/*-{
		this.xferStatus = xferStatus;
	}-*/;
}
