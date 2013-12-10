package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CurAmt;
import ong.eu.soon.ifx.element.Desc;
import ong.eu.soon.ifx.element.EffDt;
import ong.eu.soon.ifx.element.ExpDt;

public class ExtAcctBal extends IFXObject {

	ExtBalType[] extBalType; //Open Enum	Required	Balance Type. Defined Values: PrepayPenalty, Orig, UnpaidAccruedInt, Redemption, YTDWithhold, LastYrWithhold, Overdraft, Overlimit, PastDue, CashLine, OutstandingCashAdv, CashAvail, PendAuthAmt, LastStmtBal, YTDInterest, LastYrInt, YTDFees, PeriodFees, LastYrFees, CashDepositAvail.
	CurAmt[] curAmt; //Aggregate	Required	Balance Amount.
	EffDt[] effDt; //DateTime	Required	Balance DateTime.
	ExpDt expDt; //DateTime	Optional	Expiration Date of the Balance. For example, a payoff amount expiration date.
	Desc desc; //C-80	Optional	Description.
	
	public ExtBalType[] getExtBalType() {
		return extBalType;
	}
	public void setExtBalType(ExtBalType[] extBalType) {
		this.extBalType = extBalType;
	}
	public CurAmt[] getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt[] curAmt) {
		this.curAmt = curAmt;
	}
	public EffDt[] getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt[] effDt) {
		this.effDt = effDt;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}

}