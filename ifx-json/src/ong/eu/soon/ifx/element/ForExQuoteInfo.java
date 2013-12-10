package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExQuoteInfo extends IFXObject {
	ForExQuoteType forExQuoteType;//Open Enum	Optional Foreign Exchange Quote Type
	//Valid values include: Drawdown, FXFuture, FXNetTrade, FXOption, FXTrade, Multi-Trade, Offset, SwapFarLeg, SwapNearLeg, TimeDeposit, Two-Way Default Value: FXTrade
	ForExRateType forExRateType;//Closed Enum	Optional Foreign Exchange Rate Type 
	//Valid values are limited to: Commited, Future, Indicated, Spot Default Value: Indicated
	BuySellIndicator buySellIndicator;//Closed Enum	Required Buy Sell Indicator
	//Valid values are limited to: Buy, Sell
	BidOffer bidOffer;//Closed Enum	Optional Bid Offer
	//Valid values are limited to: Bid, Offer
	BaseCurCode baseCurCode;//Aggregate	Required Base Currency Code
	BaseCurAmt baseCurAmt;//Decimal	Optional The amount of base currency, if this amount is known. 
	//This is the amount currency to be bought or sold.  If the base amount is not known, only the base currency code is specified, i.e.  Buy ‘x’ EUR with 1000 USD.
	//If this amount is provided on the request, then a value cannot be provided in <ContraCurAmt> (i.e. either the base or contra amount can be provided on the request, never both). 
	public ForExQuoteType getForExQuoteType() {
		return forExQuoteType;
	}
	public void setForExQuoteType(ForExQuoteType forExQuoteType) {
		this.forExQuoteType = forExQuoteType;
	}
	public ForExRateType getForExRateType() {
		return forExRateType;
	}
	public void setForExRateType(ForExRateType forExRateType) {
		this.forExRateType = forExRateType;
	}
	public BuySellIndicator getBuySellIndicator() {
		return buySellIndicator;
	}
	public void setBuySellIndicator(BuySellIndicator buySellIndicator) {
		this.buySellIndicator = buySellIndicator;
	}
	public BidOffer getBidOffer() {
		return bidOffer;
	}
	public void setBidOffer(BidOffer bidOffer) {
		this.bidOffer = bidOffer;
	}
	public BaseCurCode getBaseCurCode() {
		return baseCurCode;
	}
	public void setBaseCurCode(BaseCurCode baseCurCode) {
		this.baseCurCode = baseCurCode;
	}
	public BaseCurAmt getBaseCurAmt() {
		return baseCurAmt;
	}
	public void setBaseCurAmt(BaseCurAmt baseCurAmt) {
		this.baseCurAmt = baseCurAmt;
	}
}
