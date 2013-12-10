package ong.eu.soon.ifx.auth;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AthInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AthAddRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	AthInfo athInfo; //Aggregate	Required	Authorization Information Aggregate
	
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
	public AthInfo getAthInfo() {
		return athInfo;
	}
	public void setAthInfo(AthInfo athInfo) {
		this.athInfo = athInfo;
	}
	
}
