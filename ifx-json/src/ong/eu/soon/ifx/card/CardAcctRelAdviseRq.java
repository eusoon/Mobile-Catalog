package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAcctRelRec;
import ong.eu.soon.ifx.element.CardAcctRelStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardAcctRelAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	CardAcctRelRec cardAcctRelRec;	 //	Aggregate	 Required	 Card Accountt Relationship Record
	CardAcctRelStatusRec cardAcctRelStatusRec;	 //	Aggregate	 Required	 Card Accountt Relationship Status Record
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
