package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PassbkItemStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PassbkItemStatusModRs extends IFXObject{

	//begin Aggregate
	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	PassbkItemStatusRec passbkItemStatusRec;	 //	Aggregate	 Required	 Passbook Item Status Record Aggregate
	//end-block
	//end Aggregate
	
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
	public PassbkItemStatusRec getPassbkItemStatusRec() {
		return passbkItemStatusRec;
	}
	public void setPassbkItemStatusRec(PassbkItemStatusRec passbkItemStatusRec) {
		this.passbkItemStatusRec = passbkItemStatusRec;
	}
	
}
