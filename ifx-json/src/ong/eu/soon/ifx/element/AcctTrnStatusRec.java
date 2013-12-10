package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctTrnStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AcctTrnId acctTrnId; //Identifier	Required	Account Transaction Identifier
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
	public AcctTrnStatus getAcctTrnStatus() {
		return acctTrnStatus;
	}
	public void setAcctTrnStatus(AcctTrnStatus acctTrnStatus) {
		this.acctTrnStatus = acctTrnStatus;
	}
	
}
