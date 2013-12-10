package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExRateSheetRec;
import ong.eu.soon.ifx.element.ForExRateSheetStatusRec;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class ForExRateSheetAdviseRq extends IFXObject{

	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	//begin-xor	Required
	ForExRateSheetRec forExRateSheetRec; //Aggregate	Required	Foreign Exchange Rate Sheet Record
	ForExRateSheetStatusRec forExRateSheetStatusRec; //Aggregate	Required	Foreign Exchange Rate Sheet Status Record
	//end-xor
	
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
	public ForExRateSheetRec getForExRateSheetRec() {
		return forExRateSheetRec;
	}
	public void setForExRateSheetRec(ForExRateSheetRec forExRateSheetRec) {
		this.forExRateSheetRec = forExRateSheetRec;
	}
	public ForExRateSheetStatusRec getForExRateSheetStatusRec() {
		return forExRateSheetStatusRec;
	}
	public void setForExRateSheetStatusRec(
			ForExRateSheetStatusRec forExRateSheetStatusRec) {
		this.forExRateSheetStatusRec = forExRateSheetStatusRec;
	}
	
}
