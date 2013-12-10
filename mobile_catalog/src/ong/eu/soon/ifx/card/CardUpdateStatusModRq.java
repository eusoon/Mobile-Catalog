package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardUpdateKeys;
import ong.eu.soon.ifx.element.CardUpdateStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardUpdateStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CardUpdateKeys cardUpdateKeys;	 //	Aggregate	 Required	  
	CardUpdateStatus cardUpdateStatus;	 //	Abstract Aggregate	 Required	 Card Update Status AggregateValid Aggregates are:ICCUpdateStatusMagCardUpdateStatus
	
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
	public CardUpdateKeys getCardUpdateKeys() {
		return cardUpdateKeys;
	}
	public void setCardUpdateKeys(CardUpdateKeys cardUpdateKeys) {
		this.cardUpdateKeys = cardUpdateKeys;
	}
	public CardUpdateStatus getCardUpdateStatus() {
		return cardUpdateStatus;
	}
	public void setCardUpdateStatus(CardUpdateStatus cardUpdateStatus) {
		this.cardUpdateStatus = cardUpdateStatus;
	}
	
}
