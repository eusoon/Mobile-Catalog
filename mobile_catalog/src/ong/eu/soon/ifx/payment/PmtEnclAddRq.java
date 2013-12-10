package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PmtEnclInfo;
import ong.eu.soon.ifx.element.RqUID;

public class PmtEnclAddRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	PmtEnclInfo pmtEnclInfo; //Aggregate	Required	Payment Enclosed Information Aggregate
	
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
	public PmtEnclInfo getPmtEnclInfo() {
		return pmtEnclInfo;
	}
	public void setPmtEnclInfo(PmtEnclInfo pmtEnclInfo) {
		this.pmtEnclInfo = pmtEnclInfo;
	}
}
