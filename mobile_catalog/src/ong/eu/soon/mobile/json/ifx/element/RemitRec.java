package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RemitRec extends IFXObject {
	protected RemitRec(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native RemitId getRemitId() /*-{
		return $wnd.cleanObject(remitId);
	}-*/;
	public final native void setRemitId(RemitId remitId) /*-{
		this.remitId = remitId;
	}-*/;
	public final native RemitInfo getRemitInfo() /*-{
		return $wnd.cleanObject(remitInfo);
	}-*/;
	public final native void setRemitInfo(RemitInfo remitInfo) /*-{
		this.remitInfo = remitInfo;
	}-*/;
	public final native RemitEnvr getRemitEnvr() /*-{
		return $wnd.cleanObject(remitEnvr);
	}-*/;
	public final native void setRemitEnvr(RemitEnvr remitEnvr) /*-{
		this.remitEnvr = remitEnvr;
	}-*/;
	public final native RemitStatus getRemitStatus() /*-{
		return $wnd.cleanObject(remitStatus);
	}-*/;
	public final native void setRemitStatus(RemitStatus remitStatus) /*-{
		this.remitStatus = remitStatus;
	}-*/;
}