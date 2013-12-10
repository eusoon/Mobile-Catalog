package ong.eu.soon.ifx.passbk;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.PassbkItemKeys;
import ong.eu.soon.ifx.element.RecCtrlIn;
import ong.eu.soon.ifx.element.RqUID;

public class PassbkItemSyncRq extends IFXObject{

	//begin Aggregate
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRqHdr msgRqHdr;	 //	Aggregate	 Optional	 Message Request Header
	RecCtrlIn recCtrlIn;	 //	Aggregate	 Optional	 Records Control Input
	PassbkItemKeys[] passbkItemKeys;	 //	Aggregate	 Optional Repeating	 Passbook Item Keys Aggregate
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
	public RecCtrlIn getRecCtrlIn() {
		return recCtrlIn;
	}
	public void setRecCtrlIn(RecCtrlIn recCtrlIn) {
		this.recCtrlIn = recCtrlIn;
	}
	public PassbkItemKeys[] getPassbkItemKeys() {
		return passbkItemKeys;
	}
	public void setPassbkItemKeys(PassbkItemKeys[] passbkItemKeys) {
		this.passbkItemKeys = passbkItemKeys;
	}
	
}
