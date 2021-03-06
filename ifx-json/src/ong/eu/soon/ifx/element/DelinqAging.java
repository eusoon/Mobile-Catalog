package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CurAmt;

public class DelinqAging extends IFXObject {

	Aging[] aging; //Open Enum	Required	Number of Days Delinquent.	This aggregate will be deprecated in IFX release 3.x, replaced by <AcctPeriodData>.	Defined values: 0-30, 31-60, 61-90, 91-120, Over121.
	CurAmt[] curAmt; //Aggregate	Required	Amount Delinquent.
	
	public Aging[] getAging() {
		return aging;
	}
	public void setAging(Aging[] aging) {
		this.aging = aging;
	}
	public CurAmt[] getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt[] curAmt) {
		this.curAmt = curAmt;
	}
}