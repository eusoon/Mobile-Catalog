package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtSel extends IFXObject {
	//begin-xor	Required Repeating
	PmtKeys[] pmtKeys;	 //	Aggregate	 Required	 Payment Keys Aggregate
	//end-xor

	public PmtKeys[] getPmtKeys() {
		return pmtKeys;
	}

	public void setPmtKeys(PmtKeys[] pmtKeys) {
		this.pmtKeys = pmtKeys;
	}
}
