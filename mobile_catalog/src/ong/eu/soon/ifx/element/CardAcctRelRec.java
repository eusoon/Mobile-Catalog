package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardAcctRelRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	CardAcctRelId cardAcctRelId;	 //	Identifier	 Required	 Card Accountt Relationship Identifier
	CardAcctRelInfo cardAcctRelInfo;	 //	Aggregate	 Required	 Card Accountt Relationship Information Aggregate
	CardAcctRelEnvr cardAcctRelEnvr;	 //	Aggregate	 Optional	 Card Account Relationship Environment Aggregate
	CardAcctRelStatus cardAcctRelStatus;	 //	Aggregate	 Required	 Card Accountt Relationship Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CardAcctRelId getCardAcctRelId() {
		return cardAcctRelId;
	}
	public void setCardAcctRelId(CardAcctRelId cardAcctRelId) {
		this.cardAcctRelId = cardAcctRelId;
	}
	public CardAcctRelInfo getCardAcctRelInfo() {
		return cardAcctRelInfo;
	}
	public void setCardAcctRelInfo(CardAcctRelInfo cardAcctRelInfo) {
		this.cardAcctRelInfo = cardAcctRelInfo;
	}
	public CardAcctRelEnvr getCardAcctRelEnvr() {
		return cardAcctRelEnvr;
	}
	public void setCardAcctRelEnvr(CardAcctRelEnvr cardAcctRelEnvr) {
		this.cardAcctRelEnvr = cardAcctRelEnvr;
	}
	public CardAcctRelStatus getCardAcctRelStatus() {
		return cardAcctRelStatus;
	}
	public void setCardAcctRelStatus(CardAcctRelStatus cardAcctRelStatus) {
		this.cardAcctRelStatus = cardAcctRelStatus;
	}
	
}
