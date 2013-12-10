package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.payment.PmtEnclAddRs;
import ong.eu.soon.ifx.payment.PmtEnclAdviseRs;
import ong.eu.soon.ifx.payment.PmtEnclCanRs;
import ong.eu.soon.ifx.payment.PmtEnclInqRs;
import ong.eu.soon.ifx.payment.PmtEnclModRs;
import ong.eu.soon.ifx.payment.PmtEnclRevRs;
import ong.eu.soon.ifx.payment.PmtEnclStatusModRs;

public class PmtEnclRsMsg extends IFXObject {

	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin-xor	Required
	PmtEnclAddRs pmtEnclAddRs;	 //	Aggregate	 Required	 Payment Enclosed Add Response
	PmtEnclModRs pmtEnclModRs;	 //	Aggregate	 Required	 Payment Enclosed Modify Response
	PmtEnclCanRs pmtEnclCanRs;	 //	Aggregate	 Required	 Payment Enclosed Cancel Response
	PmtEnclRevRs pmtEnclRevRs;	 //	Aggregate	 Required	 Payment Enclosed Reversal Response
	PmtEnclInqRs pmtEnclInqRs;	 //	Aggregate	 Required	 Payment Enclosed Inquiry Response
	PmtEnclAdviseRs pmtEnclAdviseRs;	 //	Aggregate	 Required	 Payment Enclosure Advise Response
	PmtEnclStatusModRs pmtEnclStatusModRs;	 //	Aggregate	 Required	 Payment Enclosed Status Modify Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public PmtEnclAddRs getPmtEnclAddRs() {
		return pmtEnclAddRs;
	}
	public void setPmtEnclAddRs(PmtEnclAddRs pmtEnclAddRs) {
		this.pmtEnclAddRs = pmtEnclAddRs;
	}
	public PmtEnclModRs getPmtEnclModRs() {
		return pmtEnclModRs;
	}
	public void setPmtEnclModRs(PmtEnclModRs pmtEnclModRs) {
		this.pmtEnclModRs = pmtEnclModRs;
	}
	public PmtEnclCanRs getPmtEnclCanRs() {
		return pmtEnclCanRs;
	}
	public void setPmtEnclCanRs(PmtEnclCanRs pmtEnclCanRs) {
		this.pmtEnclCanRs = pmtEnclCanRs;
	}
	public PmtEnclRevRs getPmtEnclRevRs() {
		return pmtEnclRevRs;
	}
	public void setPmtEnclRevRs(PmtEnclRevRs pmtEnclRevRs) {
		this.pmtEnclRevRs = pmtEnclRevRs;
	}
	public PmtEnclInqRs getPmtEnclInqRs() {
		return pmtEnclInqRs;
	}
	public void setPmtEnclInqRs(PmtEnclInqRs pmtEnclInqRs) {
		this.pmtEnclInqRs = pmtEnclInqRs;
	}
	public PmtEnclAdviseRs getPmtEnclAdviseRs() {
		return pmtEnclAdviseRs;
	}
	public void setPmtEnclAdviseRs(PmtEnclAdviseRs pmtEnclAdviseRs) {
		this.pmtEnclAdviseRs = pmtEnclAdviseRs;
	}
	public PmtEnclStatusModRs getPmtEnclStatusModRs() {
		return pmtEnclStatusModRs;
	}
	public void setPmtEnclStatusModRs(PmtEnclStatusModRs pmtEnclStatusModRs) {
		this.pmtEnclStatusModRs = pmtEnclStatusModRs;
	}
	
}
