package ong.eu.soon.ifx.auth;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AthRec;
import ong.eu.soon.ifx.element.AthStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AthAdviseRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	AthRec athRec;	 //	Aggregate	 Required	 Authorization Record
	AthStatusRec athStatusRec;	 //	Aggregate	 Required	 Authorization Status Record
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
	public AthRec getAthRec() {
		return athRec;
	}
	public void setAthRec(AthRec athRec) {
		this.athRec = athRec;
	}
	public AthStatusRec getAthStatusRec() {
		return athStatusRec;
	}
	public void setAthStatusRec(AthStatusRec athStatusRec) {
		this.athStatusRec = athStatusRec;
	}
	
}
