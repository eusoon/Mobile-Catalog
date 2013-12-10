package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctRec;
import ong.eu.soon.ifx.element.AcctStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctAdviseRq extends IFXObject {
	
	RqUID rqUID;//	UUID 	Required Request Identifier
	MsgRqHdr msgRqHdr;//Aggregate	Optional Message Request Header
	AcctRec acctRec; //Aggregate	Required  Account Record
	AcctStatusRec acctStatusRec; //Aggregate	Required  Account Record
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
