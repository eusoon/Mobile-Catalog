package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CPPData extends IFXObject {
	PartyData partyData;	 //	Abstract Aggregate	 Required	 Party DataValid Aggregates are:OrgDataPersonData

	public PartyData getPartyData() {
		return partyData;
	}

	public void setPartyData(PartyData partyData) {
		this.partyData = partyData;
	}
}
