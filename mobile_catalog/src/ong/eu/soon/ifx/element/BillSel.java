package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillSel extends IFXObject {
	BillKeys billKeys;//Aggregate	Required Bill Keys Aggregate

	public BillKeys getBillKeys() {
		return billKeys;
	}

	public void setBillKeys(BillKeys billKeys) {
		this.billKeys = billKeys;
	}
}
