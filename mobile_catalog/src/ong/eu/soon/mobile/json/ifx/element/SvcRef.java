package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcRef extends IFXObject {
	protected SvcRef(){	
	}
	public final native  SvcKeys getSvcKeys()/*-{
		return $wnd.cleanObject(this.svcKeys);
	}-*/;
	public final native  void setSvcKeys(SvcKeys svcKeys)/*-{
		this.svcKeys = svcKeys;
	}-*/;
	public final native  SvcRec getSvcRec()/*-{
		return $wnd.cleanObject(this.svcRec);
	}-*/;
	public final native  void setSvcRec(SvcRec svcRec)/*-{
		this.svcRec = svcRec;
	}-*/;
	public final native  SvcInfo getSvcInfo()/*-{
		return $wnd.cleanObject(this.svcInfo);
	}-*/;
	public final native  void setSvcInfo(SvcInfo svcInfo)/*-{
		this.svcInfo = svcInfo;
	}-*/;
}
