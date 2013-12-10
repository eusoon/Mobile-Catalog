package ong.eu.soon.mobile.json.ifx.payee;

import ong.eu.soon.mobile.json.ifx.element.CustPayeeKeys;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class CustPayeeSyncRq {
	protected CustPayeeSyncRq(){	
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
	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native CustPayeeKeys getCustPayeeKeys() /*-{
		return $wnd.cleanObject(custPayeeKeys);
	}-*/;
	public final native void setCustPayeeKeys(CustPayeeKeys custPayeeKeys) /*-{
		this.custPayeeKeys = custPayeeKeys;
	}-*/;
}