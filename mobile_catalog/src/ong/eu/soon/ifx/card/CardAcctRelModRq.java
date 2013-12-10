package ong.eu.soon.ifx.card;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CardAcctRelInfo;
import ong.eu.soon.ifx.element.CardAcctRelKeys;
import ong.eu.soon.ifx.element.DelElements;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.NewElements;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.UpdElements;

public class CardAcctRelModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CardAcctRelKeys cardAcctRelKeys;	 //	Aggregate	 Required	 Card Account Relationship Keys Aggregate
	//begin-block	Required Repeating
	CardAcctRelInfo[] cardAcctRelInfo;	 //	Aggregate	 Required	 Card Accountt Relationship Information Aggregate
	//begin-xor	Optional Repeating
	DelElements[] delElements;	 //	IfxPath	 Required	 An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to delete. It is an error if one attempts to delete Required fields.
	UpdElements[] updElements;	 //	IfxPath	 Required	 An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to update.  The new value of the updated element is in the accompanying xxxInfo aggregate.
	NewElements[] newElements;	 //	IfxPath	 Required	 An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to add. The new value of the new elements is in the accompanying xxxInfo aggregate.
	//end-xor
	//end-block
	
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRqHdr getMsgRqHdr() {
		return msgRqHdr;
	}
	public void setMsgRqHdr(MsgRqHdr msgRqHdr) {
		this.msgRqHdr = msgRqHdr;
	}
	public CardAcctRelKeys getCardAcctRelKeys() {
		return cardAcctRelKeys;
	}
	public void setCardAcctRelKeys(CardAcctRelKeys cardAcctRelKeys) {
		this.cardAcctRelKeys = cardAcctRelKeys;
	}
	public CardAcctRelInfo[] getCardAcctRelInfo() {
		return cardAcctRelInfo;
	}
	public void setCardAcctRelInfo(CardAcctRelInfo[] cardAcctRelInfo) {
		this.cardAcctRelInfo = cardAcctRelInfo;
	}
	public DelElements[] getDelElements() {
		return delElements;
	}
	public void setDelElements(DelElements[] delElements) {
		this.delElements = delElements;
	}
	public UpdElements[] getUpdElements() {
		return updElements;
	}
	public void setUpdElements(UpdElements[] updElements) {
		this.updElements = updElements;
	}
	public NewElements[] getNewElements() {
		return newElements;
	}
	public void setNewElements(NewElements[] newElements) {
		this.newElements = newElements;
	}
}
