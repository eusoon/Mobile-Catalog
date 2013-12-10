package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PassbkItemKeys;
import ong.eu.soon.ifx.element.PassbkItemStatus;
import ong.eu.soon.ifx.element.RqUID;

public class PassbkItemStatusModRq extends IFXObject{

	//begin Aggregate
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	PassbkItemKeys passbkItemKeys;	 //	Aggregate	 Required	 Passbook Item Keys Aggregate
	PassbkItemStatus passbkItemStatus;	 //	Aggregate	 Required	 Passbook Item Status Aggregate
	//end Aggregate
	
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
	public PassbkItemKeys getPassbkItemKeys() {
		return passbkItemKeys;
	}
	public void setPassbkItemKeys(PassbkItemKeys passbkItemKeys) {
		this.passbkItemKeys = passbkItemKeys;
	}
	public PassbkItemStatus getPassbkItemStatus() {
		return passbkItemStatus;
	}
	public void setPassbkItemStatus(PassbkItemStatus passbkItemStatus) {
		this.passbkItemStatus = passbkItemStatus;
	}
	
}
