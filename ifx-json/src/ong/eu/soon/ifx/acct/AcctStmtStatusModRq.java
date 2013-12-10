package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctStmtKeys;
import ong.eu.soon.ifx.element.AcctStmtStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctStmtStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	AcctStmtKeys acctStmtKeys;	 //	Aggregate	 Required	 Account Statement Keys Aggregate
	AcctStmtStatus acctStmtStatus;	 //	Aggregate	 Required	 Account Statement Status Aggregate
	
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
	public AcctStmtKeys getAcctStmtKeys() {
		return acctStmtKeys;
	}
	public void setAcctStmtKeys(AcctStmtKeys acctStmtKeys) {
		this.acctStmtKeys = acctStmtKeys;
	}
	public AcctStmtStatus getAcctStmtStatus() {
		return acctStmtStatus;
	}
	public void setAcctStmtStatus(AcctStmtStatus acctStmtStatus) {
		this.acctStmtStatus = acctStmtStatus;
	}
	
}
