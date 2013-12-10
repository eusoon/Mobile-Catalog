package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardOrderRef extends IFXObject {
	//begin-xor
	CardOrderKeys cardOrderKeys;//Aggregate	Required	Card Order Keys Aggregate
	CardOrderRec cardOrderRec;//Aggregate	Required	Card Order Record
	CardOrderInfo cardOrderInfo;//Aggregate	Required	Card Order Information Aggregate
	//end-xor
	
	public CardOrderKeys getCardOrderKeys() {
		return cardOrderKeys;
	}
	public void setCardOrderKeys(CardOrderKeys cardOrderKeys) {
		this.cardOrderKeys = cardOrderKeys;
	}
	public CardOrderRec getCardOrderRec() {
		return cardOrderRec;
	}
	public void setCardOrderRec(CardOrderRec cardOrderRec) {
		this.cardOrderRec = cardOrderRec;
	}
	public CardOrderInfo getCardOrderInfo() {
		return cardOrderInfo;
	}
	public void setCardOrderInfo(CardOrderInfo cardOrderInfo) {
		this.cardOrderInfo = cardOrderInfo;
	}
	
	
}
