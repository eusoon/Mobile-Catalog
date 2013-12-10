package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.remit.CompRemitStmtAddRs;
import ong.eu.soon.ifx.remit.CompRemitStmtInqRs;

public class CompRemitStmtRsMsg extends IFXObject {
	
	MsgRecDt msgRecDt; //Timestamp	Optional	Audit Record Creation Date
	//begin-xor	Required
	CompRemitStmtAddRs compRemitStmtAddRs; //Aggregate	Required	Comprehensible Remittance Statement Add Response
	CompRemitStmtInqRs compRemitStmtInqRs; //Aggregate	Required	Comprehensible Remittance Statement Inqury Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public CompRemitStmtAddRs getCompRemitStmtAddRs() {
		return compRemitStmtAddRs;
	}
	public void setCompRemitStmtAddRs(CompRemitStmtAddRs compRemitStmtAddRs) {
		this.compRemitStmtAddRs = compRemitStmtAddRs;
	}
	public CompRemitStmtInqRs getCompRemitStmtInqRs() {
		return compRemitStmtInqRs;
	}
	public void setCompRemitStmtInqRs(CompRemitStmtInqRs compRemitStmtInqRs) {
		this.compRemitStmtInqRs = compRemitStmtInqRs;
	}
}
