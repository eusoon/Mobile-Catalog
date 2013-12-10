package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RecCountLimit extends IFXObject {
	protected RecCountLimit(){	
	}
	public final native  LimitPosition getLimitPosition()/*-{
		return $wnd.cleanObject(this.limitPosition);
	}-*/;
	public final native  void setLimitPosition(LimitPosition limitPosition)/*-{
		this.limitPosition = limitPosition;
	}-*/;
	public final native  MaxRecLimit getMaxRecLimit()/*-{
		return $wnd.cleanObject(this.maxRecLimit);
	}-*/;
	public final native  void setMaxRecLimit(MaxRecLimit maxRecLimit)/*-{
		this.maxRecLimit = maxRecLimit;
	}-*/;
	public final native  CurRecLimit getCurRecLimit()/*-{
		return $wnd.cleanObject(this.curRecLimit);
	}-*/;
	public final native  void setCurRecLimit(CurRecLimit curRecLimit)/*-{
		this.curRecLimit = curRecLimit;
	}-*/;
}
