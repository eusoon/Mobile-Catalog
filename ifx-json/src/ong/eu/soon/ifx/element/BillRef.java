package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillRef extends IFXObject {
	//begin-xor	Required
	BillKeys billKeys;	 //	Aggregate	 Required	 Bill Keys Aggregate
	BillRec billRec;	 //	Aggregate	 Required	 Bill Record Aggregate
	BillInfo billInfo;	 //	Aggregate	 Required	 Bill Information Aggregate
	//end-xor
	
	public BillKeys getBillKeys() {
		return billKeys;
	}
	public void setBillKeys(BillKeys billKeys) {
		this.billKeys = billKeys;
	}
	public BillRec getBillRec() {
		return billRec;
	}
	public void setBillRec(BillRec billRec) {
		this.billRec = billRec;
	}
	public BillInfo getBillInfo() {
		return billInfo;
	}
	public void setBillInfo(BillInfo billInfo) {
		this.billInfo = billInfo;
	}
}
