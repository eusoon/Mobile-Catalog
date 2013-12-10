package ong.eu.soon.ifx.transfer;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.XferRec;
import ong.eu.soon.ifx.element.XferStatusRec;

public class XferAdviseRq extends IFXObject {
	RqUID rqUID; // UUID Required Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	//	begin-xor		Required	 
	XferRec xferRec;//Aggregate	Required	Funds Transfer Record Aggregate
	XferStatusRec xferStatusRec;//	Aggregate		Required	Funds Transfer Status Record Aggregate
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
	public XferRec getXferRec() {
		return xferRec;
	}
	public void setXferRec(XferRec xferRec) {
		this.xferRec = xferRec;
	}
	public XferStatusRec getXferStatusRec() {
		return xferStatusRec;
	}
	public void setXferStatusRec(XferStatusRec xferStatusRec) {
		this.xferStatusRec = xferStatusRec;
	}
}
