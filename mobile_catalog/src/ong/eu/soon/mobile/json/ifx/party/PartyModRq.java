package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.DelElements;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.NewElements;
import ong.eu.soon.mobile.json.ifx.element.PartyInfo;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.UpdElements;

import com.google.gwt.core.client.JsArray;


public class PartyModRq extends IFXObject {
	protected PartyModRq(){	
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
	public final native PartyKeys getPartyKeys() /*-{
		return $wnd.cleanObject(partyKeys);
	}-*/;
	public final native void setPartyKeys(PartyKeys partyKeys) /*-{
		this.partyKeys = partyKeys;
	}-*/;
	public final native JsArray<PartyInfo> getPartyInfo() /*-{
		return $wnd.cleanObject(partyInfo);
	}-*/;
	public final native void setPartyInfo(JsArray<PartyInfo> partyInfo) /*-{
		this.partyInfo = partyInfo;
	}-*/;
	public final native JsArray<DelElements> getDelElements() /*-{
		return $wnd.cleanObject(delElements);
	}-*/;
	public final native void setDelElements(JsArray<DelElements> delElements) /*-{
		this.delElements = delElements;
	}-*/;
	public final native JsArray<UpdElements> getUpdElements() /*-{
		return $wnd.cleanObject(updElements);
	}-*/;
	public final native void setUpdElements(JsArray<UpdElements> updElements) /*-{
		this.updElements = updElements;
	}-*/;
	public final native JsArray<NewElements> getNewElements() /*-{
		return $wnd.cleanObject(newElements);
	}-*/;
	public final native void setNewElements(JsArray<NewElements> newElements) /*-{
		this.newElements = newElements;
	}-*/;
}
