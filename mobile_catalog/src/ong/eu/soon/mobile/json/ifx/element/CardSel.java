package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CardSel extends IFXObject {
	
	protected CardSel(){
	}
	
	public final native  CardKeys getCardKeys()/*-{
		return $wnd.cleanObject(this.cardKeys);
	}-*/;

	public final native  void setCardKeys(CardKeys cardKeys)/*-{
		this.cardKeys = cardKeys;
	}-*/;

}
