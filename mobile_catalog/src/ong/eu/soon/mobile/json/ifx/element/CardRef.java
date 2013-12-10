package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CardRef extends IFXObject {

	protected CardRef(){
	}
	
	public final native CardKeys getCardKeys()/*-{
		return $wnd.cleanObject(this.cardKeys);
	}-*/;
	public final native void setCardKeys(CardKeys cardKeys)/*-{
		this.cardKeys = cardKeys;
	}-*/;
	public final native CardRec getCardRec()/*-{
		return $wnd.cleanObject(this.cardRec);
	}-*/;
	public final native void setCardRec(CardRec cardRec)/*-{
		this.cardRec = cardRec;
	}-*/;
	public final native CardInfo getCardInfo()/*-{
		return $wnd.cleanObject(this.cardInfo);
	}-*/;
	public final native void setCardInfo(CardInfo cardInfo)/*-{
		this.cardInfo = cardInfo;
	}-*/;
}
