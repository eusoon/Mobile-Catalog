package ong.eu.soon.ifx.acct;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctHoldKeys;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AcctHoldDelRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	AcctHoldKeys acctHoldKeys; //Aggregate	Required	Account Hold Keys Aggregate
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
	public AcctHoldKeys getAcctHoldKeys() {
		return acctHoldKeys;
	}
	public void setAcctHoldKeys(AcctHoldKeys acctHoldKeys) {
		this.acctHoldKeys = acctHoldKeys;
	}

}
