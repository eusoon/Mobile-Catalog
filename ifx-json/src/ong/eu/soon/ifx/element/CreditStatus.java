package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CreditStatus extends IFXObject {
	CreditStatusCode creditStatusCode;//Open Enum	Required Credit Status Code Valid values include: Authorized, Deleted, Held, Posted, Rejected, Valid
	StatusDesc statusDesc;//C-255	Optional Status Description
	EffDt effDt;//DateTime	Optional Effective Date Time
	StatusModBy statusModBy;//Open Enum	Optional Status Modified By Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	CreditHeldAmtExpDt creditHeldAmtExpDt;//DateTime	Optional Credit Held Expiry Date
	StatusReason StatusReason;//C-80	Optional Status Reason
	public CreditStatusCode getCreditStatusCode() {
		return creditStatusCode;
	}
	public void setCreditStatusCode(CreditStatusCode creditStatusCode) {
		this.creditStatusCode = creditStatusCode;
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
	public StatusModBy getStatusModBy() {
		return statusModBy;
	}
	public void setStatusModBy(StatusModBy statusModBy) {
		this.statusModBy = statusModBy;
	}
	public CreditHeldAmtExpDt getCreditHeldAmtExpDt() {
		return creditHeldAmtExpDt;
	}
	public void setCreditHeldAmtExpDt(CreditHeldAmtExpDt creditHeldAmtExpDt) {
		this.creditHeldAmtExpDt = creditHeldAmtExpDt;
	}
	public StatusReason getStatusReason() {
		return StatusReason;
	}
	public void setStatusReason(StatusReason statusReason) {
		StatusReason = statusReason;
	}

}
