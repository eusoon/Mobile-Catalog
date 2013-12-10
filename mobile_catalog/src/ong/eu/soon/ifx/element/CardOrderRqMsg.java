package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.card.CardOrderAddRq;
import ong.eu.soon.ifx.card.CardOrderAdviseRq;
import ong.eu.soon.ifx.card.CardOrderAudRq;
import ong.eu.soon.ifx.card.CardOrderCanRq;
import ong.eu.soon.ifx.card.CardOrderInqRq;
import ong.eu.soon.ifx.card.CardOrderModRq;
import ong.eu.soon.ifx.card.CardOrderStatusInqRq;
import ong.eu.soon.ifx.card.CardOrderStatusModRq;
import ong.eu.soon.ifx.card.CardOrderSyncRq;

public class CardOrderRqMsg extends IFXObject {

	//begin-xor	Required
	CardOrderAddRq cardOrderAddRq;	 //	Aggregate	 Required	 Card Order Add Message
	CardOrderModRq cardOrderModRq;	 //	Aggregate	 Required	 Card Order Modify Request
	CardOrderCanRq cardOrderCanRq;	 //	Aggregate	 Required	 Card Order Cancel Request
	CardOrderInqRq cardOrderInqRq;	 //	Aggregate	 Required	 Card Order Inquiry Request
	CardOrderAdviseRq cardOrderAdviseRq;	 //	Aggregate	 Required	 Card Order Advise Message
	CardOrderAudRq cardOrderAudRq;	 //	Aggregate	 Required	 Card Order Audit Request
	CardOrderSyncRq cardOrderSyncRq;	 //	Aggregate	 Required	 Card Order Sync Request
	CardOrderStatusModRq cardOrderStatusModRq;	 //	Aggregate	 Required	 Card Order Status Modify Request
	CardOrderStatusInqRq cardOrderStatusInqRq;	 //	Aggregate	 Required	 Card Order Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public CardOrderAddRq getCardOrderAddRq() {
		return cardOrderAddRq;
	}
	public void setCardOrderAddRq(CardOrderAddRq cardOrderAddRq) {
		this.cardOrderAddRq = cardOrderAddRq;
	}
	public CardOrderModRq getCardOrderModRq() {
		return cardOrderModRq;
	}
	public void setCardOrderModRq(CardOrderModRq cardOrderModRq) {
		this.cardOrderModRq = cardOrderModRq;
	}
	public CardOrderCanRq getCardOrderCanRq() {
		return cardOrderCanRq;
	}
	public void setCardOrderCanRq(CardOrderCanRq cardOrderCanRq) {
		this.cardOrderCanRq = cardOrderCanRq;
	}
	public CardOrderInqRq getCardOrderInqRq() {
		return cardOrderInqRq;
	}
	public void setCardOrderInqRq(CardOrderInqRq cardOrderInqRq) {
		this.cardOrderInqRq = cardOrderInqRq;
	}
	public CardOrderAdviseRq getCardOrderAdviseRq() {
		return cardOrderAdviseRq;
	}
	public void setCardOrderAdviseRq(CardOrderAdviseRq cardOrderAdviseRq) {
		this.cardOrderAdviseRq = cardOrderAdviseRq;
	}
	public CardOrderAudRq getCardOrderAudRq() {
		return cardOrderAudRq;
	}
	public void setCardOrderAudRq(CardOrderAudRq cardOrderAudRq) {
		this.cardOrderAudRq = cardOrderAudRq;
	}
	public CardOrderSyncRq getCardOrderSyncRq() {
		return cardOrderSyncRq;
	}
	public void setCardOrderSyncRq(CardOrderSyncRq cardOrderSyncRq) {
		this.cardOrderSyncRq = cardOrderSyncRq;
	}
	public CardOrderStatusModRq getCardOrderStatusModRq() {
		return cardOrderStatusModRq;
	}
	public void setCardOrderStatusModRq(CardOrderStatusModRq cardOrderStatusModRq) {
		this.cardOrderStatusModRq = cardOrderStatusModRq;
	}
	public CardOrderStatusInqRq getCardOrderStatusInqRq() {
		return cardOrderStatusInqRq;
	}
	public void setCardOrderStatusInqRq(CardOrderStatusInqRq cardOrderStatusInqRq) {
		this.cardOrderStatusInqRq = cardOrderStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
