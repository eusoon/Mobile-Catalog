package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtKeys extends IFXObject {
	protected PmtKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native PmtId getPmtId() /*-{
		return $wnd.cleanObject(pmtId);
	}-*/;
	public final native void setPmtId(PmtId pmtId) /*-{
		this.pmtId = pmtId;
	}-*/;
}