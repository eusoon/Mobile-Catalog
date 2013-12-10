package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.acct.AcctAddRs;
import ong.eu.soon.ifx.acct.AcctAdviseRs;
import ong.eu.soon.ifx.acct.AcctDelRs;
import ong.eu.soon.ifx.acct.AcctInqRs;
import ong.eu.soon.ifx.acct.AcctModRs;
import ong.eu.soon.ifx.acct.AcctRevRs;
import ong.eu.soon.ifx.acct.AcctStatusInqRs;
import ong.eu.soon.ifx.acct.AcctStatusModRs;
import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctRsMsg extends IFXObject {
	MsgRecDt MsgRecDt;//Timestamp	Optional Audit Record Creation Date
	//begin-xor Required 
	AcctAddRs acctAddRs;//Aggregate	Required Account Add Response
	AcctModRs AcctModRs;//Aggregate	Required Account Modify Response
	AcctDelRs AcctDelRs;//Aggregate	 Required Account Delete Response
	AcctRevRs AcctRevRs;//Aggregate	Required Account Reversal Response
	AcctInqRs AcctInqRs;//Aggregate	RequiredAccount Inquiry Response
	AcctAdviseRs AcctAdviseRs;//Aggregate	Required Account Advise Response
	AcctStatusModRs AcctStatusModRs;//Aggregate	Required Account Status Modify Response
	AcctStatusInqRs AcctStatusInqRs;//Aggregate	Required Account Status Inquiry Response
	public MsgRecDt getMsgRecDt() {
		return MsgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		MsgRecDt = msgRecDt;
	}
	public AcctAddRs getAcctAddRs() {
		return acctAddRs;
	}
	public void setAcctAddRs(AcctAddRs acctAddRs) {
		this.acctAddRs = acctAddRs;
	}
	public AcctModRs getAcctModRs() {
		return AcctModRs;
	}
	public void setAcctModRs(AcctModRs acctModRs) {
		AcctModRs = acctModRs;
	}
	public AcctDelRs getAcctDelRs() {
		return AcctDelRs;
	}
	public void setAcctDelRs(AcctDelRs acctDelRs) {
		AcctDelRs = acctDelRs;
	}
	public AcctRevRs getAcctRevRs() {
		return AcctRevRs;
	}
	public void setAcctRevRs(AcctRevRs acctRevRs) {
		AcctRevRs = acctRevRs;
	}
	public AcctInqRs getAcctInqRs() {
		return AcctInqRs;
	}
	public void setAcctInqRs(AcctInqRs acctInqRs) {
		AcctInqRs = acctInqRs;
	}
	public AcctAdviseRs getAcctAdviseRs() {
		return AcctAdviseRs;
	}
	public void setAcctAdviseRs(AcctAdviseRs acctAdviseRs) {
		AcctAdviseRs = acctAdviseRs;
	}
	public AcctStatusModRs getAcctStatusModRs() {
		return AcctStatusModRs;
	}
	public void setAcctStatusModRs(AcctStatusModRs acctStatusModRs) {
		AcctStatusModRs = acctStatusModRs;
	}
	public AcctStatusInqRs getAcctStatusInqRs() {
		return AcctStatusInqRs;
	}
	public void setAcctStatusInqRs(AcctStatusInqRs acctStatusInqRs) {
		AcctStatusInqRs = acctStatusInqRs;
	}

}
