package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardOrderKeys;
import ong.eu.soon.ifx.element.CardOrderStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardOrderStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CardOrderKeys cardOrderKeys;	 //	Aggregate	 Required	 Card Order Keys Aggregate
	CardOrderStatus cardOrderStatus;	 //	Aggregate	 Required	 Card Order Status Aggregate
	
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
	public CardOrderKeys getCardOrderKeys() {
		return cardOrderKeys;
	}
	public void setCardOrderKeys(CardOrderKeys cardOrderKeys) {
		this.cardOrderKeys = cardOrderKeys;
	}
	public CardOrderStatus getCardOrderStatus() {
		return cardOrderStatus;
	}
	public void setCardOrderStatus(CardOrderStatus cardOrderStatus) {
		this.cardOrderStatus = cardOrderStatus;
	}
	
}
