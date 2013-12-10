package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctKeys;
import ong.eu.soon.ifx.element.AcctStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctStatusModRq extends IFXObject {
	
	RqUID rqUID;//	UUID 	Required Request Identifier
	MsgRqHdr msgRqHdr;//Aggregate	Optional Message Request Header
	AcctKeys acctKeys;//Aggregate	Required Account Keys Aggregate
	AcctStatus acctStatus;//Aggregate	Required Account Status Aggregate
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
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public AcctStatus getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(AcctStatus acctStatus) {
		this.acctStatus = acctStatus;
	}

	
}
