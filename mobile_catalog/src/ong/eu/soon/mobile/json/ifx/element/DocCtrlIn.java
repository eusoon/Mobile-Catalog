package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DocCtrlIn extends IFXObject {
	
	protected DocCtrlIn(){
	}
	
	public final native  DeliveryInstruction getDeliveryInstruction()/*-{
		return $wnd.cleanObject(this.deliveryInstruction);
	}-*/;
	public final native  void setDeliveryInstruction(DeliveryInstruction deliveryInstruction)/*-{
		this.deliveryInstruction = deliveryInstruction;
	}-*/;
	public final native  PageCountLimit getPageCountLimit()/*-{
		return $wnd.cleanObject(this.PageCountLimit);
	}-*/;
	public final native  void setPageCountLimit(PageCountLimit pageCountLimit)/*-{
		PageCountLimit = pageCountLimit;
	}-*/;

}
