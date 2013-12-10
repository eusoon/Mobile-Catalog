package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctTrnRec;
import ong.eu.soon.ifx.element.AcctTrnStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class AcctTrnAdviseRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	AcctTrnRec acctTrnRec;	 //	Aggregate	 Required	 Account Transaction Record
	AcctTrnStatusRec acctTrnStatusRec;	 //	Aggregate	 Required	 Account Transaction Status Record
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
	public AcctTrnRec getAcctTrnRec() {
		return acctTrnRec;
	}
	public void setAcctTrnRec(AcctTrnRec acctTrnRec) {
		this.acctTrnRec = acctTrnRec;
	}
	public AcctTrnStatusRec getAcctTrnStatusRec() {
		return acctTrnStatusRec;
	}
	public void setAcctTrnStatusRec(AcctTrnStatusRec acctTrnStatusRec) {
		this.acctTrnStatusRec = acctTrnStatusRec;
	}
	
}
