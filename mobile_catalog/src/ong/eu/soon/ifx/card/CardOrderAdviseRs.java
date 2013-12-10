package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardOrderRec;
import ong.eu.soon.ifx.element.CardOrderStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class CardOrderAdviseRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	CardOrderRec cardOrderRec;	 //	Aggregate	 Required	 Card Order Record
	CardOrderStatusRec cardOrderStatusRec;	 //	Aggregate	 Required	 Card Order Status Record
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
	public CardOrderRec getCardOrderRec() {
		return cardOrderRec;
	}
	public void setCardOrderRec(CardOrderRec cardOrderRec) {
		this.cardOrderRec = cardOrderRec;
	}
	public CardOrderStatusRec getCardOrderStatusRec() {
		return cardOrderStatusRec;
	}
	public void setCardOrderStatusRec(CardOrderStatusRec cardOrderStatusRec) {
		this.cardOrderStatusRec = cardOrderStatusRec;
	}
	
}
