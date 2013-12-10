package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtBatchInfo;
import ong.eu.soon.ifx.element.RqUID;

public class PmtBatchAddRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PmtBatchInfo pmtBatchInfo;	 //	Aggregate	 Required	 Payment Batch Information Aggregate
	
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
	public PmtBatchInfo getPmtBatchInfo() {
		return pmtBatchInfo;
	}
	public void setPmtBatchInfo(PmtBatchInfo pmtBatchInfo) {
		this.pmtBatchInfo = pmtBatchInfo;
	}
	
}
