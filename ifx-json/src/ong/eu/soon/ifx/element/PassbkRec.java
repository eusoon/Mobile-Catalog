package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	PassbkId passbkId; //Identifier	Required	Passbook Identifier
	PassbkInfo passbkInfo; //Aggregate	Required	Passbook Information Aggregate
	PassbkEnvr passbkEnvr; //Aggregate	Optional	Passbook Environment Aggregate
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
	public PassbkInfo getPassbkInfo() {
		return passbkInfo;
	}
	public void setPassbkInfo(PassbkInfo passbkInfo) {
		this.passbkInfo = passbkInfo;
	}
	public PassbkEnvr getPassbkEnvr() {
		return passbkEnvr;
	}
	public void setPassbkEnvr(PassbkEnvr passbkEnvr) {
		this.passbkEnvr = passbkEnvr;
	}
	public PassbkStatus getPassbkStatus() {
		return passbkStatus;
	}
	public void setPassbkStatus(PassbkStatus passbkStatus) {
		this.passbkStatus = passbkStatus;
	}
	
}
