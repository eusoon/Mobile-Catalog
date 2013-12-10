package ong.eu.soon.ifx.transfer;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.XferKeys;

public class XferSyncRq extends IFXObject {
	RqUID rqUID;//	UUID 	Required Request Identifier
	MsgRqHdr msgRqHdr;//Aggregate	Optional Message Request Header
	RecCtrlIn recCtrlIn;//Aggregate	Optional Records Control Input
	XferKeys xferKeys;//Aggregate	Required Funds Transfer Keys Aggregate
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
	public RecCtrlIn getRecCtrlIn() {
		return recCtrlIn;
	}
	public void setRecCtrlIn(RecCtrlIn recCtrlIn) {
		this.recCtrlIn = recCtrlIn;
	}
	public XferKeys getXferKeys() {
		return xferKeys;
	}
	public void setXferKeys(XferKeys xferKeys) {
		this.xferKeys = xferKeys;
	}
}
