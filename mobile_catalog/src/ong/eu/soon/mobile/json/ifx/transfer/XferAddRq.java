package ong.eu.soon.mobile.json.ifx.transfer;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.XferInfo;

public class XferAddRq extends IFXObject{
	protected XferAddRq(){	
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
	public final native  XferInfo getXferInfo()/*-{
		return $wnd.cleanObject(this.xferInfo);
	}-*/;
	public final native  void setXferInfo(XferInfo xferInfo)/*-{
		this.xferInfo = xferInfo;
	}-*/;
}
