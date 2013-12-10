package ong.eu.soon.mobile.json.ifx.transfer;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DocCtrlOut;
import ong.eu.soon.mobile.json.ifx.element.MsgRsHdr;
import ong.eu.soon.mobile.json.ifx.element.NewElements;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlOut;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;
import ong.eu.soon.mobile.json.ifx.element.XferRec;

import com.google.gwt.core.client.JsArray;


public class XferInqRs extends IFXObject {
	protected XferInqRs(){	
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
	public final native  DocCtrlOut getDocCtrlOut()/*-{
		return $wnd.cleanObject(this.docCtrlOut);
	}-*/;
	public final native  void setDocCtrlOut(DocCtrlOut docCtrlOut)/*-{
		this.docCtrlOut = docCtrlOut;
	}-*/;
	public final native  RecCtrlOut getRecCtrlOut()/*-{
		return $wnd.cleanObject(this.recCtrlOut);
	}-*/;
	public final native  void setRecCtrlOut(RecCtrlOut recCtrlOut)/*-{
		this.recCtrlOut = recCtrlOut;
	}-*/;
	public final native  JsArray<XferRec> getXferRec()/*-{
		return $wnd.cleanObject(this.xferRec);
	}-*/;
	public final native  void setXferRec(JsArray<XferRec> xferRec)/*-{
		this.xferRec = xferRec;
	}-*/;

}
