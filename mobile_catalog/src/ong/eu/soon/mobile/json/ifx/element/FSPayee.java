package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class FSPayee extends IFXObject {

	protected FSPayee(){
	}
	
	public final native  JsArray<PartyData> getPartyData()/*-{
		return $wnd.cleanObject(this.partyData);
	}-*/;

	public final native  void setPartyData(JsArray<PartyData> partyData)/*-{
		this.partyData = partyData;
	}-*/;
}
