package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcStatus extends IFXObject {
	SvcStatusCode svcStatusCode; //Open Enum	Required	Service Status Code	
	//Valid values include: Active, Deleted, Inactive, Valid
	StatusDesc statusDesc; //C-255	Optional	Status Description
	EffDt effDt; //DateTime	Optional	Effective Date Time
	StatusModBy statusModBy; //Open Enum	Optional	Status Modified By	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	public SvcStatusCode getSvcStatusCode() {
		return svcStatusCode;
	}
	public void setSvcStatusCode(SvcStatusCode svcStatusCode) {
		this.svcStatusCode = svcStatusCode;
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
	
}
