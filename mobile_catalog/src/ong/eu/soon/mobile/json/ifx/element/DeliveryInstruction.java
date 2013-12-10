package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DeliveryInstruction extends IFXObject {
	
	protected DeliveryInstruction(){
	}
	
	public final native  DeliveryMethod getDeliveryMethod()/*-{
		return $wnd.cleanObject(this.deliveryMethod);
	}-*/;
	public final native  void setDeliveryMethod(DeliveryMethod deliveryMethod)/*-{
		this.deliveryMethod = deliveryMethod;
	}-*/;
	public final native  DeliveryMedia getDeliveryMedia()/*-{
		return $wnd.cleanObject(this.deliveryMedia);
	}-*/;
	public final native  void setDeliveryMedia(DeliveryMedia deliveryMedia)/*-{
		this.deliveryMedia = deliveryMedia;
	}-*/;
	public final native  DeliveryDestination getDeliveryDestination()/*-{
		return $wnd.cleanObject(this.deliveryDestination);
	}-*/;
	public final native  void setDeliveryDestination(DeliveryDestination deliveryDestination)/*-{
		this.deliveryDestination = deliveryDestination;
	}-*/;
	public final native  Locator getLocator()/*-{
		return $wnd.cleanObject(this.locator);
	}-*/;
	public final native  void setLocator(Locator locator)/*-{
		this.locator = locator;
	}-*/;
	public final native  Contact getContact()/*-{
		return $wnd.cleanObject(this.Contact);
	}-*/;
	public final native  void setContact(Contact contact)/*-{
		Contact = contact;
	}-*/;

}
