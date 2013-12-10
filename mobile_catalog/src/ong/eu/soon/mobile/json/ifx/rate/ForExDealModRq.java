package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DelElements;
import ong.eu.soon.mobile.json.ifx.element.ForExDealInfo;
import ong.eu.soon.mobile.json.ifx.element.ForExDealKeys;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.NewElements;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.UpdElements;

import com.google.gwt.core.client.JsArray;


public class ForExDealModRq extends IFXObject {
	protected ForExDealModRq(){	
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
	public final native ForExDealKeys getForExDealKeys() /*-{
		return $wnd.cleanObject(this.forExDealKeys);
	}-*/;
	public final native void setForExDealKeys(ForExDealKeys forExDealKeys) /*-{
		this.forExDealKeys = forExDealKeys;
	}-*/;
	public final native JsArray<ForExDealInfo> getForExDealInfo() /*-{
		return $wnd.cleanObject(this.forExDealInfo);
	}-*/;
	public final native void setForExDealInfo(JsArray<ForExDealInfo> forExDealInfo) /*-{
		this.forExDealInfo = forExDealInfo;
	}-*/;
	public final native JsArray<DelElements> getDelElements() /*-{
		return $wnd.cleanObject(this.delElements);
	}-*/;
	public final native void setDelElements(JsArray<DelElements> delElements) /*-{
		this.delElements = delElements;
	}-*/;
	public final native JsArray<UpdElements> getUpdElements() /*-{
		return $wnd.cleanObject(this.updElements);
	}-*/;
	public final native void setUpdElements(JsArray<UpdElements> updElements) /*-{
		this.updElements = updElements;
	}-*/;
	public final native JsArray<NewElements> getNewElements() /*-{
		return $wnd.cleanObject(this.newElements);
	}-*/;
	public final native void setNewElements(JsArray<NewElements> newElements) /*-{
		this.newElements = newElements;
	}-*/;
	
}