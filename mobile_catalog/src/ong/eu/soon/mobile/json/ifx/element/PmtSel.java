package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PmtSel extends IFXObject {
	protected PmtSel(){	
	}
	public final native JsArray<PmtKeys> getPmtKeys() /*-{
		return $wnd.cleanObject(pmtKeys);
	}-*/;

	public final native void setPmtKeys(JsArray<PmtKeys> pmtKeys) /*-{
		this.pmtKeys = pmtKeys;
	}-*/;
}
