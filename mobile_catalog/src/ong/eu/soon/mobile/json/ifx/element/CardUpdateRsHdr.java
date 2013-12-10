package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CardUpdateRsHdr extends IFXObject {

	protected CardUpdateRsHdr(){
	}
	
	public final native  CardUpdateRec getCardUpdateRec()/*-{
		return $wnd.cleanObject(this.cardUpdateRec);
	}-*/;

	public final native  void setCardUpdateRec(CardUpdateRec cardUpdateRec)/*-{
		this.cardUpdateRec = cardUpdateRec;
	}-*/;
}
