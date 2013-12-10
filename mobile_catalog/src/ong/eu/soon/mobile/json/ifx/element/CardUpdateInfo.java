package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  abstract class CardUpdateInfo extends IFXObject {
	
	protected CardUpdateInfo(){
	}
	
	public final native  CardRef getCardRef()/*-{
		return $wnd.cleanObject(this.cardRef);
	}-*/;

	public final native  void setCardRef(CardRef cardRef)/*-{
		this.cardRef = cardRef;
	}-*/;
}
