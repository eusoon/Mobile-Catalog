package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class XferSel extends IFXObject {
	protected XferSel(){	
	}
	public final native  XferKeys getXferKeys()/*-{
		return $wnd.cleanObject(this.xferKeys);
	}-*/;

	public final native  void setXferKeys(XferKeys xferKeys)/*-{
		this.xferKeys = xferKeys;
	}-*/;
}
