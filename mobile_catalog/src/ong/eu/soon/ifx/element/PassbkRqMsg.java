package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.passbk.PassbkAddRq;
import ong.eu.soon.ifx.passbk.PassbkAudRq;
import ong.eu.soon.ifx.passbk.PassbkDelRq;
import ong.eu.soon.ifx.passbk.PassbkInqRq;
import ong.eu.soon.ifx.passbk.PassbkModRq;
import ong.eu.soon.ifx.passbk.PassbkStatusInqRq;
import ong.eu.soon.ifx.passbk.PassbkStatusModRq;
import ong.eu.soon.ifx.passbk.PassbkSyncRq;

public class PassbkRqMsg extends IFXObject {

	//begin Aggregate
	//begin-xor	Required
	PassbkAddRq passbkAddRq;	 //	Aggregate	 Required	 Passbook Add Request
	PassbkModRq passbkModRq;	 //	Aggregate	 Required	 Passbook Modify Request
	PassbkDelRq passbkDelRq;	 //	Aggregate	 Required	 Passbook Delete Request
	PassbkInqRq passbkInqRq;	 //	Aggregate	 Required	 Passbook Inquiry Request
	PassbkAudRq passbkAudRq;	 //	Aggregate	 Required	 Passbook Audit Request
	PassbkSyncRq passbkSyncRq;	 //	Aggregate	 Required	 Passbook Sync Request
	PassbkStatusModRq passbkStatusModRq;	 //	Aggregate	 Required	 Passbook Status Modify Request
	PassbkStatusInqRq passbkStatusInqRq;	 //	Aggregate	 Required	 Passbook Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Optional	 Reversal Request Unique ID
	//end-xor
	//end Aggregate
	
	public PassbkAddRq getPassbkAddRq() {
		return passbkAddRq;
	}
	public void setPassbkAddRq(PassbkAddRq passbkAddRq) {
		this.passbkAddRq = passbkAddRq;
	}
	public PassbkModRq getPassbkModRq() {
		return passbkModRq;
	}
	public void setPassbkModRq(PassbkModRq passbkModRq) {
		this.passbkModRq = passbkModRq;
	}
	public PassbkDelRq getPassbkDelRq() {
		return passbkDelRq;
	}
	public void setPassbkDelRq(PassbkDelRq passbkDelRq) {
		this.passbkDelRq = passbkDelRq;
	}
	public PassbkInqRq getPassbkInqRq() {
		return passbkInqRq;
	}
	public void setPassbkInqRq(PassbkInqRq passbkInqRq) {
		this.passbkInqRq = passbkInqRq;
	}
	public PassbkAudRq getPassbkAudRq() {
		return passbkAudRq;
	}
	public void setPassbkAudRq(PassbkAudRq passbkAudRq) {
		this.passbkAudRq = passbkAudRq;
	}
	public PassbkSyncRq getPassbkSyncRq() {
		return passbkSyncRq;
	}
	public void setPassbkSyncRq(PassbkSyncRq passbkSyncRq) {
		this.passbkSyncRq = passbkSyncRq;
	}
	public PassbkStatusModRq getPassbkStatusModRq() {
		return passbkStatusModRq;
	}
	public void setPassbkStatusModRq(PassbkStatusModRq passbkStatusModRq) {
		this.passbkStatusModRq = passbkStatusModRq;
	}
	public PassbkStatusInqRq getPassbkStatusInqRq() {
		return passbkStatusInqRq;
	}
	public void setPassbkStatusInqRq(PassbkStatusInqRq passbkStatusInqRq) {
		this.passbkStatusInqRq = passbkStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
