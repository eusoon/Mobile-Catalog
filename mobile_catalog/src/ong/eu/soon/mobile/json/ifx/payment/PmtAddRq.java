package ong.eu.soon.mobile.json.ifx.payment;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PmtInfo;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class PmtAddRq extends IFXObject {
	protected PmtAddRq(){	
	}
	public final native  RqUID getRqUID()/*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native  void setRqUID(RqUID rqUID)/*-{
		this.rqUID = rqUID;
	}-*/;
	public final native  MsgRqHdr getMsgRqHdr()/*-{
		return $wnd.cleanObject(this.msgRqHdr);
	}-*/;
	public final native  void setMsgRqHdr(MsgRqHdr msgRqHdr)/*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native  PmtInfo getPmtInfo()/*-{
		return $wnd.cleanObject(this.pmtInfo);
	}-*/;
	public final native  void setPmtInfo(PmtInfo pmtInfo)/*-{
		this.pmtInfo = pmtInfo;
	}-*/;
}
