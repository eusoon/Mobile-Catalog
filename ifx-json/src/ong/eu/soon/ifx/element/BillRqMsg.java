package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.bill.BillInqRq;
import ong.eu.soon.ifx.bill.BillStatusModRq;
import ong.eu.soon.ifx.element.RevRqUID;

public class BillRqMsg extends IFXObject {
	BillInqRq billInqRq;//Aggregate	 Required Bill Inquiry Request
	BillStatusModRq billStatusModRq;//Aggregate	Required Bill Status Modification Request
	RevRqUID revRqUID;//UUID	Required Reversal Request Unique ID
	public BillInqRq getBillInqRq() {
		return billInqRq;
	}
	public void setBillInqRq(BillInqRq billInqRq) {
		this.billInqRq = billInqRq;
	}
	public BillStatusModRq getBillStatusModRq() {
		return billStatusModRq;
	}
	public void setBillStatusModRq(BillStatusModRq billStatusModRq) {
		this.billStatusModRq = billStatusModRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}

}
