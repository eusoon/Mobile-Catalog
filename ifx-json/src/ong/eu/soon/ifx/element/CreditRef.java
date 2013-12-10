package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CreditRef extends TrnRef {
	CreditKeys CreditKeys;//Aggregate	Required Credit Keys Aggregate
	CreditRec CreditRec;//Aggregate	Required Credit Record Aggregate
	CreditInfo CreditInfo;//Aggregate	Required Credit Information Aggregate
	public CreditKeys getCreditKeys() {
		return CreditKeys;
	}
	public void setCreditKeys(CreditKeys creditKeys) {
		CreditKeys = creditKeys;
	}
	public CreditRec getCreditRec() {
		return CreditRec;
	}
	public void setCreditRec(CreditRec creditRec) {
		CreditRec = creditRec;
	}
	public CreditInfo getCreditInfo() {
		return CreditInfo;
	}
	public void setCreditInfo(CreditInfo creditInfo) {
		CreditInfo = creditInfo;
	}


}