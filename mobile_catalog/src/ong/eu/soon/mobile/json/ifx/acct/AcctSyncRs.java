package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctRsMsg;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlOut;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

import com.google.gwt.core.client.JsArray;


public class AcctSyncRs extends IFXObject {
	
	protected AcctSyncRs(){	
	}
	
	public final native Status getStatus() /*-{
		return $wnd.cleanObject(this.status);
	}-*/;
	public final native void setStatus(Status status) /*-{
		this.status = status;
	}-*/;
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRsHdr getMsgRsHdr() /*-{
		return $wnd.cleanObject(this.msgRsHdr);
	}-*/;
	public final native void setMsgRsHdr(MsgRsHdr msgRsHdr) /*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;
	public final native RecCtrlOut getRecCtrlOut() /*-{
		return $wnd.cleanObject(this.recCtrlOut);
	}-*/;
	public final native void setRecCtrlOut(RecCtrlOut recCtrlOut) /*-{
		this.recCtrlOut = recCtrlOut;
	}-*/;
	public final native JsArray<AcctRsMsg> getAcctRsMsg() /*-{
		return $wnd.cleanObject(this.acctRsMsg);
	}-*/;
	public final native void setAcctRsMsg(JsArray<AcctRsMsg> acctRsMsg) /*-{
		this.acctRsMsg = acctRsMsg;
	}-*/;
	
}