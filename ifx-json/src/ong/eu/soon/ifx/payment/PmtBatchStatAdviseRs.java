package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PmtBatchStatRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PmtBatchStatAdviseRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	PmtBatchStatRec pmtBatchStatRec;	 //	Aggregate	 Required	 PmtBatch Status Record Aggregate
	PmtBatchStatStatusRec pmtBatchStatStatusRec;	 //	Aggregate	 Required	 PmtBatch Status Status Record Aggregate
	//end-xor
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
	public PmtBatchStatRec getPmtBatchStatRec() {
		return pmtBatchStatRec;
	}
	public void setPmtBatchStatRec(PmtBatchStatRec pmtBatchStatRec) {
		this.pmtBatchStatRec = pmtBatchStatRec;
	}
	public PmtBatchStatStatusRec getPmtBatchStatStatusRec() {
		return pmtBatchStatStatusRec;
	}
	public void setPmtBatchStatStatusRec(PmtBatchStatStatusRec pmtBatchStatStatusRec) {
		this.pmtBatchStatStatusRec = pmtBatchStatStatusRec;
	}
	
}
