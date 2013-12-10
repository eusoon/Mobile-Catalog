package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctRqMsg;
import ong.eu.soon.mobile.json.ifx.element.Desc;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RevReasonCode;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class AcctRevRq extends IFXObject {

	protected AcctRevRq(){	
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
	public final native RevReasonCode getRevReasonCode() /*-{
		return $wnd.cleanObject(this.revReasonCode);
	}-*/;
	public final native void setRevReasonCode(RevReasonCode revReasonCode) /*-{
		this.revReasonCode = revReasonCode;
	}-*/;
	public final native Desc getDesc() /*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native void setDesc(Desc desc) /*-{
		this.desc = desc;
	}-*/;
	public final native AcctRqMsg getAcctRqMsg() /*-{
		return $wnd.cleanObject(this.acctRqMsg);
	}-*/;
	public final native void setAcctRqMsg(AcctRqMsg acctRqMsg) /*-{
		this.acctRqMsg = acctRqMsg;
	}-*/;
}