package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctSel extends IFXObject {
	AcctKeys acctKeys; //Aggregate	Required Account Keys Aggregate

	public AcctKeys getAcctKeys() {
		return acctKeys;
	}

	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
}
