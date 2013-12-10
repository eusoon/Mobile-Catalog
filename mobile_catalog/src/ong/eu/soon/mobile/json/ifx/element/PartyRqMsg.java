package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.party.PartyAddRq;
import ong.eu.soon.mobile.json.ifx.party.PartyAdviseRq;
import ong.eu.soon.mobile.json.ifx.party.PartyAudRq;
import ong.eu.soon.mobile.json.ifx.party.PartyAuthInqRq;
import ong.eu.soon.mobile.json.ifx.party.PartyAuthModRq;
import ong.eu.soon.mobile.json.ifx.party.PartyDelRq;
import ong.eu.soon.mobile.json.ifx.party.PartyInqRq;
import ong.eu.soon.mobile.json.ifx.party.PartyModRq;
import ong.eu.soon.mobile.json.ifx.party.PartyStatusInqRq;
import ong.eu.soon.mobile.json.ifx.party.PartyStatusModRq;
import ong.eu.soon.mobile.json.ifx.party.PartySyncRq;

public class PartyRqMsg extends IFXObject {
	protected PartyRqMsg(){	
	}
	public final native PartyAddRq getPartyAddRq() /*-{
		return $wnd.cleanObject(partyAddRq);
	}-*/;
	public final native void setPartyAddRq(PartyAddRq partyAddRq) /*-{
		this.partyAddRq = partyAddRq;
	}-*/;
	public final native PartyModRq getPartyModRq() /*-{
		return $wnd.cleanObject(partyModRq);
	}-*/;
	public final native void setPartyModRq(PartyModRq partyModRq) /*-{
		this.partyModRq = partyModRq;
	}-*/;
	public final native PartyDelRq getPartyDelRq() /*-{
		return $wnd.cleanObject(partyDelRq);
	}-*/;
	public final native void setPartyDelRq(PartyDelRq partyDelRq) /*-{
		this.partyDelRq = partyDelRq;
	}-*/;
	public final native PartyInqRq getPartyInqRq() /*-{
		return $wnd.cleanObject(partyInqRq);
	}-*/;
	public final native void setPartyInqRq(PartyInqRq partyInqRq) /*-{
		this.partyInqRq = partyInqRq;
	}-*/;
	public final native PartyAdviseRq getPartyAdviseRq() /*-{
		return $wnd.cleanObject(partyAdviseRq);
	}-*/;
	public final native void setPartyAdviseRq(PartyAdviseRq partyAdviseRq) /*-{
		this.partyAdviseRq = partyAdviseRq;
	}-*/;
	public final native PartyAudRq getPartyAudRq() /*-{
		return $wnd.cleanObject(partyAudRq);
	}-*/;
	public final native void setPartyAudRq(PartyAudRq partyAudRq) /*-{
		this.partyAudRq = partyAudRq;
	}-*/;
	public final native PartySyncRq getPartySyncRq() /*-{
		return $wnd.cleanObject(partySyncRq);
	}-*/;
	public final native void setPartySyncRq(PartySyncRq partySyncRq) /*-{
		this.partySyncRq = partySyncRq;
	}-*/;
	public final native PartyStatusModRq getPartyStatusModRq() /*-{
		return $wnd.cleanObject(partyStatusModRq);
	}-*/;
	public final native void setPartyStatusModRq(PartyStatusModRq partyStatusModRq) /*-{
		this.partyStatusModRq = partyStatusModRq;
	}-*/;
	public final native PartyStatusInqRq getPartyStatusInqRq() /*-{
		return $wnd.cleanObject(partyStatusInqRq);
	}-*/;
	public final native void setPartyStatusInqRq(PartyStatusInqRq partyStatusInqRq) /*-{
		this.partyStatusInqRq = partyStatusInqRq;
	}-*/;
	public final native PartyAuthModRq getPartyAuthModRq() /*-{
		return $wnd.cleanObject(partyAuthModRq);
	}-*/;
	public final native void setPartyAuthModRq(PartyAuthModRq partyAuthModRq) /*-{
		this.partyAuthModRq = partyAuthModRq;
	}-*/;
	public final native PartyAuthInqRq getPartyAuthInqRq() /*-{
		return $wnd.cleanObject(partyAuthInqRq);
	}-*/;
	public final native void setPartyAuthInqRq(PartyAuthInqRq partyAuthInqRq) /*-{
		this.partyAuthInqRq = partyAuthInqRq;
	}-*/;
	public final native RevRqUID getRevRqUID() /*-{
		return $wnd.cleanObject(revRqUID);
	}-*/;
	public final native void setRevRqUID(RevRqUID revRqUID) /*-{
		this.revRqUID = revRqUID;
	}-*/;
}