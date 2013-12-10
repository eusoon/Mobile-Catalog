package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcProviderSel extends IFXObject {
	protected SvcProviderSel(){	
	}
	public final native SvcProviderKeys getSvcProviderKeys() /*-{
		return $wnd.cleanObject(svcProviderKeys);
	}-*/;

	public final native void setSvcProviderKeys(SvcProviderKeys svcProviderKeys) /*-{
		this.svcProviderKeys = svcProviderKeys;
	}-*/;

}
