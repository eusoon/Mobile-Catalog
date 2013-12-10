package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.acct.AcctAddRq;
import ong.eu.soon.ifx.acct.AcctAdviseRq;
import ong.eu.soon.ifx.acct.AcctAudRq;
import ong.eu.soon.ifx.acct.AcctDelRq;
import ong.eu.soon.ifx.acct.AcctInqRq;
import ong.eu.soon.ifx.acct.AcctModRq;
import ong.eu.soon.ifx.acct.AcctStatusInqRq;
import ong.eu.soon.ifx.acct.AcctStatusModRq;
import ong.eu.soon.ifx.acct.AcctSyncRq;
import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctRqMsg extends IFXObject {

	//begin Aggregate
	//begin-xor	Required
	AcctAddRq acctAddRq;	 //	Aggregate	 Required	 Account Add Message
	AcctModRq acctModRq;	 //	Aggregate	 Required	 Account Modify Request
	AcctDelRq acctDelRq;	 //	Aggregate	 Required	  
	AcctInqRq acctInqRq;	 //	Aggregate	 Required	 Account Inquiry Request
	AcctAdviseRq acctAdviseRq;	 //	Aggregate	 Required	 Account Advise Message
	AcctAudRq acctAudRq;	 //	Aggregate	 Required	 Account Audit Request
	AcctSyncRq acctSyncRq;	 //	Aggregate	 Required	 Account Sync Request
	AcctStatusModRq acctStatusModRq;	 //	Aggregate	 Required	 Account Status Modify Request
	AcctStatusInqRq acctStatusInqRq;	 //	Aggregate	 Required	 Account Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	//end Aggregate
	
	public AcctAddRq getAcctAddRq() {
		return acctAddRq;
	}
	public void setAcctAddRq(AcctAddRq acctAddRq) {
		this.acctAddRq = acctAddRq;
	}
	public AcctModRq getAcctModRq() {
		return acctModRq;
	}
	public void setAcctModRq(AcctModRq acctModRq) {
		this.acctModRq = acctModRq;
	}
	public AcctDelRq getAcctDelRq() {
		return acctDelRq;
	}
	public void setAcctDelRq(AcctDelRq acctDelRq) {
		this.acctDelRq = acctDelRq;
	}
	public AcctInqRq getAcctInqRq() {
		return acctInqRq;
	}
	public void setAcctInqRq(AcctInqRq acctInqRq) {
		this.acctInqRq = acctInqRq;
	}
	public AcctAdviseRq getAcctAdviseRq() {
		return acctAdviseRq;
	}
	public void setAcctAdviseRq(AcctAdviseRq acctAdviseRq) {
		this.acctAdviseRq = acctAdviseRq;
	}
	public AcctAudRq getAcctAudRq() {
		return acctAudRq;
	}
	public void setAcctAudRq(AcctAudRq acctAudRq) {
		this.acctAudRq = acctAudRq;
	}
	public AcctSyncRq getAcctSyncRq() {
		return acctSyncRq;
	}
	public void setAcctSyncRq(AcctSyncRq acctSyncRq) {
		this.acctSyncRq = acctSyncRq;
	}
	public AcctStatusModRq getAcctStatusModRq() {
		return acctStatusModRq;
	}
	public void setAcctStatusModRq(AcctStatusModRq acctStatusModRq) {
		this.acctStatusModRq = acctStatusModRq;
	}
	public AcctStatusInqRq getAcctStatusInqRq() {
		return acctStatusInqRq;
	}
	public void setAcctStatusInqRq(AcctStatusInqRq acctStatusInqRq) {
		this.acctStatusInqRq = acctStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}

}
