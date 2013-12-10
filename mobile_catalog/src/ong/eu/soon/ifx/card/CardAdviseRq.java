package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAuthRec;
import ong.eu.soon.ifx.element.CardRec;
import ong.eu.soon.ifx.element.CardStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	CardRec cardRec;	 //	Aggregate	 Required	 Card Record
	CardStatusRec cardStatusRec;	 //	Aggregate	 Required	 Card Status Record
	CardAuthRec cardAuthRec;	 //	Aggregate	 Required	 Card Authentication Record
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
	public CardAuthRec getCardAuthRec() {
		return cardAuthRec;
	}
	public void setCardAuthRec(CardAuthRec cardAuthRec) {
		this.cardAuthRec = cardAuthRec;
	}
	
}
