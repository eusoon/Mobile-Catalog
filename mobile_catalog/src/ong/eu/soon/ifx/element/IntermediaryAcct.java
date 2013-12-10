package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class IntermediaryAcct extends IFXObject {

	SeqNum seqNum; //Long	Required	Sequence number of the Intermediary bank in a bank chain.
	AcctKeys acctKeys; //Aggregate	Required	Deposit Account Identification Aggregate for the intermediary bank.
	
	public SeqNum getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(SeqNum seqNum) {
		this.seqNum = seqNum;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	
}
