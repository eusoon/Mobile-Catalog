package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StdPayeeRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	StdPayeeId stdPayeeId; //Identifier	Required	Standard Payee Identifier
	StdPayeeInfo stdPayeeInfo; //Aggregate	Required	Standard Payee Information Aggregate
	StdPayeeEnvr stdPayeeEnvr; //Aggregate	Optional	Standard Payee Environment Aggregate
	StdPayeeStatus stdPayeeStatus; //Aggregate	Required	Standard Payee Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public StdPayeeId getStdPayeeId() {
		return stdPayeeId;
	}
	public void setStdPayeeId(StdPayeeId stdPayeeId) {
		this.stdPayeeId = stdPayeeId;
	}
	public StdPayeeInfo getStdPayeeInfo() {
		return stdPayeeInfo;
	}
	public void setStdPayeeInfo(StdPayeeInfo stdPayeeInfo) {
		this.stdPayeeInfo = stdPayeeInfo;
	}
	public StdPayeeEnvr getStdPayeeEnvr() {
		return stdPayeeEnvr;
	}
	public void setStdPayeeEnvr(StdPayeeEnvr stdPayeeEnvr) {
		this.stdPayeeEnvr = stdPayeeEnvr;
	}
	public StdPayeeStatus getStdPayeeStatus() {
		return stdPayeeStatus;
	}
	public void setStdPayeeStatus(StdPayeeStatus stdPayeeStatus) {
		this.stdPayeeStatus = stdPayeeStatus;
	}
}