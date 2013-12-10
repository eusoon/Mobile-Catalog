package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExDealInfo extends IFXObject {

	protected ForExDealInfo(){
	}
	
	public final native  ForExQuoteRef getForExQuoteRef()/*-{
		return $wnd.cleanObject(this.forExQuoteRef);
	}-*/;

	public final native  void setForExQuoteRef(ForExQuoteRef forExQuoteRef)/*-{
		this.forExQuoteRef = forExQuoteRef;
	}-*/;
}
