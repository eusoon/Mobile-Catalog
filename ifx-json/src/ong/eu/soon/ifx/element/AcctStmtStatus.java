package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.EffDt;
import ong.eu.soon.ifx.element.StatusDesc;

public class AcctStmtStatus extends IFXObject {

	AcctStmtStatusCode acctStmtStatusCode; //Open Enum	Required	Account Statement Status Code	Valid values include: Deleted, Valid
	StatusDesc statusDesc; //C-255	Optional	Status Description
	EffDt effDt; //DateTime	Optional	Effective Date Time
	StatusModBy statusModBy; //Open Enum	Optional	Status Modified By	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	
	public AcctStmtStatusCode getAcctStmtStatusCode() {
		return acctStmtStatusCode;
	}
	public void setAcctStmtStatusCode(AcctStmtStatusCode acctStmtStatusCode) {
		this.acctStmtStatusCode = acctStmtStatusCode;
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
