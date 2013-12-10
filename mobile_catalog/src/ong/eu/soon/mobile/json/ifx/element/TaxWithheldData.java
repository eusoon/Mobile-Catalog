package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class TaxWithheldData extends IFXObject {
	protected TaxWithheldData(){	
	}
	public final native TaxYear getTaxYear() /*-{
		return $wnd.cleanObject(taxYear);
	}-*/;
	public final native void setTaxYear(TaxYear taxYear) /*-{
		this.taxYear = taxYear;
	}-*/;
	public final native JsArray<TaxData> getTaxData() /*-{
		return $wnd.cleanObject(taxData);
	}-*/;
	public final native void setTaxData(JsArray<TaxData> taxData) /*-{
		this.taxData = taxData;
	}-*/;
	public final native TaxIdent getTaxIdent() /*-{
		return $wnd.cleanObject(taxIdent);
	}-*/;
	public final native void setTaxIdent(TaxIdent taxIdent) /*-{
		this.taxIdent = taxIdent;
	}-*/;

}
