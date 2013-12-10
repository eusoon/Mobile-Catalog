package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class POSSecurity extends IFXObject {
	protected POSSecurity(){	
	}
	public final native PSSNetworkType getpSSNetworkType() /*-{
		return $wnd.cleanObject(pSSNetworkType);
	}-*/;
	public final native void setpSSNetworkType(PSSNetworkType pSSNetworkType) /*-{
		this.pSSNetworkType = pSSNetworkType;
	}-*/;
	public final native JsArray<PSSMsgMAC> getpSSMsgMAC() /*-{
		return $wnd.cleanObject(pSSMsgMAC);
	}-*/;
	public final native void setpSSMsgMAC(JsArray<PSSMsgMAC> pSSMsgMAC) /*-{
		this.pSSMsgMAC = pSSMsgMAC;
	}-*/;
	public final native JsArray<PSSMsgEncryption> getpSSMsgEncryption() /*-{
		return $wnd.cleanObject(pSSMsgEncryption);
	}-*/;
	public final native void setpSSMsgEncryption(JsArray<PSSMsgEncryption> pSSMsgEncryption) /*-{
		this.pSSMsgEncryption = pSSMsgEncryption;
	}-*/;
	public final native PSSCATSecLevel getpSSCATSecLevel() /*-{
		return $wnd.cleanObject(pSSCATSecLevel);
	}-*/;
	public final native void setpSSCATSecLevel(PSSCATSecLevel pSSCATSecLevel) /*-{
		this.pSSCATSecLevel = pSSCATSecLevel;
	}-*/;
}
