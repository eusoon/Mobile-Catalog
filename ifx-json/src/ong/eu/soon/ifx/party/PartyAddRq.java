package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PartyAuth;
import ong.eu.soon.ifx.element.PartyInfo;
import ong.eu.soon.ifx.element.RqUID;

public class PartyAddRq extends IFXObject {
	//begin Aggregate
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PartyInfo partyInfo;	 //	Abstract Aggregate	 Required	 Party Information AggregateValid Aggregates are:OrgPartyInfoPersonPartyInfo
	PartyAuth partyAuth;	 //	Aggregate	 Optional	 Party Authorization and/or Authentication Data
	//end Aggregate
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
	public PartyInfo getPartyInfo() {
		return partyInfo;
	}
	public void setPartyInfo(PartyInfo partyInfo) {
		this.partyInfo = partyInfo;
	}
	public PartyAuth getPartyAuth() {
		return partyAuth;
	}
	public void setPartyAuth(PartyAuth partyAuth) {
		this.partyAuth = partyAuth;
	}
}
