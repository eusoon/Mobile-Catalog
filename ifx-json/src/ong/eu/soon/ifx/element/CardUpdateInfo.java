package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public abstract class CardUpdateInfo extends IFXObject {
	CardRef cardRef;		//Aggregate		Optional	Card Reference Aggregate

	public CardRef getCardRef() {
		return cardRef;
	}

	public void setCardRef(CardRef cardRef) {
		this.cardRef = cardRef;
	}
}
