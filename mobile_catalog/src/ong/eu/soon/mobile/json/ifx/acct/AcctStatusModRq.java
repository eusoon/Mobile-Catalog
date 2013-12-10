package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.AcctStatus;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class AcctStatusModRq extends IFXObject {
	
	protected AcctStatusModRq(){	
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
	public final native AcctKeys getAcctKeys() /*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native void setAcctKeys(AcctKeys acctKeys) /*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native AcctStatus getAcctStatus() /*-{
		return $wnd.cleanObject(this.acctStatus);
	}-*/;
	public final native void setAcctStatus(AcctStatus acctStatus) /*-{
		this.acctStatus = acctStatus;
	}-*/;

	
}