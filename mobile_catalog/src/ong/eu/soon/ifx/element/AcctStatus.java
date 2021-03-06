package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctStatus extends IFXObject {
	AcctStatusCode acctStatusCode; //Open Enum	Required Account Status Code Valid values include: Abandoned, Active, ChargedOff, ChargeOffInProcess, Closed, Closing, Delinquent, Dormant, Escheat, Frozen, Funded, Inactive, NotAvail, NotFunded, Open, PaidOff, Terminated, Unreedemed
	StatusDesc statusDesc;//C-255	Optional Status Description
	EffDt effDt;//DateTime		Optional	Effective Date Time
	ApprovalIdent qpprovalIdent;//NC-36		Optional	Approval Identifier
	StatusModBy statusModBy;//Open Enum		Optional	Status Modified By 	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	public AcctStatusCode getAcctStatusCode() {
		return acctStatusCode;
	}
	public void setAcctStatusCode(AcctStatusCode acctStatusCode) {
		this.acctStatusCode = acctStatusCode;
	}
	public StatusDesc getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(StatusDesc statusDesc) {
		this.statusDesc = statusDesc;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public ApprovalIdent getQpprovalIdent() {
		return qpprovalIdent;
	}
	public void setQpprovalIdent(ApprovalIdent qpprovalIdent) {
		this.qpprovalIdent = qpprovalIdent;
	}
	public StatusModBy getStatusModBy() {
		return statusModBy;
	}
	public void setStatusModBy(StatusModBy statusModBy) {
		this.statusModBy = statusModBy;
	}
}
