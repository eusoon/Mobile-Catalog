package ong.eu.soon.ifx.bill;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.BillKeys;
import ong.eu.soon.ifx.element.BillStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class BillStatusModRq extends IFXObject {
	RqUID rqUID;//UUID	Required Request Identifier
	MsgRqHdr msgRqHdr;//Aggregate	Optional Message Request Header
	BillKeys billKeys;//Aggregate	Required Bill Keys Aggregate
	BillStatus billStatus;//Aggregate	Required Bill Status Aggregate
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
	public BillKeys getBillKeys() {
		return billKeys;
	}
	public void setBillKeys(BillKeys billKeys) {
		this.billKeys = billKeys;
	}
	public BillStatus getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(BillStatus billStatus) {
		this.billStatus = billStatus;
	}
}
