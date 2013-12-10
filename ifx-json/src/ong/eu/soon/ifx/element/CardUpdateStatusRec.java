package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardUpdateStatusRec extends IFXObject {
	
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	CardUpdateId cardUpdateId;	 //	Identifier	 Required	 Card Update Identifier
	CardUpdateStatus cardUpdateStatus;	 //	Abstract Aggregate	 Required	 Card Update Status AggregateValid Aggregates are:ICCUpdateStatusMagCardUpdateStatus
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CardUpdateId getCardUpdateId() {
		return cardUpdateId;
	}
	public void setCardUpdateId(CardUpdateId cardUpdateId) {
		this.cardUpdateId = cardUpdateId;
	}
	public CardUpdateStatus getCardUpdateStatus() {
		return cardUpdateStatus;
	}
	public void setCardUpdateStatus(CardUpdateStatus cardUpdateStatus) {
		this.cardUpdateStatus = cardUpdateStatus;
	}
}
