package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class XferPayee extends IFXObject {

	ToAcctRef toAcctRef; //Aggregate	Required	To Account Reference

	public ToAcctRef getToAcctRef() {
		return toAcctRef;
	}

	public void setToAcctRef(ToAcctRef toAcctRef) {
		this.toAcctRef = toAcctRef;
	}

}
