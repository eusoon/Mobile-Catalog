package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class StdPayeeSel extends IFXObject {
	protected StdPayeeSel(){	
	}
	public final native StdPayeeKeys getStdPayeeKeys() /*-{
		return $wnd.cleanObject(stdPayeeKeys);
	}-*/;

	public final native void setStdPayeeKeys(StdPayeeKeys stdPayeeKeys) /*-{
		this.stdPayeeKeys = stdPayeeKeys;
	}-*/;

}