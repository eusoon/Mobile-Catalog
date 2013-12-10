package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctPricing extends IFXObject {
	PricingPlanIdent pricingPlanIdent; //C-36	Optional Pricing Plan Identifier
	TimeFrame timeFrame;//Aggregate	Optional Time Frame
	Fee[] fee;//Aggregate	Optional Repeating Fee
	PricingCode pricingCode;//Aggregate	Optional Repeating Pricing Code
	PricingReason pricingReason;//C-40	Optional Pricing Reason
	public PricingPlanIdent getPricingPlanIdent() {
		return pricingPlanIdent;
	}
	public void setPricingPlanIdent(PricingPlanIdent pricingPlanIdent) {
		this.pricingPlanIdent = pricingPlanIdent;
	}
	public TimeFrame getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}
	public Fee[] getFee() {
		return fee;
	}
	public void setFee(Fee[] fee) {
		this.fee = fee;
	}
	public PricingCode getPricingCode() {
		return pricingCode;
	}
	public void setPricingCode(PricingCode pricingCode) {
		this.pricingCode = pricingCode;
	}
	public PricingReason getPricingReason() {
		return pricingReason;
	}
	public void setPricingReason(PricingReason pricingReason) {
		this.pricingReason = pricingReason;
	}

}
