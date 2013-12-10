package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.remit.RemitAddRs;
import ong.eu.soon.ifx.remit.RemitDelRs;
import ong.eu.soon.ifx.remit.RemitInqRs;
import ong.eu.soon.ifx.remit.RemitModRs;
import ong.eu.soon.ifx.remit.RemitRevRs;
import ong.eu.soon.ifx.remit.RemitStatusModRs;

public class RemitRsMsg extends IFXObject {

	MsgRecDt msgRecDt; //Timestamp	Optional	Audit Record Creation Date
	//begin-xor	Required
	RemitAddRs remitAddRs; //Aggregate	Required	Remittance Add Response
	RemitModRs remitModRs; //Aggregate	Required	Remittance Modification Response
	RemitDelRs RemitDelRs; //Aggregate	Required	Remittance Delete Response
	RemitRevRs remitRevRs; //Aggregate	Required	Remittance Reversal Response
	RemitInqRs remitInqRs; //Aggregate	Required	Remittance Inquiry Response
	RemitStatusModRs remitStatusModRs; //Aggregate	Required	Remittance Status Modification Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public RemitAddRs getRemitAddRs() {
		return remitAddRs;
	}
	public void setRemitAddRs(RemitAddRs remitAddRs) {
		this.remitAddRs = remitAddRs;
	}
	public RemitModRs getRemitModRs() {
		return remitModRs;
	}
	public void setRemitModRs(RemitModRs remitModRs) {
		this.remitModRs = remitModRs;
	}
	public RemitDelRs getRemitDelRs() {
		return RemitDelRs;
	}
	public void setRemitDelRs(RemitDelRs remitDelRs) {
		RemitDelRs = remitDelRs;
	}
	public RemitRevRs getRemitRevRs() {
		return remitRevRs;
	}
	public void setRemitRevRs(RemitRevRs remitRevRs) {
		this.remitRevRs = remitRevRs;
	}
	public RemitInqRs getRemitInqRs() {
		return remitInqRs;
	}
	public void setRemitInqRs(RemitInqRs remitInqRs) {
		this.remitInqRs = remitInqRs;
	}
	public RemitStatusModRs getRemitStatusModRs() {
		return remitStatusModRs;
	}
	public void setRemitStatusModRs(RemitStatusModRs remitStatusModRs) {
		this.remitStatusModRs = remitStatusModRs;
	}

}