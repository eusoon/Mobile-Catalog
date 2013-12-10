package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PartyKeys;
import ong.eu.soon.ifx.element.PartyStatus;
import ong.eu.soon.ifx.element.RqUID;

public class PartyStatusModRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PartyKeys partyKeys;	 //	Aggregate	 Required	 Party Keys Aggregate
	PartyStatus partyStatus;	 //	Aggregate	 Required	 Party Status Aggregate
	
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
	public PartyKeys getPartyKeys() {
		return partyKeys;
	}
	public void setPartyKeys(PartyKeys partyKeys) {
		this.partyKeys = partyKeys;
	}
	public PartyStatus getPartyStatus() {
		return partyStatus;
	}
	public void setPartyStatus(PartyStatus partyStatus) {
		this.partyStatus = partyStatus;
	}
}
