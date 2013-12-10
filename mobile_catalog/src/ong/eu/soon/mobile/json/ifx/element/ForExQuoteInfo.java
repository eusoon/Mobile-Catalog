package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class ForExQuoteInfo extends IFXObject {

	protected ForExQuoteInfo(){
	}
	
	public final native  ForExQuoteType getForExQuoteType()/*-{
		return $wnd.cleanObject(this.forExQuoteType);
	}-*/;
	public final native  void setForExQuoteType(ForExQuoteType forExQuoteType)/*-{
		this.forExQuoteType = forExQuoteType;
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
	public final native  BidOffer getBidOffer()/*-{
		return $wnd.cleanObject(this.bidOffer);
	}-*/;
	public final native  void setBidOffer(BidOffer bidOffer)/*-{
		this.bidOffer = bidOffer;
	}-*/;
	public final native  BaseCurCode getBaseCurCode()/*-{
		return $wnd.cleanObject(this.baseCurCode);
	}-*/;
	public final native  void setBaseCurCode(BaseCurCode baseCurCode)/*-{
		this.baseCurCode = baseCurCode;
	}-*/;
	public final native  BaseCurAmt getBaseCurAmt()/*-{
		return $wnd.cleanObject(this.baseCurAmt);
	}-*/;
	public final native  void setBaseCurAmt(BaseCurAmt baseCurAmt)/*-{
		this.baseCurAmt = baseCurAmt;
	}-*/;
}
