package ong.eu.soon.ifx.element;


import ong.eu.soon.ifx.element.AcctTrnInfo;
import ong.eu.soon.ifx.element.AcctTrnKeys;
import ong.eu.soon.ifx.element.AcctTrnRec;

public class AcctTrnRef extends TrnRef {

	//begin-xor	Required
	AcctTrnKeys acctTrnKeys; //Aggregate	Required	Account Transaction Keys Aggregate
	AcctTrnRec acctTrnRec; //Aggregate	Required	Account Transaction Record
	AcctTrnInfo acctTrnInfo; //Aggregate	Required	Account Transaction Information Aggregate
	//end-xor
	
	public AcctTrnKeys getAcctTrnKeys() {
		return acctTrnKeys;
	}
	public void setAcctTrnKeys(AcctTrnKeys acctTrnKeys) {
		this.acctTrnKeys = acctTrnKeys;
	}
	public AcctTrnRec getAcctTrnRec() {
		return acctTrnRec;
	}
	public void setAcctTrnRec(AcctTrnRec acctTrnRec) {
		this.acctTrnRec = acctTrnRec;
	}
	public AcctTrnInfo getAcctTrnInfo() {
		return acctTrnInfo;
	}
	public void setAcctTrnInfo(AcctTrnInfo acctTrnInfo) {
		this.acctTrnInfo = acctTrnInfo;
	}	
}