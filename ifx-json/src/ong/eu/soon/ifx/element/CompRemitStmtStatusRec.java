package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CompRemitStmtStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	CompRemitStmtId compRemitStmtId; //Identifier	Required	Comprehensible Remittance Statement Identifier
	CompRemitStmtStatus compRemitStmtStatus; //Aggregate	Required	Comprehensible Remittance Statement Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CompRemitStmtId getCompRemitStmtId() {
		return compRemitStmtId;
	}
	public void setCompRemitStmtId(CompRemitStmtId compRemitStmtId) {
		this.compRemitStmtId = compRemitStmtId;
	}
	public CompRemitStmtStatus getCompRemitStmtStatus() {
		return compRemitStmtStatus;
	}
	public void setCompRemitStmtStatus(CompRemitStmtStatus compRemitStmtStatus) {
		this.compRemitStmtStatus = compRemitStmtStatus;
	}
	
}