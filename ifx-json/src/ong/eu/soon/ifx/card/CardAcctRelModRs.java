package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAcctRelRec;
import ong.eu.soon.ifx.element.CardAcctRelStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class CardAcctRelModRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	CardAcctRelRec cardAcctRelRec;	 //	Aggregate	 Required	 Card Accountt Relationship Record
	CardAcctRelStatusRec cardAcctRelStatusRec;	 //	Aggregate	 Required	 Card Accountt Relationship Status Record
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
	public CardAcctRelRec getCardAcctRelRec() {
		return cardAcctRelRec;
	}
	public void setCardAcctRelRec(CardAcctRelRec cardAcctRelRec) {
		this.cardAcctRelRec = cardAcctRelRec;
	}
	public CardAcctRelStatusRec getCardAcctRelStatusRec() {
		return cardAcctRelStatusRec;
	}
	public void setCardAcctRelStatusRec(CardAcctRelStatusRec cardAcctRelStatusRec) {
		this.cardAcctRelStatusRec = cardAcctRelStatusRec;
	}
	
}
