package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.payment.PmtAddRq;
import ong.eu.soon.ifx.payment.PmtAudRq;
import ong.eu.soon.ifx.payment.PmtCanRq;
import ong.eu.soon.ifx.payment.PmtInqRq;
import ong.eu.soon.ifx.payment.PmtModRq;
import ong.eu.soon.ifx.payment.PmtSyncRq;

public class PmtRqMsg extends IFXObject {

	//begin-xor	Required
	PmtAddRq pmtAddRq;	 //	Aggregate	 Required	 Payment Add Request
	PmtModRq pmtModRq;	 //	Aggregate	 Required	 Payment Modify Request
	PmtCanRq pmtCanRq;	 //	Aggregate	 Required	 Payment Cancel Request
	PmtInqRq pmtInqRq;	 //	Aggregate	 Required	 Payment Inquiry Request
	PmtAudRq pmtAudRq;	 //	Aggregate	 Required	 Payment Audit Request
	PmtSyncRq pmtSyncRq;	 //	Aggregate	 Required	 Payment Synchronization Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public PmtAddRq getPmtAddRq() {
		return pmtAddRq;
	}
	public void setPmtAddRq(PmtAddRq pmtAddRq) {
		this.pmtAddRq = pmtAddRq;
	}
	public PmtModRq getPmtModRq() {
		return pmtModRq;
	}
	public void setPmtModRq(PmtModRq pmtModRq) {
		this.pmtModRq = pmtModRq;
	}
	public PmtCanRq getPmtCanRq() {
		return pmtCanRq;
	}
	public void setPmtCanRq(PmtCanRq pmtCanRq) {
		this.pmtCanRq = pmtCanRq;
	}
	public PmtInqRq getPmtInqRq() {
		return pmtInqRq;
	}
	public void setPmtInqRq(PmtInqRq pmtInqRq) {
		this.pmtInqRq = pmtInqRq;
	}
	public PmtAudRq getPmtAudRq() {
		return pmtAudRq;
	}
	public void setPmtAudRq(PmtAudRq pmtAudRq) {
		this.pmtAudRq = pmtAudRq;
	}
	public PmtSyncRq getPmtSyncRq() {
		return pmtSyncRq;
	}
	public void setPmtSyncRq(PmtSyncRq pmtSyncRq) {
		this.pmtSyncRq = pmtSyncRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
