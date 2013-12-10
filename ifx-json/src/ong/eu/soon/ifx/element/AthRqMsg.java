package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.auth.AthAddRq;
import ong.eu.soon.ifx.auth.AthAdviseRq;
import ong.eu.soon.ifx.auth.AthAudRq;
import ong.eu.soon.ifx.auth.AthCanRq;
import ong.eu.soon.ifx.auth.AthInqRq;
import ong.eu.soon.ifx.auth.AthModRq;
import ong.eu.soon.ifx.auth.AthStatusInqRq;
import ong.eu.soon.ifx.auth.AthStatusModRq;
import ong.eu.soon.ifx.auth.AthSyncRq;
import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthRqMsg extends IFXObject {

	//begin-xor	Required
	AthAddRq athAddRq;	 //	Aggregate	 Required	 Authorization Add Message
	AthModRq athModRq;	 //	Aggregate	 Required	 Authorization Modify Request
	AthCanRq athCanRq;	 //	Aggregate	 Required	 Authorization Cancel Request
	AthInqRq athInqRq;	 //	Aggregate	 Required	 Authorization Inquiry Request
	AthAdviseRq athAdviseRq;	 //	Aggregate	 Required	 Authorization Advise Message
	AthAudRq athAudRq;	 //	Aggregate	 Required	 Authorization Audit Request
	AthSyncRq athSyncRq;	 //	Aggregate	 Required	 Authorization Sync Request
	AthStatusModRq athStatusModRq;	 //	Aggregate	 Required	 Authorization Status Modify Request
	AthStatusInqRq athStatusInqRq;	 //	Aggregate	 Required	 Authorization Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public AthAddRq getAthAddRq() {
		return athAddRq;
	}
	public void setAthAddRq(AthAddRq athAddRq) {
		this.athAddRq = athAddRq;
	}
	public AthModRq getAthModRq() {
		return athModRq;
	}
	public void setAthModRq(AthModRq athModRq) {
		this.athModRq = athModRq;
	}
	public AthCanRq getAthCanRq() {
		return athCanRq;
	}
	public void setAthCanRq(AthCanRq athCanRq) {
		this.athCanRq = athCanRq;
	}
	public AthInqRq getAthInqRq() {
		return athInqRq;
	}
	public void setAthInqRq(AthInqRq athInqRq) {
		this.athInqRq = athInqRq;
	}
	public AthAdviseRq getAthAdviseRq() {
		return athAdviseRq;
	}
	public void setAthAdviseRq(AthAdviseRq athAdviseRq) {
		this.athAdviseRq = athAdviseRq;
	}
	public AthAudRq getAthAudRq() {
		return athAudRq;
	}
	public void setAthAudRq(AthAudRq athAudRq) {
		this.athAudRq = athAudRq;
	}
	public AthSyncRq getAthSyncRq() {
		return athSyncRq;
	}
	public void setAthSyncRq(AthSyncRq athSyncRq) {
		this.athSyncRq = athSyncRq;
	}
	public AthStatusModRq getAthStatusModRq() {
		return athStatusModRq;
	}
	public void setAthStatusModRq(AthStatusModRq athStatusModRq) {
		this.athStatusModRq = athStatusModRq;
	}
	public AthStatusInqRq getAthStatusInqRq() {
		return athStatusInqRq;
	}
	public void setAthStatusInqRq(AthStatusInqRq athStatusInqRq) {
		this.athStatusInqRq = athStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}