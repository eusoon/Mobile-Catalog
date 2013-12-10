package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CardOrderRef extends IFXObject {

	protected CardOrderRef(){
	}
	
	public final native  CardOrderKeys getCardOrderKeys()/*-{
		return $wnd.cleanObject(this.cardOrderKeys);
	}-*/;
	public final native  void setCardOrderKeys(CardOrderKeys cardOrderKeys)/*-{
		this.cardOrderKeys = cardOrderKeys;
	}-*/;
	public final native  CardOrderRec getCardOrderRec()/*-{
		return $wnd.cleanObject(this.cardOrderRec);
	}-*/;
	public final native  void setCardOrderRec(CardOrderRec cardOrderRec)/*-{
		this.cardOrderRec = cardOrderRec;
	}-*/;
	public final native  CardOrderInfo getCardOrderInfo()/*-{
		return $wnd.cleanObject(this.cardOrderInfo);
	}-*/;
	public final native  void setCardOrderInfo(CardOrderInfo cardOrderInfo)/*-{
		this.cardOrderInfo = cardOrderInfo;
	}-*/;
}
