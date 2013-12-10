package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.ForExDealRec;
import ong.eu.soon.mobile.json.ifx.element.ForExDealStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class ForExDealCanRs extends IFXObject{
	protected ForExDealCanRs(){	
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
	public final native ForExDealRec getForExDealRec() /*-{
		return $wnd.cleanObject(this.forExDealRec);
	}-*/;
	public final native void setForExDealRec(ForExDealRec forExDealRec) /*-{
		this.forExDealRec = forExDealRec;
	}-*/;
	public final native ForExDealStatusRec getForExDealStatusRec() /*-{
		return $wnd.cleanObject(this.forExDealStatusRec);
	}-*/;
	public final native void setForExDealStatusRec(ForExDealStatusRec forExDealStatusRec) /*-{
		this.forExDealStatusRec = forExDealStatusRec;
	}-*/;
	
}