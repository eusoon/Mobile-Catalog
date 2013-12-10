package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthInfo extends IFXObject {

	AthType athType;	 //	Open Enum	 Required	 Authorization TypeValid values include: PreAuthorization, Cash, CashReversal, CreditVoucher, CreditVoucher Reversal, Load, Payment, Purchase, PurchaseReversal, Reload, TransferFrom, TransferTo
	CompositeCurAmt[] compositeCurAmt;	 //	Aggregate	 Optional Repeating	 Composite Currency Amount
	AcctKeys acctKeys;	 //	Aggregate	 Optional	 Account Keys Aggregate
	DebitCredit debitCredit;	 //	Closed Enum	 Required	 Debit Credit IndicatorValid values are limited to: Credit, Debit
	EffDt effDt;	 //	DateTime	 Optional	 Effective Date Time
	AthProcCode athProcCode;	 //	C-6	 Optional	 Authorization Processing Code
	Duration duration;	 //	Aggregate	 Optional	 Duration
	AthExpDt athExpDt;	 //	Date	 Optional	 Authorization Expiration Date
	StandInInd standInInd;	 //	Boolean	 Optional	 Stand In Indicator
	StandInLoc standInLoc;	 //	C-80	 Optional	 Stand In Location
	Name name;	 //	C-40	 Optional	 Name
	PreAthInd preAthInd;	 //	Boolean	 Optional	 Pre Authorization Indicator
	
	public AthType getAthType() {
		return athType;
	}
	public void setAthType(AthType athType) {
		this.athType = athType;
	}
	public CompositeCurAmt[] getCompositeCurAmt() {
		return compositeCurAmt;
	}
	public void setCompositeCurAmt(CompositeCurAmt[] compositeCurAmt) {
		this.compositeCurAmt = compositeCurAmt;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public DebitCredit getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(DebitCredit debitCredit) {
		this.debitCredit = debitCredit;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public AthProcCode getAthProcCode() {
		return athProcCode;
	}
	public void setAthProcCode(AthProcCode athProcCode) {
		this.athProcCode = athProcCode;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public AthExpDt getAthExpDt() {
		return athExpDt;
	}
	public void setAthExpDt(AthExpDt athExpDt) {
		this.athExpDt = athExpDt;
	}
	public StandInInd getStandInInd() {
		return standInInd;
	}
	public void setStandInInd(StandInInd standInInd) {
		this.standInInd = standInInd;
	}
	public StandInLoc getStandInLoc() {
		return standInLoc;
	}
	public void setStandInLoc(StandInLoc standInLoc) {
		this.standInLoc = standInLoc;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public PreAthInd getPreAthInd() {
		return preAthInd;
	}
	public void setPreAthInd(PreAthInd preAthInd) {
		this.preAthInd = preAthInd;
	}

}
