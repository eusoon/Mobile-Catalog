package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctTrnRec;
import ong.eu.soon.ifx.element.AcctTrnStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctTrnAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	AcctTrnRec acctTrnRec;	 //	Aggregate	 Required	 Account Transaction Record
	AcctTrnStatusRec acctTrnStatusRec;	 //	Aggregate	 Required	 Account Transaction Status Record
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
