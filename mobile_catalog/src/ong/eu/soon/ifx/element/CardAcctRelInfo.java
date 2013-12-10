package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardAcctRelInfo extends IFXObject {

	CardRef cardRef;	 //	Aggregate	 Optional	 Card Reference Aggregate
	AcctRef acctRef;	 //	Aggregate	 Optional	 Account Reference Aggregate
	CardAcctPriority cardAcctPriority;	 //	Long	 Required	 Card Account Priority
	Nickname nickname;	 //	C-40	 Optional	 Nickname
	RelEstablishDt relEstablishDt;	 //	DateTime	 Optional	 Relationship Established Date
	CardPref cardPref;	 //	Aggregate	 Optional	 Overrides the preferences in the CardPref in the Card Object.
	
	public CardRef getCardRef() {
		return cardRef;
	}
	public void setCardRef(CardRef cardRef) {
		this.cardRef = cardRef;
	}
	public AcctRef getAcctRef() {
		return acctRef;
	}
	public void setAcctRef(AcctRef acctRef) {
		this.acctRef = acctRef;
	}
	public CardAcctPriority getCardAcctPriority() {
		return cardAcctPriority;
	}
	public void setCardAcctPriority(CardAcctPriority cardAcctPriority) {
		this.cardAcctPriority = cardAcctPriority;
	}
	public Nickname getNickname() {
		return nickname;
	}
	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}
	public RelEstablishDt getRelEstablishDt() {
		return relEstablishDt;
	}
	public void setRelEstablishDt(RelEstablishDt relEstablishDt) {
		this.relEstablishDt = relEstablishDt;
	}
	public CardPref getCardPref() {
		return cardPref;
	}
	public void setCardPref(CardPref cardPref) {
		this.cardPref = cardPref;
	}
	
}
