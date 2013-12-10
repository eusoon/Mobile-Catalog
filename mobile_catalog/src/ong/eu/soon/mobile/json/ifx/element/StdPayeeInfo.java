package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class StdPayeeInfo extends IFXObject {
	protected StdPayeeInfo(){	
	}
	public final native PartyData getPartyData() /*-{
		return $wnd.cleanObject(partyData);
	}-*/;
	public final native void setPartyData(PartyData partyData) /*-{
		this.partyData = partyData;
	}-*/;
	public final native JsArray<AcctMask> getAcctMask() /*-{
		return $wnd.cleanObject(acctMask);
	}-*/;
	public final native void setAcctMask(JsArray<AcctMask> acctMask) /*-{
		this.acctMask = acctMask;
	}-*/;
	public final native DaysToPay getDaysToPay() /*-{
		return $wnd.cleanObject(daysToPay);
	}-*/;
	public final native void setDaysToPay(DaysToPay daysToPay) /*-{
		this.daysToPay = daysToPay;
	}-*/;
	public final native BillerKeys getBillerKeys() /*-{
		return $wnd.cleanObject(billerKeys);
	}-*/;
	public final native void setBillerKeys(BillerKeys billerKeys) /*-{
		this.billerKeys = billerKeys;
	}-*/;
}
