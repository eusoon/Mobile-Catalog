package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class SvcProviderInfo extends IFXObject {
	protected SvcProviderInfo(){	
	}
	public final native SvcProviderName getSvcProviderName() /*-{
		return $wnd.cleanObject(SvcProviderName);
	}-*/;
	public final native void setSvcProviderName(SvcProviderName svcProviderName) /*-{
		SvcProviderName = svcProviderName;
	}-*/;
	public final native LegalName getLegalName() /*-{
		return $wnd.cleanObject(LegalName);
	}-*/;
	public final native void setLegalName(LegalName legalName) /*-{
		LegalName = legalName;
	}-*/;
	public final native HoldCoIdent getHoldCoIdent() /*-{
		return $wnd.cleanObject(HoldCoIdent);
	}-*/;
	public final native void setHoldCoIdent(HoldCoIdent holdCoIdent) /*-{
		HoldCoIdent = holdCoIdent;
	}-*/;
	public final native JsArray<Contact> getContact() /*-{
		return $wnd.cleanObject(Contact);
	}-*/;
	public final native void setContact(JsArray<Contact> contact) /*-{
		Contact = contact;
	}-*/;
	public final native JsArray<SvcRef> getSvcRef() /*-{
		return $wnd.cleanObject(svcRef);
	}-*/;
	public final native void setSvcRef(JsArray<SvcRef> svcRef) /*-{
		this.svcRef = svcRef;
	}-*/;
	public final native JsArray<SvcStatusDt> getSvcStatusDt() /*-{
		return $wnd.cleanObject(svcStatusDt);
	}-*/;
	public final native void setSvcStatusDt(JsArray<SvcStatusDt> svcStatusDt) /*-{
		this.svcStatusDt = svcStatusDt;
	}-*/;

}
