package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StdPayeeRqMsg extends IFXObject {
	StdPayeeInqRq stdPayeeInqRq;//Aggregate	Required Standard Payee Inquiry
	RevRqUID revRqUID;//UUID	Required Reversal Request Unique ID
	
	public StdPayeeInqRq getStdPayeeInqRq() {
		return stdPayeeInqRq;
	}
	public void setStdPayeeInqRq(StdPayeeInqRq stdPayeeInqRq) {
		this.stdPayeeInqRq = stdPayeeInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
}
