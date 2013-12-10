package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctHoldStatus extends IFXObject {

	AcctHoldStatusCode acctHoldStatusCode; //Open Enum	Required	Account Hold Status Code	Valid values include: Active, Deleted, Expired
	StatusDesc statusDesc; //C-255	Optional	Status Description
	EffDt effDt; //DateTime	Optional	Effective Date Time
	StatusModBy statusModBy; //Open Enum	Optional	Status Modified By	Valid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	public AcctHoldStatusCode getAcctHoldStatusCode() {
		return acctHoldStatusCode;
	}
	public void setAcctHoldStatusCode(AcctHoldStatusCode acctHoldStatusCode) {
		this.acctHoldStatusCode = acctHoldStatusCode;
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