package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkItemRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	PassbkItemId passbkItemId; //Identifier	Required	Passbook Item Identifier
	PassbkItemInfo passbkItemInfo; //Aggregate	Required	Passbook Item Information Aggregate
	PassbkItemEnvr passbkItemEnvr; //Aggregate	Optional	Passbook Item Environment Aggregate
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
	public PassbkItemInfo getPassbkItemInfo() {
		return passbkItemInfo;
	}
	public void setPassbkItemInfo(PassbkItemInfo passbkItemInfo) {
		this.passbkItemInfo = passbkItemInfo;
	}
	public PassbkItemEnvr getPassbkItemEnvr() {
		return passbkItemEnvr;
	}
	public void setPassbkItemEnvr(PassbkItemEnvr passbkItemEnvr) {
		this.passbkItemEnvr = passbkItemEnvr;
	}
	public PassbkItemStatus getPassbkItemStatus() {
		return passbkItemStatus;
	}
	public void setPassbkItemStatus(PassbkItemStatus passbkItemStatus) {
		this.passbkItemStatus = passbkItemStatus;
	}
}
