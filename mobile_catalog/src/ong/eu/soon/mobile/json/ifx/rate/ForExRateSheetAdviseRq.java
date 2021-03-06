package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.ForExRateSheetRec;
import ong.eu.soon.mobile.json.ifx.element.ForExRateSheetStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class ForExRateSheetAdviseRq extends IFXObject {
	protected ForExRateSheetAdviseRq(){	
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
	public final native ForExRateSheetRec getForExRateSheetRec() /*-{
		return $wnd.cleanObject(this.forExRateSheetRec);
	}-*/;
	public final native void setForExRateSheetRec(ForExRateSheetRec forExRateSheetRec) /*-{
		this.forExRateSheetRec = forExRateSheetRec;
	}-*/;
	public final native ForExRateSheetStatusRec getForExRateSheetStatusRec() /*-{
		return $wnd.cleanObject(this.forExRateSheetStatusRec);
	}-*/;
	public final native void setForExRateSheetStatusRec(
			ForExRateSheetStatusRec forExRateSheetStatusRec) /*-{
		this.forExRateSheetStatusRec = forExRateSheetStatusRec;
	}-*/;
	
}