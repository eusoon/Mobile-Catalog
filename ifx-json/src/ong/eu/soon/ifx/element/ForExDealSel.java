package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExDealSel extends IFXObject {

	//begin-xor	Required Repeating
	ForExDealKeys[] forExDealKeys; //Aggregate	Required	Foreign Exchange Deal Keys Aggregate
	//end-xor

	public ForExDealKeys[] getForExDealKeys() {
		return forExDealKeys;
	}

	public void setForExDealKeys(ForExDealKeys[] forExDealKeys) {
		this.forExDealKeys = forExDealKeys;
	}
		
}