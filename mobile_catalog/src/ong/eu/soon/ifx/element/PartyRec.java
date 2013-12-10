package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	PartyId partyId;//Identifier	Required Party Identifier
	PartyInfo partyInfo;//Abstract Aggregate	Required Party Information Aggregate Valid Aggregates are: OrgPartyInfo PersonPartyInfo
	PartyEnvr partyEnvr;//Aggregate	Optional Party Environment Aggregate
	PartyAuth partyAuth;//Aggregate	Optional Party Authorization and/or Authentication Data
	PartyStatus partyStatus;//Aggregate	Required Party Status Aggregate
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
	public PartyInfo getPartyInfo() {
		return partyInfo;
	}
	public void setPartyInfo(PartyInfo partyInfo) {
		this.partyInfo = partyInfo;
	}
	public PartyEnvr getPartyEnvr() {
		return partyEnvr;
	}
	public void setPartyEnvr(PartyEnvr partyEnvr) {
		this.partyEnvr = partyEnvr;
	}
	public PartyAuth getPartyAuth() {
		return partyAuth;
	}
	public void setPartyAuth(PartyAuth partyAuth) {
		this.partyAuth = partyAuth;
	}
	public PartyStatus getPartyStatus() {
		return partyStatus;
	}
	public void setPartyStatus(PartyStatus partyStatus) {
		this.partyStatus = partyStatus;
	}




}
