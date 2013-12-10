package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PartyAuth;
import ong.eu.soon.ifx.element.PartyKeys;
import ong.eu.soon.ifx.element.RqUID;

public class PartyAuthModRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PartyKeys partyKeys;	 //	Aggregate	 Optional	 Party Keys Aggregate
	PartyAuth partyAuth;	 //	Aggregate	 Required	 Party Authorization and/or Authentication Data
	
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
	public PartyAuth getPartyAuth() {
		return partyAuth;
	}
	public void setPartyAuth(PartyAuth partyAuth) {
		this.partyAuth = partyAuth;
	}
}
