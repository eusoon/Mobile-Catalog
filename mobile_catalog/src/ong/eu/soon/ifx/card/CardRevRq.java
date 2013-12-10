package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardRqMsg;
import ong.eu.soon.ifx.element.Desc;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RevReasonCode;
import ong.eu.soon.ifx.element.RqUID;

public class CardRevRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	RevReasonCode revReasonCode;	 //	Aggregate	 Required	 Reversal Reason Code
	Desc desc;	 //	C-80	 Optional	 Description
	CardRqMsg cardRqMsg;	 //	Aggregate	 Required	 Card Request Messages Aggregate
	
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
	public RevReasonCode getRevReasonCode() {
		return revReasonCode;
	}
	public void setRevReasonCode(RevReasonCode revReasonCode) {
		this.revReasonCode = revReasonCode;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public CardRqMsg getCardRqMsg() {
		return cardRqMsg;
	}
	public void setCardRqMsg(CardRqMsg cardRqMsg) {
		this.cardRqMsg = cardRqMsg;
	}
	
}
