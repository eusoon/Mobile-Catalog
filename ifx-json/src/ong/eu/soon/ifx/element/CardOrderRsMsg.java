package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.card.CardOrderAddRs;
import ong.eu.soon.ifx.card.CardOrderAdviseRs;
import ong.eu.soon.ifx.card.CardOrderCanRs;
import ong.eu.soon.ifx.card.CardOrderInqRs;
import ong.eu.soon.ifx.card.CardOrderModRs;
import ong.eu.soon.ifx.card.CardOrderRevRs;
import ong.eu.soon.ifx.card.CardOrderStatusInqRs;
import ong.eu.soon.ifx.card.CardOrderStatusModRs;

public class CardOrderRsMsg extends IFXObject {

	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin-xor	Required
	CardOrderAddRs cardOrderAddRs;	 //	Aggregate	 Required	 Card Order Add Response
	CardOrderModRs cardOrderModRs;	 //	Aggregate	 Required	 Card Order Modify Response
	CardOrderCanRs cardOrderCanRs;	 //	Aggregate	 Required	 Card Order Cancel Response
	CardOrderRevRs cardOrderRevRs;	 //	Aggregate	 Required	 Card Order Reversal Response
	CardOrderInqRs cardOrderInqRs;	 //	Aggregate	 Required	 Card Order Inquiry Response
	CardOrderAdviseRs cardOrderAdviseRs;	 //	Aggregate	 Required	 Card Order Advise Response
	CardOrderStatusModRs cardOrderStatusModRs;	 //	Aggregate	 Required	 Card Order Status Modify Response
	CardOrderStatusInqRs cardOrderStatusInqRs;	 //	Aggregate	 Required	 Card Order Status Inquiry Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public CardOrderAddRs getCardOrderAddRs() {
		return cardOrderAddRs;
	}
	public void setCardOrderAddRs(CardOrderAddRs cardOrderAddRs) {
		this.cardOrderAddRs = cardOrderAddRs;
	}
	public CardOrderModRs getCardOrderModRs() {
		return cardOrderModRs;
	}
	public void setCardOrderModRs(CardOrderModRs cardOrderModRs) {
		this.cardOrderModRs = cardOrderModRs;
	}
	public CardOrderCanRs getCardOrderCanRs() {
		return cardOrderCanRs;
	}
	public void setCardOrderCanRs(CardOrderCanRs cardOrderCanRs) {
		this.cardOrderCanRs = cardOrderCanRs;
	}
	public CardOrderRevRs getCardOrderRevRs() {
		return cardOrderRevRs;
	}
	public void setCardOrderRevRs(CardOrderRevRs cardOrderRevRs) {
		this.cardOrderRevRs = cardOrderRevRs;
	}
	public CardOrderInqRs getCardOrderInqRs() {
		return cardOrderInqRs;
	}
	public void setCardOrderInqRs(CardOrderInqRs cardOrderInqRs) {
		this.cardOrderInqRs = cardOrderInqRs;
	}
	public CardOrderAdviseRs getCardOrderAdviseRs() {
		return cardOrderAdviseRs;
	}
	public void setCardOrderAdviseRs(CardOrderAdviseRs cardOrderAdviseRs) {
		this.cardOrderAdviseRs = cardOrderAdviseRs;
	}
	public CardOrderStatusModRs getCardOrderStatusModRs() {
		return cardOrderStatusModRs;
	}
	public void setCardOrderStatusModRs(CardOrderStatusModRs cardOrderStatusModRs) {
		this.cardOrderStatusModRs = cardOrderStatusModRs;
	}
	public CardOrderStatusInqRs getCardOrderStatusInqRs() {
		return cardOrderStatusInqRs;
	}
	public void setCardOrderStatusInqRs(CardOrderStatusInqRs cardOrderStatusInqRs) {
		this.cardOrderStatusInqRs = cardOrderStatusInqRs;
	}

}
