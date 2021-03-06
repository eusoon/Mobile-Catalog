package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class StdPayeeRef extends IFXObject {
	protected StdPayeeRef(){	
	}
	public final native StdPayeeKeys getStdPayeeKeys() /*-{
		return $wnd.cleanObject(stdPayeeKeys);
	}-*/;
	public final native void setStdPayeeKeys(StdPayeeKeys stdPayeeKeys) /*-{
		this.stdPayeeKeys = stdPayeeKeys;
	}-*/;
	public final native StdPayeeRec getStdPayeeRec() /*-{
		return $wnd.cleanObject(stdPayeeRec);
	}-*/;
	public final native void setStdPayeeRec(StdPayeeRec stdPayeeRec) /*-{
		this.stdPayeeRec = stdPayeeRec;
	}-*/;
	public final native StdPayeeInfo getStdPayeeInfo() /*-{
		return $wnd.cleanObject(stdPayeeInfo);
	}-*/;
	public final native void setStdPayeeInfo(StdPayeeInfo stdPayeeInfo) /*-{
		this.stdPayeeInfo = stdPayeeInfo;
	}-*/;
}