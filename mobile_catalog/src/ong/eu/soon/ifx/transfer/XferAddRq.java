package ong.eu.soon.ifx.transfer;

import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.XferInfo;

public class XferAddRq {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	XferInfo xferInfo;//Aggregate	Required Funds Transfer Information Aggregate
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
}
