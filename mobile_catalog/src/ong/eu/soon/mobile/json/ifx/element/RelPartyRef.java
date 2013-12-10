package ong.eu.soon.mobile.json.ifx.element;

import com.google.gwt.core.client.JsArray;

public class RelPartyRef extends PartyRef {
	protected RelPartyRef(){	
	}
	public final native JsArray<RelPartyRole> getRelPartyRole() /*-{
		return $wnd.cleanObject(relPartyRole);
	}-*/;
	public final native void setRelPartyRole(JsArray<RelPartyRole> relPartyRole) /*-{
		this.relPartyRole = relPartyRole;
	}-*/;
	public final native RelEstablishDt getRelEstablishDt() /*-{
		return $wnd.cleanObject(relEstablishDt);
	}-*/;
	public final native void setRelEstablishDt(RelEstablishDt relEstablishDt) /*-{
		this.relEstablishDt = relEstablishDt;
	}-*/;
	public final native TimeFrame getTimeFrame() /*-{
		return $wnd.cleanObject(timeFrame);
	}-*/;
	public final native void setTimeFrame(TimeFrame timeFrame) /*-{
		this.timeFrame = timeFrame;
	}-*/;
}
