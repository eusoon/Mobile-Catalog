package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAcctRelKeys;
import ong.eu.soon.ifx.element.CardAcctRelStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardAcctRelStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CardAcctRelKeys cardAcctRelKeys;	 //	Aggregate	 Required	 Card Account Relationship Keys Aggregate
	CardAcctRelStatus cardAcctRelStatus;	 //	Aggregate	 Required	 Card Accountt Relationship Status Aggregate
	
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
	public CardAcctRelKeys getCardAcctRelKeys() {
		return cardAcctRelKeys;
	}
	public void setCardAcctRelKeys(CardAcctRelKeys cardAcctRelKeys) {
		this.cardAcctRelKeys = cardAcctRelKeys;
	}
	public CardAcctRelStatus getCardAcctRelStatus() {
		return cardAcctRelStatus;
	}
	public void setCardAcctRelStatus(CardAcctRelStatus cardAcctRelStatus) {
		this.cardAcctRelStatus = cardAcctRelStatus;
	}
	
}
