package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class MsgAuthCode extends IFXObject {
	protected MsgAuthCode(){	
	}
	public final native MacValue getMacValue() /*-{
		return $wnd.cleanObject(macValue);
	}-*/;
	public final native void setMacValue(MacValue macValue) /*-{
		this.macValue = macValue;
	}-*/;
	public final native MacVariant getMacVariant() /*-{
		return $wnd.cleanObject(MacVariant);
	}-*/;
	public final native void setMacVariant(MacVariant macVariant) /*-{
		MacVariant = macVariant;
	}-*/;
	public final native SecObjId getSecObjId() /*-{
		return $wnd.cleanObject(SecObjId);
	}-*/;
	public final native void setSecObjId(SecObjId secObjId) /*-{
		SecObjId = secObjId;
	}-*/;
}