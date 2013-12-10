package ong.eu.soon.mobile.json.ifx.element;

import com.google.gwt.core.client.JsArray;

public class SecTokenSecretAnswer extends SecToken {

	protected SecTokenSecretAnswer(){	
	}
	
	public final native SecretIdent getSecretIdent() /*-{
		return $wnd.cleanObject(secretIdent);
	}-*/;
	public final native void setSecretIdent(SecretIdent secretIdent) /*-{
		this.secretIdent = secretIdent;
	}-*/;
	public final native CryptType getCryptType() /*-{
		return $wnd.cleanObject(cryptType);
	}-*/;
	public final native void setCryptType(CryptType cryptType) /*-{
		this.cryptType = cryptType;
	}-*/;
	public final native JsArray<SecObjId> getSecObjId() /*-{
		return $wnd.cleanObject(secObjId);
	}-*/;
	public final native void setSecObjId(JsArray<SecObjId> secObjId) /*-{
		this.secObjId = secObjId;
	}-*/;
	public final native Secret getSecret() /*-{
		return $wnd.cleanObject(secret);
	}-*/;
	public final native void setSecret(Secret secret) /*-{
		this.secret = secret;
	}-*/;
	public final native CryptSecret getCryptSecret() /*-{
		return $wnd.cleanObject(CryptSecret);
	}-*/;
	public final native void setCryptSecret(CryptSecret cryptSecret) /*-{
		CryptSecret = cryptSecret;
	}-*/;
}
