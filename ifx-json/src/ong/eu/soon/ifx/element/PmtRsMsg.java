package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.payment.PmtAddRs;
import ong.eu.soon.ifx.payment.PmtCanRs;
import ong.eu.soon.ifx.payment.PmtInqRs;
import ong.eu.soon.ifx.payment.PmtModRs;
import ong.eu.soon.ifx.payment.PmtRevRs;

public class PmtRsMsg extends IFXObject {

	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin-xor	Required
	PmtAddRs pmtAddRs;	 //	Aggregate	 Required	 Payment Add Response
	PmtModRs pmtModRs;	 //	Aggregate	 Required	 Payment Modification Response
	PmtCanRs pmtCanRs;	 //	Aggregate	 Required	 Payment Cancel Response
	PmtRevRs pmtRevRs;	 //	Aggregate	 Required	 Payment Reversal Response
	PmtInqRs pmtInqRs;	 //	Aggregate	 Required	 Payment Inquiry Response
	//end-xor
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public PmtAddRs getPmtAddRs() {
		return pmtAddRs;
	}
	public void setPmtAddRs(PmtAddRs pmtAddRs) {
		this.pmtAddRs = pmtAddRs;
	}
	public PmtModRs getPmtModRs() {
		return pmtModRs;
	}
	public void setPmtModRs(PmtModRs pmtModRs) {
		this.pmtModRs = pmtModRs;
	}
	public PmtCanRs getPmtCanRs() {
		return pmtCanRs;
	}
	public void setPmtCanRs(PmtCanRs pmtCanRs) {
		this.pmtCanRs = pmtCanRs;
	}
	public PmtRevRs getPmtRevRs() {
		return pmtRevRs;
	}
	public void setPmtRevRs(PmtRevRs pmtRevRs) {
		this.pmtRevRs = pmtRevRs;
	}
	public PmtInqRs getPmtInqRs() {
		return pmtInqRs;
	}
	public void setPmtInqRs(PmtInqRs pmtInqRs) {
		this.pmtInqRs = pmtInqRs;
	}
	
}
