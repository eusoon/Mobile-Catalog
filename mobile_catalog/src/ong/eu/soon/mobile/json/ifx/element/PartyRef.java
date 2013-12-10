package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyRef extends IFXObject {
	protected PartyRef(){	
	}
	public final native PartyKeys getPartyKeys() /*-{
		return $wnd.cleanObject(partyKeys);
	}-*/;
	public final native void setPartyKeys(PartyKeys partyKeys) /*-{
		this.partyKeys = partyKeys;
	}-*/;
	public final native PartyRec getPartyRec() /*-{
		return $wnd.cleanObject(partyRec);
	}-*/;
	public final native void setPartyRec(PartyRec partyRec) /*-{
		this.partyRec = partyRec;
	}-*/;
	public final native PartyInfo getPartyInfo() /*-{
		return $wnd.cleanObject(partyInfo);
	}-*/;
	public final native void setPartyInfo(PartyInfo partyInfo) /*-{
		this.partyInfo = partyInfo;
	}-*/;
}