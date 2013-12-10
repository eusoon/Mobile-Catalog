package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtBatchStatus extends IFXObject {

	PmtBatchStatusCode pmtBatchStatusCode;	 //	Open Enum	 Required	 Payment Batch Status CodeValid values include: Deleted, Valid
	StatusDesc statusDesc;	 //	C-255	 Optional	 Status Description
	EffDt effDt;	 //	DateTime	 Optional	 Effective Date Time
	ApprovalIdent approvalIdent;	 //	NC-36	 Optional	 Approval Identifier
	StatusModBy statusModBy;	 //	Open Enum	 Optional	 Status Modified ByValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	
	public PmtBatchStatusCode getPmtBatchStatusCode() {
		return pmtBatchStatusCode;
	}
	public void setPmtBatchStatusCode(PmtBatchStatusCode pmtBatchStatusCode) {
		this.pmtBatchStatusCode = pmtBatchStatusCode;
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
