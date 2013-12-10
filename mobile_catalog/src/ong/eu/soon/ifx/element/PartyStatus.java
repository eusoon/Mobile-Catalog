package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyStatus extends IFXObject {
	PartyStatusCode PartyStatusCode;//Open Enum	Required nParty Status Code
	//Valid values include: Deleted, Valid
	StatusDesc statusDesc;//C-255	Optional Status Description
	EffDt effDt;//DateTime	Optional Effective Date Time
	ApprovalIdent approvalIdent;//NC-36	Optional Approval Identifier
	StatusModBy statusModBy;//Open Enum	Optional Status Modified By
	//Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	public PartyStatusCode getPartyStatusCode() {
		return PartyStatusCode;
	}
	public void setPartyStatusCode(PartyStatusCode partyStatusCode) {
		PartyStatusCode = partyStatusCode;
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
