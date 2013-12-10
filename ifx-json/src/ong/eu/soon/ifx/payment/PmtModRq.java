package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.DelElements;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.NewElements;
import ong.eu.soon.ifx.element.PmtInfo;
import ong.eu.soon.ifx.element.PmtKeys;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.UpdElements;

public class PmtModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PmtKeys pmtKeys;	 //	Aggregate	 Required	 Payment Keys Aggregate
	//begin-block	Required Repeating
	PmtInfo[] pmtInfo;	 //	Aggregate	 Required	 Payment Information Aggregate
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
	public PmtKeys getPmtKeys() {
		return pmtKeys;
	}
	public void setPmtKeys(PmtKeys pmtKeys) {
		this.pmtKeys = pmtKeys;
	}
	public PmtInfo[] getPmtInfo() {
		return pmtInfo;
	}
	public void setPmtInfo(PmtInfo[] pmtInfo) {
		this.pmtInfo = pmtInfo;
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
