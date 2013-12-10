package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PartySel extends IFXObject {
	protected PartySel(){	
	}
	public final native JsArray<PartyKeys> getPartyKeys() /*-{
		return $wnd.cleanObject(this.partyKeys);
	}-*/;
	public final native void setPartyKeys(JsArray<PartyKeys> partyKeys) /*-{
		this.partyKeys = partyKeys;
	}-*/;
	public final native JsArray<PersonIndicator> getPersonIndicator() /*-{
		return $wnd.cleanObject(this.personIndicator);
	}-*/;
	public final native void setPersonIndicator(JsArray<PersonIndicator> personIndicator) /*-{
		this.personIndicator = personIndicator;
	}-*/;
	public final native JsArray<IssuedIdentValue> getIssuedIdentValue() /*-{
		return $wnd.cleanObject(this.issuedIdentValue);
	}-*/;
	public final native void setIssuedIdentValue(JsArray<IssuedIdentValue> issuedIdentValue) /*-{
		this.issuedIdentValue = issuedIdentValue;
	}-*/;
	public final native JsArray<IssuedIdentType> getIssuedIdentType() /*-{
		return $wnd.cleanObject(this.issuedIdentType);
	}-*/;
	public final native void setIssuedIdentType(JsArray<IssuedIdentType> issuedIdentType) /*-{
		this.issuedIdentType = issuedIdentType;
	}-*/;
	public final native JsArray<FullName> getFullName() /*-{
		return $wnd.cleanObject(this.fullName);
	}-*/;
	public final native void setFullName(JsArray<FullName> fullName) /*-{
		this.fullName = fullName;
	}-*/;
	public final native JsArray<Addr1> getAddr1() /*-{
		return $wnd.cleanObject(this.addr1);
	}-*/;
	public final native void setAddr1(JsArray<Addr1> addr1) /*-{
		this.addr1 = addr1;
	}-*/;
	public final native JsArray<PostalCode> getPostalCode() /*-{
		return $wnd.cleanObject(this.postalCode);
	}-*/;
	public final native void setPostalCode(JsArray<PostalCode> postalCode) /*-{
		this.postalCode = postalCode;
	}-*/;
	public final native JsArray<BirthDt> getBirthDt() /*-{
		return $wnd.cleanObject(this.birthDt);
	}-*/;
	public final native void setBirthDt(JsArray<BirthDt> birthDt) /*-{
		this.birthDt = birthDt;
	}-*/;
	public final native JsArray<Phone> getPhone() /*-{
		return $wnd.cleanObject(this.phone);
	}-*/;
	public final native void setPhone(JsArray<Phone> phone) /*-{
		this.phone = phone;
	}-*/;
	public final native JsArray<EmailAddr> getEmailAddr() /*-{
		return $wnd.cleanObject(this.emailAddr);
	}-*/;
	public final native void setEmailAddr(JsArray<EmailAddr> emailAddr) /*-{
		this.emailAddr = emailAddr;
	}-*/;
	
	
}
