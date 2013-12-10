package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SubjectPswd extends IFXObject {
	protected SubjectPswd(){	
	}
	public final native CryptType getCryptType() /*-{
		return $wnd.cleanObject(cryptType);
	}-*/;
	public final native void setCryptType(CryptType cryptType) /*-{
		this.cryptType = cryptType;
	}-*/;
	public final native SecObjId getSecObjId() /*-{
		return $wnd.cleanObject(secObjId);
	}-*/;
	public final native void setSecObjId(SecObjId secObjId) /*-{
		this.secObjId = secObjId;
	}-*/;
	public final native Pswd getPswd() /*-{
		return $wnd.cleanObject(pswd);
	}-*/;
	public final native void setPswd(Pswd pswd) /*-{
		this.pswd = pswd;
	}-*/;
	public final native CryptPswd getCryptPswd() /*-{
		return $wnd.cleanObject(cryptPswd);
	}-*/;
	public final native void setCryptPswd(CryptPswd cryptPswd) /*-{
		this.cryptPswd = cryptPswd;
	}-*/;

}