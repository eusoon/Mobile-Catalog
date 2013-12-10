package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtEnclSel extends IFXObject {

	//begin-xor	Required Repeating
	PmtEnclKeys[] pmtEnclKeys; //Aggregate	Required	Payment Enclosed Keys Aggregate
	//end-xor

	public PmtEnclKeys[] getPmtEnclKeys() {
		return pmtEnclKeys;
	}

	public void setPmtEnclKeys(PmtEnclKeys[] pmtEnclKeys) {
		this.pmtEnclKeys = pmtEnclKeys;
	}

}
