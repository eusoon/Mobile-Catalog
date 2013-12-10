package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class FeeWaiver extends IFXObject {
	
	protected FeeWaiver(){
	}
	
	public final native  WaiverReason getWaiverReason()/*-{
		return $wnd.cleanObject(this.waiverReason);
	}-*/;
	public final native  void setWaiverReason(WaiverReason waiverReason)/*-{
		this.waiverReason = waiverReason;
	}-*/;
	public final native  TimeFrame getTimeFrame()/*-{
		return $wnd.cleanObject(this.TimeFrame);
	}-*/;
	public final native  void setTimeFrame(TimeFrame timeFrame)/*-{
		TimeFrame = timeFrame;
	}-*/;
}
