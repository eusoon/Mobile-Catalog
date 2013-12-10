package ong.eu.soon.ifx.remit;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.CompRemitStmtInfo;
import ong.eu.soon.ifx.element.MsgRqHdr;
import ong.eu.soon.ifx.element.RqUID;

public class CompRemitStmtAddRq extends IFXObject {
	
	RqUID rqUID; //UUID	Required	Request Identifier
	MsgRqHdr msgRqHdr; //Aggregate	Optional	Message Request Header
	CompRemitStmtInfo compRemitStmtInfo; //Aggregate	Required	Comprehensible Remittance Statement Information Aggregate
	
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
	public CompRemitStmtInfo getCompRemitStmtInfo() {
		return compRemitStmtInfo;
	}
	public void setCompRemitStmtInfo(CompRemitStmtInfo compRemitStmtInfo) {
		this.compRemitStmtInfo = compRemitStmtInfo;
	}

}
