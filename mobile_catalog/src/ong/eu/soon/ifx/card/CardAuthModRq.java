package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAuth;
import ong.eu.soon.ifx.element.CardKeys;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CardAuthModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CardKeys cardKeys;	 //	Aggregate	 Optional	 Card Keys Aggregate
	CardAuth cardAuth;	 //	Aggregate	 Required	 Card Authentication Aggregate
	
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
	public CardKeys getCardKeys() {
		return cardKeys;
	}
	public void setCardKeys(CardKeys cardKeys) {
		this.cardKeys = cardKeys;
	}
	public CardAuth getCardAuth() {
		return cardAuth;
	}
	public void setCardAuth(CardAuth cardAuth) {
		this.cardAuth = cardAuth;
	}
	
}
