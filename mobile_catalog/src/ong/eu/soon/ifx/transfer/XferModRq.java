package ong.eu.soon.ifx.transfer;

import ong.eu.soon.ifx.element.DelElements;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.NewElements;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.UpdElements;
import ong.eu.soon.ifx.element.XferInfo;

public class XferModRq {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	XferInfo xferInfo;//Aggregate	Required Funds Transfer Information Aggregate
	//begin-xor Required Repeating 
	DelElements[] delElements;//IfxPath	Required An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to delete. It is an error if one attempts to delete Required fields.
	UpdElements[] UpdElements;//IfxPath	Required An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to update.  The new value of the updated element is in the accompanying xxxInfo aggregate.
	NewElements[] NewElements;//IfxPath	Required An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to add. The new value of the new elements is in the accompanying xxxInfo aggregate.
	//end-xor
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
	public XferInfo getXferInfo() {
		return xferInfo;
	}
	public void setXferInfo(XferInfo xferInfo) {
		this.xferInfo = xferInfo;
	}
	public DelElements[] getDelElements() {
		return delElements;
	}
	public void setDelElements(DelElements[] delElements) {
		this.delElements = delElements;
	}
	public UpdElements[] getUpdElements() {
		return UpdElements;
	}
	public void setUpdElements(UpdElements[] updElements) {
		UpdElements = updElements;
	}
	public NewElements[] getNewElements() {
		return NewElements;
	}
	public void setNewElements(NewElements[] newElements) {
		NewElements = newElements;
	}


}
