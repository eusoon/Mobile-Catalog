package ong.eu.soon.ifx.transfer;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;
import ong.eu.soon.ifx.element.XferRec;
import ong.eu.soon.ifx.element.XferStatusRec;

public class XferAddRs extends IFXObject {
	// begin-block Required
		Status status; // Aggregate Optional Response Status
		RqUID rqUID; // UUID Required Request Identifier
		MsgRsHdr msgRsHdr; // Aggregate Optional Message Response Header
	//	end-block
	//	begin-block Optional required if message is successful
	//	begin-xor		Required	 
		XferRec xferRec;//Aggregate	Required	Funds Transfer Record Aggregate
		XferStatusRec xferStatusRec;//	Aggregate		Required	Funds Transfer Status Record Aggregate
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
		public XferRec getXferRec() {
			return xferRec;
		}
		public void setXferRec(XferRec xferRec) {
			this.xferRec = xferRec;
		}
		public XferStatusRec getXferStatusRec() {
			return xferStatusRec;
		}
		public void setXferStatusRec(XferStatusRec xferStatusRec) {
			this.xferStatusRec = xferStatusRec;
		}

}
