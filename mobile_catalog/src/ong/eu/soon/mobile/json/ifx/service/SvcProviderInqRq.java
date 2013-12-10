package ong.eu.soon.mobile.json.ifx.service;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DocCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RecSelect;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.SvcProviderSel;

import com.google.gwt.core.client.JsArray;


public class SvcProviderInqRq extends IFXObject {
	protected SvcProviderInqRq(){	
	}
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRqHdr getMsgRqHdr() /*-{
		return $wnd.cleanObject(msgRqHdr);
	}-*/;
	public final native void setMsgRqHdr(MsgRqHdr msgRqHdr) /*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native DocCtrlIn getDocCtrlIn() /*-{
		return $wnd.cleanObject(docCtrlIn);
	}-*/;
	public final native void setDocCtrlIn(DocCtrlIn docCtrlIn) /*-{
		this.docCtrlIn = docCtrlIn;
	}-*/;
	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native JsArray<SvcProviderSel> getSvcProviderSel() /*-{
		return $wnd.cleanObject(svcProviderSel);
	}-*/;
	public final native void setSvcProviderSel(JsArray<SvcProviderSel> svcProviderSel) /*-{
		this.svcProviderSel = svcProviderSel;
	}-*/;
	public final native JsArray<RecSelect> getRecSelect() /*-{
		return $wnd.cleanObject(recSelect);
	}-*/;
	public final native void setRecSelect(JsArray<RecSelect> recSelect) /*-{
		this.recSelect = recSelect;
	}-*/;
}