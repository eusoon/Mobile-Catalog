package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyAuthRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	PartyId partyId;	 //	Identifier	 Required	 Party Identifier
	PartyAuth partyAuth;	 //	Aggregate	 Required	 Party Authorization and/or Authentication Data
	
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
	public PartyAuth getPartyAuth() {
		return partyAuth;
	}
	public void setPartyAuth(PartyAuth partyAuth) {
		this.partyAuth = partyAuth;
	}
}
