package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExQuoteInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExQuoteAddRq extends IFXObject {

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	ForExQuoteInfo forExQuoteInfo; //Aggregate	Required	Foreign Exchange Quote Information
	
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
	public ForExQuoteInfo getForExQuoteInfo() {
		return forExQuoteInfo;
	}
	public void setForExQuoteInfo(ForExQuoteInfo forExQuoteInfo) {
		this.forExQuoteInfo = forExQuoteInfo;
	}
	
}
