package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.DocCtrlIn;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PassbkItemSel;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.element.RqUID;

public class PassbkItemInqRq extends IFXObject{

	//begin Aggregate
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	DocCtrlIn docCtrlIn;	 //	Aggregate	 Optional	 Document Control Input
	RecCtrlIn recCtrlIn;	 //	Aggregate	 Optional	 Records Control Input
	//begin-xor	Optional Repeating
	PassbkItemSel[] passbkItemSel;	 //	Aggregate	 Required	 Passbook Item Selection Aggregate
	RecSelect[] recSelect;	 //	IfxPath	 Required	 Record Select
	//end-xor
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
	public DocCtrlIn getDocCtrlIn() {
		return docCtrlIn;
	}
	public void setDocCtrlIn(DocCtrlIn docCtrlIn) {
		this.docCtrlIn = docCtrlIn;
	}
	public RecCtrlIn getRecCtrlIn() {
		return recCtrlIn;
	}
	public void setRecCtrlIn(RecCtrlIn recCtrlIn) {
		this.recCtrlIn = recCtrlIn;
	}
	public PassbkItemSel[] getPassbkItemSel() {
		return passbkItemSel;
	}
	public void setPassbkItemSel(PassbkItemSel[] passbkItemSel) {
		this.passbkItemSel = passbkItemSel;
	}
	public RecSelect[] getRecSelect() {
		return recSelect;
	}
	public void setRecSelect(RecSelect[] recSelect) {
		this.recSelect = recSelect;
	}

}
