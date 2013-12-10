package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PassbkItemInfo;
import ong.eu.soon.ifx.element.RqUID;

public class PassbkItemAddRq extends IFXObject{
 
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	PassbkItemInfo passbkItemInfo; //Aggregate	Required	Passbook Item Information Aggregate
	
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
	public PassbkItemInfo getPassbkItemInfo() {
		return passbkItemInfo;
	}
	public void setPassbkItemInfo(PassbkItemInfo passbkItemInfo) {
		this.passbkItemInfo = passbkItemInfo;
	}
	
}
