package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PartyAuthRec;
import ong.eu.soon.ifx.element.PartyRec;
import ong.eu.soon.ifx.element.PartyStatusRec;
import ong.eu.soon.ifx.element.RqUID;

public class PartyAdviseRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//begin-xor	Required
	PartyRec partyRec;	 //	Aggregate	 Required	 Party Record Aggregate
	PartyStatusRec partyStatusRec;	 //	Aggregate	 Required	 Party Status Record Aggregate
	PartyAuthRec partyAuthRec;	 //	Aggregate	 Required	 Party Authorization Record
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
