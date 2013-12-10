package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class XferStatusModRq extends IFXObject {
	RqUID rqUID; // UUID Required Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	XferKeys xferKeys;//Aggregate	Required Funds Transfer Keys Aggregate
	XferStatus xferStatus;//Aggregate	Required Funds Transfer Status Aggregate
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
	public XferKeys getXferKeys() {
		return xferKeys;
	}
	public void setXferKeys(XferKeys xferKeys) {
		this.xferKeys = xferKeys;
	}
	public XferStatus getXferStatus() {
		return xferStatus;
	}
	public void setXferStatus(XferStatus xferStatus) {
		this.xferStatus = xferStatus;
	}
}
