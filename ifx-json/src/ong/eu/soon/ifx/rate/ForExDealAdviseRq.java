package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExDealRec;
import ong.eu.soon.ifx.element.ForExDealStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExDealAdviseRq extends IFXObject {
	
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	//begin-xor	Required
	ForExDealRec forExDealRec; //Aggregate	Required	Foreign Exchange Deal Record
	ForExDealStatusRec forExDealStatusRec; //Aggregate	Required	ForExDealStatusRec
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
