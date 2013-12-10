package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctPayOffKeys;
import ong.eu.soon.ifx.element.AcctPayOffStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctPayOffStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	AcctPayOffKeys acctPayOffKeys;	 //	Aggregate	 Required	 Account PayOff Keys Aggregate
	AcctPayOffStatus acctPayOffStatus;	 //	Aggregate	 Required	 Account PayOff Status Aggregate
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
	public AcctPayOffKeys getAcctPayOffKeys() {
		return acctPayOffKeys;
	}
	public void setAcctPayOffKeys(AcctPayOffKeys acctPayOffKeys) {
		this.acctPayOffKeys = acctPayOffKeys;
	}
	public AcctPayOffStatus getAcctPayOffStatus() {
		return acctPayOffStatus;
	}
	public void setAcctPayOffStatus(AcctPayOffStatus acctPayOffStatus) {
		this.acctPayOffStatus = acctPayOffStatus;
	}
	
}