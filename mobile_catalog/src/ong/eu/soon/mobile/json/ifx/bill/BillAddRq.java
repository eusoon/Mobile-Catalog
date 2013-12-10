package ong.eu.soon.mobile.json.ifx.bill;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.BillInfo;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class BillAddRq extends IFXObject {
	protected BillAddRq(){	
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
	public final native BillInfo getBillInfo() /*-{
		return $wnd.cleanObject(billInfo);
	}-*/;
	public final native void setBillInfo(BillInfo billInfo) /*-{
		this.billInfo = billInfo;
	}-*/;
	
}