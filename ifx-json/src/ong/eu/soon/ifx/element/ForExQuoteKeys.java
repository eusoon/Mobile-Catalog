package ong.eu.soon.ifx.element;

public class ForExQuoteKeys extends BaseKeys {
	SvcIdent SvcIdent;//Aggregate	Optional Service Identifier
	//begin-xor Required
	ForExQuoteId ForExQuoteId;//Identifier	Required Foreign Exchange Quote Identifier
	ForExQuoteIdent ForExQuoteIdent;//NC-250	Required Foreign Exchange Quote Identifier
	//end-xor
	public SvcIdent getSvcIdent() {
		return SvcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		SvcIdent = svcIdent;
	}
	public ForExQuoteId getForExQuoteId() {
		return ForExQuoteId;
	}
	public void setForExQuoteId(ForExQuoteId forExQuoteId) {
		ForExQuoteId = forExQuoteId;
	}
	public ForExQuoteIdent getForExQuoteIdent() {
		return ForExQuoteIdent;
	}
	public void setForExQuoteIdent(ForExQuoteIdent forExQuoteIdent) {
		ForExQuoteIdent = forExQuoteIdent;
	}

}
