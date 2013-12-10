package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.party.PartyAddRs;
import ong.eu.soon.mobile.json.ifx.party.PartyAdviseRs;
import ong.eu.soon.mobile.json.ifx.party.PartyAuthInqRs;
import ong.eu.soon.mobile.json.ifx.party.PartyAuthModRs;
import ong.eu.soon.mobile.json.ifx.party.PartyDelRs;
import ong.eu.soon.mobile.json.ifx.party.PartyInqRs;
import ong.eu.soon.mobile.json.ifx.party.PartyModRs;
import ong.eu.soon.mobile.json.ifx.party.PartyRevRs;
import ong.eu.soon.mobile.json.ifx.party.PartyStatusInqRs;
import ong.eu.soon.mobile.json.ifx.party.PartyStatusModRs;

public class PartyRsMsg extends IFXObject {
	protected PartyRsMsg(){	
	}
	public final native MsgRecDt getMsgRecDt() /*-{
		return $wnd.cleanObject(msgRecDt);
	}-*/;
	public final native void setMsgRecDt(MsgRecDt msgRecDt) /*-{
		this.msgRecDt = msgRecDt;
	}-*/;
	public final native PartyAddRs getPartyAddRs() /*-{
		return $wnd.cleanObject(partyAddRs);
	}-*/;
	public final native void setPartyAddRs(PartyAddRs partyAddRs) /*-{
		this.partyAddRs = partyAddRs;
	}-*/;
	public final native PartyModRs getPartyModRs() /*-{
		return $wnd.cleanObject(partyModRs);
	}-*/;
	public final native void setPartyModRs(PartyModRs partyModRs) /*-{
		this.partyModRs = partyModRs;
	}-*/;
	public final native PartyDelRs getPartyDelRs() /*-{
		return $wnd.cleanObject(partyDelRs);
	}-*/;
	public final native void setPartyDelRs(PartyDelRs partyDelRs) /*-{
		this.partyDelRs = partyDelRs;
	}-*/;
	public final native PartyRevRs getPartyRevRs() /*-{
		return $wnd.cleanObject(partyRevRs);
	}-*/;
	public final native void setPartyRevRs(PartyRevRs partyRevRs) /*-{
		this.partyRevRs = partyRevRs;
	}-*/;
	public final native PartyInqRs getPartyInqRs() /*-{
		return $wnd.cleanObject(partyInqRs);
	}-*/;
	public final native void setPartyInqRs(PartyInqRs partyInqRs) /*-{
		this.partyInqRs = partyInqRs;
	}-*/;
	public final native PartyAdviseRs getPartyAdviseRs() /*-{
		return $wnd.cleanObject(partyAdviseRs);
	}-*/;
	public final native void setPartyAdviseRs(PartyAdviseRs partyAdviseRs) /*-{
		this.partyAdviseRs = partyAdviseRs;
	}-*/;
	public final native PartyStatusModRs getPartyStatusModRs() /*-{
		return $wnd.cleanObject(partyStatusModRs);
	}-*/;
	public final native void setPartyStatusModRs(PartyStatusModRs partyStatusModRs) /*-{
		this.partyStatusModRs = partyStatusModRs;
	}-*/;
	public final native PartyStatusInqRs getPartyStatusInqRs() /*-{
		return $wnd.cleanObject(partyStatusInqRs);
	}-*/;
	public final native void setPartyStatusInqRs(PartyStatusInqRs partyStatusInqRs) /*-{
		this.partyStatusInqRs = partyStatusInqRs;
	}-*/;
	public final native PartyAuthModRs getPartyAuthModRs() /*-{
		return $wnd.cleanObject(partyAuthModRs);
	}-*/;
	public final native void setPartyAuthModRs(PartyAuthModRs partyAuthModRs) /*-{
		this.partyAuthModRs = partyAuthModRs;
	}-*/;
	public final native PartyAuthInqRs getPartyAuthInqRs() /*-{
		return $wnd.cleanObject(partyAuthInqRs);
	}-*/;
	public final native void setPartyAuthInqRs(PartyAuthInqRs partyAuthInqRs) /*-{
		this.partyAuthInqRs = partyAuthInqRs;
	}-*/;
}