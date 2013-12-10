package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExDealInfo extends IFXObject {
	ForExQuoteRef forExQuoteRef;//Aggregate	Required This aggregate provides either a reference to an existing FX Quote or FX information that the server can use to create a new FX Quote record. 

	public ForExQuoteRef getForExQuoteRef() {
		return forExQuoteRef;
	}

	public void setForExQuoteRef(ForExQuoteRef forExQuoteRef) {
		this.forExQuoteRef = forExQuoteRef;
	}
}