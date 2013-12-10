package ong.eu.soon.mobile.json.ifx.bill;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.BillRqMsg;
import ong.eu.soon.mobile.json.ifx.element.Desc;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RevReasonCode;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class BillRevRq extends IFXObject {
	protected BillRevRq(){	
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
	public final native BillRqMsg getBillRqMsg() /*-{
		return $wnd.cleanObject(billRqMsg);
	}-*/;
	public final native void setBillRqMsg(BillRqMsg billRqMsg) /*-{
		this.billRqMsg = billRqMsg;
	}-*/;
	
}