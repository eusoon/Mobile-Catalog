package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardStatusRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	CardId cardId;	 //	Identifier	 Required	 Card Identifier
	CardStatus cardStatus;	 //	Aggregate	 Required	 Card Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CardId getCardId() {
		return cardId;
	}
	public void setCardId(CardId cardId) {
		this.cardId = cardId;
	}
	public CardStatus getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(CardStatus cardStatus) {
		this.cardStatus = cardStatus;
	}
	
}
