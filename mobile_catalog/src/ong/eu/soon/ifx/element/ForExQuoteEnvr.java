package ong.eu.soon.ifx.element;

public class ForExQuoteEnvr extends BaseEnvr {
	ForExQuoteIdent forExQuoteIdent;//NC-250	Optional Foreign Exchange Quote Identifier
	NewForExRate newForExRate;//Aggregate	Required Foreign Exchange Rate
	ForExHomeRate forExHomeRate;//Aggregate Optional Foreign Exchange Home Rate
	ForwardPts forwardPts;//Decimal	Optional Forward Points
	EffTimeFrame effTimeFrame;//Aggregate	Required The start and end date and time for which the currency rate is effective.After the end date/time indicated in this aggregate the currency rate is no longer valid or guaranteed by the rate issuer.
	FixingDt fixingDt;//DateTime	Optional Fixing Date
	SmallBankNoteDenom smallBankNoteDenom;//Decimal	Optional Small Bank Note Denomination
	FundingDueDt FundingDueDt;//DateTime	Optional Funding Due Date
	public ForExQuoteIdent getForExQuoteIdent() {
		return forExQuoteIdent;
	}
	public void setForExQuoteIdent(ForExQuoteIdent forExQuoteIdent) {
		this.forExQuoteIdent = forExQuoteIdent;
	}
	public NewForExRate getNewForExRate() {
		return newForExRate;
	}
	public void setNewForExRate(NewForExRate newForExRate) {
		this.newForExRate = newForExRate;
	}
	public ForExHomeRate getForExHomeRate() {
		return forExHomeRate;
	}
	public void setForExHomeRate(ForExHomeRate forExHomeRate) {
		this.forExHomeRate = forExHomeRate;
	}
	public ForwardPts getForwardPts() {
		return forwardPts;
	}
	public void setForwardPts(ForwardPts forwardPts) {
		this.forwardPts = forwardPts;
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
	public SmallBankNoteDenom getSmallBankNoteDenom() {
		return smallBankNoteDenom;
	}
	public void setSmallBankNoteDenom(SmallBankNoteDenom smallBankNoteDenom) {
		this.smallBankNoteDenom = smallBankNoteDenom;
	}
	public FundingDueDt getFundingDueDt() {
		return FundingDueDt;
	}
	public void setFundingDueDt(FundingDueDt fundingDueDt) {
		FundingDueDt = fundingDueDt;
	}

}
