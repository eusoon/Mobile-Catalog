package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class UltimateCreditorData extends IFXObject {
	PartyData PartyData;//Abstract Aggregate	Required Party information. Valid Aggregates are: OrgData PersonData
	DebtorAcctNumWithCreditor debtorAcctNumWithCreditor;//NC-36	Optional Accounts Receivable or similar identifier assigned to this debtor/payer/customer in the creditor/payee's accounting system.
	public PartyData getPartyData() {
		return PartyData;
	}
	public void setPartyData(PartyData partyData) {
		PartyData = partyData;
	}
	public DebtorAcctNumWithCreditor getDebtorAcctNumWithCreditor() {
		return debtorAcctNumWithCreditor;
	}
	public void setDebtorAcctNumWithCreditor(
			DebtorAcctNumWithCreditor debtorAcctNumWithCreditor) {
		this.debtorAcctNumWithCreditor = debtorAcctNumWithCreditor;
	}
}
