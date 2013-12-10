package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkItemInfo extends IFXObject {

	PassbkId passbkId; //Identifier	Required	The Passbook Object this specific item is associated with.
	PassbkItemDetail passbkItemDetail; //Aggregate	Required	Details (e.g. line information) for this passbook item.
	
	public PassbkId getPassbkId() {
		return passbkId;
	}
	public void setPassbkId(PassbkId passbkId) {
		this.passbkId = passbkId;
	}
	public PassbkItemDetail getPassbkItemDetail() {
		return passbkItemDetail;
	}
	public void setPassbkItemDetail(PassbkItemDetail passbkItemDetail) {
		this.passbkItemDetail = passbkItemDetail;
	}
	
}
