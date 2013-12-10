package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.auth.AthAddRs;
import ong.eu.soon.ifx.auth.AthAdviseRs;
import ong.eu.soon.ifx.auth.AthCanRs;
import ong.eu.soon.ifx.auth.AthInqRs;
import ong.eu.soon.ifx.auth.AthModRs;
import ong.eu.soon.ifx.auth.AthRevRs;
import ong.eu.soon.ifx.auth.AthStatusInqRs;
import ong.eu.soon.ifx.auth.AthStatusModRs;
import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthRsMsg extends IFXObject {

	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin-xor	Required
	AthAddRs athAddRs;	 //	Aggregate	 Required	 Authorization Add Response
	AthModRs athModRs;	 //	Aggregate	 Required	 Authorization Modify Response
	AthCanRs athCanRs;	 //	Aggregate	 Required	 Authorization Cancel Response
	AthRevRs athRevRs;	 //	Aggregate	 Required	 Authorization Reversal Response
	AthInqRs athInqRs;	 //	Aggregate	 Required	 Authorization Inquiry Response
	AthAdviseRs athAdviseRs;	 //	Aggregate	 Required	 Authorization Advise Response
	AthStatusModRs athStatusModRs;	 //	Aggregate	 Required	 Authorization Status Modify Response
	AthStatusInqRs athStatusInqRs;	 //	Aggregate	 Required	 Authorization Status Inquiry Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public AthAddRs getAthAddRs() {
		return athAddRs;
	}
	public void setAthAddRs(AthAddRs athAddRs) {
		this.athAddRs = athAddRs;
	}
	public AthModRs getAthModRs() {
		return athModRs;
	}
	public void setAthModRs(AthModRs athModRs) {
		this.athModRs = athModRs;
	}
	public AthCanRs getAthCanRs() {
		return athCanRs;
	}
	public void setAthCanRs(AthCanRs athCanRs) {
		this.athCanRs = athCanRs;
	}
	public AthRevRs getAthRevRs() {
		return athRevRs;
	}
	public void setAthRevRs(AthRevRs athRevRs) {
		this.athRevRs = athRevRs;
	}
	public AthInqRs getAthInqRs() {
		return athInqRs;
	}
	public void setAthInqRs(AthInqRs athInqRs) {
		this.athInqRs = athInqRs;
	}
	public AthAdviseRs getAthAdviseRs() {
		return athAdviseRs;
	}
	public void setAthAdviseRs(AthAdviseRs athAdviseRs) {
		this.athAdviseRs = athAdviseRs;
	}
	public AthStatusModRs getAthStatusModRs() {
		return athStatusModRs;
	}
	public void setAthStatusModRs(AthStatusModRs athStatusModRs) {
		this.athStatusModRs = athStatusModRs;
	}
	public AthStatusInqRs getAthStatusInqRs() {
		return athStatusInqRs;
	}
	public void setAthStatusInqRs(AthStatusInqRs athStatusInqRs) {
		this.athStatusInqRs = athStatusInqRs;
	}
	
}
