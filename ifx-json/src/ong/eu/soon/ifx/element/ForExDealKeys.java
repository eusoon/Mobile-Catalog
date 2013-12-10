package ong.eu.soon.ifx.element;

public class ForExDealKeys extends BaseKeys {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	//begin-xor	Required
	ForExDealId forExDealId;	 //	Identifier	 Required	 Foreign Exchange Deal Identifier
	ForExDealIdent forExDealIdent;	 //	NC-250	 Required	 Foreign Exchange Deal Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public ForExDealId getForExDealId() {
		return forExDealId;
	}
	public void setForExDealId(ForExDealId forExDealId) {
		this.forExDealId = forExDealId;
	}
	public ForExDealIdent getForExDealIdent() {
		return forExDealIdent;
	}
	public void setForExDealIdent(ForExDealIdent forExDealIdent) {
		this.forExDealIdent = forExDealIdent;
	}
}
