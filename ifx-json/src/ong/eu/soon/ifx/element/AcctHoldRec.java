package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctHoldRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AcctHoldId acctHoldId; //Identifier	Required	Account Hold Identifier
	AcctHoldInfo acctHoldInfo; //Aggregate	Required	Account Hold Information Aggregate
	AcctHoldEnvr acctHoldEnvr; //Aggregate	Optional	Account Hold Environment Aggregate
	AcctHoldStatus acctHoldStatus; //Aggregate	Required	Account Hold Status Aggregate
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctHoldId getAcctHoldId() {
		return acctHoldId;
	}
	public void setAcctHoldId(AcctHoldId acctHoldId) {
		this.acctHoldId = acctHoldId;
	}
	public AcctHoldInfo getAcctHoldInfo() {
		return acctHoldInfo;
	}
	public void setAcctHoldInfo(AcctHoldInfo acctHoldInfo) {
		this.acctHoldInfo = acctHoldInfo;
	}
	public AcctHoldEnvr getAcctHoldEnvr() {
		return acctHoldEnvr;
	}
	public void setAcctHoldEnvr(AcctHoldEnvr acctHoldEnvr) {
		this.acctHoldEnvr = acctHoldEnvr;
	}
	public AcctHoldStatus getAcctHoldStatus() {
		return acctHoldStatus;
	}
	public void setAcctHoldStatus(AcctHoldStatus acctHoldStatus) {
		this.acctHoldStatus = acctHoldStatus;
	}

	
	
}
