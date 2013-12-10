package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.ForExDealRec;
import ong.eu.soon.mobile.json.ifx.element.ForExDealStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class ForExDealAdviseRq extends IFXObject{
	protected ForExDealAdviseRq(){	
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