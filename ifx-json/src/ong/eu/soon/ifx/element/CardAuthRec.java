package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardAuthRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	CardId cardId; //Identifier		Required	Card Identifier
	CardAuth cardAuth; //Aggregate	Required	Card Authentication Aggregate
	
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
	public CardAuth getCardAuth() {
		return cardAuth;
	}
	public void setCardAuth(CardAuth cardAuth) {
		this.cardAuth = cardAuth;
	}

}
