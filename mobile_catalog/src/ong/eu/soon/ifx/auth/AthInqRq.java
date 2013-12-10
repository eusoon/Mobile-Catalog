package ong.eu.soon.ifx.auth;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AthSel;
import ong.eu.soon.ifx.element.DocCtrlIn;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.element.RqUID;

public class AthInqRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	DocCtrlIn docCtrlIn;	 //	Aggregate	 Optional	 Document Control Input
	RecCtrlIn recCtrlIn;	 //	Aggregate	 Optional	 Records Control Input
	//begin-xor	Optional Repeating
	AthSel[] athSel;	 //	Aggregate	 Required	 Authorization Selection Aggregate
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
	public AthSel[] getAthSel() {
		return athSel;
	}
	public void setAthSel(AthSel[] athSel) {
		this.athSel = athSel;
	}
	public RecSelect[] getRecSelect() {
		return recSelect;
	}
	public void setRecSelect(RecSelect[] recSelect) {
		this.recSelect = recSelect;
	}

}
