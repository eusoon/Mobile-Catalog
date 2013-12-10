package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DeliveryInstruction extends IFXObject {
	DeliveryMethod deliveryMethod;//Open Enum	Optional Delivery Method Valid values include: Channel, Courier, Email, Fax, HomeBank, InPerson, LocalPrinter, OverNight, Phone, Post, SMS, TwoDay, UPS, URL
	DeliveryMedia deliveryMedia;//	Open Enum		Optional	Delivery Media	Valid values include: CD, Diskette, DVD, Paper Default Value: Paper
	DeliveryDestination deliveryDestination;//Open Enum	Optional	Delivery destination	Valid values include: AlternateAddress, Branch, ChildAcct, Consumer, ParentAcct, ParentChildAcct. Default Value: Consumer
	Locator locator;//	Abstract Aggregate	Optional The Locator is the delivery destination. It is most commonly a postal address and takes precedence over the Locator information in Contact. Valid Aggregates are: Email, PhoneNum,PostAddr
	Contact Contact; //Aggregate	Optional Contact
	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public DeliveryMedia getDeliveryMedia() {
		return deliveryMedia;
	}
	public void setDeliveryMedia(DeliveryMedia deliveryMedia) {
		this.deliveryMedia = deliveryMedia;
	}
	public DeliveryDestination getDeliveryDestination() {
		return deliveryDestination;
	}
	public void setDeliveryDestination(DeliveryDestination deliveryDestination) {
		this.deliveryDestination = deliveryDestination;
	}
	public Locator getLocator() {
		return locator;
	}
	public void setLocator(Locator locator) {
		this.locator = locator;
	}
	public Contact getContact() {
		return Contact;
	}
	public void setContact(Contact contact) {
		Contact = contact;
	}

}