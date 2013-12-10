package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.payment.PmtEnclAddRq;
import ong.eu.soon.ifx.payment.PmtEnclAdviseRq;
import ong.eu.soon.ifx.payment.PmtEnclAudRq;
import ong.eu.soon.ifx.payment.PmtEnclCanRq;
import ong.eu.soon.ifx.payment.PmtEnclInqRq;
import ong.eu.soon.ifx.payment.PmtEnclModRq;
import ong.eu.soon.ifx.payment.PmtEnclStatusModRq;

public class PmtEnclRqMsg extends IFXObject {

	//begin-xor	Required
	PmtEnclAddRq pmtEnclAddRq;	 //	Aggregate	 Required	 Payment Enclosed Add Request
	PmtEnclModRq pmtEnclModRq;	 //	Aggregate	 Required	 Payment Enclosed Modify Request
	PmtEnclCanRq pmtEnclCanRq;	 //	Aggregate	 Required	 Payment Enclosed Cancel Request
	PmtEnclInqRq pmtEnclInqRq;	 //	Aggregate	 Required	 Payment Enclosed Inquiry Response
	PmtEnclAdviseRq pmtEnclAdviseRq;	 //	Aggregate	 Required	 Payment Enclosed Advise Response
	PmtEnclAudRq pmtEnclAudRq;	 //	Aggregate	 Required	 Payment Enclosed Audit Request
	PmtEnclStatusModRq pmtEnclStatusModRq;	 //	Aggregate	 Required	 Payment Enclosed Status Modify Request
	RevRqUID revRqUID;	 //	UUID	 Optional	 Reversal Request Unique ID
	//end-xor
	
	public PmtEnclAddRq getPmtEnclAddRq() {
		return pmtEnclAddRq;
	}
	public void setPmtEnclAddRq(PmtEnclAddRq pmtEnclAddRq) {
		this.pmtEnclAddRq = pmtEnclAddRq;
	}
	public PmtEnclModRq getPmtEnclModRq() {
		return pmtEnclModRq;
	}
	public void setPmtEnclModRq(PmtEnclModRq pmtEnclModRq) {
		this.pmtEnclModRq = pmtEnclModRq;
	}
	public PmtEnclCanRq getPmtEnclCanRq() {
		return pmtEnclCanRq;
	}
	public void setPmtEnclCanRq(PmtEnclCanRq pmtEnclCanRq) {
		this.pmtEnclCanRq = pmtEnclCanRq;
	}
	public PmtEnclInqRq getPmtEnclInqRq() {
		return pmtEnclInqRq;
	}
	public void setPmtEnclInqRq(PmtEnclInqRq pmtEnclInqRq) {
		this.pmtEnclInqRq = pmtEnclInqRq;
	}
	public PmtEnclAdviseRq getPmtEnclAdviseRq() {
		return pmtEnclAdviseRq;
	}
	public void setPmtEnclAdviseRq(PmtEnclAdviseRq pmtEnclAdviseRq) {
		this.pmtEnclAdviseRq = pmtEnclAdviseRq;
	}
	public PmtEnclAudRq getPmtEnclAudRq() {
		return pmtEnclAudRq;
	}
	public void setPmtEnclAudRq(PmtEnclAudRq pmtEnclAudRq) {
		this.pmtEnclAudRq = pmtEnclAudRq;
	}
	public PmtEnclStatusModRq getPmtEnclStatusModRq() {
		return pmtEnclStatusModRq;
	}
	public void setPmtEnclStatusModRq(PmtEnclStatusModRq pmtEnclStatusModRq) {
		this.pmtEnclStatusModRq = pmtEnclStatusModRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}

}
