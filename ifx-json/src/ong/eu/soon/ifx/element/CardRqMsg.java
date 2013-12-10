package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.card.CardAddRq;
import ong.eu.soon.ifx.card.CardAdviseRq;
import ong.eu.soon.ifx.card.CardAudRq;
import ong.eu.soon.ifx.card.CardAuthInqRq;
import ong.eu.soon.ifx.card.CardAuthModRq;
import ong.eu.soon.ifx.card.CardDelRq;
import ong.eu.soon.ifx.card.CardInqRq;
import ong.eu.soon.ifx.card.CardModRq;
import ong.eu.soon.ifx.card.CardStatusInqRq;
import ong.eu.soon.ifx.card.CardStatusModRq;
import ong.eu.soon.ifx.card.CardSyncRq;

public class CardRqMsg extends IFXObject {

	//begin-xor	Required
	CardAddRq cardAddRq;	 //	Aggregate	 Required	 Card Add Message
	CardModRq cardModRq;	 //	Aggregate	 Required	 Card Modify Request
	CardDelRq cardDelRq;	 //	Aggregate	 Required	 Card Delete Request
	CardInqRq cardInqRq;	 //	Aggregate	 Required	 Card Inquiry Request
	CardAdviseRq cardAdviseRq;	 //	Aggregate	 Required	 Card Advise Message
	CardAudRq cardAudRq;	 //	Aggregate	 Required	 Card Audit Request
	CardSyncRq cardSyncRq;	 //	Aggregate	 Required	 Card Sync Request
	CardStatusModRq cardStatusModRq;	 //	Aggregate	 Required	 Card Status Modify Request
	CardStatusInqRq cardStatusInqRq;	 //	Aggregate	 Required	 Card Status Inquiry Request
	CardAuthModRq cardAuthModRq;	 //	Aggregate	 Required	 Card Authorization Modify Request
	CardAuthInqRq cardAuthInqRq;	 //	Aggregate	 Required	 Card Authorization Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public CardAddRq getCardAddRq() {
		return cardAddRq;
	}
	public void setCardAddRq(CardAddRq cardAddRq) {
		this.cardAddRq = cardAddRq;
	}
	public CardModRq getCardModRq() {
		return cardModRq;
	}
	public void setCardModRq(CardModRq cardModRq) {
		this.cardModRq = cardModRq;
	}
	public CardDelRq getCardDelRq() {
		return cardDelRq;
	}
	public void setCardDelRq(CardDelRq cardDelRq) {
		this.cardDelRq = cardDelRq;
	}
	public CardInqRq getCardInqRq() {
		return cardInqRq;
	}
	public void setCardInqRq(CardInqRq cardInqRq) {
		this.cardInqRq = cardInqRq;
	}
	public CardAdviseRq getCardAdviseRq() {
		return cardAdviseRq;
	}
	public void setCardAdviseRq(CardAdviseRq cardAdviseRq) {
		this.cardAdviseRq = cardAdviseRq;
	}
	public CardAudRq getCardAudRq() {
		return cardAudRq;
	}
	public void setCardAudRq(CardAudRq cardAudRq) {
		this.cardAudRq = cardAudRq;
	}
	public CardSyncRq getCardSyncRq() {
		return cardSyncRq;
	}
	public void setCardSyncRq(CardSyncRq cardSyncRq) {
		this.cardSyncRq = cardSyncRq;
	}
	public CardStatusModRq getCardStatusModRq() {
		return cardStatusModRq;
	}
	public void setCardStatusModRq(CardStatusModRq cardStatusModRq) {
		this.cardStatusModRq = cardStatusModRq;
	}
	public CardStatusInqRq getCardStatusInqRq() {
		return cardStatusInqRq;
	}
	public void setCardStatusInqRq(CardStatusInqRq cardStatusInqRq) {
		this.cardStatusInqRq = cardStatusInqRq;
	}
	public CardAuthModRq getCardAuthModRq() {
		return cardAuthModRq;
	}
	public void setCardAuthModRq(CardAuthModRq cardAuthModRq) {
		this.cardAuthModRq = cardAuthModRq;
	}
	public CardAuthInqRq getCardAuthInqRq() {
		return cardAuthInqRq;
	}
	public void setCardAuthInqRq(CardAuthInqRq cardAuthInqRq) {
		this.cardAuthInqRq = cardAuthInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
}