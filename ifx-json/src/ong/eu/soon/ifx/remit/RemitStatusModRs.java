package ong.eu.soon.ifx.remit;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RemitKeys;
import ong.eu.soon.ifx.element.RemitStatus;
import ong.eu.soon.ifx.element.RqUID;

public class RemitStatusModRs extends IFXObject {
	
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	RemitKeys remitKeys; //Aggregate	Required	Remittance Keys Aggregate
	RemitStatus remitStatus; //Aggregate	Required	Remittance Status Aggregate
	
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
	public RemitKeys getRemitKeys() {
		return remitKeys;
	}
	public void setRemitKeys(RemitKeys remitKeys) {
		this.remitKeys = remitKeys;
	}
	public RemitStatus getRemitStatus() {
		return remitStatus;
	}
	public void setRemitStatus(RemitStatus remitStatus) {
		this.remitStatus = remitStatus;
	}
}
