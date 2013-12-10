package ong.eu.soon.ifx.service;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;
import ong.eu.soon.ifx.element.SvcRec;
import ong.eu.soon.ifx.element.SvcStatusRec;

public class SvcAdviseRs extends IFXObject {
	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block Optional required if message is successful
	//begin-xor Required
	 
	SvcRec svcRec;//Aggregate	Required Service Record
	SvcStatusRec SvcStatusRec;//Aggregate	Required Service Status Record
	//end-xor
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
	public SvcRec getSvcRec() {
		return svcRec;
	}
	public void setSvcRec(SvcRec svcRec) {
		this.svcRec = svcRec;
	}
	public SvcStatusRec getSvcStatusRec() {
		return SvcStatusRec;
	}
	public void setSvcStatusRec(SvcStatusRec svcStatusRec) {
		SvcStatusRec = svcStatusRec;
	}

}
