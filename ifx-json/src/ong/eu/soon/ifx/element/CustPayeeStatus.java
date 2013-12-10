package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CustPayeeStatus extends IFXObject {
	CustPayeeStatusCode custPayeeStatusCode;	 //	Open Enum	 Required	 Customer Payee Status CodeValid values include: Active, Deleted, Inactive , Pending, Valid
	StatusDesc statusDesc;	 //	C-255	 Optional	 Status Description
	EffDt effDt;	 //	DateTime	 Optional	 Effective Date Time
	ApprovalIdent approvalIdent;	 //	NC-36	 Optional	 Approval Identifier
	StatusModBy statusModBy;	 //	Open Enum	 Optional	 Status Modified ByValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	
	public CustPayeeStatusCode getCustPayeeStatusCode() {
		return custPayeeStatusCode;
	}
	public void setCustPayeeStatusCode(CustPayeeStatusCode custPayeeStatusCode) {
		this.custPayeeStatusCode = custPayeeStatusCode;
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
