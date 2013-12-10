package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CompositeCurAmt extends IFXObject {
	
	protected CompositeCurAmt(){
	}
	
	public final native  CompositeCurAmtIdent getCompositeCurAmtIdent()/*-{
		return $wnd.cleanObject(this.compositeCurAmtIdent);
	}-*/;
	public final native  void setCompositeCurAmtIdent(CompositeCurAmtIdent compositeCurAmtIdent)/*-{
		this.compositeCurAmtIdent = compositeCurAmtIdent;
	}-*/;
	public final native  CompositeCurAmtType getCompositeCurAmtType()/*-{
		return $wnd.cleanObject(this.compositeCurAmtType);
	}-*/;
	public final native  void setCompositeCurAmtType(CompositeCurAmtType compositeCurAmtType)/*-{
		this.compositeCurAmtType = compositeCurAmtType;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  ExchangeRate getExchangeRate()/*-{
		return $wnd.cleanObject(this.exchangeRate);
	}-*/;
	public final native  void setExchangeRate(ExchangeRate exchangeRate)/*-{
		this.exchangeRate = exchangeRate;
	}-*/;
	public final native  Rate getRate()/*-{
		return $wnd.cleanObject(this.rate);
	}-*/;
	public final native  void setRate(Rate rate)/*-{
		this.rate = rate;
	}-*/;
	public final native  MinCurAmt getMinCurAmt()/*-{
		return $wnd.cleanObject(this.minCurAmt);
	}-*/;
	public final native  void setMinCurAmt(MinCurAmt minCurAmt)/*-{
		this.minCurAmt = minCurAmt;
	}-*/;
	public final native  MaxCurAmt getMaxCurAmt()/*-{
		return $wnd.cleanObject(this.maxCurAmt);
	}-*/;
	public final native  void setMaxCurAmt(MaxCurAmt maxCurAmt)/*-{
		this.maxCurAmt = maxCurAmt;
	}-*/;
	public final native  SpecialHandling getSpecialHandling()/*-{
		return $wnd.cleanObject(this.specialHandling);
	}-*/;
	public final native  void setSpecialHandling(SpecialHandling specialHandling)/*-{
		this.specialHandling = specialHandling;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
}
