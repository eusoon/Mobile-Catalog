package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;



public  class AcctPricing extends IFXObject {

	protected AcctPricing(){	
	}
	
	public final native  PricingPlanIdent getPricingPlanIdent()/*-{
		return $wnd.cleanObject(this.pricingPlanIdent);
	}-*/;
	public final native  void setPricingPlanIdent(PricingPlanIdent pricingPlanIdent)/*-{
		this.pricingPlanIdent = pricingPlanIdent;
	}-*/;
	public final native  TimeFrame getTimeFrame()/*-{
		return $wnd.cleanObject(this.timeFrame);
	}-*/;
	public final native  void setTimeFrame(TimeFrame timeFrame)/*-{
		this.timeFrame = timeFrame;
	}-*/;
	public final native  JsArray<Fee> getFee()/*-{
		return $wnd.cleanObject(this.fee);
	}-*/;
	public final native  void setFee(JsArray<Fee> fee)/*-{
		this.fee = fee;
	}-*/;
	public final native  PricingCode getPricingCode()/*-{
		return $wnd.cleanObject(this.pricingCode);
	}-*/;
	public final native  void setPricingCode(PricingCode pricingCode)/*-{
		this.pricingCode = pricingCode;
	}-*/;
	public final native  PricingReason getPricingReason()/*-{
		return $wnd.cleanObject(this.pricingReason);
	}-*/;
	public final native  void setPricingReason(PricingReason pricingReason)/*-{
		this.pricingReason = pricingReason;
	}-*/;

}
