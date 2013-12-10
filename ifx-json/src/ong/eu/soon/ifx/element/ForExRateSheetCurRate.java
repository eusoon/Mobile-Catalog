package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExRateSheetCurRate extends IFXObject {

	NewForExRate newForExRate; //Aggregate	Required	Foreign Exchange Rate
	ForExRateType forExRateType; //Closed Enum	Optional	Foreign Exchange Rate Type	Valid values are limited to: Commited, Future, Indicated, Spot	Default Value: Indicated
	BuySellIndicator buySellIndicator; //Closed Enum	Required	Buy Sell Indicator	Valid values are limited to: Buy, Sell
	ReceivingMethod receivingMethod; //Open Enum	Required	Receiving Method	Valid values include: Account, BankNotes, Draft, EFT, SSI
	ForExValDtType forExValDtType; //Closed Enum	Required	Foreign Exchange Value Date Type	Valid values are limited to: Cash, Forward, Spot, Tomorrow, Window
	ForExValDt forExValDt; //DateTime	Optional	Foreign Exchange Value Date
	MinCurAmt minCurAmt; //Aggregate	Optional	Minimum Amount
	MaxCurAmt maxCurAmt; //Aggregate	Optional	Maximum Currency Amount
	SmallBankNoteDenom smallBankNoteDenom; //Decimal	Optional	Small Bank Note Denomination
	EffTimeFrame effTimeFrame; //Aggregate	Optional	The start and end date and time for which the currency rate is effective.After the end date/time indicated in this aggregate the currency rate is no longer valid or guaranteed by the rate issuer.
	FixingDt fixingDt; //DateTime	Optional	Fixing Date
	ForExRateProviderName forExRateProviderName; //C-255	Optional	Foreign Exchange Rate Provider Name
	
	public NewForExRate getNewForExRate() {
		return newForExRate;
	}
	public void setNewForExRate(NewForExRate newForExRate) {
		this.newForExRate = newForExRate;
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
	public ReceivingMethod getReceivingMethod() {
		return receivingMethod;
	}
	public void setReceivingMethod(ReceivingMethod receivingMethod) {
		this.receivingMethod = receivingMethod;
	}
	public ForExValDtType getForExValDtType() {
		return forExValDtType;
	}
	public void setForExValDtType(ForExValDtType forExValDtType) {
		this.forExValDtType = forExValDtType;
	}
	public ForExValDt getForExValDt() {
		return forExValDt;
	}
	public void setForExValDt(ForExValDt forExValDt) {
		this.forExValDt = forExValDt;
	}
	public MinCurAmt getMinCurAmt() {
		return minCurAmt;
	}
	public void setMinCurAmt(MinCurAmt minCurAmt) {
		this.minCurAmt = minCurAmt;
	}
	public MaxCurAmt getMaxCurAmt() {
		return maxCurAmt;
	}
	public void setMaxCurAmt(MaxCurAmt maxCurAmt) {
		this.maxCurAmt = maxCurAmt;
	}
	public SmallBankNoteDenom getSmallBankNoteDenom() {
		return smallBankNoteDenom;
	}
	public void setSmallBankNoteDenom(SmallBankNoteDenom smallBankNoteDenom) {
		this.smallBankNoteDenom = smallBankNoteDenom;
	}
	public EffTimeFrame getEffTimeFrame() {
		return effTimeFrame;
	}
	public void setEffTimeFrame(EffTimeFrame effTimeFrame) {
		this.effTimeFrame = effTimeFrame;
	}
	public FixingDt getFixingDt() {
		return fixingDt;
	}
	public void setFixingDt(FixingDt fixingDt) {
		this.fixingDt = fixingDt;
	}
	public ForExRateProviderName getForExRateProviderName() {
		return forExRateProviderName;
	}
	public void setForExRateProviderName(ForExRateProviderName forExRateProviderName) {
		this.forExRateProviderName = forExRateProviderName;
	}
	
}