package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class DepAcctData extends IFXObject {

	protected DepAcctData(){
	}
	
	public final native  AcctHashValue getAcctHashValue()/*-{
		return $wnd.cleanObject(this.acctHashValue);
	}-*/;
	public final native  void setAcctHashValue(AcctHashValue acctHashValue)/*-{
		this.acctHashValue = acctHashValue;
	}-*/;
	public final native  JsArray<SignatureReqd> getSignatureReqd()/*-{
		return $wnd.cleanObject(this.signatureReqd);
	}-*/;
	public final native  void setSignatureReqd(JsArray<SignatureReqd> signatureReqd)/*-{
		this.signatureReqd = signatureReqd;
	}-*/;
	public final native  SignatureCode getSignatureCode()/*-{
		return $wnd.cleanObject(this.signatureCode);
	}-*/;
	public final native  void setSignatureCode(SignatureCode signatureCode)/*-{
		this.signatureCode = signatureCode;
	}-*/;
	public final native  IntDispData getIntDispData()/*-{
		return $wnd.cleanObject(this.intDispData);
	}-*/;
	public final native  void setIntDispData(IntDispData intDispData)/*-{
		this.intDispData = intDispData;
	}-*/;
	public final native  RetirementPlanIdent getRetirementPlanIdent()/*-{
		return $wnd.cleanObject(this.retirementPlanIdent);
	}-*/;
	public final native  void setRetirementPlanIdent(RetirementPlanIdent retirementPlanIdent)/*-{
		this.retirementPlanIdent = retirementPlanIdent;
	}-*/;
	public final native  RenewalOption getRenewalOption()/*-{
		return $wnd.cleanObject(this.renewalOption);
	}-*/;
	public final native  void setRenewalOption(RenewalOption renewalOption)/*-{
		this.renewalOption = renewalOption;
	}-*/;
}
