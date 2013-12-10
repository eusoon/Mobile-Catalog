package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class DiscRef extends IFXObject {
	
	protected DiscRef(){
	}
	
	public final native  DiscKeys getDiscKeys()/*-{
		return $wnd.cleanObject(this.DiscKeys);
	}-*/;
	public final native  void setDiscKeys(DiscKeys discKeys)/*-{
		DiscKeys = discKeys;
	}-*/;
	public final native  DiscRec getDiscRec()/*-{
		return $wnd.cleanObject(this.DiscRec);
	}-*/;
	public final native  void setDiscRec(DiscRec discRec)/*-{
		DiscRec = discRec;
	}-*/;
	public final native  DiscInfo getDiscInfo()/*-{
		return $wnd.cleanObject(this.DiscInfo);
	}-*/;
	public final native  void setDiscInfo(DiscInfo discInfo)/*-{
		DiscInfo = discInfo;
	}-*/;
}
