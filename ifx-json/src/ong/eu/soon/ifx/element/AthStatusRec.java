package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AthId athId; //Identifier	Required	Authorization Identifier
	AthStatus athStatus; //Aggregate	Required	Authorization Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AthId getAthId() {
		return athId;
	}
	public void setAthId(AthId athId) {
		this.athId = athId;
	}
	public AthStatus getAthStatus() {
		return athStatus;
	}
	public void setAthStatus(AthStatus athStatus) {
		this.athStatus = athStatus;
	}
	
}
