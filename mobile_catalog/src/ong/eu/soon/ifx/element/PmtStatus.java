package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtStatus extends IFXObject {
	PmtStatusCode pmtStatusCode;	 //	Open Enum	 Required	 Payment Status CodeValid values include: Deleted, Valid
	StatusDesc statusDesc;	 //	C-255	 Optional	 Status Description
	EffDt effDt;	 //	DateTime	 Optional	 Effective Date Time
	ApprovalIdent approvalIdent;	 //	NC-36	 Optional	 Approval Identifier
	StatusModBy statusModBy;	 //	Open Enum	 Optional	 Status Modified ByValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	
	public PmtStatusCode getPmtStatusCode() {
		return pmtStatusCode;
	}
	public void setPmtStatusCode(PmtStatusCode pmtStatusCode) {
		this.pmtStatusCode = pmtStatusCode;
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
	public ApprovalIdent getApprovalIdent() {
		return approvalIdent;
	}
	public void setApprovalIdent(ApprovalIdent approvalIdent) {
		this.approvalIdent = approvalIdent;
	}
	public StatusModBy getStatusModBy() {
		return statusModBy;
	}
	public void setStatusModBy(StatusModBy statusModBy) {
		this.statusModBy = statusModBy;
	}
}
