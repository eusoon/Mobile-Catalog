package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.DueDt;

public class CreditStmtData extends IFXObject {
 
	ExtAcctBal extAcctBal; //Aggregate	Optional	Extended Account Balance
	DueDt dueDt; //Date	Optional	Due Date
	MinAmtDue minAmtDue; //Aggregate	Optional	Minimum Amount Due
	DelinqAging delinqAging; //Aggregate	Optional Repeating	Delinquency Aging. This aggregate will be deprecated in IFX release 3.x, replaced by <AcctPeriodData>.
	
	public ExtAcctBal getExtAcctBal() {
		return extAcctBal;
	}
	public void setExtAcctBal(ExtAcctBal extAcctBal) {
		this.extAcctBal = extAcctBal;
	}
	public DueDt getDueDt() {
		return dueDt;
	}
	public void setDueDt(DueDt dueDt) {
		this.dueDt = dueDt;
	}
	public MinAmtDue getMinAmtDue() {
		return minAmtDue;
	}
	public void setMinAmtDue(MinAmtDue minAmtDue) {
		this.minAmtDue = minAmtDue;
	}
	public DelinqAging getDelinqAging() {
		return delinqAging;
	}
	public void setDelinqAging(DelinqAging delinqAging) {
		this.delinqAging = delinqAging;
	}
}