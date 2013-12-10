package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PmtBatchRec;
import ong.eu.soon.ifx.element.PmtBatchStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PmtBatchCanRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	PmtBatchRec pmtBatchRec;	 //	Aggregate	 Required	 Payment Batch Record Aggregate
	PmtBatchStatusRec pmtBatchStatusRec;	 //	Aggregate	 Required	 Payment Batch Status Record Aggregate
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
	public PmtBatchRec getPmtBatchRec() {
		return pmtBatchRec;
	}
	public void setPmtBatchRec(PmtBatchRec pmtBatchRec) {
		this.pmtBatchRec = pmtBatchRec;
	}
	public PmtBatchStatusRec getPmtBatchStatusRec() {
		return pmtBatchStatusRec;
	}
	public void setPmtBatchStatusRec(PmtBatchStatusRec pmtBatchStatusRec) {
		this.pmtBatchStatusRec = pmtBatchStatusRec;
	}

}
