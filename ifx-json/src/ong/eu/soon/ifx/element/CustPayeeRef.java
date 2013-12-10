package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CustPayeeRef extends IFXObject {
	//begin-xor	Required
	CustPayeeKeys custPayeeKeys;	 //	Aggregate	 Required	 Customer Payee Keys Aggregate
	CustPayeeRec custPayeeRec;	 //	Aggregate	 Required	 Customer Payee Record Aggregate
	CustPayeeInfo custPayeeInfo;	 //	Aggregate	 Required	 Customer Payee Information Aggregate
	//end-xor
	
	public CustPayeeKeys getCustPayeeKeys() {
		return custPayeeKeys;
	}
	public void setCustPayeeKeys(CustPayeeKeys custPayeeKeys) {
		this.custPayeeKeys = custPayeeKeys;
	}
	public CustPayeeRec getCustPayeeRec() {
		return custPayeeRec;
	}
	public void setCustPayeeRec(CustPayeeRec custPayeeRec) {
		this.custPayeeRec = custPayeeRec;
	}
	public CustPayeeInfo getCustPayeeInfo() {
		return custPayeeInfo;
	}
	public void setCustPayeeInfo(CustPayeeInfo custPayeeInfo) {
		this.custPayeeInfo = custPayeeInfo;
	}
}