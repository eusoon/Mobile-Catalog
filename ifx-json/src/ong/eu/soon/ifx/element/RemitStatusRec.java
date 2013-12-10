package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RemitStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	RemitId remitId; //Identifier	Required	Remittance Identifier
	RemitStatus remitStatus; //Aggregate	Required	Remittance Status Aggregate
	
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
	public RemitStatus getRemitStatus() {
		return remitStatus;
	}
	public void setRemitStatus(RemitStatus remitStatus) {
		this.remitStatus = remitStatus;
	}
	
}