package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PINData extends IFXObject {
	CryptType cryptType;//Open Enum	Required Encryption Type. Valid values include: ACBC, ACFB, ACM, AECB, AOFB, CBC, CFB, ECB, None, OFB, PKCS#1, PKCS#10, PKCS#7, RSA#1, TCBC, TCBC-I, TCFB, TCFB-P, TECB, TOFB, TOFB-I, TR-31
	SecObjId secObjId;//Identifier	Optional Repeating Security Object Identifier
	//begin-xor Required 
	PIN pIN;//NC-32	Required Personal Identification Number
	CryptPIN cryptPIN; //Aggregate	Required Encrypted PIN
	//end-xor
	public CryptType getCryptType() {
		return cryptType;
	}
	public void setCryptType(CryptType cryptType) {
		this.cryptType = cryptType;
	}
	public SecObjId getSecObjId() {
		return secObjId;
	}
	public void setSecObjId(SecObjId secObjId) {
		this.secObjId = secObjId;
	}
	public PIN getpIN() {
		return pIN;
	}
	public void setpIN(PIN pIN) {
		this.pIN = pIN;
	}
	public CryptPIN getCryptPIN() {
		return cryptPIN;
	}
	public void setCryptPIN(CryptPIN cryptPIN) {
		this.cryptPIN = cryptPIN;
	}

}
