package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class UltimateCreditorData extends IFXObject {
	protected UltimateCreditorData(){	
	}
	public final native  PartyData getPartyData()/*-{
		return $wnd.cleanObject(this.PartyData);
	}-*/;
	public final native  void setPartyData(PartyData partyData)/*-{
		PartyData = partyData;
	}-*/;
	public final native  DebtorAcctNumWithCreditor getDebtorAcctNumWithCreditor()/*-{
		return $wnd.cleanObject(this.debtorAcctNumWithCreditor);
	}-*/;
	public final native  void setDebtorAcctNumWithCreditor(
			DebtorAcctNumWithCreditor debtorAcctNumWithCreditor)/*-{
		this.debtorAcctNumWithCreditor = debtorAcctNumWithCreditor;
	}-*/;
}
