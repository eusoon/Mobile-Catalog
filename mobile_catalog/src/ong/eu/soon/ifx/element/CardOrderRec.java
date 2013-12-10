package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardOrderRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	CardOrderId cardOrderId;	 //	Identifier	 Required	 Card Order Identifier
	CardOrderInfo cardOrderInfo;	 //	Aggregate	 Required	 Card Order Information Aggregate
	CardOrderEnvr cardOrderEnvr;	 //	Aggregate	 Optional	 Card Order Environment Aggregate
	CardOrderStatus cardOrderStatus;	 //	Aggregate	 Required	 Card Order Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CardOrderId getCardOrderId() {
		return cardOrderId;
	}
	public void setCardOrderId(CardOrderId cardOrderId) {
		this.cardOrderId = cardOrderId;
	}
	public CardOrderInfo getCardOrderInfo() {
		return cardOrderInfo;
	}
	public void setCardOrderInfo(CardOrderInfo cardOrderInfo) {
		this.cardOrderInfo = cardOrderInfo;
	}
	public CardOrderEnvr getCardOrderEnvr() {
		return cardOrderEnvr;
	}
	public void setCardOrderEnvr(CardOrderEnvr cardOrderEnvr) {
		this.cardOrderEnvr = cardOrderEnvr;
	}
	public CardOrderStatus getCardOrderStatus() {
		return cardOrderStatus;
	}
	public void setCardOrderStatus(CardOrderStatus cardOrderStatus) {
		this.cardOrderStatus = cardOrderStatus;
	}
}
