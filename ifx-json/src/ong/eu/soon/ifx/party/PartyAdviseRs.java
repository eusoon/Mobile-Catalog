package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PartyAuthRec;
import ong.eu.soon.ifx.element.PartyRec;
import ong.eu.soon.ifx.element.PartyStatusRec;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PartyAdviseRs extends IFXObject {
	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	PartyRec partyRec;	 //	Aggregate	 Required	 Party Record Aggregate
	PartyStatusRec partyStatusRec;	 //	Aggregate	 Required	 Party Status Record Aggregate
	PartyAuthRec partyAuthRec;	 //	Aggregate	 Required	 Party Authorization Record
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
	public PartyRec getPartyRec() {
		return partyRec;
	}
	public void setPartyRec(PartyRec partyRec) {
		this.partyRec = partyRec;
	}
	public PartyStatusRec getPartyStatusRec() {
		return partyStatusRec;
	}
	public void setPartyStatusRec(PartyStatusRec partyStatusRec) {
		this.partyStatusRec = partyStatusRec;
	}
	public PartyAuthRec getPartyAuthRec() {
		return partyAuthRec;
	}
	public void setPartyAuthRec(PartyAuthRec partyAuthRec) {
		this.partyAuthRec = partyAuthRec;
	}
}
