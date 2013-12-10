package ong.eu.soon.ifx.rate;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.DocCtrlOut;
import ong.eu.soon.ifx.element.ForExQuoteRec;
import ong.eu.soon.ifx.element.MsgRsHdr;
import ong.eu.soon.ifx.element.RecCtrlOut;
import ong.eu.soon.ifx.element.RqUID;
import ong.eu.soon.ifx.element.Status;

public class ForExQuoteInqRs extends IFXObject{

	//begin-block	Required
	Status status; //Aggregate	Optional	Response Status
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRsHdr msgRsHdr; //Aggregate	Optional	Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	DocCtrlOut docCtrlOut; //Aggregate	Optional	Document Control Output
	RecCtrlOut recCtrlOut; //Aggregate	Optional	Records Control Output
	ForExQuoteRec[] forExQuoteRec; //Aggregate	Required Repeating	Foreign Exchange Quote Record
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
	public DocCtrlOut getDocCtrlOut() {
		return docCtrlOut;
	}
	public void setDocCtrlOut(DocCtrlOut docCtrlOut) {
		this.docCtrlOut = docCtrlOut;
	}
	public RecCtrlOut getRecCtrlOut() {
		return recCtrlOut;
	}
	public void setRecCtrlOut(RecCtrlOut recCtrlOut) {
		this.recCtrlOut = recCtrlOut;
	}
	public ForExQuoteRec[] getForExQuoteRec() {
		return forExQuoteRec;
	}
	public void setForExQuoteRec(ForExQuoteRec[] forExQuoteRec) {
		this.forExQuoteRec = forExQuoteRec;
	}
}
