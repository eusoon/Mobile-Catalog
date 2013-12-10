package ong.eu.soon.ifx.service;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.SvcRec;
import ong.eu.soon.ifx.element.SvcStatusRec;

public class SvcAdviseRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//end-block
	//begin-block Optional required if message is successful
	//begin-xor Required
	 
	SvcRec svcRec;//Aggregate	Required Service Record
	SvcStatusRec SvcStatusRec;//Aggregate	Required Service Status Record
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
