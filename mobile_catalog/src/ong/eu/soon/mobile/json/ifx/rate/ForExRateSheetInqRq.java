package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DocCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.ForExRateSheetSel;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RecSelect;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class ForExRateSheetInqRq extends IFXObject{
	protected ForExRateSheetInqRq(){	
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
	public final native DocCtrlIn getDocCtrlIn() /*-{
		return $wnd.cleanObject(this.docCtrlIn);
	}-*/;
	public final native void setDocCtrlIn(DocCtrlIn docCtrlIn) /*-{
		this.docCtrlIn = docCtrlIn;
	}-*/;
	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(this.recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native ForExRateSheetSel getForExRateSheetSel() /*-{
		return $wnd.cleanObject(this.forExRateSheetSel);
	}-*/;
	public final native void setForExRateSheetSel(ForExRateSheetSel forExRateSheetSel) /*-{
		this.forExRateSheetSel = forExRateSheetSel;
	}-*/;
	public final native RecSelect getRecSelect() /*-{
		return $wnd.cleanObject(this.recSelect);
	}-*/;
	public final native void setRecSelect(RecSelect recSelect) /*-{
		this.recSelect = recSelect;
	}-*/;
	
}