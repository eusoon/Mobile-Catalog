package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtEnclRec;
import ong.eu.soon.ifx.element.PmtEnclStatusRec;
import ong.eu.soon.ifx.element.RqUID;

public class PmtEnclAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	PmtEnclRec pmtEnclRec;	 //	Aggregate	 Required	 Payment Enclosed Record Aggregate
	PmtEnclStatusRec pmtEnclStatusRec;	 //	Aggregate	 Required	 Payment Enclosed Status Record Aggregate
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
	public PmtEnclRec getPmtEnclRec() {
		return pmtEnclRec;
	}
	public void setPmtEnclRec(PmtEnclRec pmtEnclRec) {
		this.pmtEnclRec = pmtEnclRec;
	}
	public PmtEnclStatusRec getPmtEnclStatusRec() {
		return pmtEnclStatusRec;
	}
	public void setPmtEnclStatusRec(PmtEnclStatusRec pmtEnclStatusRec) {
		this.pmtEnclStatusRec = pmtEnclStatusRec;
	}
}
