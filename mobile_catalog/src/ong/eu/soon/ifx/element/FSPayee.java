package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class FSPayee extends IFXObject {

	PartyData[] partyData; //Abstract Aggregate	Required	Party Data	Valid Aggregates are: OrgData, PersonData

	public PartyData[] getPartyData() {
		return partyData;
	}

	public void setPartyData(PartyData[] partyData) {
		this.partyData = partyData;
	}
}