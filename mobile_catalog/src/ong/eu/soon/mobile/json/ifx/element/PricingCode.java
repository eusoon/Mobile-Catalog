package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PricingCode extends IFXObject {
	protected PricingCode(){	
	}
	public final native PricingCodeType getPricingCodeType() /*-{
		return $wnd.cleanObject(pricingCodeType);
	}-*/;
	public final native void setPricingCodeType(PricingCodeType pricingCodeType) /*-{
		this.pricingCodeType = pricingCodeType;
	}-*/;
	public final native PricingCodeValue getPricingCodeValue() /*-{
		return $wnd.cleanObject(pricingCodeValue);
	}-*/;
	public final native void setPricingCodeValue(PricingCodeValue pricingCodeValue) /*-{
		this.pricingCodeValue = pricingCodeValue;
	}-*/;
	public final native TimeFrame getTimeFrame() /*-{
		return $wnd.cleanObject(timeFrame);
	}-*/;
	public final native void setTimeFrame(TimeFrame timeFrame) /*-{
		this.timeFrame = timeFrame;
	}-*/;

}