package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class BillerSel extends IFXObject {
	
	protected BillerSel(){	
	}
	
	public final native  BillerKeys getBillerKeys()/*-{
	return $wnd.cleanObject(this.billerKeys);
	}-*/;
	
	public final native  void setBillerKeys(BillerKeys billerKeys)/*-{
		this.billerKeys = billerKeys;
	}-*/;
}
