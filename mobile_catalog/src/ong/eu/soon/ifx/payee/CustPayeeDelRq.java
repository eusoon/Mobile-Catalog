package ong.eu.soon.ifx.payee;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CustPayeeKeys;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CustPayeeDelRq extends IFXObject{
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CustPayeeKeys custPayeeKeys;	 //	Aggregate	 Required	 Customer Payee Keys Aggregate
	
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
}
