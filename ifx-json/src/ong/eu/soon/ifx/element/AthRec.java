package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	AthId athId;	 //	Identifier	 Required	 Authorization Identifier
	AthInfo athInfo;	 //	Aggregate	 Required	 Authorization Information Aggregate
	AthEnvr athEnvr;	 //	Aggregate	 Optional	 Authorization Environment Aggregate
	AthStatus athStatus;	 //	Aggregate	 Required	 Authorization Status Aggregate
	
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
	public AthInfo getAthInfo() {
		return athInfo;
	}
	public void setAthInfo(AthInfo athInfo) {
		this.athInfo = athInfo;
	}
	public AthEnvr getAthEnvr() {
		return athEnvr;
	}
	public void setAthEnvr(AthEnvr athEnvr) {
		this.athEnvr = athEnvr;
	}
	public AthStatus getAthStatus() {
		return athStatus;
	}
	public void setAthStatus(AthStatus athStatus) {
		this.athStatus = athStatus;
	}
	
}