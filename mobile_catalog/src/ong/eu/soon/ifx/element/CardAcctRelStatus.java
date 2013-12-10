package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardAcctRelStatus extends IFXObject {

	CardAcctRelStatusCode cardAcctRelStatusCode;	 //	Open Enum	 Required	 Card Account Relationship Status CodeValid values include: Active, Deleted, Inactive, PendDelete, Pending
	StatusDesc statusDesc;	 //	C-255	 Optional	 Status Description
	EffDt effDt;	 //	DateTime	 Optional	 Effective Date Time
	StatusModBy statusModBy;	 //	Open Enum	 Optional	 Status Modified ByValid values include: BPP, BPPSR, BSP, BSPSR, CPP, CPPSR, CSP, CSPSR, Customer, FI, PSP
	
	public CardAcctRelStatusCode getCardAcctRelStatusCode() {
		return cardAcctRelStatusCode;
	}
	public void setCardAcctRelStatusCode(CardAcctRelStatusCode cardAcctRelStatusCode) {
		this.cardAcctRelStatusCode = cardAcctRelStatusCode;
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
