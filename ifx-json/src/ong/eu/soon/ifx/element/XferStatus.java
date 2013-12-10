package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class XferStatus extends IFXObject {
	XferStatusCode xferStatusCode;//	Open Enum		Required	Transfer Processing Status Code
//	Valid values include: Cancelled, Cleared, Deleted, Failed, FIHeld, Held, Posted, Processed, RejClosed, Rejected, RejInactive, RejNoFund, Returned, Scheduled, Skipped, Valid
	StatusDesc statusDesc; //C-255	Optional	Status Description
	EffDt effDt; //DateTime	Optional	Effective Date Time
	StatusModBy statusModBy; //Open Enum	Optional	Status Modified By	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	StatusReason statusReason;//	C-80		Optional	Status Reason
	public XferStatusCode getXferStatusCode() {
		return xferStatusCode;
	}
	public void setXferStatusCode(XferStatusCode xferStatusCode) {
		this.xferStatusCode = xferStatusCode;
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
	public StatusReason getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(StatusReason statusReason) {
		this.statusReason = statusReason;
	}

}
