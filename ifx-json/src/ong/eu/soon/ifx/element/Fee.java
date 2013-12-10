package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Fee extends IFXObject {
	FeeType feeType; //Open Enum	Required Fee Type

	CurAmt curAmt; //Aggregate	Optional Currency Amount. When used for a fixed amount fee, this is the fixed amount that will be charged. For fees that are calculated as a fixed amount plus a percentage of the transaction, this is the fixed amount and the percentage is in Rate.

	Rate rate; //	Decimal		Optional	Fee rate. Used as a percentage (e.g. a value of 5.2 equals 5.2%).

	MinCurAmt minCurAmt;//	Aggregate	Optional Minimum Currency Amount. The minimum amount to charge for this fee.

	MaxCurAmt maxCurAmt; //Aggregate	Optional Maximum Currency Amount. The maximum amount to charge for this fee.

	FeePlan feePlan; //C-80	Optional Fee Plan
	WaiveFeeInd waiveFeeInd;//Boolean	Optional Waive Fee Indicator
	FeeWaiver feeWaiver;//Aggregate	Optional Fee Waiver
	FeeAcctKeys feeAcctKeys; //Aggregate	Optional Fee Account Keys
	TimeFrame timeFrame;//Aggregate	Optional Time Frame
	public FeeType getFeeType() {
		return feeType;
	}
	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}
	public MinCurAmt getMinCurAmt() {
		return minCurAmt;
	}
	public void setMinCurAmt(MinCurAmt minCurAmt) {
		this.minCurAmt = minCurAmt;
	}
	public MaxCurAmt getMaxCurAmt() {
		return maxCurAmt;
	}
	public void setMaxCurAmt(MaxCurAmt maxCurAmt) {
		this.maxCurAmt = maxCurAmt;
	}
	public FeePlan getFeePlan() {
		return feePlan;
	}
	public void setFeePlan(FeePlan feePlan) {
		this.feePlan = feePlan;
	}
	public WaiveFeeInd getWaiveFeeInd() {
		return waiveFeeInd;
	}
	public void setWaiveFeeInd(WaiveFeeInd waiveFeeInd) {
		this.waiveFeeInd = waiveFeeInd;
	}
	public FeeWaiver getFeeWaiver() {
		return feeWaiver;
	}
	public void setFeeWaiver(FeeWaiver feeWaiver) {
		this.feeWaiver = feeWaiver;
	}
	public FeeAcctKeys getFeeAcctKeys() {
		return feeAcctKeys;
	}
	public void setFeeAcctKeys(FeeAcctKeys feeAcctKeys) {
		this.feeAcctKeys = feeAcctKeys;
	}
	public TimeFrame getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}

}
