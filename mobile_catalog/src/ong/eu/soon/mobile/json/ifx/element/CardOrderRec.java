package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CardOrderRec extends IFXObject {

	protected CardOrderRec(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CardOrderId getCardOrderId()/*-{
		return $wnd.cleanObject(this.cardOrderId);
	}-*/;
	public final native  void setCardOrderId(CardOrderId cardOrderId)/*-{
		this.cardOrderId = cardOrderId;
	}-*/;
	public final native  CardOrderInfo getCardOrderInfo()/*-{
		return $wnd.cleanObject(this.cardOrderInfo);
	}-*/;
	public final native  void setCardOrderInfo(CardOrderInfo cardOrderInfo)/*-{
		this.cardOrderInfo = cardOrderInfo;
	}-*/;
	public final native  CardOrderEnvr getCardOrderEnvr()/*-{
		return $wnd.cleanObject(this.cardOrderEnvr);
	}-*/;
	public final native  void setCardOrderEnvr(CardOrderEnvr cardOrderEnvr)/*-{
		this.cardOrderEnvr = cardOrderEnvr;
	}-*/;
	public final native  CardOrderStatus getCardOrderStatus()/*-{
		return $wnd.cleanObject(this.cardOrderStatus);
	}-*/;
	public final native  void setCardOrderStatus(CardOrderStatus cardOrderStatus)/*-{
		this.cardOrderStatus = cardOrderStatus;
	}-*/;
}
