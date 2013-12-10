package ong.eu.soon.ifx.bill;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.BillRec;
import ong.eu.soon.ifx.element.BillStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class BillAddRs extends IFXObject {
	//begin-block Required
	Status status; //Aggregate	Optional Response Status
	RqUID rqUID; //UUID	Required Request Identifier
	MsgRsHdr msgRsHdr;//Aggregate	Optional Message Response Header
	//end-block
	//begin-xor	Optional required if message is successful
	BillRec billRec; //Aggregate	Required  Account Record
	BillStatusRec billStatusRec; //Aggregate	Required  Account Record
	//end-xor
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRsHdr getMsgRsHdr() {
		return msgRsHdr;
	}
	public void setMsgRsHdr(MsgRsHdr msgRsHdr) {
		this.msgRsHdr = msgRsHdr;
	}
	public BillRec getBillRec() {
		return billRec;
	}
	public void setBillRec(BillRec billRec) {
		this.billRec = billRec;
	}
	public BillStatusRec getBillStatusRec() {
		return billStatusRec;
	}
	public void setBillStatusRec(BillStatusRec billStatusRec) {
		this.billStatusRec = billStatusRec;
	}
	
}
