package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ChkData extends IFXObject {
	ChkNum chkNum;	 //	NC-12	 Optional	 Check number. Assigned by the Payer or CSP or CPP if payment is by paper check.
	OrigDt origDt;	 //	Date	 Optional	 Check origination date. The date on which the check is originated.
	CreditorData creditorData;	 //	Aggregate	 Optional	 Creditor information to appear on check (name, etc.)
	Memo memo;	 //	C-255	 Optional	 Text description on the check.
	
	public ChkNum getChkNum() {
		return chkNum;
	}
	public void setChkNum(ChkNum chkNum) {
		this.chkNum = chkNum;
	}
	public OrigDt getOrigDt() {
		return origDt;
	}
	public void setOrigDt(OrigDt origDt) {
		this.origDt = origDt;
	}
	public CreditorData getCreditorData() {
		return creditorData;
	}
	public void setCreditorData(CreditorData creditorData) {
		this.creditorData = creditorData;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
}
