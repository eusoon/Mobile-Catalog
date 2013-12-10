package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtRec extends IFXObject {
	protected PmtRec(){	
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
	public final native PmtInfo getPmtInfo() /*-{
		return $wnd.cleanObject(pmtInfo);
	}-*/;
	public final native void setPmtInfo(PmtInfo pmtInfo) /*-{
		this.pmtInfo = pmtInfo;
	}-*/;
	public final native PmtEnvr getPmtEnvr() /*-{
		return $wnd.cleanObject(pmtEnvr);
	}-*/;
	public final native void setPmtEnvr(PmtEnvr pmtEnvr) /*-{
		this.pmtEnvr = pmtEnvr;
	}-*/;
	public final native PmtStatus getPmtStatus() /*-{
		return $wnd.cleanObject(pmtStatus);
	}-*/;
	public final native void setPmtStatus(PmtStatus pmtStatus) /*-{
		this.pmtStatus = pmtStatus;
	}-*/;
}