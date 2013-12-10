package ong.eu.soon.ifx.party;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.RevRqUID;
import ong.eu.soon.ifx.party.PartyAddRq;
import ong.eu.soon.ifx.party.PartyAudRq;
import ong.eu.soon.ifx.party.PartyAuthModRq;
import ong.eu.soon.ifx.party.PartyInqRq;
import ong.eu.soon.ifx.party.PartyModRq;
import ong.eu.soon.ifx.party.PartyStatusInqRq;
import ong.eu.soon.ifx.party.PartyStatusModRq;
import ong.eu.soon.ifx.party.PartySyncRq;

public class PartyRqMsg extends IFXObject {
	//begin-xor	Required
	PartyAddRq partyAddRq;	 //	Aggregate	 Required	 Party Add Message
	PartyModRq partyModRq;	 //	Aggregate	 Required	 Party Modify Request
	PartyDelRq partyDelRq;	 //	Aggregate	 Required	 Party Delete Request
	PartyInqRq partyInqRq;	 //	Aggregate	 Required	 Party Inquiry Request
	PartyAdviseRq partyAdviseRq;	 //	Aggregate	 Required	 Party Advise Message
	PartyAudRq partyAudRq;	 //	Aggregate	 Required	 Party Audit Request
	PartySyncRq partySyncRq;	 //	Aggregate	 Required	 Party Sync Request
	PartyStatusModRq partyStatusModRq;	 //	Aggregate	 Required	 Party Status Modify Request
	PartyStatusInqRq partyStatusInqRq;	 //	Aggregate	 Required	 Party Status Inquiry Request
	PartyAuthModRq partyAuthModRq;	 //	Aggregate	 Required	 Party Authorization Modify Request
	PartyAuthInqRq partyAuthInqRq;	 //	Aggregate	 Required	 Party Authorization Inquiry Request
	RevRqUID revRqUID;	 //	UUID	 Required	 Reversal Request Unique ID
	//end-xor
	
	public PartyAddRq getPartyAddRq() {
		return partyAddRq;
	}
	public void setPartyAddRq(PartyAddRq partyAddRq) {
		this.partyAddRq = partyAddRq;
	}
	public PartyModRq getPartyModRq() {
		return partyModRq;
	}
	public void setPartyModRq(PartyModRq partyModRq) {
		this.partyModRq = partyModRq;
	}
	public PartyDelRq getPartyDelRq() {
		return partyDelRq;
	}
	public void setPartyDelRq(PartyDelRq partyDelRq) {
		this.partyDelRq = partyDelRq;
	}
	public PartyInqRq getPartyInqRq() {
		return partyInqRq;
	}
	public void setPartyInqRq(PartyInqRq partyInqRq) {
		this.partyInqRq = partyInqRq;
	}
	public PartyAdviseRq getPartyAdviseRq() {
		return partyAdviseRq;
	}
	public void setPartyAdviseRq(PartyAdviseRq partyAdviseRq) {
		this.partyAdviseRq = partyAdviseRq;
	}
	public PartyAudRq getPartyAudRq() {
		return partyAudRq;
	}
	public void setPartyAudRq(PartyAudRq partyAudRq) {
		this.partyAudRq = partyAudRq;
	}
	public PartySyncRq getPartySyncRq() {
		return partySyncRq;
	}
	public void setPartySyncRq(PartySyncRq partySyncRq) {
		this.partySyncRq = partySyncRq;
	}
	public PartyStatusModRq getPartyStatusModRq() {
		return partyStatusModRq;
	}
	public void setPartyStatusModRq(PartyStatusModRq partyStatusModRq) {
		this.partyStatusModRq = partyStatusModRq;
	}
	public PartyStatusInqRq getPartyStatusInqRq() {
		return partyStatusInqRq;
	}
	public void setPartyStatusInqRq(PartyStatusInqRq partyStatusInqRq) {
		this.partyStatusInqRq = partyStatusInqRq;
	}
	public PartyAuthModRq getPartyAuthModRq() {
		return partyAuthModRq;
	}
	public void setPartyAuthModRq(PartyAuthModRq partyAuthModRq) {
		this.partyAuthModRq = partyAuthModRq;
	}
	public PartyAuthInqRq getPartyAuthInqRq() {
		return partyAuthInqRq;
	}
	public void setPartyAuthInqRq(PartyAuthInqRq partyAuthInqRq) {
		this.partyAuthInqRq = partyAuthInqRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
}
