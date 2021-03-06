package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyStatusRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	PartyId partyId;	 //	Identifier	 Required	 Party Identifier
	PartyStatus partyStatus;	 //	Aggregate	 Required	 Party Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PartyId getPartyId() {
		return partyId;
	}
	public void setPartyId(PartyId partyId) {
		this.partyId = partyId;
	}
	public PartyStatus getPartyStatus() {
		return partyStatus;
	}
	public void setPartyStatus(PartyStatus partyStatus) {
		this.partyStatus = partyStatus;
	}
}
