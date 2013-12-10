package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExQuoteStatus extends IFXObject {
	ForExQuoteStatusCode forExQuoteStatusCode;//Open Enum	RequiredForeign Exchange Quote Status Code
	//Valid values include: Canceled, Confirmed, Deleted, Expired, Indicative, Pending, Valid
	StatusDesc statusDesc;//C-255	Optional Status Description
	EffDt effDt;//DateTime	Optional Effective Date Time
	ApprovalIdent approvalIdent;//NC-36	OptionalApproval Identifier
	StatusModBy statusModBy;//Open Enum	OptionalStatus Modified By nValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	public ForExQuoteStatusCode getForExQuoteStatusCode() {
		return forExQuoteStatusCode;
	}
	public void setForExQuoteStatusCode(ForExQuoteStatusCode forExQuoteStatusCode) {
		this.forExQuoteStatusCode = forExQuoteStatusCode;
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
