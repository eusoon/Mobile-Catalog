package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctHoldStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	AcctHoldId acctHoldId; //Identifier	Required	Account Hold Identifier
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
	public AcctHoldStatus getAcctHoldStatus() {
		return acctHoldStatus;
	}
	public void setAcctHoldStatus(AcctHoldStatus acctHoldStatus) {
		this.acctHoldStatus = acctHoldStatus;
	}

	
	
}
