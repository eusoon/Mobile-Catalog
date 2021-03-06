package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillInfo extends IFXObject {

	BillType billType;	 //	Open Enum	 Required	 Bill Type.Defined values: Bill, Statement, Notice, Invoice.
	PartyRef partyRef;	 //	Aggregate	 Optional	 Party Reference Aggregate
	Memo memo;	 //	C-255	 Optional	 Biller-information displayed to user by the biller. This may be used for notice information when = Notice.
	BillSummAmt[] billSummAmt;	 //	Aggregate	 Optional Repeating	 Bill Summary Amount Aggregate. Used for any currency amounts that are being presented in the Bill Summary. Note: If = Bill, at least one occurrence of this aggregate must be present where the amount is a payable amount ( = Payable).
	DueDt dueDt;	 //	Date	 Optional	 Payment due date. If absent and is Bill, the meaning is that the bill is due upon receipt.
	BillInvoiceDt billInvoiceDt;	 //	Date	 Required	 Bill date.
	OpenDt openDt;	 //	Date	 Optional	 Opening statement date.
	CloseDt closeDt;	 //	Date	 Optional	 Closing statement date.
	PmtOptions[] pmtOptions;	 //	Aggregate	 Optional Repeating	 Payment Options
	NotifyReqd notifyReqd;	 //	Boolean	 Optional	 If True, the server requires that the client send a for each change of status of either the bill or its payment. The server may not send True if the client did not set to True in .
	ViewDtlPref viewDtlPref;	 //	Open Enum	 Optional	 Indicates biller preference that customer view the detail of the bill.Defined values: None, PreferredBill detail is available through the specified within the aggregate.
	BillStmtData billStmtData;	 //	Aggregate	 Optional	 Statement image aggregate.
	BillRefText billRefText;	 //	NC-80	 Optional	 Bill Reference Text
	
	public BillType getBillType() {
		return billType;
	}
	public void setBillType(BillType billType) {
		this.billType = billType;
	}
	public PartyRef getPartyRef() {
		return partyRef;
	}
	public void setPartyRef(PartyRef partyRef) {
		this.partyRef = partyRef;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public BillSummAmt[] getBillSummAmt() {
		return billSummAmt;
	}
	public void setBillSummAmt(BillSummAmt[] billSummAmt) {
		this.billSummAmt = billSummAmt;
	}
	public DueDt getDueDt() {
		return dueDt;
	}
	public void setDueDt(DueDt dueDt) {
		this.dueDt = dueDt;
	}
	public BillInvoiceDt getBillInvoiceDt() {
		return billInvoiceDt;
	}
	public void setBillInvoiceDt(BillInvoiceDt billInvoiceDt) {
		this.billInvoiceDt = billInvoiceDt;
	}
	public OpenDt getOpenDt() {
		return openDt;
	}
	public void setOpenDt(OpenDt openDt) {
		this.openDt = openDt;
	}
	public CloseDt getCloseDt() {
		return closeDt;
	}
	public void setCloseDt(CloseDt closeDt) {
		this.closeDt = closeDt;
	}
	public PmtOptions[] getPmtOptions() {
		return pmtOptions;
	}
	public void setPmtOptions(PmtOptions[] pmtOptions) {
		this.pmtOptions = pmtOptions;
	}
	public NotifyReqd getNotifyReqd() {
		return notifyReqd;
	}
	public void setNotifyReqd(NotifyReqd notifyReqd) {
		this.notifyReqd = notifyReqd;
	}
	public ViewDtlPref getViewDtlPref() {
		return viewDtlPref;
	}
	public void setViewDtlPref(ViewDtlPref viewDtlPref) {
		this.viewDtlPref = viewDtlPref;
	}
	public BillStmtData getBillStmtData() {
		return billStmtData;
	}
	public void setBillStmtData(BillStmtData billStmtData) {
		this.billStmtData = billStmtData;
	}
	public BillRefText getBillRefText() {
		return billRefText;
	}
	public void setBillRefText(BillRefText billRefText) {
		this.billRefText = billRefText;
	}
}
