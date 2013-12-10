package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.ForExQuoteRec;
import ong.eu.soon.mobile.json.ifx.element.ForExQuoteStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class ForExQuoteModRs extends IFXObject{
	protected ForExQuoteModRs(){	
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
	public final native ForExQuoteRec getForExQuoteRec() /*-{
		return $wnd.cleanObject(this.forExQuoteRec);
	}-*/;
	public final native void setForExQuoteRec(ForExQuoteRec forExQuoteRec) /*-{
		this.forExQuoteRec = forExQuoteRec;
	}-*/;
	public final native ForExQuoteStatusRec getForExQuoteStatusRec() /*-{
		return $wnd.cleanObject(this.forExQuoteStatusRec);
	}-*/;
	public final native void setForExQuoteStatusRec(ForExQuoteStatusRec forExQuoteStatusRec) /*-{
		this.forExQuoteStatusRec = forExQuoteStatusRec;
	}-*/;
	
}