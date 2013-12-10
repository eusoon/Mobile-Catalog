package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctRef extends IFXObject {
	AcctKeys acctKeys;//Aggregate	Required Account Keys Aggregate
	AcctRec acctRec; //Aggregate	Required Account Record                                                                                                                                                                                                                                                                                                                      
	AcctInfo acctInfo;//Aggregate	Required Account Information Aggregate
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public AcctRec getAcctRec() {
		return acctRec;
	}
	public void setAcctRec(AcctRec acctRec) {
		this.acctRec = acctRec;
	}
	public AcctInfo getAcctInfo() {
		return acctInfo;
	}
	public void setAcctInfo(AcctInfo acctInfo) {
		this.acctInfo = acctInfo;
	}


}
