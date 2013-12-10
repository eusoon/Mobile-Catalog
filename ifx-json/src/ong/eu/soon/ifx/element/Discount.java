package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Discount extends IFXObject {

	//begin-xor	Required
	Rate[] rate; //Decimal	Required	Discount Percentage.
	CurAmt[] curAmt; //Aggregate	Required	Discount Currency Amount.
	//end-xor
	EffDt effDt; //DateTime	Optional	Discount Date.
	Desc desc; //C-80	Optional	Discount Description.
	
	public Rate[] getRate() {
		return rate;
	}
	public void setRate(Rate[] rate) {
		this.rate = rate;
	}
	public CurAmt[] getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt[] curAmt) {
		this.curAmt = curAmt;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
}