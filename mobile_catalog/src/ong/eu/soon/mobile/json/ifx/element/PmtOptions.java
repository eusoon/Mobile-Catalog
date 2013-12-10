package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtOptions extends IFXObject {
	protected PmtOptions(){	
	}
	public final native PmtInstType getPmtInstType() /*-{
		return $wnd.cleanObject(pmtInstType);
	}-*/;
	public final native void setPmtInstType(PmtInstType pmtInstType) /*-{
		this.pmtInstType = pmtInstType;
	}-*/;
	public final native Brand getBrand() /*-{
		return $wnd.cleanObject(brand);
	}-*/;
	public final native void setBrand(Brand brand) /*-{
		this.brand = brand;
	}-*/;
}