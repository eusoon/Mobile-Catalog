package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExQuoteRef extends IFXObject {
	ForExQuoteKeys forExQuoteKeys;//Aggregate	Required Foreign Exchange Quote Keys Aggregate
	ForExQuoteRec forExQuoteRec;//Aggregate	 Require Foreign Exchange Quote Record
	ForExQuoteInfo ForExQuoteInfo;//Aggregate	Required Foreign Exchange Quote Information
	public ForExQuoteKeys getForExQuoteKeys() {
		return forExQuoteKeys;
	}
	public void setForExQuoteKeys(ForExQuoteKeys forExQuoteKeys) {
		this.forExQuoteKeys = forExQuoteKeys;
	}
	public ForExQuoteRec getForExQuoteRec() {
		return forExQuoteRec;
	}
	public void setForExQuoteRec(ForExQuoteRec forExQuoteRec) {
		this.forExQuoteRec = forExQuoteRec;
	}
	public ForExQuoteInfo getForExQuoteInfo() {
		return ForExQuoteInfo;
	}
	public void setForExQuoteInfo(ForExQuoteInfo forExQuoteInfo) {
		ForExQuoteInfo = forExQuoteInfo;
	}

}
