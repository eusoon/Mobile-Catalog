package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillerSel extends IFXObject {

	//begin-xor	Required Repeating
	BillerKeys billerKeys; //Aggregate	Required	Biller Keys Aggregate
	//end-xor

	public BillerKeys getBillerKeys() {
		return billerKeys;
	}

	public void setBillerKeys(BillerKeys billerKeys) {
		this.billerKeys = billerKeys;
	}
	
}
