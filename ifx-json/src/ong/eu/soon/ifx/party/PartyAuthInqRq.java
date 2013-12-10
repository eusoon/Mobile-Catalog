package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PartySel;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.element.RqUID;

public class PartyAuthInqRq extends IFXObject {
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	RecCtrlIn recCtrlIn;	 //	Aggregate	 Optional	 Records Control Input
	//begin-xor	Optional Repeating
	PartySel[] partySel;	 //	Aggregate	 Required	 Party Selection Aggregate
	RecSelect[] recSelect;	 //	IfxPath	 Required	 Record Select
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
	public RecCtrlIn getRecCtrlIn() {
		return recCtrlIn;
	}
	public void setRecCtrlIn(RecCtrlIn recCtrlIn) {
		this.recCtrlIn = recCtrlIn;
	}
	public PartySel[] getPartySel() {
		return partySel;
	}
	public void setPartySel(PartySel[] partySel) {
		this.partySel = partySel;
	}
	public RecSelect[] getRecSelect() {
		return recSelect;
	}
	public void setRecSelect(RecSelect[] recSelect) {
		this.recSelect = recSelect;
	}	
}
