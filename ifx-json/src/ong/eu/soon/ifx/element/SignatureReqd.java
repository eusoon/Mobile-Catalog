package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SignatureReqd extends IFXObject {
	NumSignatureReqd numSignatureReqd;
	SignatureAmtLimit signatureAmtLimit;
	SignatureTransaction signatureTransaction;
	SigningInstruction signingInstruction;
	public NumSignatureReqd getNumSignatureReqd() {
		return numSignatureReqd;
	}
	public void setNumSignatureReqd(NumSignatureReqd numSignatureReqd) {
		this.numSignatureReqd = numSignatureReqd;
	}
	public SignatureAmtLimit getSignatureAmtLimit() {
		return signatureAmtLimit;
	}
	public void setSignatureAmtLimit(SignatureAmtLimit signatureAmtLimit) {
		this.signatureAmtLimit = signatureAmtLimit;
	}
	public SignatureTransaction getSignatureTransaction() {
		return signatureTransaction;
	}
	public void setSignatureTransaction(SignatureTransaction signatureTransaction) {
		this.signatureTransaction = signatureTransaction;
	}
	public SigningInstruction getSigningInstruction() {
		return signingInstruction;
	}
	public void setSigningInstruction(SigningInstruction signingInstruction) {
		this.signingInstruction = signingInstruction;
	}
}
