package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CompositeCurAmt extends IFXObject {
	CompositeCurAmtIdent compositeCurAmtIdent;//NC-36	Optional Composite Currency Amount Id. Required if the aggregate is repeating within a debit or credit message.
	CompositeCurAmtType compositeCurAmtType;//Open Enum	Required Composite Currency Amount Type. Description of Float Category or Currency Amount Type. Defined Values: Immediate, 1DayFloat, 2DayFloat, 3DayFloat, 4DayFloat, 5DayFloat, 6DayFloat, OnePlusDay, TwoPlusDay, ThreePlusDay, Standard, Debit, Credit, ForExFee, StopChkFee, LateFee, TransactionFee, InterchangeFee, Surcharge, StatementFee, Tax, MerchandisePurchase, MerchandiseReturn, CheckFee, PmtEnclosed, CashBack, CreditHeld, Bonus, Freight, PurchaseItemTotal.
	
	//begin-block Required
	CurAmt curAmt;//Aggregate	Required Currency Amount. When used for float, the fractional amount of the transaction amount assigned to this float category. When used for a fixed amount fee, this is the fixed amount that will be charged. For fees that are calculated as a fixed amount plus a percentage of the transaction, this is the fixed amount and the percentage is in Rate.
	ExchangeRate exchangeRate;//Aggregate	Optional Exchange Rate
	//end-block

	Rate rate;//Decimal	Required Fee Rate. Usage is a percentage (e.g. a value of 2.5 = 2.5%).
	MinCurAmt minCurAmt;//Aggregate	Optional Minimum Currency Amount. The minimum amount to charge for this fee.
	MaxCurAmt maxCurAmt;//Aggregate	Optional Maximum Currency Amount. The maximum amount to charge for this fee.
	SpecialHandling specialHandling;//Open Enum	Optional Special Handling requests. Defined Values: ClientOverride
	Memo memo;//C-255	Optional Memo. Additional information about the transaction (e.g. reason for modifying the fees)
	public CompositeCurAmtIdent getCompositeCurAmtIdent() {
		return compositeCurAmtIdent;
	}
	public void setCompositeCurAmtIdent(CompositeCurAmtIdent compositeCurAmtIdent) {
		this.compositeCurAmtIdent = compositeCurAmtIdent;
	}
	public CompositeCurAmtType getCompositeCurAmtType() {
		return compositeCurAmtType;
	}
	public void setCompositeCurAmtType(CompositeCurAmtType compositeCurAmtType) {
		this.compositeCurAmtType = compositeCurAmtType;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public ExchangeRate getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}
	public MinCurAmt getMinCurAmt() {
		return minCurAmt;
	}
	public void setMinCurAmt(MinCurAmt minCurAmt) {
		this.minCurAmt = minCurAmt;
	}
	public MaxCurAmt getMaxCurAmt() {
		return maxCurAmt;
	}
	public void setMaxCurAmt(MaxCurAmt maxCurAmt) {
		this.maxCurAmt = maxCurAmt;
	}
	public SpecialHandling getSpecialHandling() {
		return specialHandling;
	}
	public void setSpecialHandling(SpecialHandling specialHandling) {
		this.specialHandling = specialHandling;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}







}