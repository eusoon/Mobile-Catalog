package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.DelElements;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.NewElements;
import ong.eu.soon.ifx.element.PartyInfo;
import ong.eu.soon.ifx.element.PartyKeys;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.UpdElements;

public class PartyModRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PartyKeys partyKeys;	 //	Aggregate	 Required	 Party Keys Aggregate
	//begin-block	Required Repeating
	PartyInfo[] partyInfo;	 //	Abstract Aggregate	 Required	 Party Information AggregateValid Aggregates are:OrgPartyInfoPersonPartyInfo
	//begin-xor	Required Repeating
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
	public PartyKeys getPartyKeys() {
		return partyKeys;
	}
	public void setPartyKeys(PartyKeys partyKeys) {
		this.partyKeys = partyKeys;
	}
	public PartyInfo[] getPartyInfo() {
		return partyInfo;
	}
	public void setPartyInfo(PartyInfo[] partyInfo) {
		this.partyInfo = partyInfo;
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
