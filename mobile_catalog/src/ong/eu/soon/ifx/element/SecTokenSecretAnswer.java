package ong.eu.soon.ifx.element;

public class SecTokenSecretAnswer extends SecToken {
	SecretIdent secretIdent;//NC-36	Required Secret Identification
	CryptType cryptType;//Open Enum	Required Encryption Type. Valid values include: ACBC, ACFB, ACM, AECB, AOFB, CBC, CFB, ECB, None, OFB, PKCS#1, PKCS#10, PKCS#7, RSA#1, TCBC, TCBC-I, TCFB, TCFB-P, TECB, TOFB, TOFB-I, TR-31
	SecObjId[] secObjId;//Identifier	Optional Repeating Security Object Identifier

	//begin-xor Required
	Secret secret;//C-80	Required Secret
	CryptSecret CryptSecret;//Aggregate		Required	Encrypted Password
	//end-xor
	public SecretIdent getSecretIdent() {
		return secretIdent;
	}
	public void setSecretIdent(SecretIdent secretIdent) {
		this.secretIdent = secretIdent;
	}
	public CryptType getCryptType() {
		return cryptType;
	}
	public void setCryptType(CryptType cryptType) {
		this.cryptType = cryptType;
	}
	public SecObjId[] getSecObjId() {
		return secObjId;
	}
	public void setSecObjId(SecObjId[] secObjId) {
		this.secObjId = secObjId;
	}
	public Secret getSecret() {
		return secret;
	}
	public void setSecret(Secret secret) {
		this.secret = secret;
	}
	public CryptSecret getCryptSecret() {
		return CryptSecret;
	}
	public void setCryptSecret(CryptSecret cryptSecret) {
		CryptSecret = cryptSecret;
	}
}
