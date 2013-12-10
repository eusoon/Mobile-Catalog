package ong.eu.soon.mobile.json.ifx.bill;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.BillKeys;
import ong.eu.soon.mobile.json.ifx.element.BillStatus;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class BillStatusModRq extends IFXObject {
	protected BillStatusModRq(){	
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
	public final native BillKeys getBillKeys() /*-{
		return $wnd.cleanObject(billKeys);
	}-*/;
	public final native void setBillKeys(BillKeys billKeys) /*-{
		this.billKeys = billKeys;
	}-*/;
	public final native BillStatus getBillStatus() /*-{
		return $wnd.cleanObject(billStatus);
	}-*/;
	public final native void setBillStatus(BillStatus billStatus) /*-{
		this.billStatus = billStatus;
	}-*/;
}