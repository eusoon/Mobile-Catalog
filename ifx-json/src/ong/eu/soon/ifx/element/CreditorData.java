package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CreditorData extends IFXObject {
	PartyData[] partyData;	 //	Abstract Aggregate	 Optional Repeating	 Party information.Valid Aggregates are:OrgDataPersonData
	CreditorAcctNumWithDebtor creditorAcctNumWithDebtor;	 //	NC-36	 Optional	 Aka AcctPayAcctIdent; Accounts Payable or similar identifier assigned to this creditor in the debtor's accounting system.
	
	public PartyData[] getPartyData() {
		return partyData;
	}
	public void setPartyData(PartyData[] partyData) {
		this.partyData = partyData;
	}
	public CreditorAcctNumWithDebtor getCreditorAcctNumWithDebtor() {
		return creditorAcctNumWithDebtor;
	}
	public void setCreditorAcctNumWithDebtor(
			CreditorAcctNumWithDebtor creditorAcctNumWithDebtor) {
		this.creditorAcctNumWithDebtor = creditorAcctNumWithDebtor;
	}
}
