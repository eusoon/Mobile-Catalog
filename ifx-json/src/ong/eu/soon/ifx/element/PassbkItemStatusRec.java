package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkItemStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	PassbkItemId passbkItemId; //Identifier	Required	Passbook Item Identifier
	PassbkItemStatus passbkItemStatus; //Aggregate	Required	Passbook Item Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PassbkItemId getPassbkItemId() {
		return passbkItemId;
	}
	public void setPassbkItemId(PassbkItemId passbkItemId) {
		this.passbkItemId = passbkItemId;
	}
	public PassbkItemStatus getPassbkItemStatus() {
		return passbkItemStatus;
	}
	public void setPassbkItemStatus(PassbkItemStatus passbkItemStatus) {
		this.passbkItemStatus = passbkItemStatus;
	}
	
}
