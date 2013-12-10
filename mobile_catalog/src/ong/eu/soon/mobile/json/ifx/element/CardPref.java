package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class CardPref extends IFXObject {
	
	protected CardPref(){
	}
	
	public final native  Language getLanguage()/*-{
		return $wnd.cleanObject(this.language);
	}-*/;
	public final native  void setLanguage(Language language)/*-{
		this.language = language;
	}-*/;
	public final native  JsArray<CardPrefTrn> getCardPrefTrn()/*-{
		return $wnd.cleanObject(this.cardPrefTrn);
	}-*/;
	public final native  void setCardPrefTrn(JsArray<CardPrefTrn> cardPrefTrn)/*-{
		this.cardPrefTrn = cardPrefTrn;
	}-*/;	
}
