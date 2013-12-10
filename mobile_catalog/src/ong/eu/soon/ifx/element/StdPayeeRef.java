package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StdPayeeRef extends IFXObject {

	//begin-xor	Required
	StdPayeeKeys stdPayeeKeys; //Aggregate	Required	Standard Payee Keys Aggregate
	StdPayeeRec stdPayeeRec; //Aggregate	Required	Standard Payee Record Aggregate
	StdPayeeInfo stdPayeeInfo; //Aggregate	Required	Standard Payee Information Aggregate
	//end-xor
	
	public StdPayeeKeys getStdPayeeKeys() {
		return stdPayeeKeys;
	}
	public void setStdPayeeKeys(StdPayeeKeys stdPayeeKeys) {
		this.stdPayeeKeys = stdPayeeKeys;
	}
	public StdPayeeRec getStdPayeeRec() {
		return stdPayeeRec;
	}
	public void setStdPayeeRec(StdPayeeRec stdPayeeRec) {
		this.stdPayeeRec = stdPayeeRec;
	}
	public StdPayeeInfo getStdPayeeInfo() {
		return stdPayeeInfo;
	}
	public void setStdPayeeInfo(StdPayeeInfo stdPayeeInfo) {
		this.stdPayeeInfo = stdPayeeInfo;
	}
}