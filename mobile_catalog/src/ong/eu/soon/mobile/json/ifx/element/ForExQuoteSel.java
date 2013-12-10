package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExQuoteSel extends IFXObject {

	protected ForExQuoteSel(){
	}
	
	public final native  ForExQuoteKeys getForExQuoteKeys()/*-{
		return $wnd.cleanObject(this.forExQuoteKeys);
	}-*/;

	public final native  void setForExQuoteKeys(ForExQuoteKeys forExQuoteKeys)/*-{
		this.forExQuoteKeys = forExQuoteKeys;
	}-*/;
	
}
