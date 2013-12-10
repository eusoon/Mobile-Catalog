package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class OperRsHdr extends IFXObject {
	protected OperRsHdr(){	
	}
	public final native AsyncRqUID getAsyncRqUID() /*-{
		return $wnd.cleanObject(asyncRqUID);
	}-*/;
	public final native void setAsyncRqUID(AsyncRqUID asyncRqUID) /*-{
		this.asyncRqUID = asyncRqUID;
	}-*/;
	public final native AsyncRsData getAsyncRsData() /*-{
		return $wnd.cleanObject(asyncRsData);
	}-*/;
	public final native void setAsyncRsData(AsyncRsData asyncRsData) /*-{
		this.asyncRsData = asyncRsData;
	}-*/;
	public final native JsArray<CredentialsRsHdr> getCredentialsRsHdr() /*-{
		return $wnd.cleanObject(credentialsRsHdr);
	}-*/;
	public final native void setCredentialsRsHdr(JsArray<CredentialsRsHdr> credentialsRsHdr) /*-{
		this.credentialsRsHdr = credentialsRsHdr;
	}-*/;
	public final native ContextRsHdr getContextRsHdr() /*-{
		return $wnd.cleanObject(contextRsHdr);
	}-*/;
	public final native void setContextRsHdr(ContextRsHdr contextRsHdr) /*-{
		this.contextRsHdr = contextRsHdr;
	}-*/;
	public final native JsArray<FeeRsHdr> getFeeRsHdr() /*-{
		return $wnd.cleanObject(feeRsHdr);
	}-*/;
	public final native void setFeeRsHdr(JsArray<FeeRsHdr> feeRsHdr) /*-{
		this.feeRsHdr = feeRsHdr;
	}-*/;
	public final native CardUpdateRsHdr getCardUpdateRsHdr() /*-{
		return $wnd.cleanObject(cardUpdateRsHdr);
	}-*/;
	public final native void setCardUpdateRsHdr(CardUpdateRsHdr cardUpdateRsHdr) /*-{
		this.cardUpdateRsHdr = cardUpdateRsHdr;
	}-*/;

}
