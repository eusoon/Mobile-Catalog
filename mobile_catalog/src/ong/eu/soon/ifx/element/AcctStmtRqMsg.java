package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.acct.AcctStmtAdviseRq;
import ong.eu.soon.ifx.acct.AcctStmtInqRq;
import ong.eu.soon.ifx.acct.AcctStmtStatusInqRq;
import ong.eu.soon.ifx.acct.AcctStmtStatusModRq;
import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctStmtRqMsg extends IFXObject {

	//begin-xor	Required
	AcctStmtInqRq acctStmtInqRq;	 //	Aggregate	 Required	 Account Statement Inquiry Message
	AcctStmtAdviseRq acctStmtAdviseRq;	 //	Aggregate	 Required	 Account Statement Advise Message
	AcctStmtStatusModRq acctStmtStatusModRq;	 //	Aggregate	 Required	 Account Statement Status Modify Request
	AcctStmtStatusInqRq acctStmtStatusInqRq;	 //	Aggregate	 Required	 Account Statement Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public AcctStmtInqRq getAcctStmtInqRq() {
		return acctStmtInqRq;
	}
	public void setAcctStmtInqRq(AcctStmtInqRq acctStmtInqRq) {
		this.acctStmtInqRq = acctStmtInqRq;
	}
	public AcctStmtAdviseRq getAcctStmtAdviseRq() {
		return acctStmtAdviseRq;
	}
	public void setAcctStmtAdviseRq(AcctStmtAdviseRq acctStmtAdviseRq) {
		this.acctStmtAdviseRq = acctStmtAdviseRq;
	}
	public AcctStmtStatusModRq getAcctStmtStatusModRq() {
		return acctStmtStatusModRq;
	}
	public void setAcctStmtStatusModRq(AcctStmtStatusModRq acctStmtStatusModRq) {
		this.acctStmtStatusModRq = acctStmtStatusModRq;
	}
	public AcctStmtStatusInqRq getAcctStmtStatusInqRq() {
		return acctStmtStatusInqRq;
	}
	public void setAcctStmtStatusInqRq(AcctStmtStatusInqRq acctStmtStatusInqRq) {
		this.acctStmtStatusInqRq = acctStmtStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
