package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PassbkRec;
import ong.eu.soon.ifx.element.PassbkStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PassbkModRs extends IFXObject{

	//begin Aggregate
	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	PassbkRec passbkRec;	 //	Aggregate	 Required	 Passbook Record Aggregate
	PassbkStatusRec passbkStatusRec;	 //	Aggregate	 Required	 Passbook Status Record Aggregate
	//end-xor
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
	public PassbkRec getPassbkRec() {
		return passbkRec;
	}
	public void setPassbkRec(PassbkRec passbkRec) {
		this.passbkRec = passbkRec;
	}
	public PassbkStatusRec getPassbkStatusRec() {
		return passbkStatusRec;
	}
	public void setPassbkStatusRec(PassbkStatusRec passbkStatusRec) {
		this.passbkStatusRec = passbkStatusRec;
	}
	
}
