package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CustPayeeStatusRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	CustPayeeId custPayeeId;	 //	Identifier	 Required	 Customer Payee Identifier
	CustPayeeStatus custPayeeStatus;	 //	Aggregate	 Required	 Customer Payee Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CustPayeeId getCustPayeeId() {
		return custPayeeId;
	}
	public void setCustPayeeId(CustPayeeId custPayeeId) {
		this.custPayeeId = custPayeeId;
	}
	public CustPayeeStatus getCustPayeeStatus() {
		return custPayeeStatus;
	}
	public void setCustPayeeStatus(CustPayeeStatus custPayeeStatus) {
		this.custPayeeStatus = custPayeeStatus;
	}
}