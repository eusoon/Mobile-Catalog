package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class TaxData extends IFXObject {
	protected TaxData(){	
	}
	public final native Org getOrg() /*-{
		return $wnd.cleanObject(org);
	}-*/;
	public final native void setOrg(Org org) /*-{
		this.org = org;
	}-*/;
	public final native TaxType getTaxType() /*-{
		return $wnd.cleanObject(taxType);
	}-*/;
	public final native void setTaxType(TaxType taxType) /*-{
		this.taxType = taxType;
	}-*/;
	public final native TaxAmount getTaxAmount() /*-{
		return $wnd.cleanObject(taxAmount);
	}-*/;
	public final native void setTaxAmount(TaxAmount taxAmount) /*-{
		this.taxAmount = taxAmount;
	}-*/;
	public final native Rate getRate() /*-{
		return $wnd.cleanObject(rate);
	}-*/;
	public final native void setRate(Rate rate) /*-{
		this.rate = rate;
	}-*/;
}
