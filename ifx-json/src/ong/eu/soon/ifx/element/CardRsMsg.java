package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.card.CardAddRs;
import ong.eu.soon.ifx.card.CardAdviseRs;
import ong.eu.soon.ifx.card.CardAuthInqRs;
import ong.eu.soon.ifx.card.CardAuthModRs;
import ong.eu.soon.ifx.card.CardDelRs;
import ong.eu.soon.ifx.card.CardInqRs;
import ong.eu.soon.ifx.card.CardModRs;
import ong.eu.soon.ifx.card.CardRevRs;
import ong.eu.soon.ifx.card.CardStatusInqRs;
import ong.eu.soon.ifx.card.CardStatusModRs;

public class CardRsMsg extends IFXObject {

	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin-xor	Required
	CardAddRs cardAddRs;	 //	Aggregate	 Required	 Card Add Response
	CardModRs cardModRs;	 //	Aggregate	 Required	 Card Modify Response
	CardDelRs cardDelRs;	 //	Aggregate	 Required	 Card Delete Response
	CardRevRs cardRevRs;	 //	Aggregate	 Required	 Card Reversal Response
	CardInqRs cardInqRs;	 //	Aggregate	 Required	 Card Inquiry Response
	CardAdviseRs cardAdviseRs;	 //	Aggregate	 Required	 Card Advise Response
	CardStatusModRs cardStatusModRs;	 //	Aggregate	 Required	 Card Status Modify Response
	CardStatusInqRs cardStatusInqRs;	 //	Aggregate	 Required	 Card Status Inquiry Response
	CardAuthModRs cardAuthModRs;	 //	Aggregate	 Required	 Card Authorizatino Modify Response
	CardAuthInqRs cardAuthInqRs;	 //	Aggregate	 Required	 Card Authorization Inquiry Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public CardAddRs getCardAddRs() {
		return cardAddRs;
	}
	public void setCardAddRs(CardAddRs cardAddRs) {
		this.cardAddRs = cardAddRs;
	}
	public CardModRs getCardModRs() {
		return cardModRs;
	}
	public void setCardModRs(CardModRs cardModRs) {
		this.cardModRs = cardModRs;
	}
	public CardDelRs getCardDelRs() {
		return cardDelRs;
	}
	public void setCardDelRs(CardDelRs cardDelRs) {
		this.cardDelRs = cardDelRs;
	}
	public CardRevRs getCardRevRs() {
		return cardRevRs;
	}
	public void setCardRevRs(CardRevRs cardRevRs) {
		this.cardRevRs = cardRevRs;
	}
	public CardInqRs getCardInqRs() {
		return cardInqRs;
	}
	public void setCardInqRs(CardInqRs cardInqRs) {
		this.cardInqRs = cardInqRs;
	}
	public CardAdviseRs getCardAdviseRs() {
		return cardAdviseRs;
	}
	public void setCardAdviseRs(CardAdviseRs cardAdviseRs) {
		this.cardAdviseRs = cardAdviseRs;
	}
	public CardStatusModRs getCardStatusModRs() {
		return cardStatusModRs;
	}
	public void setCardStatusModRs(CardStatusModRs cardStatusModRs) {
		this.cardStatusModRs = cardStatusModRs;
	}
	public CardStatusInqRs getCardStatusInqRs() {
		return cardStatusInqRs;
	}
	public void setCardStatusInqRs(CardStatusInqRs cardStatusInqRs) {
		this.cardStatusInqRs = cardStatusInqRs;
	}
	public CardAuthModRs getCardAuthModRs() {
		return cardAuthModRs;
	}
	public void setCardAuthModRs(CardAuthModRs cardAuthModRs) {
		this.cardAuthModRs = cardAuthModRs;
	}
	public CardAuthInqRs getCardAuthInqRs() {
		return cardAuthInqRs;
	}
	public void setCardAuthInqRs(CardAuthInqRs cardAuthInqRs) {
		this.cardAuthInqRs = cardAuthInqRs;
	}
	
}
