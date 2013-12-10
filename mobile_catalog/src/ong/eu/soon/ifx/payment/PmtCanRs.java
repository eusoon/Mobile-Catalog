package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PmtRec;
import ong.eu.soon.ifx.element.PmtStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PmtCanRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	PmtRec pmtRec;	 //	Aggregate	 Required	 Payment Record Aggregate
	PmtStatusRec pmtStatusRec;	 //	Aggregate	 Required	 Payment Status Record Aggregate
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
	public PmtRec getPmtRec() {
		return pmtRec;
	}
	public void setPmtRec(PmtRec pmtRec) {
		this.pmtRec = pmtRec;
	}
	public PmtStatusRec getPmtStatusRec() {
		return pmtStatusRec;
	}
	public void setPmtStatusRec(PmtStatusRec pmtStatusRec) {
		this.pmtStatusRec = pmtStatusRec;
	}
	
}
