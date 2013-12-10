package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.service.SvcAdviseRs;
import ong.eu.soon.ifx.service.SvcInqRs;
import ong.eu.soon.ifx.service.SvcStatusInqRs;

public class SvcRsMsg extends IFXObject {
	MsgRecDt msgRecDt;//Timestamp	OptionalAudit Record Creation Date
	//begin-xor Required 
	SvcInqRs svcInqRs;//Aggregate	Required Service Inquiry Response
	SvcAdviseRs svcAdviseRs;//Aggregate	 Required Service Advise Response
	SvcStatusInqRs svcStatusInqRs;//Aggregate	Required Service Status Inquiry Response
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public SvcInqRs getSvcInqRs() {
		return svcInqRs;
	}
	public void setSvcInqRs(SvcInqRs svcInqRs) {
		this.svcInqRs = svcInqRs;
	}
	public SvcAdviseRs getSvcAdviseRs() {
		return svcAdviseRs;
	}
	public void setSvcAdviseRs(SvcAdviseRs svcAdviseRs) {
		this.svcAdviseRs = svcAdviseRs;
	}
	public SvcStatusInqRs getSvcStatusInqRs() {
		return svcStatusInqRs;
	}
	public void setSvcStatusInqRs(SvcStatusInqRs svcStatusInqRs) {
		this.svcStatusInqRs = svcStatusInqRs;
	}

}
