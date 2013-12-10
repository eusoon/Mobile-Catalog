package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardSel extends IFXObject {
	CardKeys cardKeys;//Aggregate	Required Card Keys Aggregate

	public CardKeys getCardKeys() {
		return cardKeys;
	}

	public void setCardKeys(CardKeys cardKeys) {
		this.cardKeys = cardKeys;
	}

}
