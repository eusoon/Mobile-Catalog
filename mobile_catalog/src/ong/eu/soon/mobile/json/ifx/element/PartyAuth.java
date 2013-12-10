package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PartyAuth extends IFXObject {
	protected PartyAuth(){	
	}
	public final native JsArray<SecToken> getSecToken() /*-{
		return $wnd.cleanObject(secToken);
	}-*/;

	public final native void setSecToken(JsArray<SecToken> secToken) /*-{
		this.secToken = secToken;
	}-*/;
}
