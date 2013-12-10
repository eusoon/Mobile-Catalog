package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PartySel;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RecSelect;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;


public class PartyStatusInqRq extends IFXObject {
	protected PartyStatusInqRq(){	
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
	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native JsArray<PartySel> getPartySel() /*-{
		return $wnd.cleanObject(partySel);
	}-*/;
	public final native void setPartySel(JsArray<PartySel> partySel) /*-{
		this.partySel = partySel;
	}-*/;
	public final native JsArray<RecSelect> getRecSelect() /*-{
		return $wnd.cleanObject(recSelect);
	}-*/;
	public final native void setRecSelect(JsArray<RecSelect> recSelect) /*-{
		this.recSelect = recSelect;
	}-*/;
}
