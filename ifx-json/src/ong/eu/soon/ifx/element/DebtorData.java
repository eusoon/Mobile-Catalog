package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DebtorData extends IFXObject {
	PartyData partyData;	 //	Abstract Aggregate	 Required	 Party information.Valid Aggregates are:OrgDataPersonData
	DebtorAcctNumWithCreditor debtorAcctNumWithCreditor;	 //	NC-36	 Optional	 Accounts Receivable or similar identifier assigned to this debtor/payer/customer in the creditor/payee's accounting system.
	
	public PartyData getPartyData() {
		return partyData;
	}
	public void setPartyData(PartyData partyData) {
		this.partyData = partyData;
	}
	public DebtorAcctNumWithCreditor getDebtorAcctNumWithCreditor() {
		return debtorAcctNumWithCreditor;
	}
	public void setDebtorAcctNumWithCreditor(
			DebtorAcctNumWithCreditor debtorAcctNumWithCreditor) {
		this.debtorAcctNumWithCreditor = debtorAcctNumWithCreditor;
	}
}