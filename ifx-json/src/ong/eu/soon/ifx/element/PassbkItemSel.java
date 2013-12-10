package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkItemSel extends IFXObject {

	//begin Aggregate
	//begin-xor	Required Repeating
	PassbkItemKeys[] passbkItemKeys;	 //	Aggregate	 Required	 Passbook Item Keys Aggregate
	//end-xor
	//end Aggregate

	public PassbkItemKeys[] getPassbkItemKeys() {
		return passbkItemKeys;
	}

	public void setPassbkItemKeys(PassbkItemKeys[] passbkItemKeys) {
		this.passbkItemKeys = passbkItemKeys;
	}

}
