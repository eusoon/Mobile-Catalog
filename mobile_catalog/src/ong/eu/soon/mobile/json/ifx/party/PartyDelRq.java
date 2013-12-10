package ong.eu.soon.mobile.json.ifx.party;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.MsgRqHdr;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

public class PartyDelRq extends IFXObject {
	protected PartyDelRq(){	
	}
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native MsgRqHdr getMsgRqHdr() /*-{
		return $wnd.cleanObject(msgRqHdr);
	}-*/;
	public final native void setMsgRqHdr(MsgRqHdr msgRqHdr) /*-{
		this.msgRqHdr = msgRqHdr;
	}-*/;
	public final native PartyKeys getPartyKeys() /*-{
		return $wnd.cleanObject(partyKeys);
	}-*/;
	public final native void setPartyKeys(PartyKeys partyKeys) /*-{
		this.partyKeys = partyKeys;
	}-*/;
}