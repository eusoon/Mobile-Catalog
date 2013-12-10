package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.DelElements;
import ong.eu.soon.ifx.element.ForExQuoteInfo;
import ong.eu.soon.ifx.element.ForExQuoteKeys;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.NewElements;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.UpdElements;

public class ForExQuoteModRq extends IFXObject{
	
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	ForExQuoteKeys forExQuoteKeys; //Aggregate	Required	Foreign Exchange Quote Keys Aggregate
	//begin-block	Required Repeating	 
	ForExQuoteInfo[] forExQuoteInfo; //Aggregate	Required	Foreign Exchange Quote Information
	//begin-xor	Optional Repeating
	DelElements[] delElements; //IfxPath	Required	An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to delete. It is an error if one attempts to delete Required fields.
	UpdElements[] updElements; //IfxPath	Required	An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to update.  The new value of the updated element is in the accompanying xxxInfo aggregate.
	NewElements[] newElements; //IfxPath	Required	An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to add. The new value of the new elements is in the accompanying xxxInfo aggregate.
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
	public ForExQuoteKeys getForExQuoteKeys() {
		return forExQuoteKeys;
	}
	public void setForExQuoteKeys(ForExQuoteKeys forExQuoteKeys) {
		this.forExQuoteKeys = forExQuoteKeys;
	}
	public ForExQuoteInfo[] getForExQuoteInfo() {
		return forExQuoteInfo;
	}
	public void setForExQuoteInfo(ForExQuoteInfo[] forExQuoteInfo) {
		this.forExQuoteInfo = forExQuoteInfo;
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
