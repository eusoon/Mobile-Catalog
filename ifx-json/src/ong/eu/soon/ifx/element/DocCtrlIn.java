package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DocCtrlIn extends IFXObject {
	DeliveryInstruction deliveryInstruction;//Aggregate	Optional Delivery Instruction
	PageCountLimit PageCountLimit;//Aggregate	Optional PageCount Limit Aggregate
	public DeliveryInstruction getDeliveryInstruction() {
		return deliveryInstruction;
	}
	public void setDeliveryInstruction(DeliveryInstruction deliveryInstruction) {
		this.deliveryInstruction = deliveryInstruction;
	}
	public PageCountLimit getPageCountLimit() {
		return PageCountLimit;
	}
	public void setPageCountLimit(PageCountLimit pageCountLimit) {
		PageCountLimit = pageCountLimit;
	}

}
