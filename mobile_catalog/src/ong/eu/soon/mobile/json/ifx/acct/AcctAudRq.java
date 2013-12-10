package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.DtRange;
import ong.eu.soon.mobile.json.ifx.element.Method;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class AcctAudRq extends IFXObject {
	
	protected AcctAudRq(){	
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
	public final native DtRange getDtRange() /*-{
		return $wnd.cleanObject(this.dtRange);
	}-*/;
	public final native void setDtRange(DtRange dtRange) /*-{
		this.dtRange = dtRange;
	}-*/;
	public final native Method getMethod() /*-{
		return $wnd.cleanObject(this.method);
	}-*/;
	public final native void setMethod(Method method) /*-{
		this.method = method;
	}-*/;
	public final native AcctKeys getAcctKeys() /*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native void setAcctKeys(AcctKeys acctKeys) /*-{
		this.acctKeys = acctKeys;
	}-*/;


	
}