package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAcctRelInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardAcctRelAddRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CardAcctRelInfo cardAcctRelInfo;	 //	Aggregate	 Required	 Card Accountt Relationship Information Aggregate
	
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
	public CardAcctRelInfo getCardAcctRelInfo() {
		return cardAcctRelInfo;
	}
	public void setCardAcctRelInfo(CardAcctRelInfo cardAcctRelInfo) {
		this.cardAcctRelInfo = cardAcctRelInfo;
	}

}
