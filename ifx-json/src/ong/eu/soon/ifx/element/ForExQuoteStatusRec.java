package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ForExQuoteStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	ForExQuoteId forExQuoteId; //Identifier	Required	Foreign Exchange Quote Identifier
	ForExQuoteStatus forExQuoteStatus; //Aggregate	Required	Foreign Exchange Quote Status
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public ForExQuoteId getForExQuoteId() {
		return forExQuoteId;
	}
	public void setForExQuoteId(ForExQuoteId forExQuoteId) {
		this.forExQuoteId = forExQuoteId;
	}
	public ForExQuoteStatus getForExQuoteStatus() {
		return forExQuoteStatus;
	}
	public void setForExQuoteStatus(ForExQuoteStatus forExQuoteStatus) {
		this.forExQuoteStatus = forExQuoteStatus;
	}
	
}
