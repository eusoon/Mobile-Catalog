package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardRef extends IFXObject {
	//begin -xor
	CardKeys cardKeys;	 //	Aggregate	 Required	 Card Keys Aggregate
	CardRec cardRec;	 //	Aggregate	 Required	 Card Record
	CardInfo cardInfo;	 //	Aggregate	 Required	 Card Information Aggregate
	//end -xor
	public CardKeys getCardKeys() {
		return cardKeys;
	}
	public void setCardKeys(CardKeys cardKeys) {
		this.cardKeys = cardKeys;
	}
	public CardRec getCardRec() {
		return cardRec;
	}
	public void setCardRec(CardRec cardRec) {
		this.cardRec = cardRec;
	}
	public CardInfo getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}
	
	
}
