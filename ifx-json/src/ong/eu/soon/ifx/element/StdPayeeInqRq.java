package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StdPayeeInqRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	DocCtrlIn docCtrlIn; //Aggregate	Optional	Document Control Input
	RecCtrlIn recCtrlIn; //Aggregate	Optional	Records Control Input
	//begin-xor	Optional Repeating
	StdPayeeSel[] stdPayeeSel; //Aggregate	Required	Standard Payee Selection Aggregate
	RecSelect[] recSelect; //IfxPath	Required	Record Select
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
	public StdPayeeSel[] getStdPayeeSel() {
		return stdPayeeSel;
	}
	public void setStdPayeeSel(StdPayeeSel[] stdPayeeSel) {
		this.stdPayeeSel = stdPayeeSel;
	}
	public RecSelect[] getRecSelect() {
		return recSelect;
	}
	public void setRecSelect(RecSelect[] recSelect) {
		this.recSelect = recSelect;
	}

}
