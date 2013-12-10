package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BalAmt extends IFXObject {

	Amt amt; //Decimal	Optional	Amount.
	CurCode curCode; //Aggregate	Optional	Currency Code
	
	public Amt getAmt() {
		return amt;
	}
	public void setAmt(Amt amt) {
		this.amt = amt;
	}
	public CurCode getCurCode() {
		return curCode;
	}
	public void setCurCode(CurCode curCode) {
		this.curCode = curCode;
	}
	
}
