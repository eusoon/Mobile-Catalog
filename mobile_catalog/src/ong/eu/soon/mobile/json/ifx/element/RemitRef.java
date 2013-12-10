package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RemitRef extends IFXObject {
	protected RemitRef(){	
	}
	public final native RemitKeys getRemitKeys() /*-{
		return $wnd.cleanObject(remitKeys);
	}-*/;
	public final native void setRemitKeys(RemitKeys remitKeys) /*-{
		this.remitKeys = remitKeys;
	}-*/;
	public final native RemitRec getRemitRec() /*-{
		return $wnd.cleanObject(remitRec);
	}-*/;
	public final native void setRemitRec(RemitRec remitRec) /*-{
		this.remitRec = remitRec;
	}-*/;
	public final native RemitInfo getRemitInfo() /*-{
		return $wnd.cleanObject(remitInfo);
	}-*/;
	public final native void setRemitInfo(RemitInfo remitInfo) /*-{
		this.remitInfo = remitInfo;
	}-*/;
}