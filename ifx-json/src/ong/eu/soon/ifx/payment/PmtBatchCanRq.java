package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtBatchKeys;
import ong.eu.soon.ifx.element.RqUID;

public class PmtBatchCanRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PmtBatchKeys pmtBatchKeys;	 //	Aggregate	 Required	 Payment Batch Keys Aggregate
	
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
	public PmtBatchKeys getPmtBatchKeys() {
		return pmtBatchKeys;
	}
	public void setPmtBatchKeys(PmtBatchKeys pmtBatchKeys) {
		this.pmtBatchKeys = pmtBatchKeys;
	}
	
}
