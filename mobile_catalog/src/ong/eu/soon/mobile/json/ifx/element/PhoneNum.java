package ong.eu.soon.mobile.json.ifx.element;

public class PhoneNum extends Locator {
	protected PhoneNum(){	
	}
	public final native PhoneType getPhoneType() /*-{
		return $wnd.cleanObject(phoneType);
	}-*/;
	public final native void setPhoneType(PhoneType phoneType) /*-{
		this.phoneType = phoneType;
	}-*/;
	public final native Phone getPhone() /*-{
		return $wnd.cleanObject(phone);
	}-*/;
	public final native void setPhone(Phone phone) /*-{
		this.phone = phone;
	}-*/;

}