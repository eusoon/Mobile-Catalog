package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardRec;
import ong.eu.soon.ifx.element.CardStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class CardModRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	CardRec cardRec;	 //	Aggregate	 Required	 Card Record
	CardStatusRec cardStatusRec;	 //	Aggregate	 Required	 Card Status Record
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
	public CardRec getCardRec() {
		return cardRec;
	}
	public void setCardRec(CardRec cardRec) {
		this.cardRec = cardRec;
	}
	public CardStatusRec getCardStatusRec() {
		return cardStatusRec;
	}
	public void setCardStatusRec(CardStatusRec cardStatusRec) {
		this.cardStatusRec = cardStatusRec;
	}
	
}
