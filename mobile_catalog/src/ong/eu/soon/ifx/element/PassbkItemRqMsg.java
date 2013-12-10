package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.passbk.PassbkItemAddRq;
import ong.eu.soon.ifx.passbk.PassbkItemAudRq;
import ong.eu.soon.ifx.passbk.PassbkItemDelRq;
import ong.eu.soon.ifx.passbk.PassbkItemInqRq;
import ong.eu.soon.ifx.passbk.PassbkItemModRq;
import ong.eu.soon.ifx.passbk.PassbkItemStatusInqRq;
import ong.eu.soon.ifx.passbk.PassbkItemStatusModRq;
import ong.eu.soon.ifx.passbk.PassbkItemSyncRq;

public class PassbkItemRqMsg extends IFXObject {

	//begin Aggregate
	//begin-xor	Required
	PassbkItemAddRq passbkItemAddRq;	 //	Aggregate	 Required	 Passbook Item Add Request
	PassbkItemModRq passbkItemModRq;	 //	Aggregate	 Required	 Passbook Item Modify Request
	PassbkItemDelRq passbkItemDelRq;	 //	Aggregate	 Required	 Passbook Item Delete Request
	PassbkItemInqRq passbkItemInqRq;	 //	Aggregate	 Required	 Passbook Item Inquiry Request
	PassbkItemAudRq passbkItemAudRq;	 //	Aggregate	 Required	 Passbook Item Audit Request
	PassbkItemSyncRq passbkItemSyncRq;	 //	Aggregate	 Required	 Passbook Item Sync Request
	PassbkItemStatusModRq passbkItemStatusModRq;	 //	Aggregate	 Required	 Passbook Item Status Modify Request
	PassbkItemStatusInqRq passbkItemStatusInqRq;	 //	Aggregate	 Required	 Passbook Item Status Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Optional	 Reversal Request Unique ID
	//end-xor
	//end Aggregate
	
	public PassbkItemAddRq getPassbkItemAddRq() {
		return passbkItemAddRq;
	}
	public void setPassbkItemAddRq(PassbkItemAddRq passbkItemAddRq) {
		this.passbkItemAddRq = passbkItemAddRq;
	}
	public PassbkItemModRq getPassbkItemModRq() {
		return passbkItemModRq;
	}
	public void setPassbkItemModRq(PassbkItemModRq passbkItemModRq) {
		this.passbkItemModRq = passbkItemModRq;
	}
	public PassbkItemDelRq getPassbkItemDelRq() {
		return passbkItemDelRq;
	}
	public void setPassbkItemDelRq(PassbkItemDelRq passbkItemDelRq) {
		this.passbkItemDelRq = passbkItemDelRq;
	}
	public PassbkItemInqRq getPassbkItemInqRq() {
		return passbkItemInqRq;
	}
	public void setPassbkItemInqRq(PassbkItemInqRq passbkItemInqRq) {
		this.passbkItemInqRq = passbkItemInqRq;
	}
	public PassbkItemAudRq getPassbkItemAudRq() {
		return passbkItemAudRq;
	}
	public void setPassbkItemAudRq(PassbkItemAudRq passbkItemAudRq) {
		this.passbkItemAudRq = passbkItemAudRq;
	}
	public PassbkItemSyncRq getPassbkItemSyncRq() {
		return passbkItemSyncRq;
	}
	public void setPassbkItemSyncRq(PassbkItemSyncRq passbkItemSyncRq) {
		this.passbkItemSyncRq = passbkItemSyncRq;
	}
	public PassbkItemStatusModRq getPassbkItemStatusModRq() {
		return passbkItemStatusModRq;
	}
	public void setPassbkItemStatusModRq(PassbkItemStatusModRq passbkItemStatusModRq) {
		this.passbkItemStatusModRq = passbkItemStatusModRq;
	}
	public PassbkItemStatusInqRq getPassbkItemStatusInqRq() {
		return passbkItemStatusInqRq;
	}
	public void setPassbkItemStatusInqRq(PassbkItemStatusInqRq passbkItemStatusInqRq) {
		this.passbkItemStatusInqRq = passbkItemStatusInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
	
}
