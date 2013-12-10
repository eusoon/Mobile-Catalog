package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DepAcctData extends IFXObject {
	AcctHashValue acctHashValue;//	NC-22	Optional Account Hash Value
	SignatureReqd[] signatureReqd; //Aggregate	Optional Repeating Signature Required
	SignatureCode signatureCode; //Open Enum	Optional Signature Code Valid values include: Missing, OnlineSignatureCaptured, SignatureCardExpired, SignatureCardOnFile
	IntDispData intDispData;//Aggregate	Optional Interest Disposition Data
	RetirementPlanIdent retirementPlanIdent; //NC-36	Optional Retirement Plan Identification

	RenewalOption renewalOption;//Open Enum	Optional Renewal Option Valid values include: AutomaticRenewal, NoRenewalAllowed, RenewAtCurrentRate

	public AcctHashValue getAcctHashValue() {
		return acctHashValue;
	}
	public void setAcctHashValue(AcctHashValue acctHashValue) {
		this.acctHashValue = acctHashValue;
	}
	public SignatureReqd[] getSignatureReqd() {
		return signatureReqd;
	}
	public void setSignatureReqd(SignatureReqd[] signatureReqd) {
		this.signatureReqd = signatureReqd;
	}
	public SignatureCode getSignatureCode() {
		return signatureCode;
	}
	public void setSignatureCode(SignatureCode signatureCode) {
		this.signatureCode = signatureCode;
	}
	public IntDispData getIntDispData() {
		return intDispData;
	}
	public void setIntDispData(IntDispData intDispData) {
		this.intDispData = intDispData;
	}
	public RetirementPlanIdent getRetirementPlanIdent() {
		return retirementPlanIdent;
	}
	public void setRetirementPlanIdent(RetirementPlanIdent retirementPlanIdent) {
		this.retirementPlanIdent = retirementPlanIdent;
	}
	public RenewalOption getRenewalOption() {
		return renewalOption;
	}
	public void setRenewalOption(RenewalOption renewalOption) {
		this.renewalOption = renewalOption;
	}
}