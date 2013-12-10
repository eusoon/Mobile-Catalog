package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkItemKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required	 
	PassbkItemId passbkItemId; //Identifier	Required	Passbook Item Identifier
	//end-xor
	
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

}
