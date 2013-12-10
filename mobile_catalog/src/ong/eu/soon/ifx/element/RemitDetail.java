package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RemitDetail extends IFXObject {
	UltimateCreditorData ultimateCreditorData;	 //	Aggregate	 Optional	 Party that is ultimately receiving the payment; end beneficiary, if different than the Creditor.
	UltimateDebtorData ultimateDebtorData;	 //	Aggregate	 Optional	 Party that is ultimately responsible for the payment, if different than the Debtor. May vary at the credit level, i.e. one debtor may be paying from their account on behalf of several parties; the ultimate debtor would be indicated for each credit.
	CurAmt curAmt;	 //	Aggregate	 Optional	 Payment Currency Amount. Total amount being paid on behalf of subsidiary account. This element must be present if is repeating.
	PmtSummAmt[] pmtSummAmt;	 //	Aggregate	 Optional Repeating	 Payment Summary Amount. Used to designate the identifier for the amount being paid, or to specify the allocation of the total amount being paid or a portion of the total amount.
	RefData[] refData;	 //	Aggregate	 Optional Repeating	 Reference Information
	BillRefText billRefText;	 //	NC-80	 Optional	 Bill Reference Text
	//begin-xor	Optional
	BillRef billRef;	 //	Aggregate	 Optional	 Bill Reference Aggregate
	InvoiceData[] invoiceData;	 //	Aggregate	 Optional Repeating	 Provides information about invoices.
	//end-xor
	Memo memo;	 //	C-255	 Optional	 Memo for Payment. From Customer to Payee.Depending on the Payment Provider and the payment network and message used to make the payment, may be truncated or dropped.
	
	public UltimateCreditorData getUltimateCreditorData() {
		return ultimateCreditorData;
	}
	public void setUltimateCreditorData(UltimateCreditorData ultimateCreditorData) {
		this.ultimateCreditorData = ultimateCreditorData;
	}
	public UltimateDebtorData getUltimateDebtorData() {
		return ultimateDebtorData;
	}
	public void setUltimateDebtorData(UltimateDebtorData ultimateDebtorData) {
		this.ultimateDebtorData = ultimateDebtorData;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public PmtSummAmt[] getPmtSummAmt() {
		return pmtSummAmt;
	}
	public void setPmtSummAmt(PmtSummAmt[] pmtSummAmt) {
		this.pmtSummAmt = pmtSummAmt;
	}
	public RefData[] getRefData() {
		return refData;
	}
	public void setRefData(RefData[] refData) {
		this.refData = refData;
	}
	public BillRefText getBillRefText() {
		return billRefText;
	}
	public void setBillRefText(BillRefText billRefText) {
		this.billRefText = billRefText;
	}
	public BillRef getBillRef() {
		return billRef;
	}
	public void setBillRef(BillRef billRef) {
		this.billRef = billRef;
	}
	public InvoiceData[] getInvoiceData() {
		return invoiceData;
	}
	public void setInvoiceData(InvoiceData[] invoiceData) {
		this.invoiceData = invoiceData;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
}
