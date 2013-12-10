package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctStmtId;
import ong.eu.soon.ifx.element.SvcIdent;

public class AcctStmtRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AcctStmtId acctStmtId; //Identifier	Required	Account Statement Identifier
	AcctStmtInfo acctStmtInfo; //Aggregate	Required	Account Statement Information Aggregate
	AcctStmtEnvr acctStmtEnvr; //Aggregate	Optional	Account Statement Environment Aggregate
	AcctStmtStatus acctStmtStatus; //Aggregate	Required	Account Statement Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctStmtId getAcctStmtId() {
		return acctStmtId;
	}
	public void setAcctStmtId(AcctStmtId acctStmtId) {
		this.acctStmtId = acctStmtId;
	}
	public AcctStmtInfo getAcctStmtInfo() {
		return acctStmtInfo;
	}
	public void setAcctStmtInfo(AcctStmtInfo acctStmtInfo) {
		this.acctStmtInfo = acctStmtInfo;
	}
	public AcctStmtEnvr getAcctStmtEnvr() {
		return acctStmtEnvr;
	}
	public void setAcctStmtEnvr(AcctStmtEnvr acctStmtEnvr) {
		this.acctStmtEnvr = acctStmtEnvr;
	}
	public AcctStmtStatus getAcctStmtStatus() {
		return acctStmtStatus;
	}
	public void setAcctStmtStatus(AcctStmtStatus acctStmtStatus) {
		this.acctStmtStatus = acctStmtStatus;
	}
}
