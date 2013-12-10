package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CompRemitStmtSel extends IFXObject {

	//begin-xor	Required Repeating
	CompRemitStmtKeys[] compRemitStmtKeys; //Aggregate	Required	Comprehensible Remittance Statement Keys Aggregate
	//end-xor

	public CompRemitStmtKeys[] getCompRemitStmtKeys() {
		return compRemitStmtKeys;
	}

	public void setCompRemitStmtKeys(CompRemitStmtKeys[] compRemitStmtKeys) {
		this.compRemitStmtKeys = compRemitStmtKeys;
	}
	
}
