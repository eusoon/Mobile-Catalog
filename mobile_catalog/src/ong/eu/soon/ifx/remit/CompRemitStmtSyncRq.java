package ong.eu.soon.ifx.remit;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CompRemitStmtKeys;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RqUID;

public class CompRemitStmtSyncRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	RecCtrlIn recCtrlIn; //Aggregate	Optional	Records Control Input
	CompRemitStmtKeys[] compRemitStmtKeys; //Aggregate	Optional Repeating	Comprehensible Remittance Statement Keys Aggregate
	
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
	public CompRemitStmtKeys[] getCompRemitStmtKeys() {
		return compRemitStmtKeys;
	}
	public void setCompRemitStmtKeys(CompRemitStmtKeys[] compRemitStmtKeys) {
		this.compRemitStmtKeys = compRemitStmtKeys;
	}
	
}
