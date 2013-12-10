package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.ForExQuoteRec;
import ong.eu.soon.mobile.json.ifx.element.ForExQuoteStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class ForExQuoteAdviseRq extends IFXObject{
	protected ForExQuoteAdviseRq(){	
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