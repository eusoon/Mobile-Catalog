package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctPayOffRec;
import ong.eu.soon.ifx.element.AcctPayOffStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class AcctPayOffAddRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	AcctPayOffRec acctPayOffRec;	 //	Aggregate	 Required	 Account PayOff Record
	AcctPayOffStatusRec acctPayOffStatusRec;	 //	Aggregate	 Required	 Account PayOff Status Record
	//end-xor
	//end-block
	
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
	public AcctPayOffRec getAcctPayOffRec() {
		return acctPayOffRec;
	}
	public void setAcctPayOffRec(AcctPayOffRec acctPayOffRec) {
		this.acctPayOffRec = acctPayOffRec;
	}
	public AcctPayOffStatusRec getAcctPayOffStatusRec() {
		return acctPayOffStatusRec;
	}
	public void setAcctPayOffStatusRec(AcctPayOffStatusRec acctPayOffStatusRec) {
		this.acctPayOffStatusRec = acctPayOffStatusRec;
	}
	
}
