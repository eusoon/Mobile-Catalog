package ong.eu.soon.ifx.element;



public class PhoneNum extends Locator {
	PhoneType phoneType;
	Phone phone;
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
