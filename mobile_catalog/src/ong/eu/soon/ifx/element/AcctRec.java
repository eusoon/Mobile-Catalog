package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctRec extends IFXObject {

	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	AcctId acctId;//Identifier	Required Account Identifier
	AcctInfo acctInfo;//Aggregate	Required Account Information Aggregate
	AcctEnvr acctEnvr;//Aggregate	Optional Account Environment Aggregate
	AcctStatus acctStatus;//Aggregate	Required Account Status Aggregate
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctId getAcctId() {
		return acctId;
	}
	public void setAcctId(AcctId acctId) {
		this.acctId = acctId;
	}
	public AcctInfo getAcctInfo() {
		return acctInfo;
	}
	public void setAcctInfo(AcctInfo acctInfo) {
		this.acctInfo = acctInfo;
	}
	public AcctEnvr getAcctEnvr() {
		return acctEnvr;
	}
	public void setAcctEnvr(AcctEnvr acctEnvr) {
		this.acctEnvr = acctEnvr;
	}
	public AcctStatus getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(AcctStatus acctStatus) {
		this.acctStatus = acctStatus;
	}


}
