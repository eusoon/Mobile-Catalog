package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctKeys;
import ong.eu.soon.ifx.element.CardAcctRelKeys;
import ong.eu.soon.ifx.element.CardKeys;

public class CardAcctRelRevRs extends IFXObject {

	//begin-xor	Required Repeating
	CardAcctRelKeys[] cardAcctRelKeys;	 //	Aggregate	 Required	 Card Account Relationship Keys Aggregate
	//begin-block	Required
	CardKeys cardKeys;	 //	Aggregate	 Optional	 Card Keys Aggregate
	AcctKeys acctKeys;	 //	Aggregate	 Optional	 Account Keys Aggregate
	//end-block
	//end-xor
	
	public CardAcctRelKeys[] getCardAcctRelKeys() {
		return cardAcctRelKeys;
	}
	public void setCardAcctRelKeys(CardAcctRelKeys[] cardAcctRelKeys) {
		this.cardAcctRelKeys = cardAcctRelKeys;
	}
	public CardKeys getCardKeys() {
		return cardKeys;
	}
	public void setCardKeys(CardKeys cardKeys) {
		this.cardKeys = cardKeys;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	
}
