package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctSel;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RecSelect;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;


public class AcctStatusInqRq extends IFXObject {
	
	protected AcctStatusInqRq(){	
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

	public final native RecCtrlIn getRecCtrlIn() /*-{
		return $wnd.cleanObject(this.recCtrlIn);
	}-*/;
	public final native void setRecCtrlIn(RecCtrlIn recCtrlIn) /*-{
		this.recCtrlIn = recCtrlIn;
	}-*/;
	public final native JsArray<AcctSel> getAcctSel() /*-{
		return $wnd.cleanObject(this.acctSel);
	}-*/;
	public final native void setAcctSel(JsArray<AcctSel> acctSel) /*-{
		this.acctSel = acctSel;
	}-*/;
	public final native JsArray<RecSelect> getRecSelect() /*-{
		return $wnd.cleanObject(this.recSelect);
	}-*/;
	public final native void setRecSelect(JsArray<RecSelect> recSelect) /*-{
		this.recSelect = recSelect;
	}-*/;
	
}