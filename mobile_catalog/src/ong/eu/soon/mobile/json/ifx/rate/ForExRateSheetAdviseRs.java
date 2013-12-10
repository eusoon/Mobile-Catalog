package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.ForExRateSheetRec;
import ong.eu.soon.mobile.json.ifx.element.ForExRateSheetStatusRec;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

public class ForExRateSheetAdviseRs extends IFXObject {
	protected ForExRateSheetAdviseRs(){	
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