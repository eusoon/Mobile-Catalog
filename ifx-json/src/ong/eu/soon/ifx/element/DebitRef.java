package ong.eu.soon.ifx.element;



public class DebitRef extends TrnRef {
	DebitKeys debitKeys;//Aggregate	Required Debit Keys Aggregate
	DebitRec debitRec;//Aggregate	Required Debit Record Aggregate
	DebitInfo debitInfo;//Aggregate	Required Debit Information Aggregate


	public DebitKeys getDebitKeys() {
		return debitKeys;
	}
	public void setDebitKeys(DebitKeys debitKeys) {
		this.debitKeys = debitKeys;
	}
	public DebitRec getDebitRec() {
		return debitRec;
	}
	public void setDebitRec(DebitRec debitRec) {
		this.debitRec = debitRec;
	}
	public DebitInfo getDebitInfo() {
		return debitInfo;
	}
	public void setDebitInfo(DebitInfo debitInfo) {
		this.debitInfo = debitInfo;
	}

}
