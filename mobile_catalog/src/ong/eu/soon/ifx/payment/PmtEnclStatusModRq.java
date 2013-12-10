package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtEnclKeys;
import ong.eu.soon.ifx.element.PmtEnclStatus;
import ong.eu.soon.ifx.element.RqUID;

public class PmtEnclStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PmtEnclKeys pmtEnclKeys;	 //	Aggregate	 Required	 Payment Enclosed Keys Aggregate
	PmtEnclStatus pmtEnclStatus;	 //	Aggregate	 Required	 Payment Enclosed Status Aggregate
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
	public PmtEnclStatus getPmtEnclStatus() {
		return pmtEnclStatus;
	}
	public void setPmtEnclStatus(PmtEnclStatus pmtEnclStatus) {
		this.pmtEnclStatus = pmtEnclStatus;
	}
	
}
