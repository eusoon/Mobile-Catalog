package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class Fee extends IFXObject {
	
	protected Fee(){
	}
	
	public final native  FeeType getFeeType()/*-{
		return $wnd.cleanObject(this.feeType);
	}-*/;
	public final native  void setFeeType(FeeType feeType)/*-{
		this.feeType = feeType;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  Rate getRate()/*-{
		return $wnd.cleanObject(this.rate);
	}-*/;
	public final native  void setRate(Rate rate)/*-{
		this.rate = rate;
	}-*/;
	public final native  MinCurAmt getMinCurAmt()/*-{
		return $wnd.cleanObject(this.minCurAmt);
	}-*/;
	public final native  void setMinCurAmt(MinCurAmt minCurAmt)/*-{
		this.minCurAmt = minCurAmt;
	}-*/;
	public final native  MaxCurAmt getMaxCurAmt()/*-{
		return $wnd.cleanObject(this.maxCurAmt);
	}-*/;
	public final native  void setMaxCurAmt(MaxCurAmt maxCurAmt)/*-{
		this.maxCurAmt = maxCurAmt;
	}-*/;
	public final native  FeePlan getFeePlan()/*-{
		return $wnd.cleanObject(this.feePlan);
	}-*/;
	public final native  void setFeePlan(FeePlan feePlan)/*-{
		this.feePlan = feePlan;
	}-*/;
	public final native  WaiveFeeInd getWaiveFeeInd()/*-{
		return $wnd.cleanObject(this.waiveFeeInd);
	}-*/;
	public final native  void setWaiveFeeInd(WaiveFeeInd waiveFeeInd)/*-{
		this.waiveFeeInd = waiveFeeInd;
	}-*/;
	public final native  FeeWaiver getFeeWaiver()/*-{
		return $wnd.cleanObject(this.feeWaiver);
	}-*/;
	public final native  void setFeeWaiver(FeeWaiver feeWaiver)/*-{
		this.feeWaiver = feeWaiver;
	}-*/;
	public final native  FeeAcctKeys getFeeAcctKeys()/*-{
		return $wnd.cleanObject(this.feeAcctKeys);
	}-*/;
	public final native  void setFeeAcctKeys(FeeAcctKeys feeAcctKeys)/*-{
		this.feeAcctKeys = feeAcctKeys;
	}-*/;
	public final native  TimeFrame getTimeFrame()/*-{
		return $wnd.cleanObject(this.timeFrame);
	}-*/;
	public final native  void setTimeFrame(TimeFrame timeFrame)/*-{
		this.timeFrame = timeFrame;
	}-*/;

}
