package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RecordCountLimit extends IFXObject {
	protected RecordCountLimit(){	
	}
	public final native LimitPosition getLimitPosition() /*-{
		return $wnd.cleanObject(limitPosition);
	}-*/;
	public final native void setLimitPosition(LimitPosition limitPosition) /*-{
		this.limitPosition = limitPosition;
	}-*/;
	public final native MaxRecLimit getMaxRecLimit() /*-{
		return $wnd.cleanObject(maxRecLimit);
	}-*/;
	public final native void setMaxRecLimit(MaxRecLimit maxRecLimit) /*-{
		this.maxRecLimit = maxRecLimit;
	}-*/;
	public final native CurRecLimit getCurRecLimit() /*-{
		return $wnd.cleanObject(curRecLimit);
	}-*/;
	public final native void setCurRecLimit(CurRecLimit curRecLimit) /*-{
		this.curRecLimit = curRecLimit;
	}-*/;

}