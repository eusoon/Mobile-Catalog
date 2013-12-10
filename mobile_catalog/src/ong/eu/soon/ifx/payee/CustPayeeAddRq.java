package ong.eu.soon.ifx.payee;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CustPayeeInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CustPayeeAddRq extends IFXObject {
	//begin Aggregate
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	CustPayeeInfo custPayeeInfo;	 //	Aggregate	 Required	 Customer Payee Information Aggregate
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
	public CustPayeeInfo getCustPayeeInfo() {
		return custPayeeInfo;
	}
	public void setCustPayeeInfo(CustPayeeInfo custPayeeInfo) {
		this.custPayeeInfo = custPayeeInfo;
	}
}
