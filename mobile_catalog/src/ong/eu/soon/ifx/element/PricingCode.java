package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PricingCode extends IFXObject {
	PricingCodeType pricingCodeType; //Open Enum	Optional Pricing Code Type Valid values include: MinimumPayment, PaymentSpread
	PricingCodeValue pricingCodeValue;//C-40	Optional Pricing Code Value
	TimeFrame timeFrame; //Aggregate	Optional Time Frame
	public PricingCodeType getPricingCodeType() {
		return pricingCodeType;
	}
	public void setPricingCodeType(PricingCodeType pricingCodeType) {
		this.pricingCodeType = pricingCodeType;
	}
	public PricingCodeValue getPricingCodeValue() {
		return pricingCodeValue;
	}
	public void setPricingCodeValue(PricingCodeValue pricingCodeValue) {
		this.pricingCodeValue = pricingCodeValue;
	}
	public TimeFrame getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}

}
