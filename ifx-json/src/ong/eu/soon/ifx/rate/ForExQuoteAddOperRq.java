package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.OperRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExQuoteAddOperRq extends IFXObject {
	
	RqUID rqUID; //UUID	Required	Request Identifier
	OperRqHdr operRqHdr; //Aggregate	Required	Operation Request Header
	ForExQuoteAddRq[] forExQuoteAddRq; //Aggregate	Required Repeating	Foreign Exchange Quote Add Message
	
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
	public ForExQuoteAddRq[] getForExQuoteAddRq() {
		return forExQuoteAddRq;
	}
	public void setForExQuoteAddRq(ForExQuoteAddRq[] forExQuoteAddRq) {
		this.forExQuoteAddRq = forExQuoteAddRq;
	}

}