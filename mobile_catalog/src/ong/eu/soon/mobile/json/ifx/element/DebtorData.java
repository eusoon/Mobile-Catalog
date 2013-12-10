package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class DebtorData extends IFXObject {

	protected DebtorData(){
	}
	
	public final native  PartyData getPartyData()/*-{
		return $wnd.cleanObject(this.partyData);
	}-*/;
	public final native  void setPartyData(PartyData partyData)/*-{
		this.partyData = partyData;
	}-*/;
	public final native  DebtorAcctNumWithCreditor getDebtorAcctNumWithCreditor()/*-{
		return $wnd.cleanObject(this.debtorAcctNumWithCreditor);
	}-*/;
	public final native  void setDebtorAcctNumWithCreditor(
			DebtorAcctNumWithCreditor debtorAcctNumWithCreditor)/*-{
		this.debtorAcctNumWithCreditor = debtorAcctNumWithCreditor;
	}-*/;
}
