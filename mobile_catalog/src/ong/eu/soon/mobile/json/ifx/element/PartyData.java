package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PartyData extends IFXObject {
	protected PartyData(){	
	}
	public final native JsArray<Contact> getContact() /*-{
		return $wnd.cleanObject(contact);
	}-*/;
	public final native void setContact(JsArray<Contact> contact) /*-{
		this.contact = contact;
	}-*/;
	public final native JsArray<IssuedIdent> getIssuedIdent() /*-{
		return $wnd.cleanObject(issuedIdent);
	}-*/;
	public final native void setIssuedIdent(JsArray<IssuedIdent> issuedIdent) /*-{
		this.issuedIdent = issuedIdent;
	}-*/;

}