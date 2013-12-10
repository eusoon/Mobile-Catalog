package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.card.CardAcctRelAddRq;
import ong.eu.soon.ifx.card.CardAcctRelAdviseRq;
import ong.eu.soon.ifx.card.CardAcctRelAudRq;
import ong.eu.soon.ifx.card.CardAcctRelDelRq;
import ong.eu.soon.ifx.card.CardAcctRelInqRq;
import ong.eu.soon.ifx.card.CardAcctRelModRq;
import ong.eu.soon.ifx.card.CardAcctRelStatusInqRq;
import ong.eu.soon.ifx.card.CardAcctRelStatusModRq;
import ong.eu.soon.ifx.card.CardAcctRelSyncRq;

public class CardAcctRelRqMsg extends IFXObject {

	//begin-xor	Required
	CardAcctRelAddRq cardAcctRelAddRq;	 //	Aggregate	 Required	 Card Account Relationship Add Message
	CardAcctRelModRq cardAcctRelModRq;	 //	Aggregate	 Required	 Card Account Relationship Modify Request
	CardAcctRelDelRq cardAcctRelDelRq;	 //	Aggregate	 Required	 Card Account Relationship Delete Request
	CardAcctRelInqRq cardAcctRelInqRq;	 //	Aggregate	 Required	 Card Account Relationship Inquiry Request
	CardAcctRelAdviseRq cardAcctRelAdviseRq;	 //	Aggregate	 Required	 Card Account Relationship Advise Message
	CardAcctRelAudRq cardAcctRelAudRq;	 //	Aggregate	 Required	 Card Account Relationship Audit Request
	CardAcctRelSyncRq cardAcctRelSyncRq;	 //	Aggregate	 Required	 Card Account Relationship Sync Request
	CardAcctRelStatusModRq cardAcctRelStatusModRq;	 //	Aggregate	 Required	 Card Account Relationship Status Modify Request
	CardAcctRelStatusInqRq cardAcctRelStatusInqRq;	 //	Aggregate	 Required	 Card Account Relationship Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public CardAcctRelAddRq getCardAcctRelAddRq() {
		return cardAcctRelAddRq;
	}
	public void setCardAcctRelAddRq(CardAcctRelAddRq cardAcctRelAddRq) {
		this.cardAcctRelAddRq = cardAcctRelAddRq;
	}
	public CardAcctRelModRq getCardAcctRelModRq() {
		return cardAcctRelModRq;
	}
	public void setCardAcctRelModRq(CardAcctRelModRq cardAcctRelModRq) {
		this.cardAcctRelModRq = cardAcctRelModRq;
	}
	public CardAcctRelDelRq getCardAcctRelDelRq() {
		return cardAcctRelDelRq;
	}
	public void setCardAcctRelDelRq(CardAcctRelDelRq cardAcctRelDelRq) {
		this.cardAcctRelDelRq = cardAcctRelDelRq;
	}
	public CardAcctRelInqRq getCardAcctRelInqRq() {
		return cardAcctRelInqRq;
	}
	public void setCardAcctRelInqRq(CardAcctRelInqRq cardAcctRelInqRq) {
		this.cardAcctRelInqRq = cardAcctRelInqRq;
	}
	public CardAcctRelAdviseRq getCardAcctRelAdviseRq() {
		return cardAcctRelAdviseRq;
	}
	public void setCardAcctRelAdviseRq(CardAcctRelAdviseRq cardAcctRelAdviseRq) {
		this.cardAcctRelAdviseRq = cardAcctRelAdviseRq;
	}
	public CardAcctRelAudRq getCardAcctRelAudRq() {
		return cardAcctRelAudRq;
	}
	public void setCardAcctRelAudRq(CardAcctRelAudRq cardAcctRelAudRq) {
		this.cardAcctRelAudRq = cardAcctRelAudRq;
	}
	public CardAcctRelSyncRq getCardAcctRelSyncRq() {
		return cardAcctRelSyncRq;
	}
	public void setCardAcctRelSyncRq(CardAcctRelSyncRq cardAcctRelSyncRq) {
		this.cardAcctRelSyncRq = cardAcctRelSyncRq;
	}
	public CardAcctRelStatusModRq getCardAcctRelStatusModRq() {
		return cardAcctRelStatusModRq;
	}
	public void setCardAcctRelStatusModRq(
			CardAcctRelStatusModRq cardAcctRelStatusModRq) {
		this.cardAcctRelStatusModRq = cardAcctRelStatusModRq;
	}
	public CardAcctRelStatusInqRq getCardAcctRelStatusInqRq() {
		return cardAcctRelStatusInqRq;
	}
	public void setCardAcctRelStatusInqRq(
			CardAcctRelStatusInqRq cardAcctRelStatusInqRq) {
		this.cardAcctRelStatusInqRq = cardAcctRelStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
