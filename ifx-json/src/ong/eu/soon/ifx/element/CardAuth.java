package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardAuth extends IFXObject {
	//begin-xor
	 SecToken secToken;//Abstract Aggregate	Optional	Security Token	Valid Aggregates are:SecTokenCard,SecTokenCert,SecTokenICC,SecTokenIssuedIdent,SecTokenKey,SecTokenLogin,SecTokenMagCard,SecTokenObject,SecTokenParty,SecTokenSecretAnswer
	ResetPinBlock resetPinBlock;//Open Enum	Optional	Reset PIN Block	Valid values include: InvalidPINAttempts, NumOfAttempts, OfflinePINTries
	//end-xor
	TemporaryPINInd temporaryPINInd;//Boolean	Optional	Temporary PIN Indicator
	public SecToken getSecToken() {
		return secToken;
	}
	public void setSecToken(SecToken secToken) {
		this.secToken = secToken;
	}
	public ResetPinBlock getResetPinBlock() {
		return resetPinBlock;
	}
	public void setResetPinBlock(ResetPinBlock resetPinBlock) {
		this.resetPinBlock = resetPinBlock;
	}
	public TemporaryPINInd getTemporaryPINInd() {
		return temporaryPINInd;
	}
	public void setTemporaryPINInd(TemporaryPINInd temporaryPINInd) {
		this.temporaryPINInd = temporaryPINInd;
	}
	
	
}