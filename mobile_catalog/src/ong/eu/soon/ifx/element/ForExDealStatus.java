package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExDealStatus extends IFXObject {
	ForExDealStatusCode forExDealStatusCode;//	Open Enum		Required	Foreign Exchange Deal Status Code
	//	Valid values include: Canceled, Complete, Confirmed, Deleted, Expired, Valid
	StatusDesc statusDesc;//C-255	Optional Status Description
	EffDt effDt;//DateTime	Optional Effective Date Time
	ApprovalIdent approvalIdent;//NC-36	OptionalApproval Identifier
	StatusModBy statusModBy;//Open Enum	OptionalStatus Modified By nValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	public ForExDealStatusCode getForExDealStatusCode() {
		return forExDealStatusCode;
	}
	public void setForExDealStatusCode(ForExDealStatusCode forExDealStatusCode) {
		this.forExDealStatusCode = forExDealStatusCode;
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
