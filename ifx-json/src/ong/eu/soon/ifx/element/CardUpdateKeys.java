package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardUpdateKeys extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	//begin-xor	Required
	CardUpdateId cardUpdateId;	 //	Identifier	 Required	 Card Update Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CardUpdateId getCardUpdateId() {
		return cardUpdateId;
	}
	public void setCardUpdateId(CardUpdateId cardUpdateId) {
		this.cardUpdateId = cardUpdateId;
	}
	
}
