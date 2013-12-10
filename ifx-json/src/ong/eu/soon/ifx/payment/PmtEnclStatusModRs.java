package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PmtEnclStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PmtEnclStatusModRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	PmtEnclStatusRec pmtEnclStatusRec;	 //	Aggregate	 Required	 Payment Enclosed Status Record Aggregate
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
	public PmtEnclStatusRec getPmtEnclStatusRec() {
		return pmtEnclStatusRec;
	}
	public void setPmtEnclStatusRec(PmtEnclStatusRec pmtEnclStatusRec) {
		this.pmtEnclStatusRec = pmtEnclStatusRec;
	}
	
}