package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExQuoteSel extends IFXObject {

	//begin-xor	Required Repeating
	ForExQuoteKeys forExQuoteKeys; //Aggregate	Required	Foreign Exchange Quote Keys Aggregate
	//end-xor

	public ForExQuoteKeys getForExQuoteKeys() {
		return forExQuoteKeys;
	}

	public void setForExQuoteKeys(ForExQuoteKeys forExQuoteKeys) {
		this.forExQuoteKeys = forExQuoteKeys;
	}
	
}