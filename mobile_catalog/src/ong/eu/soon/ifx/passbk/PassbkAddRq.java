package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PassbkInfo;
import ong.eu.soon.ifx.element.RqUID;

public class PassbkAddRq extends IFXObject{

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	PassbkInfo passbkInfo; //Aggregate	Required	Passbook Information Aggregate
	
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
	public PassbkInfo getPassbkInfo() {
		return passbkInfo;
	}
	public void setPassbkInfo(PassbkInfo passbkInfo) {
		this.passbkInfo = passbkInfo;
	}	
}
