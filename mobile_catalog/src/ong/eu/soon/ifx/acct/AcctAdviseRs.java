package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctRec;
import ong.eu.soon.ifx.element.AcctStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class AcctAdviseRs extends IFXObject {
	Status status; //Aggregate	Optional Response Status
	RqUID rqUID;//	UUID 	Required Request Identifier
	MsgRsHdr msgRsHdr;//Aggregate	Optional Message Request Header
	AcctRec acctRec; //Aggregate	Required  Account Record
	AcctStatusRec acctStatusRec; //Aggregate	Required  Account Record
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRsHdr getMsgRsHdr() {
		return msgRsHdr;
	}
	public void setMsgRsHdr(MsgRsHdr msgRsHdr) {
		this.msgRsHdr = msgRsHdr;
	}
	public AcctRec getAcctRec() {
		return acctRec;
	}
	public void setAcctRec(AcctRec acctRec) {
		this.acctRec = acctRec;
	}
	public AcctStatusRec getAcctStatusRec() {
		return acctStatusRec;
	}
	public void setAcctStatusRec(AcctStatusRec acctStatusRec) {
		this.acctStatusRec = acctStatusRec;
	}
	
	
}
