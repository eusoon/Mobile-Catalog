package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardOrderRec;
import ong.eu.soon.ifx.element.CardOrderStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardOrderAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	CardOrderRec cardOrderRec;	 //	Aggregate	 Required	 Card Order Record
	CardOrderStatusRec cardOrderStatusRec;	 //	Aggregate	 Required	 Card Order Status Record
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
