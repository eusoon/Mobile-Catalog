package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class CreditorData extends IFXObject {
	
	protected CreditorData(){	
	}
	
	public final native  JsArray<PartyData> getPartyData()/*-{
		return $wnd.cleanObject(this.partyData);
	}-*/;
	public final native  void setPartyData(JsArray<PartyData> partyData)/*-{
		this.partyData = partyData;
	}-*/;
	public final native  CreditorAcctNumWithDebtor getCreditorAcctNumWithDebtor()/*-{
		return $wnd.cleanObject(this.creditorAcctNumWithDebtor);
	}-*/;
	public final native  void setCreditorAcctNumWithDebtor(
			CreditorAcctNumWithDebtor creditorAcctNumWithDebtor)/*-{
		this.creditorAcctNumWithDebtor = creditorAcctNumWithDebtor;
	}-*/;
}
