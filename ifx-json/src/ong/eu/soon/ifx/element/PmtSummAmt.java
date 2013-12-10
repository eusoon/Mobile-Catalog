package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtSummAmt extends IFXObject {
	BillSummAmtIdent billSummAmtIdent;	 //	NC-36	 Required	 Bill Summary Amount Identifier. Biller's identifier for this currency amount, which is obtained in the for a presented bill. The consumer can return this in the payment messages to identify to the biller the type of amount being paid or allocated by the consumer.
	CurAmt curAmt;	 //	Aggregate	 Required	 Currency Amount. Used to specify the amount being associated with the identifier specified by . This may be the same as the total amount being paid or a portion of the total amount (such as a supplemental payment amount or sub-amount allocation).
	EquivCurAmt[] equivCurAmt;	 //	Aggregate	 Optional Repeating	 The equivalent value of and/or exchange rate, to allow the amount to be expressed in an alternate currency.  May repeat to allow for multiple alternate currencies.
	
	public BillSummAmtIdent getBillSummAmtIdent() {
		return billSummAmtIdent;
	}
	public void setBillSummAmtIdent(BillSummAmtIdent billSummAmtIdent) {
		this.billSummAmtIdent = billSummAmtIdent;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public EquivCurAmt[] getEquivCurAmt() {
		return equivCurAmt;
	}
	public void setEquivCurAmt(EquivCurAmt[] equivCurAmt) {
		this.equivCurAmt = equivCurAmt;
	}
}