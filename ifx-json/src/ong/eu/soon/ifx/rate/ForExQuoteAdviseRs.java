package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExQuoteRec;
import ong.eu.soon.ifx.element.ForExQuoteStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class ForExQuoteAdviseRs extends IFXObject{

	//begin-block	Required
	Status status; //Aggregate	Optional	Response Status
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRsHdr msgRsHdr; //Aggregate	Optional	Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	ForExQuoteRec forExQuoteRec; //Aggregate	Required	Foreign Exchange Quote Record
	ForExQuoteStatusRec forExQuoteStatusRec; //Aggregate	Required	Foreign Exchange Quote Status Record
	//end-xor
	//end-block
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRsHdr getMsgRsHdr() {
		return msgRsHdr;
	}
	public void setMsgRsHdr(MsgRsHdr msgRsHdr) {
		this.msgRsHdr = msgRsHdr;
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
