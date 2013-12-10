package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyKeys extends IFXObject {
	SvcIdent svcIdent;
	PartyId partyId;
	LoginIdent loginIdent;
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PartyId getPartyId() {
		return partyId;
	}
	public void setPartyId(PartyId partyId) {
		this.partyId = partyId;
	}
	public LoginIdent getLoginIdent() {
		return loginIdent;
	}
	public void setLoginIdent(LoginIdent loginIdent) {
		this.loginIdent = loginIdent;
	}


}
