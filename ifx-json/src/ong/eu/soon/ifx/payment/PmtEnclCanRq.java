package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtEnclKeys;
import ong.eu.soon.ifx.element.RqUID;

public class PmtEnclCanRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	PmtEnclKeys pmtEnclKeys; //Aggregate	Required	Payment Enclosed Keys Aggregate
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
	public PmtEnclKeys getPmtEnclKeys() {
		return pmtEnclKeys;
	}
	public void setPmtEnclKeys(PmtEnclKeys pmtEnclKeys) {
		this.pmtEnclKeys = pmtEnclKeys;
	}
	
}
