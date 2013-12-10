package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillerStatus extends IFXObject {

	BillerStatusCode billerStatusCode;	 //	Open Enum	 Required	 Biller Status CodeValid values include: Available, AvailPend, Deleted, DelPend, Valid
	StatusDesc statusDesc;	 //	C-255	 Optional	 Status Description
	EffDt effDt;	 //	DateTime	 Optional	 Effective Date Time
	StatusModBy statusModBy;	 //	Open Enum	 Optional	 Status Modified ByValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	Memo memo;	 //	C-255	 Optional	 Memo
	public BillerStatusCode getBillerStatusCode() {
		return billerStatusCode;
	}
	public void setBillerStatusCode(BillerStatusCode billerStatusCode) {
		this.billerStatusCode = billerStatusCode;
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
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	
}
