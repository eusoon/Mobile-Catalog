package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExDealKeys;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExDealCanRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	ForExDealKeys forExDealKeys; //Aggregate	Required	Foreign Exchange Deal Keys Aggregate
	
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
	public ForExDealKeys getForExDealKeys() {
		return forExDealKeys;
	}
	public void setForExDealKeys(ForExDealKeys forExDealKeys) {
		this.forExDealKeys = forExDealKeys;
	}
	
}
