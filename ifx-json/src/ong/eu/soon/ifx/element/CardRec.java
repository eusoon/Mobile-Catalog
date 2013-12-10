package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	CardId cardId;	 //	Identifier	 Required	 Card Identifier
	CardInfo cardInfo;	 //	Aggregate	 Required	 Card Information Aggregate
	CardEnvr cardEnvr;	 //	Aggregate	 Optional	 Card Environment Aggregate
	CardAuth cardAuth;	 //	Aggregate	 Optional	 Card Authentication Aggregate
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
	public CardInfo getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}
	public CardEnvr getCardEnvr() {
		return cardEnvr;
	}
	public void setCardEnvr(CardEnvr cardEnvr) {
		this.cardEnvr = cardEnvr;
	}
	public CardAuth getCardAuth() {
		return cardAuth;
	}
	public void setCardAuth(CardAuth cardAuth) {
		this.cardAuth = cardAuth;
	}
	public CardStatus getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(CardStatus cardStatus) {
		this.cardStatus = cardStatus;
	}
	
	
}
