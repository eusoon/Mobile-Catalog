package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PartyAuth extends IFXObject {
	SecToken[] secToken;//Abstract Aggregate	Required Repeating Security Token	
	//Valid Aggregates are:SecTokenCard SecTokenCert SecTokenICC SecTokenIssuedIdent SecTokenKey SecTokenLogin SecTokenMagCard SecTokenObject SecTokenParty SecTokenSecretAnswer

	public SecToken[] getSecToken() {
		return secToken;
	}

	public void setSecToken(SecToken[] secToken) {
		this.secToken = secToken;
	}
}
