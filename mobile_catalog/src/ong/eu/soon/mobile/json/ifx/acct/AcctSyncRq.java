package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;


public class AcctSyncRq {
	
	protected AcctSyncRq(){	
	}
	
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRqHdr getMsgRqHdr() /*-{
		return $wnd.cleanObject(this.msgRqHdr);
	}-*/;
	public final native void setMsgRqHdr(MsgRqHdr msgRqHdr) /*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(this.recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native JsArray<AcctKeys> getAcctKeys() /*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native void setAcctKeys(JsArray<AcctKeys> acctKeys) /*-{
		this.acctKeys = acctKeys;
	}-*/;

}