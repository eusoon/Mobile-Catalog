package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctStmtRec;
import ong.eu.soon.ifx.element.AcctStmtStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctStmtAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	AcctStmtRec acctStmtRec;	 //	Aggregate	 Required	 Account Statement Record
	AcctStmtStatusRec acctStmtStatusRec;	 //	Aggregate	 Required	 Account Statement Status Record
	//end-xor
	
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRqHdr getMsgRqHdr() {
		return msgRqHdr;
	}
	public void setMsgRqHdr(MsgRqHdr msgRqHdr) {
		this.msgRqHdr = msgRqHdr;
	}
	public AcctStmtRec getAcctStmtRec() {
		return acctStmtRec;
	}
	public void setAcctStmtRec(AcctStmtRec acctStmtRec) {
		this.acctStmtRec = acctStmtRec;
	}
	public AcctStmtStatusRec getAcctStmtStatusRec() {
		return acctStmtStatusRec;
	}
	public void setAcctStmtStatusRec(AcctStmtStatusRec acctStmtStatusRec) {
		this.acctStmtStatusRec = acctStmtStatusRec;
	}
	
}
