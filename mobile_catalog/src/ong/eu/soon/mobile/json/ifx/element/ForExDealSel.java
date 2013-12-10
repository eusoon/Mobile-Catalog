package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class ForExDealSel extends IFXObject {
	
	protected ForExDealSel(){
	}
	
	public final native  JsArray<ForExDealKeys> getForExDealKeys()/*-{
		return $wnd.cleanObject(this.forExDealKeys);
	}-*/;

	public final native  void setForExDealKeys(JsArray<ForExDealKeys> forExDealKeys)/*-{
		this.forExDealKeys = forExDealKeys;
	}-*/;
		
}
