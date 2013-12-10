package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PassbkKeys;
import ong.eu.soon.ifx.element.RqUID;

public class PassbkDelRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	PassbkKeys passbkKeys; //Aggregate	Required	Passbook Keys Aggregate
	
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
	public PassbkKeys getPassbkKeys() {
		return passbkKeys;
	}
	public void setPassbkKeys(PassbkKeys passbkKeys) {
		this.passbkKeys = passbkKeys;
	}	
}
