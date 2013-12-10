package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.remit.RemitAddRq;
import ong.eu.soon.ifx.remit.RemitAudRq;
import ong.eu.soon.ifx.remit.RemitDelRq;
import ong.eu.soon.ifx.remit.RemitInqRq;
import ong.eu.soon.ifx.remit.RemitModRq;
import ong.eu.soon.ifx.remit.RemitStatusModRq;
import ong.eu.soon.ifx.remit.RemitSyncRq;

public class RemitRqMsg extends IFXObject {

	//begin-xor	Required
	RemitAddRq remitAddRq; //Aggregate	Required	Remittance Add Request
	RemitModRq remitModRq; //Aggregate	Required	Remittance Modify Request
	RemitDelRq remitDelRq; //Aggregate	Required	Remittance Delete Request
	RemitInqRq remitInqRq; //Aggregate	Required	Remittance Inquiry Request
	RemitAudRq remitAudRq; //Aggregate	Required	Remittance Audit Request
	RemitSyncRq remitSyncRq; //Aggregate	Required	Remittance Synchronization Request
	RemitStatusModRq remitStatusModRq; //Aggregate	Required	Remittance Status Modify Request
	RevRqUID revRqUID; //UUID	Required	Reversal Request Unique ID
	//end-xor
	
	public RemitAddRq getRemitAddRq() {
		return remitAddRq;
	}
	public void setRemitAddRq(RemitAddRq remitAddRq) {
		this.remitAddRq = remitAddRq;
	}
	public RemitModRq getRemitModRq() {
		return remitModRq;
	}
	public void setRemitModRq(RemitModRq remitModRq) {
		this.remitModRq = remitModRq;
	}
	public RemitDelRq getRemitDelRq() {
		return remitDelRq;
	}
	public void setRemitDelRq(RemitDelRq remitDelRq) {
		this.remitDelRq = remitDelRq;
	}
	public RemitInqRq getRemitInqRq() {
		return remitInqRq;
	}
	public void setRemitInqRq(RemitInqRq remitInqRq) {
		this.remitInqRq = remitInqRq;
	}
	public RemitAudRq getRemitAudRq() {
		return remitAudRq;
	}
	public void setRemitAudRq(RemitAudRq remitAudRq) {
		this.remitAudRq = remitAudRq;
	}
	public RemitSyncRq getRemitSyncRq() {
		return remitSyncRq;
	}
	public void setRemitSyncRq(RemitSyncRq remitSyncRq) {
		this.remitSyncRq = remitSyncRq;
	}
	public RemitStatusModRq getRemitStatusModRq() {
		return remitStatusModRq;
	}
	public void setRemitStatusModRq(RemitStatusModRq remitStatusModRq) {
		this.remitStatusModRq = remitStatusModRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}

}
