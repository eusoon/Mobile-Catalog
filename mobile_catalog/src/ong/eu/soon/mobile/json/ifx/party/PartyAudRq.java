package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DtRange;
import ong.eu.soon.mobile.json.ifx.element.Method;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.RecCtrlIn;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;



public class PartyAudRq extends IFXObject {
	protected PartyAudRq(){	
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
	public final native DtRange getDtRange() /*-{
		return $wnd.cleanObject(dtRange);
	}-*/;
	public final native void setDtRange(DtRange dtRange) /*-{
		this.dtRange = dtRange;
	}-*/;
	public final native JsArray<Method> getMethod() /*-{
		return $wnd.cleanObject(method);
	}-*/;
	public final native void setMethod(JsArray<Method> method) /*-{
		this.method = method;
	}-*/;
	public final native JsArray<PartyKeys> getPartyKeys() /*-{
		return $wnd.cleanObject(partyKeys);
	}-*/;
	public final native void setPartyKeys(JsArray<PartyKeys> partyKeys) /*-{
		this.partyKeys = partyKeys;
	}-*/;
}
