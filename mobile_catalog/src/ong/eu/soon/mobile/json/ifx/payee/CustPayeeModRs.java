package ong.eu.soon.mobile.json.ifx.payee;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeRec;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class CustPayeeModRs extends IFXObject {
	protected CustPayeeModRs(){	
	}
	public final native Status getStatus() /*-{
		return $wnd.cleanObject(status);
	}-*/;
	public final native void setStatus(Status status) /*-{
		this.status = status;
	}-*/;
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRsHdr getMsgRsHdr() /*-{
		return $wnd.cleanObject(msgRsHdr);
	}-*/;
	public final native void setMsgRsHdr(MsgRsHdr msgRsHdr) /*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;
	public final native CustPayeeRec getCustPayeeRec() /*-{
		return $wnd.cleanObject(custPayeeRec);
	}-*/;
	public final native void setCustPayeeRec(CustPayeeRec custPayeeRec) /*-{
		this.custPayeeRec = custPayeeRec;
	}-*/;
	public final native CustPayeeStatusRec getCustPayeeStatusRec() /*-{
		return $wnd.cleanObject(custPayeeStatusRec);
	}-*/;
	public final native void setCustPayeeStatusRec(CustPayeeStatusRec custPayeeStatusRec) /*-{
		this.custPayeeStatusRec = custPayeeStatusRec;
	}-*/;
	
	
	
}