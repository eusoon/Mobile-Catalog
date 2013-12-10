package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkStatus extends IFXObject {

	PassbkStatusCode passbkStatusCode; //Open Enum	Required	Passbook Status Code	Valid values include: Deleted, MediaError, NewItems, UpToDate, Valid
	StatusDesc statusDesc; //C-255	Optional	Status Description
	EffDt effDt; //DateTime	Optional	Effective Date Time
	ApprovalIdent approvalIdent; //NC-36	Optional	Approval Identifier
	StatusModBy statusModBy; //Open Enum	Optional	Status Modified By	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	PassbkNewItemsToPrint passbkNewItemsToPrint; //Long	Optional	Passbook New Items To Print
	
	public PassbkStatusCode getPassbkStatusCode() {
		return passbkStatusCode;
	}
	public void setPassbkStatusCode(PassbkStatusCode passbkStatusCode) {
		this.passbkStatusCode = passbkStatusCode;
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
	public PassbkNewItemsToPrint getPassbkNewItemsToPrint() {
		return passbkNewItemsToPrint;
	}
	public void setPassbkNewItemsToPrint(PassbkNewItemsToPrint passbkNewItemsToPrint) {
		this.passbkNewItemsToPrint = passbkNewItemsToPrint;
	}
	
}
