package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class HouseHoldAddr extends IFXObject {

	protected HouseHoldAddr(){
	}
	
	public final native  HouseholdIdent getHouseholdIdent()/*-{
		return $wnd.cleanObject(this.householdIdent);
	}-*/;
	public final native  void setHouseholdIdent(HouseholdIdent householdIdent)/*-{
		this.householdIdent = householdIdent;
	}-*/;
	public final native  AddressIdent getAddressIdent()/*-{
		return $wnd.cleanObject(this.addressIdent);
	}-*/;
	public final native  void setAddressIdent(AddressIdent addressIdent)/*-{
		this.addressIdent = addressIdent;
	}-*/;	
}
