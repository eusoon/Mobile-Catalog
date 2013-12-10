package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExRateSheetSel extends IFXObject {

	//begin-xor	Required Repeating
	ForExRateSheetKeys forExRateSheetKeys; //Aggregate	Required	Foreign Exchange Rate Sheet Keys Aggregate
	//end-xor

	public ForExRateSheetKeys getForExRateSheetKeys() {
		return forExRateSheetKeys;
	}

	public void setForExRateSheetKeys(ForExRateSheetKeys forExRateSheetKeys) {
		this.forExRateSheetKeys = forExRateSheetKeys;
	}

}
