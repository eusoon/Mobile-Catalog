package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.passbk.PassbkAddRs;
import ong.eu.soon.ifx.passbk.PassbkDelRs;
import ong.eu.soon.ifx.passbk.PassbkInqRs;
import ong.eu.soon.ifx.passbk.PassbkModRs;
import ong.eu.soon.ifx.passbk.PassbkRevRs;
import ong.eu.soon.ifx.passbk.PassbkStatusInqRs;
import ong.eu.soon.ifx.passbk.PassbkStatusModRs;

public class PassbkRsMsg extends IFXObject {

	MsgRecDt msgRecDt; //Timestamp	Optional	Audit Record Creation Date
	//begin-xor	Required
	PassbkAddRs passbkAddRs; //Aggregate	Required	Passbook Add Response
	PassbkModRs passbkModRs; //Aggregate	Required	Passbook Modify Response
	PassbkDelRs passbkDelRs; //Aggregate	Required	Passbook Delete Response
	PassbkRevRs PassbkRevRs; //Aggregate	Required	Passbook Reversal Response
	PassbkInqRs passbkInqRs; //Aggregate	Required	Passbook Inquiry Response
	PassbkStatusModRs passbkStatusModRs; //Aggregate	Required	Passbook Status Modify Response
	PassbkStatusInqRs passbkStatusInqRs; //Aggregate	Required	Passbook Status Inquiry Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public PassbkAddRs getPassbkAddRs() {
		return passbkAddRs;
	}
	public void setPassbkAddRs(PassbkAddRs passbkAddRs) {
		this.passbkAddRs = passbkAddRs;
	}
	public PassbkModRs getPassbkModRs() {
		return passbkModRs;
	}
	public void setPassbkModRs(PassbkModRs passbkModRs) {
		this.passbkModRs = passbkModRs;
	}
	public PassbkDelRs getPassbkDelRs() {
		return passbkDelRs;
	}
	public void setPassbkDelRs(PassbkDelRs passbkDelRs) {
		this.passbkDelRs = passbkDelRs;
	}
	public PassbkRevRs getPassbkRevRs() {
		return PassbkRevRs;
	}
	public void setPassbkRevRs(PassbkRevRs passbkRevRs) {
		PassbkRevRs = passbkRevRs;
	}
	public PassbkInqRs getPassbkInqRs() {
		return passbkInqRs;
	}
	public void setPassbkInqRs(PassbkInqRs passbkInqRs) {
		this.passbkInqRs = passbkInqRs;
	}
	public PassbkStatusModRs getPassbkStatusModRs() {
		return passbkStatusModRs;
	}
	public void setPassbkStatusModRs(PassbkStatusModRs passbkStatusModRs) {
		this.passbkStatusModRs = passbkStatusModRs;
	}
	public PassbkStatusInqRs getPassbkStatusInqRs() {
		return passbkStatusInqRs;
	}
	public void setPassbkStatusInqRs(PassbkStatusInqRs passbkStatusInqRs) {
		this.passbkStatusInqRs = passbkStatusInqRs;
	}
	
}
