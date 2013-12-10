package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.OperRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExDealAddOperRq extends IFXObject {
	
	RqUID rqUID; //UUID	Required	Request Identifier
	OperRqHdr operRqHdr; //Aggregate	Required	Operation Request Header
	ForExDealAddRq[] forExDealAddRq; //Aggregate	Required Repeating	Foreign Exchange Deal Status Add Request
	
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public OperRqHdr getOperRqHdr() {
		return operRqHdr;
	}
	public void setOperRqHdr(OperRqHdr operRqHdr) {
		this.operRqHdr = operRqHdr;
	}
	public ForExDealAddRq[] getForExDealAddRq() {
		return forExDealAddRq;
	}
	public void setForExDealAddRq(ForExDealAddRq[] forExDealAddRq) {
		this.forExDealAddRq = forExDealAddRq;
	}
}