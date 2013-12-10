package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class TimeFrame extends IFXObject {
	protected TimeFrame(){	
	}
	public final native StartDt getStartDt() /*-{
		return $wnd.cleanObject(startDt);
	}-*/;
	public final native void setStartDt(StartDt startDt) /*-{
		this.startDt = startDt;
	}-*/;
	public final native EndDt getEndDt() /*-{
		return $wnd.cleanObject(endDt);
	}-*/;
	public final native void setEndDt(EndDt endDt) /*-{
		this.endDt = endDt;
	}-*/;
	public final native Duration getDuration() /*-{
		return $wnd.cleanObject(duration);
	}-*/;
	public final native void setDuration(Duration duration) /*-{
		this.duration = duration;
	}-*/;
	public final native AllDayEvent getAllDayEvent() /*-{
		return $wnd.cleanObject(allDayEvent);
	}-*/;
	public final native void setAllDayEvent(AllDayEvent allDayEvent) /*-{
		this.allDayEvent = allDayEvent;
	}-*/;
	public final native JsArray<RecurRule> getRecurRule() /*-{
		return $wnd.cleanObject(recurRule);
	}-*/;
	public final native void setRecurRule(JsArray<RecurRule> recurRule) /*-{
		this.recurRule = recurRule;
	}-*/;
	public final native JsArray<RecurException> getRecurException() /*-{
		return $wnd.cleanObject(recurException);
	}-*/;
	public final native void setRecurException(JsArray<RecurException> recurException) /*-{
		this.recurException = recurException;
	}-*/;


}
