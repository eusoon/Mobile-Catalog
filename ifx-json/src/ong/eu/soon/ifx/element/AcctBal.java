package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctBal extends IFXObject {
	BalType balType; //Aggregate	Required Balance Type
	CurAmt curAmt; //Aggregate	Required Currency Amount
	ExpDt expDt; //DateTime	OptionalExpiration Date
	Desc desc; //C-80	Optional Description
	public BalType getBalType() {
		return balType;
	}
	public void setBalType(BalType balType) {
		this.balType = balType;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
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