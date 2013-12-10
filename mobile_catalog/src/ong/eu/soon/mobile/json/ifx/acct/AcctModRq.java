package ong.eu.soon.mobile.json.ifx.acct;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctInfo;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.DelElements;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.NewElements;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.UpdElements;

import com.google.gwt.core.client.JsArray;


public class AcctModRq extends IFXObject {

	protected AcctModRq(){	
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
	public final native AcctKeys getAcctKeys() /*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native void setAcctKeys(AcctKeys acctKeys) /*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native AcctInfo getAcctInfo() /*-{
		return $wnd.cleanObject(this.acctInfo);
	}-*/;
	public final native void setAcctInfo(AcctInfo acctInfo) /*-{
		this.acctInfo = acctInfo;
	}-*/;
	public final native JsArray<DelElements> getDelElements() /*-{
		return $wnd.cleanObject(this.delElements);
	}-*/;
	public final native void setDelElements(JsArray<DelElements> delElements) /*-{
		this.delElements = delElements;
	}-*/;
	public final native JsArray<UpdElements> getUpdElements() /*-{
		return $wnd.cleanObject(this.UpdElements);
	}-*/;
	public final native void setUpdElements(JsArray<UpdElements> updElements) /*-{
		UpdElements = updElements;
	}-*/;
	public final native JsArray<NewElements> getNewElements() /*-{
		return $wnd.cleanObject(this.NewElements);
	}-*/;
	public final native void setNewElements(JsArray<NewElements> newElements) /*-{
		NewElements = newElements;
	}-*/;

	
}