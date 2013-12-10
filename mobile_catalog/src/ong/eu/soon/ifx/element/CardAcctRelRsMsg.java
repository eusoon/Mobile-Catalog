package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.card.CardAcctRelAddRs;
import ong.eu.soon.ifx.card.CardAcctRelAdviseRs;
import ong.eu.soon.ifx.card.CardAcctRelDelRs;
import ong.eu.soon.ifx.card.CardAcctRelInqRs;
import ong.eu.soon.ifx.card.CardAcctRelModRs;
import ong.eu.soon.ifx.card.CardAcctRelRevRs;
import ong.eu.soon.ifx.card.CardAcctRelStatusInqRs;
import ong.eu.soon.ifx.card.CardAcctRelStatusModRs;

public class CardAcctRelRsMsg extends IFXObject {

	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin-xor	Required
	CardAcctRelAddRs cardAcctRelAddRs;	 //	Aggregate	 Required	 Card Account Relationship Add Response
	CardAcctRelModRs cardAcctRelModRs;	 //	Aggregate	 Required	 Card Account Relationship Modify Response
	CardAcctRelDelRs cardAcctRelDelRs;	 //	Aggregate	 Required	 Card Account Relationship Delete Response
	CardAcctRelRevRs cardAcctRelRevRs;	 //	Aggregate	 Required	 Card Account Relationship Reversal Response
	CardAcctRelInqRs cardAcctRelInqRs;	 //	Aggregate	 Required	 Card Account Relationship Inquiry Response
	CardAcctRelAdviseRs cardAcctRelAdviseRs;	 //	Aggregate	 Required	 Card Account Relationship Advise Response
	CardAcctRelStatusModRs cardAcctRelStatusModRs;	 //	Aggregate	 Required	 Card Account Relationship Status Modify Response
	CardAcctRelStatusInqRs cardAcctRelStatusInqRs;	 //	Aggregate	 Required	 Card Account Relationship Status Inquiry Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public CardAcctRelAddRs getCardAcctRelAddRs() {
		return cardAcctRelAddRs;
	}
	public void setCardAcctRelAddRs(CardAcctRelAddRs cardAcctRelAddRs) {
		this.cardAcctRelAddRs = cardAcctRelAddRs;
	}
	public CardAcctRelModRs getCardAcctRelModRs() {
		return cardAcctRelModRs;
	}
	public void setCardAcctRelModRs(CardAcctRelModRs cardAcctRelModRs) {
		this.cardAcctRelModRs = cardAcctRelModRs;
	}
	public CardAcctRelDelRs getCardAcctRelDelRs() {
		return cardAcctRelDelRs;
	}
	public void setCardAcctRelDelRs(CardAcctRelDelRs cardAcctRelDelRs) {
		this.cardAcctRelDelRs = cardAcctRelDelRs;
	}
	public CardAcctRelRevRs getCardAcctRelRevRs() {
		return cardAcctRelRevRs;
	}
	public void setCardAcctRelRevRs(CardAcctRelRevRs cardAcctRelRevRs) {
		this.cardAcctRelRevRs = cardAcctRelRevRs;
	}
	public CardAcctRelInqRs getCardAcctRelInqRs() {
		return cardAcctRelInqRs;
	}
	public void setCardAcctRelInqRs(CardAcctRelInqRs cardAcctRelInqRs) {
		this.cardAcctRelInqRs = cardAcctRelInqRs;
	}
	public CardAcctRelAdviseRs getCardAcctRelAdviseRs() {
		return cardAcctRelAdviseRs;
	}
	public void setCardAcctRelAdviseRs(CardAcctRelAdviseRs cardAcctRelAdviseRs) {
		this.cardAcctRelAdviseRs = cardAcctRelAdviseRs;
	}
	public CardAcctRelStatusModRs getCardAcctRelStatusModRs() {
		return cardAcctRelStatusModRs;
	}
	public void setCardAcctRelStatusModRs(
			CardAcctRelStatusModRs cardAcctRelStatusModRs) {
		this.cardAcctRelStatusModRs = cardAcctRelStatusModRs;
	}
	public CardAcctRelStatusInqRs getCardAcctRelStatusInqRs() {
		return cardAcctRelStatusInqRs;
	}
	public void setCardAcctRelStatusInqRs(
			CardAcctRelStatusInqRs cardAcctRelStatusInqRs) {
		this.cardAcctRelStatusInqRs = cardAcctRelStatusInqRs;
	}
	
}
