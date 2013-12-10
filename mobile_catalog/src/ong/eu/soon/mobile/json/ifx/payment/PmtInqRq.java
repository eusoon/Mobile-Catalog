package ong.eu.soon.mobile.json.ifx.payment;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DocCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PmtSel;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RecSelect;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;



public class PmtInqRq extends IFXObject {
	protected PmtInqRq(){	
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
	public final native  DocCtrlIn getDocCtrlIn()/*-{
		return $wnd.cleanObject(this.docCtrlIn);
	}-*/;
	public final native  void setDocCtrlIn(DocCtrlIn docCtrlIn)/*-{
		this.docCtrlIn = docCtrlIn;
	}-*/;
	public final native  RecCtrlIn getRecCtrlIn()/*-{
		return $wnd.cleanObject(this.recCtrlIn);
	}-*/;
	public final native  void setRecCtrlIn(RecCtrlIn recCtrlIn)/*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native  JsArray<PmtSel> getPmtSel()/*-{
		return $wnd.cleanObject(this.pmtSel);
	}-*/;
	public final native  void setPmtSel(JsArray<PmtSel> pmtSel)/*-{
		this.pmtSel = pmtSel;
	}-*/;
	public final native  JsArray<RecSelect> getRecSelect()/*-{
		return $wnd.cleanObject(this.recSelect);
	}-*/;
	public final native  void setRecSelect(JsArray<RecSelect> recSelect)/*-{
		this.recSelect = recSelect;
	}-*/;
}
