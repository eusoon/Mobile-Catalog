package ong.eu.soon.ifx.remit;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RemitKeys;
import ong.eu.soon.ifx.element.RqUID;

public class RemitSyncRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	RecCtrlIn recCtrlIn; //Aggregate	Optional	Records Control Input
	RemitKeys[] remitKeys; //Aggregate	Optional Repeating	Remittance Keys Aggregate
	
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
	public RemitKeys[] getRemitKeys() {
		return remitKeys;
	}
	public void setRemitKeys(RemitKeys[] remitKeys) {
		this.remitKeys = remitKeys;
	}
	
}
