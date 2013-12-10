package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.ForExRateSheetRec;
import ong.eu.soon.ifx.element.ForExRateSheetStatusRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class ForExRateSheetAdviseRs extends IFXObject{

	//begin-block	Required
	Status status; //Aggregate	Optional	Response Status
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRsHdr msgRsHdr; //Aggregate	Optional	Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	//begin-xor	Required
	ForExRateSheetRec forExRateSheetRec; //Aggregate	Required	Foreign Exchange Rate Sheet Record
	ForExRateSheetStatusRec forExRateSheetStatusRec; //Aggregate	Required	Foreign Exchange Rate Sheet Status Record
	//end-xor
	//end-block
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RqUID getRqUID() {
		return rqUID;
	}
	public void setRqUID(RqUID rqUID) {
		this.rqUID = rqUID;
	}
	public MsgRsHdr getMsgRsHdr() {
		return msgRsHdr;
	}
	public void setMsgRsHdr(MsgRsHdr msgRsHdr) {
		this.msgRsHdr = msgRsHdr;
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
