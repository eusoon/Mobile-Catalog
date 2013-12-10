package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CurAmtRange extends IFXObject {

	//begin-or	Required
	LowCurAmt lowCurAmt; //Aggregate	Required	Selection Low Amount.
	HighCurAmt highCurAmt; //Aggregate	Required	Selection End Amount.
	//end-or
	public LowCurAmt getLowCurAmt() {
		return lowCurAmt;
	}
	public void setLowCurAmt(LowCurAmt lowCurAmt) {
		this.lowCurAmt = lowCurAmt;
	}
	public HighCurAmt getHighCurAmt() {
		return highCurAmt;
	}
	public void setHighCurAmt(HighCurAmt highCurAmt) {
		this.highCurAmt = highCurAmt;
	}
	
	
	
}
