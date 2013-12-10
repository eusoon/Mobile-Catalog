package ong.eu.soon.ifx.payee;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CustPayeeRec;
import ong.eu.soon.ifx.element.CustPayeeStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class CustPayeeAddRs extends IFXObject {
	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	CustPayeeRec custPayeeRec;	 //	Aggregate	 Required	 Customer Payee Record Aggregate
	CustPayeeStatusRec custPayeeStatusRec;	 //	Aggregate	 Required	 Customer Payee Status Record Aggregate
	//end-xor
	//end-block
	
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
	public CustPayeeRec getCustPayeeRec() {
		return custPayeeRec;
	}
	public void setCustPayeeRec(CustPayeeRec custPayeeRec) {
		this.custPayeeRec = custPayeeRec;
	}
	public CustPayeeStatusRec getCustPayeeStatusRec() {
		return custPayeeStatusRec;
	}
	public void setCustPayeeStatusRec(CustPayeeStatusRec custPayeeStatusRec) {
		this.custPayeeStatusRec = custPayeeStatusRec;
	}
	
	
	
}
