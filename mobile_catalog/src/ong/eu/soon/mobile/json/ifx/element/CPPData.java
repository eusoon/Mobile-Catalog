package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CPPData extends IFXObject {

	protected CPPData(){	
	}
	
	public final native  PartyData getPartyData()/*-{
		return partyData;
	}-*/;

	public final native  void setPartyData(PartyData partyData)/*-{
		this.partyData = partyData;
	}-*/;
}
