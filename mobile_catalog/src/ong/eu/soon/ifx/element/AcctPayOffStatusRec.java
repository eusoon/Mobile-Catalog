package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctPayOffStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AcctPayOffId acctPayOffId; //Identifier	Required	Account PayOff Identifier
	AcctPayOffStatus acctPayOffStatus; //Aggregate	Required	Account PayOff Status Aggregate
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
	public AcctPayOffStatus getAcctPayOffStatus() {
		return acctPayOffStatus;
	}
	public void setAcctPayOffStatus(AcctPayOffStatus acctPayOffStatus) {
		this.acctPayOffStatus = acctPayOffStatus;
	}
	
}
