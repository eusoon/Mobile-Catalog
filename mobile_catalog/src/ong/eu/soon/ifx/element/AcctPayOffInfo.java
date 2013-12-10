package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctPayOffInfo extends IFXObject {

	AcctKeys acctKeys;	 //	Aggregate	 Required	 Account Keys Aggregate
	PayOffEffDt payOffEffDt;	 //	Date	 Required	 Account PayOff Effective Date
	PayOffRequestDt payOffRequestDt;	 //	DateTime	 Optional	 Account PayOff Request Date
	//begin-block	Optional Repeating
	PayOffAmtType[] payOffAmtType;	 //	Open Enum	 Optional	 PayOff Amount TypeValid values include: AnnualFee, AnnualFeeCr, CashAdv, ChkDb, CommitmentFee, Credit, CreditIntEarn, Disputes, Escrow, ExtCredit, GovCharge, InCollections, InsuranceFee, IntAccr, IntAccrEscrow, IntCashAdv, Interest, IntPurch, LateFee, LoanFee, LockOut, OpenLedg, OtherFee, OutstndngCashAdv, OutstndngPmtAth, OutstndngPurch, Payments, PayOff, PayOffFee, PayOffFeeCr, PendAuthAmt, PrePayPenalty, Principal, Purch, TaxWithheld, UnAppliedFund, WriteOff
	Amt[] amt;	 //	Decimal	 Optional	 Amount
	//end-block
	AcctInfo acctInfo;	 //	Aggregate	 Optional	 Account Information Aggregate that may be present to provide a snapshot of the account data at the time of the request.
	
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public PayOffEffDt getPayOffEffDt() {
		return payOffEffDt;
	}
	public void setPayOffEffDt(PayOffEffDt payOffEffDt) {
		this.payOffEffDt = payOffEffDt;
	}
	public PayOffRequestDt getPayOffRequestDt() {
		return payOffRequestDt;
	}
	public void setPayOffRequestDt(PayOffRequestDt payOffRequestDt) {
		this.payOffRequestDt = payOffRequestDt;
	}
	public PayOffAmtType[] getPayOffAmtType() {
		return payOffAmtType;
	}
	public void setPayOffAmtType(PayOffAmtType[] payOffAmtType) {
		this.payOffAmtType = payOffAmtType;
	}
	public Amt[] getAmt() {
		return amt;
	}
	public void setAmt(Amt[] amt) {
		this.amt = amt;
	}
	public AcctInfo getAcctInfo() {
		return acctInfo;
	}
	public void setAcctInfo(AcctInfo acctInfo) {
		this.acctInfo = acctInfo;
	}
	
}
