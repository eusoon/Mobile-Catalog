package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;


public class ForExDealRef extends IFXObject {
	ForExDealKeys forExDealKeys;//Aggregate	Required Foreign Exchange Deal Keys Aggregate
	ForExDealRec forExDealRec;//Aggregate	Required Foreign Exchange Deal Record
	ForExDealInfo forExDealInfo;//Aggregate	Required Foreign Exchange Deal Information
	public ForExDealKeys getForExDealKeys() {
		return forExDealKeys;
	}
	public void setForExDealKeys(ForExDealKeys forExDealKeys) {
		this.forExDealKeys = forExDealKeys;
	}
	public ForExDealRec getForExDealRec() {
		return forExDealRec;
	}
	public void setForExDealRec(ForExDealRec forExDealRec) {
		this.forExDealRec = forExDealRec;
	}
	public ForExDealInfo getForExDealInfo() {
		return forExDealInfo;
	}
	public void setForExDealInfo(ForExDealInfo forExDealInfo) {
		this.forExDealInfo = forExDealInfo;
	}

}
