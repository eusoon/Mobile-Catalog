package ong.eu.soon.ifx.bill;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.BillStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class BillStatusModRs extends IFXObject {
	Status status; //Aggregate	Optional Response Status
	RqUID rqUID;//UUID	Required Request Identifier
	MsgRsHdr msgRsHdr;//Aggregate	Optional Message Request Header
	BillStatusRec billStatusRec;//Aggregate	Required Bill Status Aggregate
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
	public BillStatusRec getBillStatusRec() {
		return billStatusRec;
	}
	public void setBillStatusRec(BillStatusRec billStatusRec) {
		this.billStatusRec = billStatusRec;
	}
}
