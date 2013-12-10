package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExRateSheetCurRate extends IFXObject {

	protected ForExRateSheetCurRate(){
	}
	
	public final native  NewForExRate getNewForExRate()/*-{
		return $wnd.cleanObject(this.newForExRate);
	}-*/;
	public final native  void setNewForExRate(NewForExRate newForExRate)/*-{
		this.newForExRate = newForExRate;
	}-*/;
	public final native  ForExRateType getForExRateType()/*-{
		return $wnd.cleanObject(this.forExRateType);
	}-*/;
	public final native  void setForExRateType(ForExRateType forExRateType)/*-{
		this.forExRateType = forExRateType;
	}-*/;
	public final native  BuySellIndicator getBuySellIndicator()/*-{
		return $wnd.cleanObject(this.buySellIndicator);
	}-*/;
	public final native  void setBuySellIndicator(BuySellIndicator buySellIndicator)/*-{
		this.buySellIndicator = buySellIndicator;
	}-*/;
	public final native  ReceivingMethod getReceivingMethod()/*-{
		return $wnd.cleanObject(this.receivingMethod);
	}-*/;
	public final native  void setReceivingMethod(ReceivingMethod receivingMethod)/*-{
		this.receivingMethod = receivingMethod;
	}-*/;
	public final native  ForExValDtType getForExValDtType()/*-{
		return $wnd.cleanObject(this.forExValDtType);
	}-*/;
	public final native  void setForExValDtType(ForExValDtType forExValDtType)/*-{
		this.forExValDtType = forExValDtType;
	}-*/;
	public final native  ForExValDt getForExValDt()/*-{
		return $wnd.cleanObject(this.forExValDt);
	}-*/;
	public final native  void setForExValDt(ForExValDt forExValDt)/*-{
		this.forExValDt = forExValDt;
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
	public final native  SmallBankNoteDenom getSmallBankNoteDenom()/*-{
		return $wnd.cleanObject(this.smallBankNoteDenom);
	}-*/;
	public final native  void setSmallBankNoteDenom(SmallBankNoteDenom smallBankNoteDenom)/*-{
		this.smallBankNoteDenom = smallBankNoteDenom;
	}-*/;
	public final native  EffTimeFrame getEffTimeFrame()/*-{
		return $wnd.cleanObject(this.effTimeFrame);
	}-*/;
	public final native  void setEffTimeFrame(EffTimeFrame effTimeFrame)/*-{
		this.effTimeFrame = effTimeFrame;
	}-*/;
	public final native  FixingDt getFixingDt()/*-{
		return $wnd.cleanObject(this.fixingDt);
	}-*/;
	public final native  void setFixingDt(FixingDt fixingDt)/*-{
		this.fixingDt = fixingDt;
	}-*/;
	public final native  ForExRateProviderName getForExRateProviderName()/*-{
		return $wnd.cleanObject(this.forExRateProviderName);
	}-*/;
	public final native  void setForExRateProviderName(ForExRateProviderName forExRateProviderName)/*-{
		this.forExRateProviderName = forExRateProviderName;
	}-*/;
	
}
