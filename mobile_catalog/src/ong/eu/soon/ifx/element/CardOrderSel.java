package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardOrderSel extends IFXObject {

	//begin-xor	Required Repeating
	CardOrderKeys[] cardOrderKeys; //Aggregate	Required	Card Order Keys Aggregate
	//end-xor

	public CardOrderKeys[] getCardOrderKeys() {
		return cardOrderKeys;
	}

	public void setCardOrderKeys(CardOrderKeys[] cardOrderKeys) {
		this.cardOrderKeys = cardOrderKeys;
	}	
}
