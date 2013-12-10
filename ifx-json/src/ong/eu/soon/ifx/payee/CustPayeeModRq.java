package ong.eu.soon.ifx.payee;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CustPayeeInfo;
import ong.eu.soon.ifx.element.CustPayeeKeys;
import ong.eu.soon.ifx.element.DelElements;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.NewElements;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.UpdElements;

public class CustPayeeModRq extends IFXObject {
	//begin Aggregate
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CustPayeeKeys custPayeeKeys;	 //	Aggregate	 Required	 Customer Payee Keys Aggregate
	CustPayeeInfo custPayeeInfo;	 //	Aggregate	 Required	 Customer Payee Information Aggregate
	//begin-xor Required Repeating 
	DelElements[] delElements;//IfxPath	Required An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to delete. It is an error if one attempts to delete Required fields.
	UpdElements[] UpdElements;//IfxPath	Required An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to update.  The new value of the updated element is in the accompanying xxxInfo aggregate.
	NewElements[] NewElements;//IfxPath	Required An IfxPath (relative to a base of this IFX object's Info aggregate) which indicates which element to add. The new value of the new elements is in the accompanying xxxInfo aggregate.
	//end-xor
	//end Aggregate
	
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
	public CustPayeeKeys getCustPayeeKeys() {
		return custPayeeKeys;
	}
	public void setCustPayeeKeys(CustPayeeKeys custPayeeKeys) {
		this.custPayeeKeys = custPayeeKeys;
	}
	public CustPayeeInfo getCustPayeeInfo() {
		return custPayeeInfo;
	}
	public void setCustPayeeInfo(CustPayeeInfo custPayeeInfo) {
		this.custPayeeInfo = custPayeeInfo;
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
