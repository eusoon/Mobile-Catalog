package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcSel extends IFXObject {
	protected SvcSel(){	
	}
	public final native  SvcKeys getSvcKeys()/*-{
		return $wnd.cleanObject(this.svcKeys);
	}-*/;
	public final native  void setSvcKeys(SvcKeys svcKeys)/*-{
		this.svcKeys = svcKeys;
	}-*/;
}
