package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CompRemitStmtStatus extends IFXObject {

	CompRemitStmtStatusCode compRemitStmtStatusCode; //Open Enum	Required	Comprehensible Remittance Status Code.	Valid values include: Deleted, Deposited, Pending, Rejected, Valid
	StatusDesc statusDesc; //C-255	Optional	Status Description
	EffDt effDt; //DateTime	Optional	Effective Date Time
	StatusModBy statusModBy; //Open Enum	Optional	Status Modified By	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	
	public CompRemitStmtStatusCode getCompRemitStmtStatusCode() {
		return compRemitStmtStatusCode;
	}
	public void setCompRemitStmtStatusCode(
			CompRemitStmtStatusCode compRemitStmtStatusCode) {
		this.compRemitStmtStatusCode = compRemitStmtStatusCode;
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
