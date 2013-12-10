package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DiscRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	DiscId discId;//Identifier	Required Disclosure Identifier
	DiscInfo discInfo;//Aggregate	Required Disclosure Information Aggregate
	DiscEnvr discEnvr;//Aggregate	Optional Disclosure Environment Aggregate
	DiscStatus DiscStatus;//Aggregate	Required Disclosure Status Aggregate
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public DiscId getDiscId() {
		return discId;
	}
	public void setDiscId(DiscId discId) {
		this.discId = discId;
	}
	public DiscInfo getDiscInfo() {
		return discInfo;
	}
	public void setDiscInfo(DiscInfo discInfo) {
		this.discInfo = discInfo;
	}
	public DiscEnvr getDiscEnvr() {
		return discEnvr;
	}
	public void setDiscEnvr(DiscEnvr discEnvr) {
		this.discEnvr = discEnvr;
	}
	public DiscStatus getDiscStatus() {
		return DiscStatus;
	}
	public void setDiscStatus(DiscStatus discStatus) {
		DiscStatus = discStatus;
	}


}
