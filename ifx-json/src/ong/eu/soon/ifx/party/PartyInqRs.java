package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.*;

public class PartyInqRs extends IFXObject {
	//begin-block	Required
	Status status;	 //	Aggregate	 Optional	 Response Status
	RqUID rqUID;	 //	UUID	 Required	 Request Identifier
	MsgRsHdr msgRsHdr;	 //	Aggregate	 Optional	 Message Response Header
	//end-block
	//begin-block	Optional	required if message is successful
	DocCtrlOut docCtrlOut;	 //	Aggregate	 Optional	 Document Control Output
	RecCtrlOut recCtrlOut;	 //	Aggregate	 Optional	 Records Control Output
	PartyRec[] partyRec;	 //	Aggregate	 Required Repeating	 Party Record Aggregate
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
	public PartyRec[] getPartyRec() {
		return partyRec;
	}
	public void setPartyRec(PartyRec[] partyRec) {
		this.partyRec = partyRec;
	}	
}
