package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ExceptionRpt extends IFXObject {

	ExceptionResponse exceptionResponse;//Open Enum	Required	Exception Response	Valid values include: Collections, Counterfeit, Credit, Decline, Fraud, Lost, Other, PickUp, PickUpSpecial, RefertoIssuer, Stolen, Unauthorized, VIPApproval, VIPApprovalA1, VIPApprovalA2, VIPApprovalA3, VIPApprovalA4, VIPApprovalA5, VIPApprovalA6, VIPApprovalA7, VIPApprovalA8, VIPApprovalA9, VIPApprovalAD, VIPApprovalXA
	PurgeDt purgeDt;//Date	Required	The date the exception report should be purged from the exception condition response file
	LimitAmt limitAmt;//Aggregate	Optional	Identifies the maximum dollar amount to approve an authorization for a VIP.

	//begin-block	Optional Repeating
	ExceptionRegion[] exceptionRegion;//Open Enum	Required	Exception Region	Valid values include: AfricaMiddleEast, AfricaMiddleEastSouthAsia, ALL, AsiaPacific, C1, C2, C3, Canada, EuropeMiddleEast, LatinAmerica, NationalCRBInd, NoLocation, OutsideUnitedStates, UnitedStates, US1, US2, US3, US4, US5, US6, US7, US8, US9
	RegionPurgeDt[] regionPurgeDt;//Date	Optional	If this field is not included, then the region will use the same purge date as the exception file purge date.
	//end-block
	public ExceptionResponse getExceptionResponse() {
		return exceptionResponse;
	}
	public void setExceptionResponse(ExceptionResponse exceptionResponse) {
		this.exceptionResponse = exceptionResponse;
	}
	public PurgeDt getPurgeDt() {
		return purgeDt;
	}
	public void setPurgeDt(PurgeDt purgeDt) {
		this.purgeDt = purgeDt;
	}
	public LimitAmt getLimitAmt() {
		return limitAmt;
	}
	public void setLimitAmt(LimitAmt limitAmt) {
		this.limitAmt = limitAmt;
	}
	public ExceptionRegion[] getExceptionRegion() {
		return exceptionRegion;
	}
	public void setExceptionRegion(ExceptionRegion[] exceptionRegion) {
		this.exceptionRegion = exceptionRegion;
	}
	public RegionPurgeDt[] getRegionPurgeDt() {
		return regionPurgeDt;
	}
	public void setRegionPurgeDt(RegionPurgeDt[] regionPurgeDt) {
		this.regionPurgeDt = regionPurgeDt;
	}

	
}