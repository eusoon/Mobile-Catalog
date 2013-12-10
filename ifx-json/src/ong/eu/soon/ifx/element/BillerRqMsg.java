package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.bill.BillerInqRq;

public class BillerRqMsg extends IFXObject {

	//begin-xor	Required
	BillerInqRq billerInqRq; //Aggregate	Required	Biller Inquiry Request
	RevRqUID revRqUID; //UUID	Required	Reversal Request Unique ID
	//end-xor
	public BillerInqRq getBillerInqRq() {
		return billerInqRq;
	}
	public void setBillerInqRq(BillerInqRq billerInqRq) {
		this.billerInqRq = billerInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}

}
