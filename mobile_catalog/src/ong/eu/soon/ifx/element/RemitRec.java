package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RemitRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	RemitId remitId;	 //	Identifier	 Required	 Remittance Identifier
	RemitInfo remitInfo;	 //	Aggregate	 Required	 Remittance Information Aggregate
	RemitEnvr remitEnvr;	 //	Aggregate	 Optional	 Remittance Environment Aggregate
	RemitStatus remitStatus;	 //	Aggregate	 Required	 Remittance Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public RemitId getRemitId() {
		return remitId;
	}
	public void setRemitId(RemitId remitId) {
		this.remitId = remitId;
	}
	public RemitInfo getRemitInfo() {
		return remitInfo;
	}
	public void setRemitInfo(RemitInfo remitInfo) {
		this.remitInfo = remitInfo;
	}
	public RemitEnvr getRemitEnvr() {
		return remitEnvr;
	}
	public void setRemitEnvr(RemitEnvr remitEnvr) {
		this.remitEnvr = remitEnvr;
	}
	public RemitStatus getRemitStatus() {
		return remitStatus;
	}
	public void setRemitStatus(RemitStatus remitStatus) {
		this.remitStatus = remitStatus;
	}
}
