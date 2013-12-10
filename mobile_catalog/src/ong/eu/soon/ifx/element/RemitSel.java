package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RemitSel extends IFXObject {

	//begin-xor	Required Repeating
	RemitKeys[] remitKeys; //Aggregate	Required	Remittance Keys Aggregate
	//end-xor

	public RemitKeys[] getRemitKeys() {
		return remitKeys;
	}

	public void setRemitKeys(RemitKeys[] remitKeys) {
		this.remitKeys = remitKeys;
	}
	
}
