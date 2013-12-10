package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardPref extends IFXObject {
	Language language;//NC-17	Optional	Language
	CardPrefTrn[] cardPrefTrn;//Aggregate	Optional Repeating	Card Preference Transaction
	
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public CardPrefTrn[] getCardPrefTrn() {
		return cardPrefTrn;
	}
	public void setCardPrefTrn(CardPrefTrn[] cardPrefTrn) {
		this.cardPrefTrn = cardPrefTrn;
	}	
}