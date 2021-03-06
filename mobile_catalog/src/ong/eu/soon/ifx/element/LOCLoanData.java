package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class LOCLoanData extends IFXObject {
	
	LOCLimit lOCLimit; //Aggregate	Optional LOC Limit -- The maximum authorized amount for the line of credit.
	MinPmt minPmt; //Aggregate	Optional Minimum Payment Amount.
	ExpDt expDt; //DateTime	Optional Expiration Date. If omitted, the LOC is open ended.
	public LOCLimit getlOCLimit() {
		return lOCLimit;
	}
	public void setlOCLimit(LOCLimit lOCLimit) {
		this.lOCLimit = lOCLimit;
	}
	public MinPmt getMinPmt() {
		return minPmt;
	}
	public void setMinPmt(MinPmt minPmt) {
		this.minPmt = minPmt;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}

}
