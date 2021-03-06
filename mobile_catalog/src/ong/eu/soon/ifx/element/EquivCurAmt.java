package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class EquivCurAmt extends IFXObject {
	EquivCurAmtType equivCurAmtType;	 //	Open Enum	 Optional	 Equivalent Currency Amount TypeValid values include: AcctCur, BillCur, CreditCur, DebitCur, PmtCur, SettleCur, XferCur
	//begin-or	Required	(One of the other or both must be provided)
	CurAmt curAmt;	 //	Aggregate	 Required	 The equivalent amount in the currency specified, may be supplied if known to provide the already calculated amount in the alternate currency.
	ExchangeRate exchangeRate;	 //	Aggregate	 Required	 In cases where both the calculated Equivalent Currency Amount and an exchange rate are provided for a given amount but do not match arithmetically, the behavior is server-dependent.
	//end-or
	
	public EquivCurAmtType getEquivCurAmtType() {
		return equivCurAmtType;
	}
	public void setEquivCurAmtType(EquivCurAmtType equivCurAmtType) {
		this.equivCurAmtType = equivCurAmtType;
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
}
