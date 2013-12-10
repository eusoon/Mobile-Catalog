package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardUpdateRsHdr extends IFXObject {
	CardUpdateRec cardUpdateRec;  //Aggregate	Optiona	Card Update Record

	public CardUpdateRec getCardUpdateRec() {
		return cardUpdateRec;
	}

	public void setCardUpdateRec(CardUpdateRec cardUpdateRec) {
		this.cardUpdateRec = cardUpdateRec;
	}
}
