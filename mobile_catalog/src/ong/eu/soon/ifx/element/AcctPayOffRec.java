package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctPayOffRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	AcctPayOffId acctPayOffId;	 //	Identifier	 Required	 Account PayOff Identifier
	AcctPayOffInfo acctPayOffInfo;	 //	Aggregate	 Required	 Account PayOff Information Aggregate
	AcctPayOffEnvr acctPayOffEnvr;	 //	Aggregate	 Optional	 Account PayOff Environment Aggregate
	AcctPayOffStatus acctPayOffStatus;	 //	Aggregate	 Required	 Account PayOff Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctPayOffId getAcctPayOffId() {
		return acctPayOffId;
	}
	public void setAcctPayOffId(AcctPayOffId acctPayOffId) {
		this.acctPayOffId = acctPayOffId;
	}
	public AcctPayOffInfo getAcctPayOffInfo() {
		return acctPayOffInfo;
	}
	public void setAcctPayOffInfo(AcctPayOffInfo acctPayOffInfo) {
		this.acctPayOffInfo = acctPayOffInfo;
	}
	public AcctPayOffEnvr getAcctPayOffEnvr() {
		return acctPayOffEnvr;
	}
	public void setAcctPayOffEnvr(AcctPayOffEnvr acctPayOffEnvr) {
		this.acctPayOffEnvr = acctPayOffEnvr;
	}
	public AcctPayOffStatus getAcctPayOffStatus() {
		return acctPayOffStatus;
	}
	public void setAcctPayOffStatus(AcctPayOffStatus acctPayOffStatus) {
		this.acctPayOffStatus = acctPayOffStatus;
	}
	
}
