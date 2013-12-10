package ong.eu.soon.mobile.json.ifx.payment;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.PmtRec;
import ong.eu.soon.mobile.json.ifx.element.PmtStatusRec;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;


public class PmtAddRs extends IFXObject {
	protected PmtAddRs(){	
	}
	public final native  Status getStatus()/*-{
		return $wnd.cleanObject(this.status);
	}-*/;

	public final native  void setStatus(Status status)/*-{
		this.status = status;
	}-*/;

	public final native  RqUID getRqUID()/*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;

	public final native  void setRqUID(RqUID rqUID)/*-{
		this.rqUID = rqUID;
	}-*/;

	public final native  MsgRsHdr getMsgRsHdr()/*-{
		return $wnd.cleanObject(this.msgRsHdr);
	}-*/;

	public final native  void setMsgRsHdr(MsgRsHdr msgRsHdr)/*-{
		this.msgRsHdr = msgRsHdr;
	}-*/;

	public final native  PmtRec getPmtRec()/*-{
		return $wnd.cleanObject(this.pmtRec);
	}-*/;

	public final native  void setPmtRec(PmtRec pmtRec)/*-{
		this.pmtRec = pmtRec;
	}-*/;

	public final native  PmtStatusRec getPmtStatusRec()/*-{
		return $wnd.cleanObject(this.pmtStatusRec);
	}-*/;

	public final native  void setPmtStatusRec(PmtStatusRec pmtStatusRec)/*-{
		this.pmtStatusRec = pmtStatusRec;
	}-*/;
}
