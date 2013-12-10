package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.party.PartyAddRs;
import ong.eu.soon.ifx.party.PartyAdviseRs;
import ong.eu.soon.ifx.party.PartyAuthInqRs;
import ong.eu.soon.ifx.party.PartyAuthModRs;
import ong.eu.soon.ifx.party.PartyDelRs;
import ong.eu.soon.ifx.party.PartyInqRs;
import ong.eu.soon.ifx.party.PartyModRs;
import ong.eu.soon.ifx.party.PartyRevRs;
import ong.eu.soon.ifx.party.PartyStatusInqRs;
import ong.eu.soon.ifx.party.PartyStatusModRs;

public class PartyRsMsg extends IFXObject {
	MsgRecDt msgRecDt;	 //	Timestamp	 Optional	 Audit Record Creation Date
	//begin -xor
	PartyAddRs partyAddRs;	 //	Aggregate	 Required	 Party Add Response
	PartyModRs partyModRs;	 //	Aggregate	 Required	 Party Modify Response
	PartyDelRs partyDelRs;	 //	Aggregate	 Required	 Party Delete Response
	PartyRevRs partyRevRs;	 //	Aggregate	 Required	 Party Reversal Response
	PartyInqRs partyInqRs;	 //	Aggregate	 Required	 Party Inquiry Response
	PartyAdviseRs partyAdviseRs;	 //	Aggregate	 Required	 Party Advise Response
	PartyStatusModRs partyStatusModRs;	 //	Aggregate	 Required	 Party Status Modify Response
	PartyStatusInqRs partyStatusInqRs;	 //	Aggregate	 Required	 Party Status Inquiry Response
	PartyAuthModRs partyAuthModRs;	 //	Aggregate	 Required	 Party Authorization Modify Response
	PartyAuthInqRs partyAuthInqRs;	 //	Aggregate	 Required	 Party Authorization Inquiry Response
	//end -xor
	public MsgRecDt getMsgRecDt() {
		return msgRecDt;
	}
	public void setMsgRecDt(MsgRecDt msgRecDt) {
		this.msgRecDt = msgRecDt;
	}
	public PartyAddRs getPartyAddRs() {
		return partyAddRs;
	}
	public void setPartyAddRs(PartyAddRs partyAddRs) {
		this.partyAddRs = partyAddRs;
	}
	public PartyModRs getPartyModRs() {
		return partyModRs;
	}
	public void setPartyModRs(PartyModRs partyModRs) {
		this.partyModRs = partyModRs;
	}
	public PartyDelRs getPartyDelRs() {
		return partyDelRs;
	}
	public void setPartyDelRs(PartyDelRs partyDelRs) {
		this.partyDelRs = partyDelRs;
	}
	public PartyRevRs getPartyRevRs() {
		return partyRevRs;
	}
	public void setPartyRevRs(PartyRevRs partyRevRs) {
		this.partyRevRs = partyRevRs;
	}
	public PartyInqRs getPartyInqRs() {
		return partyInqRs;
	}
	public void setPartyInqRs(PartyInqRs partyInqRs) {
		this.partyInqRs = partyInqRs;
	}
	public PartyAdviseRs getPartyAdviseRs() {
		return partyAdviseRs;
	}
	public void setPartyAdviseRs(PartyAdviseRs partyAdviseRs) {
		this.partyAdviseRs = partyAdviseRs;
	}
	public PartyStatusModRs getPartyStatusModRs() {
		return partyStatusModRs;
	}
	public void setPartyStatusModRs(PartyStatusModRs partyStatusModRs) {
		this.partyStatusModRs = partyStatusModRs;
	}
	public PartyStatusInqRs getPartyStatusInqRs() {
		return partyStatusInqRs;
	}
	public void setPartyStatusInqRs(PartyStatusInqRs partyStatusInqRs) {
		this.partyStatusInqRs = partyStatusInqRs;
	}
	public PartyAuthModRs getPartyAuthModRs() {
		return partyAuthModRs;
	}
	public void setPartyAuthModRs(PartyAuthModRs partyAuthModRs) {
		this.partyAuthModRs = partyAuthModRs;
	}
	public PartyAuthInqRs getPartyAuthInqRs() {
		return partyAuthInqRs;
	}
	public void setPartyAuthInqRs(PartyAuthInqRs partyAuthInqRs) {
		this.partyAuthInqRs = partyAuthInqRs;
	}
}
