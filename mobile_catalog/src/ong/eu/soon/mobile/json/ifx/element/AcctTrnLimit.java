package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class AcctTrnLimit extends IFXObject {

	protected AcctTrnLimit(){	
	}
	public final native  TrnType getTrnType()/*-{
		return $wnd.cleanObject(this.TrnType);
	}-*/;

	public final native  void setTrnType(TrnType trnType)/*-{
		TrnType = trnType;
	}-*/;

	public final native  TrnSubType getTrnSubType()/*-{
		return $wnd.cleanObject(this.trnSubType);
	}-*/;

	public final native  void setTrnSubType(TrnSubType trnSubType)/*-{
		this.trnSubType = trnSubType;
	}-*/;

	public final native  AcctTrnUse getAcctTrnUse()/*-{
		return $wnd.cleanObject(this.acctTrnUse);
	}-*/;

	public final native  void setAcctTrnUse(AcctTrnUse acctTrnUse)/*-{
		this.acctTrnUse = acctTrnUse;
	}-*/;

	public final native  JsArray<TrnSrc> getTrnSrc()/*-{
		return $wnd.cleanObject(this.trnSrc);
	}-*/;

	public final native  void setTrnSrc(JsArray<TrnSrc> trnSrc)/*-{
		this.trnSrc = trnSrc;
	}-*/;

	public final native  JsArray<LimitType> getLimitType()/*-{
		return $wnd.cleanObject(this.limitType);
	}-*/;

	public final native  void setLimitType(JsArray<LimitType> limitType)/*-{
		this.limitType = limitType;
	}-*/;

	public final native  LimitAmount getLimitAmt()/*-{
		return $wnd.cleanObject(this.limitAmt);
	}-*/;

	public final native  void setLimitAmt(LimitAmount limitAmt)/*-{
		this.limitAmt = limitAmt;
	}-*/;

	public final native  LimitCount getLimitCount()/*-{
		return $wnd.cleanObject(this.limitCount);
	}-*/;

	public final native  void setLimitCount(LimitCount limitCount)/*-{
		this.limitCount = limitCount;
	}-*/;

}
