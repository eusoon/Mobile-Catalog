package ong.eu.soon.mobile.json.ifx.transfer;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.Desc;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RevReasonCode;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.XferRqMsg;

public class XferRevRq extends IFXObject {
	protected XferRevRq(){	
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
	public final native RevReasonCode getRevReasonCode() /*-{
		return $wnd.cleanObject(revReasonCode);
	}-*/;
	public final native void setRevReasonCode(RevReasonCode revReasonCode) /*-{
		this.revReasonCode = revReasonCode;
	}-*/;
	public final native Desc getDesc() /*-{
		return $wnd.cleanObject(desc);
	}-*/;
	public final native void setDesc(Desc desc) /*-{
		this.desc = desc;
	}-*/;
	public final native XferRqMsg getXferRqMsg() /*-{
		return $wnd.cleanObject(xferRqMsg);
	}-*/;
	public final native void setXferRqMsg(XferRqMsg xferRqMsg) /*-{
		this.xferRqMsg = xferRqMsg;
	}-*/;

}