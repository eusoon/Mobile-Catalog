package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtStatusRec extends IFXObject {
	protected PmtStatusRec(){	
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
	public final native PmtStatus getPmtStatus() /*-{
		return $wnd.cleanObject(pmtStatus);
	}-*/;
	public final native void setPmtStatus(PmtStatus pmtStatus) /*-{
		this.pmtStatus = pmtStatus;
	}-*/;
}