package ong.eu.soon.ifx.auth;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AthRec;
import ong.eu.soon.ifx.element.AthStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class AthCanRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	AthRec athRec;	 //	Aggregate	 Required	 Authorization Record
	AthStatusRec athStatusRec;	 //	Aggregate	 Required	 Authorization Status Record
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
