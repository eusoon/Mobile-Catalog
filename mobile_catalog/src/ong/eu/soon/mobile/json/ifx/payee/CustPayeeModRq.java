package ong.eu.soon.mobile.json.ifx.payee;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeInfo;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeKeys;
import ong.eu.soon.mobile.json.ifx.element.DelElements;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.NewElements;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.UpdElements;

import com.google.gwt.core.client.JsArray;


public class CustPayeeModRq extends IFXObject {
	protected CustPayeeModRq(){	
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
	public final native CustPayeeKeys getCustPayeeKeys() /*-{
		return $wnd.cleanObject(custPayeeKeys);
	}-*/;
	public final native void setCustPayeeKeys(CustPayeeKeys custPayeeKeys) /*-{
		this.custPayeeKeys = custPayeeKeys;
	}-*/;
	public final native CustPayeeInfo getCustPayeeInfo() /*-{
		return $wnd.cleanObject(custPayeeInfo);
	}-*/;
	public final native void setCustPayeeInfo(CustPayeeInfo custPayeeInfo) /*-{
		this.custPayeeInfo = custPayeeInfo;
	}-*/;
	public final native JsArray<DelElements> getDelElements() /*-{
		return $wnd.cleanObject(delElements);
	}-*/;
	public final native void setDelElements(JsArray<DelElements> delElements) /*-{
		this.delElements = delElements;
	}-*/;
	public final native JsArray<UpdElements> getUpdElements() /*-{
		return $wnd.cleanObject(UpdElements);
	}-*/;
	public final native void setUpdElements(JsArray<UpdElements> updElements) /*-{
		UpdElements = updElements;
	}-*/;
	public final native JsArray<NewElements> getNewElements() /*-{
		return $wnd.cleanObject(NewElements);
	}-*/;
	public final native void setNewElements(JsArray<NewElements> newElements) /*-{
		NewElements = newElements;
	}-*/;
}