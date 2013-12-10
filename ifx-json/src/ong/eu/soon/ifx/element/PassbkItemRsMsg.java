package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.passbk.PassbkItemAddRs;
import ong.eu.soon.ifx.passbk.PassbkItemDelRs;
import ong.eu.soon.ifx.passbk.PassbkItemInqRs;
import ong.eu.soon.ifx.passbk.PassbkItemModRs;
import ong.eu.soon.ifx.passbk.PassbkItemRevRs;
import ong.eu.soon.ifx.passbk.PassbkItemStatusInqRs;
import ong.eu.soon.ifx.passbk.PassbkItemStatusModRs;

public class PassbkItemRsMsg extends IFXObject {

	MsgRecDt msgRecDt; //Timestamp	Optional	Audit Record Creation Date
	//begin-xor	Required
	PassbkItemAddRs passbkItemAddRs; //Aggregate	Required	Passbook Item Add Response
	PassbkItemModRs passbkItemModRs; //Aggregate	Required	Passbook Item Modify Response
	PassbkItemDelRs passbkItemDelRs; //Aggregate	Required	Passbook Item Delete Response
	PassbkItemRevRs passbkItemRevRs; //Aggregate	Required	Passbook Item Reversal Response
	PassbkItemInqRs passbkItemInqRs; //Aggregate	Required	Passbook Item Inquiry Response
	PassbkItemStatusModRs passbkItemStatusModRs; //Aggregate	Required	Passbook Item Status Modify Response
	PassbkItemStatusInqRs passbkItemStatusInqRs; //Aggregate	Required	Passbook Item Status Inquiry Response
	//end-xor
	
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public PassbkItemAddRs getPassbkItemAddRs() {
		return passbkItemAddRs;
	}
	public void setPassbkItemAddRs(PassbkItemAddRs passbkItemAddRs) {
		this.passbkItemAddRs = passbkItemAddRs;
	}
	public PassbkItemModRs getPassbkItemModRs() {
		return passbkItemModRs;
	}
	public void setPassbkItemModRs(PassbkItemModRs passbkItemModRs) {
		this.passbkItemModRs = passbkItemModRs;
	}
	public PassbkItemDelRs getPassbkItemDelRs() {
		return passbkItemDelRs;
	}
	public void setPassbkItemDelRs(PassbkItemDelRs passbkItemDelRs) {
		this.passbkItemDelRs = passbkItemDelRs;
	}
	public PassbkItemRevRs getPassbkItemRevRs() {
		return passbkItemRevRs;
	}
	public void setPassbkItemRevRs(PassbkItemRevRs passbkItemRevRs) {
		this.passbkItemRevRs = passbkItemRevRs;
	}
	public PassbkItemInqRs getPassbkItemInqRs() {
		return passbkItemInqRs;
	}
	public void setPassbkItemInqRs(PassbkItemInqRs passbkItemInqRs) {
		this.passbkItemInqRs = passbkItemInqRs;
	}
	public PassbkItemStatusModRs getPassbkItemStatusModRs() {
		return passbkItemStatusModRs;
	}
	public void setPassbkItemStatusModRs(PassbkItemStatusModRs passbkItemStatusModRs) {
		this.passbkItemStatusModRs = passbkItemStatusModRs;
	}
	public PassbkItemStatusInqRs getPassbkItemStatusInqRs() {
		return passbkItemStatusInqRs;
	}
	public void setPassbkItemStatusInqRs(PassbkItemStatusInqRs passbkItemStatusInqRs) {
		this.passbkItemStatusInqRs = passbkItemStatusInqRs;
	}

}
