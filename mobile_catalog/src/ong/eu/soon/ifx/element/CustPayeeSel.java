package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CustPayeeSel extends IFXObject {
	//begin-xor	Required Repeating
	CustPayeeKeys custPayeeKeys;	 //	Aggregate	 Required	 Customer Payee Keys Aggregate
	PayeeType[] payeeType;	 //	Closed Enum	 Required Repeating	 Payee Type
	//Valid values are limited to: FSPayee, Std, Xfer
	//end-xor
	
	public CustPayeeKeys getCustPayeeKeys() {
		return custPayeeKeys;
	}
	public void setCustPayeeKeys(CustPayeeKeys custPayeeKeys) {
		this.custPayeeKeys = custPayeeKeys;
	}
	public PayeeType[] getPayeeType() {
		return payeeType;
	}
	public void setPayeeType(PayeeType[] payeeType) {
		this.payeeType = payeeType;
	}
}
