package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkSel extends IFXObject {

	//begin-xor	Required Repeating
	PassbkKeys passbkKeys; //Aggregate	Required	Passbook Keys Aggregate
	//end-xor

	public PassbkKeys getPassbkKeys() {
		return passbkKeys;
	}

	public void setPassbkKeys(PassbkKeys passbkKeys) {
		this.passbkKeys = passbkKeys;
	}
	
}
