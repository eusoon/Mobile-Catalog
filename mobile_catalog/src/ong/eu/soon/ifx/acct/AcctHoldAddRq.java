package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctHoldInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctHoldAddRq extends IFXObject {
	RqUID rqUID; //UUID Required	Request Identifier	
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	AcctHoldInfo acctHoldInfo; //Aggregate	Required	Account Hold Information Aggregate
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
	public AcctHoldInfo getAcctHoldInfo() {
		return acctHoldInfo;
	}
	public void setAcctHoldInfo(AcctHoldInfo acctHoldInfo) {
		this.acctHoldInfo = acctHoldInfo;
	}
}
