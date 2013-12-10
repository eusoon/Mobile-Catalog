package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtBatchStatSel extends IFXObject {

	//begin-xor	Required Repeating
	PmtBatchStatKeys[] pmtBatchStatKeys; //Aggregate	Required	PmtBatch Status Keys Aggregate
	//end-xor

	public PmtBatchStatKeys[] getPmtBatchStatKeys() {
		return pmtBatchStatKeys;
	}

	public void setPmtBatchStatKeys(PmtBatchStatKeys[] pmtBatchStatKeys) {
		this.pmtBatchStatKeys = pmtBatchStatKeys;
	}

}
