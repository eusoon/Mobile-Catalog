package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public   class BillerInfo extends IFXObject{
	
	protected BillerInfo(){	
	}
	
	public final native  Name getName()/*-{
		return $wnd.cleanObject(name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  CreditorData getCreditorData()/*-{
		return $wnd.cleanObject(creditorData);
	}-*/;
	public final native  void setCreditorData(CreditorData creditorData)/*-{
		this.creditorData = creditorData;
	}-*/;
	public final native  JsArray<SecretPrompt> getSecretPrompt()/*-{
		return $wnd.cleanObject(secretPrompt);
	}-*/;
	public final native  void setSecretPrompt(JsArray<SecretPrompt> secretPrompt)/*-{
		this.secretPrompt = secretPrompt;
	}-*/;
	public final native  JsArray<CryptType> getCryptType()/*-{
		return $wnd.cleanObject(cryptType);
	}-*/;
	public final native  void setCryptType(JsArray<CryptType> cryptType)/*-{
		this.cryptType = cryptType;
	}-*/;
	public final native  HistRetentionDays getHistRetentionDays()/*-{
		return $wnd.cleanObject(histRetentionDays);
	}-*/;
	public final native  void setHistRetentionDays(HistRetentionDays histRetentionDays)/*-{
		this.histRetentionDays = histRetentionDays;
	}-*/;
	public final native  CSPCustInfoReq getcSPCustInfoReq()/*-{
		return $wnd.cleanObject(cSPCustInfoReq);
	}-*/;
	public final native  void setcSPCustInfoReq(CSPCustInfoReq cSPCustInfoReq)/*-{
		this.cSPCustInfoReq = cSPCustInfoReq;
	}-*/;
	public final native  BillerPayData getBillerPayData()/*-{
		return $wnd.cleanObject(billerPayData);
	}-*/;
	public final native  void setBillerPayData(BillerPayData billerPayData)/*-{
		this.billerPayData = billerPayData;
	}-*/;
	public final native  LogoURL getLogoURL()/*-{
		return $wnd.cleanObject(logoURL);
	}-*/;
	public final native  void setLogoURL(LogoURL logoURL)/*-{
		this.logoURL = logoURL;
	}-*/;
	public final native  Logo getLogo()/*-{
		return $wnd.cleanObject(logo);
	}-*/;
	public final native  void setLogo(Logo logo)/*-{
		this.logo = logo;
	}-*/;
	public final native  BillerEnrollURL getBillerEnrollURL()/*-{
		return $wnd.cleanObject(billerEnrollURL);
	}-*/;
	public final native  void setBillerEnrollURL(BillerEnrollURL billerEnrollURL)/*-{
		this.billerEnrollURL = billerEnrollURL;
	}-*/;
	public final native  BillerAcctIdSpec getBillerAcctIdSpec()/*-{
		return $wnd.cleanObject(billerAcctIdSpec);
	}-*/;
	public final native  void setBillerAcctIdSpec(BillerAcctIdSpec billerAcctIdSpec)/*-{
		this.billerAcctIdSpec = billerAcctIdSpec;
	}-*/;
	public final native  DiscReqd getDiscReqd()/*-{
		return $wnd.cleanObject(discReqd);
	}-*/;
	public final native  void setDiscReqd(DiscReqd discReqd)/*-{
		this.discReqd = discReqd;
	}-*/;
	public final native  DiscRef getDiscRef()/*-{
		return $wnd.cleanObject(discRef);
	}-*/;
	public final native  void setDiscRef(DiscRef discRef)/*-{
		this.discRef = discRef;
	}-*/;
	public final native  DiscDt getDiscDt()/*-{
		return $wnd.cleanObject(discDt);
	}-*/;
	public final native  void setDiscDt(DiscDt discDt)/*-{
		this.discDt = discDt;
	}-*/;


}
