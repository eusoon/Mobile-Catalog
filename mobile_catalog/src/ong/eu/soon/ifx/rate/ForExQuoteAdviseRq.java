package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExQuoteRec;
import ong.eu.soon.ifx.element.ForExQuoteStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExQuoteAdviseRq extends IFXObject{

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	//begin-xor	Required
	ForExQuoteRec forExQuoteRec; //Aggregate	Required	Foreign Exchange Quote Record
	ForExQuoteStatusRec forExQuoteStatusRec; //Aggregate	Required	Foreign Exchange Quote Status Record
	//end-xor
	
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRqHdr getMsgRqHdr() {
		return msgRqHdr;
	}
	public void setMsgRqHdr(MsgRqHdr msgRqHdr) {
		this.msgRqHdr = msgRqHdr;
	}
	public ForExQuoteRec getForExQuoteRec() {
		return forExQuoteRec;
	}
	public void setForExQuoteRec(ForExQuoteRec forExQuoteRec) {
		this.forExQuoteRec = forExQuoteRec;
	}
	public ForExQuoteStatusRec getForExQuoteStatusRec() {
		return forExQuoteStatusRec;
	}
	public void setForExQuoteStatusRec(ForExQuoteStatusRec forExQuoteStatusRec) {
		this.forExQuoteStatusRec = forExQuoteStatusRec;
	}

}
