package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardPrefTrn extends IFXObject {
	TrnType trnType;	 //	Aggregate	 Required	 Transaction Type
	AcctId acctId;	 //	Identifier	 Optional	 Account Identifier
	CurAmt curAmt;	 //	Aggregate	 Optional	 Currency Amount
	PrintReceipt printReceipt;	 //	Boolean	 Optional	 Print Receipt
	public TrnType getTrnType() {
		return trnType;
	}
	public void setTrnType(TrnType trnType) {
		this.trnType = trnType;
	}
	public AcctId getAcctId() {
		return acctId;
	}
	public void setAcctId(AcctId acctId) {
		this.acctId = acctId;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public PrintReceipt getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(PrintReceipt printReceipt) {
		this.printReceipt = printReceipt;
	}
	
	
}
