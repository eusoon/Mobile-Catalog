package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class HouseHoldAddr extends IFXObject {
	HouseholdIdent householdIdent;//NC-36	Required	Household Identifier
	AddressIdent addressIdent;//NC-36	Required	Address Identifier
	
	public HouseholdIdent getHouseholdIdent() {
		return householdIdent;
	}
	public void setHouseholdIdent(HouseholdIdent householdIdent) {
		this.householdIdent = householdIdent;
	}
	public AddressIdent getAddressIdent() {
		return addressIdent;
	}
	public void setAddressIdent(AddressIdent addressIdent) {
		this.addressIdent = addressIdent;
	}
	
	
}
