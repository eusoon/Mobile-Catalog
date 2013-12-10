package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.PmtRsMsg;
import ong.eu.soon.ifx.element.RecCtrlOut;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class PmtSyncRs extends IFXObject {

	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	RecCtrlOut recCtrlOut;	 //	Aggregate	 Optional	 Records Control Output
	PmtRsMsg[] pmtRsMsg;	 //	Aggregate	 Optional Repeating	 PaymentResponse Message Record Aggregate
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
	public RecCtrlOut getRecCtrlOut() {
		return recCtrlOut;
	}
	public void setRecCtrlOut(RecCtrlOut recCtrlOut) {
		this.recCtrlOut = recCtrlOut;
	}
	public PmtRsMsg[] getPmtRsMsg() {
		return pmtRsMsg;
	}
	public void setPmtRsMsg(PmtRsMsg[] pmtRsMsg) {
		this.pmtRsMsg = pmtRsMsg;
	}
	
}
