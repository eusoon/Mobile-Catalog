package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctAddRq extends IFXObject {
	
	RqUID rqUID;//	UUID 	Required Request Identifier
	MsgRqHdr msgRqHdr;//Aggregate	Optional Message Request Header
	AcctInfo acctInfo;//Aggregate	Required Account Information Aggregate
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
	public AcctInfo getAcctInfo() {
		return acctInfo;
	}
	public void setAcctInfo(AcctInfo acctInfo) {
		this.acctInfo = acctInfo;
	}

	
}
