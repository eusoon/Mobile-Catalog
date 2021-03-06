package ong.eu.soon.ifx.auth;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AthKeys;
import ong.eu.soon.ifx.element.AthStatus;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class AthStatusModRq extends IFXObject {

	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	AthKeys athKeys;	 //	Aggregate	 Required	 Authorization Keys Aggregate
	AthStatus athStatus;	 //	Aggregate	 Required	 Authorization Status Aggregate
	
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
	public AthKeys getAthKeys() {
		return athKeys;
	}
	public void setAthKeys(AthKeys athKeys) {
		this.athKeys = athKeys;
	}
	public AthStatus getAthStatus() {
		return athStatus;
	}
	public void setAthStatus(AthStatus athStatus) {
		this.athStatus = athStatus;
	}
	
}
