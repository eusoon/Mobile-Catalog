package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class MsgRqHdr extends IFXObject {
	protected MsgRqHdr(){	
	}
	public final native AsyncRqUID getAsyncRqUID() /*-{
		return $wnd.cleanObject(asyncRqUID);
	}-*/;
	public final native void setAsyncRqUID(AsyncRqUID asyncRqUID) /*-{
		this.asyncRqUID = asyncRqUID;
	}-*/;
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native JsArray<CredentialsRqHdr> getCredentialsRqHdr() /*-{
		return $wnd.cleanObject(credentialsRqHdr);
	}-*/;
	public final native void setCredentialsRqHdr(JsArray<CredentialsRqHdr> credentialsRqHdr) /*-{
		this.credentialsRqHdr = credentialsRqHdr;
	}-*/;
	public final native ContextRqHdr getContextRqHdr() /*-{
		return $wnd.cleanObject(contextRqHdr);
	}-*/;
	public final native void setContextRqHdr(ContextRqHdr contextRqHdr) /*-{
		this.contextRqHdr = contextRqHdr;
	}-*/;
	public final native JsArray<FeeRqHdr> getFeeRqHdr() /*-{
		return $wnd.cleanObject(feeRqHdr);
	}-*/;
	public final native void setFeeRqHdr(JsArray<FeeRqHdr> feeRqHdr) /*-{
		this.feeRqHdr = feeRqHdr;
	}-*/;
}
