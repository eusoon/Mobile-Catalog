package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	PassbkId passbkId; //Identifier	Required	Passbook Identifier
	PassbkStatus passbkStatus; //Aggregate	Required	Passbook Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PassbkId getPassbkId() {
		return passbkId;
	}
	public void setPassbkId(PassbkId passbkId) {
		this.passbkId = passbkId;
	}
	public PassbkStatus getPassbkStatus() {
		return passbkStatus;
	}
	public void setPassbkStatus(PassbkStatus passbkStatus) {
		this.passbkStatus = passbkStatus;
	}
	
}
