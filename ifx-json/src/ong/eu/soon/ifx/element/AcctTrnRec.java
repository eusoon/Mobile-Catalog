package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctTrnRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AcctTrnId acctTrnId; //Identifier	Required	Account Transaction Identifier
	AcctTrnInfo acctTrnInfo; //Aggregate	Required	Account Transaction Information Aggregate
	AcctTrnEnvr acctTrnEnvr; //Aggregate	Optional	Account Transaction Environment Aggregate
	AcctTrnStatus acctTrnStatus; //Aggregate	Required	Account Transaction Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctTrnId getAcctTrnId() {
		return acctTrnId;
	}
	public void setAcctTrnId(AcctTrnId acctTrnId) {
		this.acctTrnId = acctTrnId;
	}
	public AcctTrnInfo getAcctTrnInfo() {
		return acctTrnInfo;
	}
	public void setAcctTrnInfo(AcctTrnInfo acctTrnInfo) {
		this.acctTrnInfo = acctTrnInfo;
	}
	public AcctTrnEnvr getAcctTrnEnvr() {
		return acctTrnEnvr;
	}
	public void setAcctTrnEnvr(AcctTrnEnvr acctTrnEnvr) {
		this.acctTrnEnvr = acctTrnEnvr;
	}
	public AcctTrnStatus getAcctTrnStatus() {
		return acctTrnStatus;
	}
	public void setAcctTrnStatus(AcctTrnStatus acctTrnStatus) {
		this.acctTrnStatus = acctTrnStatus;
	}
}