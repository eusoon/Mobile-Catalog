package ong.eu.soon.ifx.remit;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RemitRec;
import ong.eu.soon.ifx.element.RemitStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class RemitModRs extends IFXObject {

	//begin-block	Required
	Status status; //Aggregate	Optional	Response Status
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRsHdr msgRsHdr; //Aggregate	Optional	Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required 
	RemitRec remitRec; //Aggregate	Required	Remittance Record Aggregate
	RemitStatusRec remitStatusRec; //Aggregate	Required	Remittance Status Record Aggregate
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
	public RemitRec getRemitRec() {
		return remitRec;
	}
	public void setRemitRec(RemitRec remitRec) {
		this.remitRec = remitRec;
	}
	public RemitStatusRec getRemitStatusRec() {
		return remitStatusRec;
	}
	public void setRemitStatusRec(RemitStatusRec remitStatusRec) {
		this.remitStatusRec = remitStatusRec;
	}

}
