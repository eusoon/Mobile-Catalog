package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExDealRec;
import ong.eu.soon.ifx.element.ForExDealStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class ForExDealAdviseRs extends IFXObject {
	
	//begin-block	Required
	Status status; //Aggregate	Optional	Response Status
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRsHdr msgRsHdr; //Aggregate	Optional	Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	ForExDealRec forExDealRec; //Aggregate	Required	Foreign Exchange Deal Record
	ForExDealStatusRec forExDealStatusRec; //Aggregate	Required	ForExDealStatusRec
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
	public ForExDealRec getForExDealRec() {
		return forExDealRec;
	}
	public void setForExDealRec(ForExDealRec forExDealRec) {
		this.forExDealRec = forExDealRec;
	}
	public ForExDealStatusRec getForExDealStatusRec() {
		return forExDealStatusRec;
	}
	public void setForExDealStatusRec(ForExDealStatusRec forExDealStatusRec) {
		this.forExDealStatusRec = forExDealStatusRec;
	}

}
