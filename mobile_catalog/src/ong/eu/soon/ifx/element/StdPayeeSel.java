package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StdPayeeSel extends IFXObject {
	StdPayeeKeys stdPayeeKeys;//Aggregate	Required Standard Payee Keys Aggregate

	public StdPayeeKeys getStdPayeeKeys() {
		return stdPayeeKeys;
	}

	public void setStdPayeeKeys(StdPayeeKeys stdPayeeKeys) {
		this.stdPayeeKeys = stdPayeeKeys;
	}

}
