package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtBatchStatRec;
import ong.eu.soon.ifx.element.RqUID;

public class PmtBatchStatAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	PmtBatchStatRec pmtBatchStatRec;	 //	Aggregate	 Required	 PmtBatch Status Record Aggregate
	PmtBatchStatStatusRec pmtBatchStatStatusRec;	 //	Aggregate	 Required	 PmtBatch Status Status Record Aggregate
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
