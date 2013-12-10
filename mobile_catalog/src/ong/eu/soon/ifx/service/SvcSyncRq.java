package ong.eu.soon.ifx.service;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.SvcKeys;

public class SvcSyncRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	RecCtrlIn recCtrlIn;	 //	Aggregate	 Optional	 Records Control Input
	SvcKeys[] svcKeys;//Aggregate	Optional Repeating Service Keys Aggregate
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
	public SvcKeys[] getSvcKeys() {
		return svcKeys;
	}
	public void setSvcKeys(SvcKeys[] svcKeys) {
		this.svcKeys = svcKeys;
	}

}
