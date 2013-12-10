package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctHoldRec;
import ong.eu.soon.ifx.element.AcctHoldStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class AcctHoldModRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	AcctHoldRec acctHoldRec;	 //	Aggregate	 Required	 Account Hold Record
	AcctHoldStatusRec acctHoldStatusRec;	 //	Aggregate	 Required	 Account Hold Status Record
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
	public AcctHoldRec getAcctHoldRec() {
		return acctHoldRec;
	}
	public void setAcctHoldRec(AcctHoldRec acctHoldRec) {
		this.acctHoldRec = acctHoldRec;
	}
	public AcctHoldStatusRec getAcctHoldStatusRec() {
		return acctHoldStatusRec;
	}
	public void setAcctHoldStatusRec(AcctHoldStatusRec acctHoldStatusRec) {
		this.acctHoldStatusRec = acctHoldStatusRec;
	}
	
}
