package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcRec extends IFXObject {
	protected SvcRec(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native SvcId getSvcId() /*-{
		return $wnd.cleanObject(svcId);
	}-*/;
	public final native void setSvcId(SvcId svcId) /*-{
		this.svcId = svcId;
	}-*/;
	public final native SvcInfo getSvcInfo() /*-{
		return $wnd.cleanObject(svcInfo);
	}-*/;
	public final native void setSvcInfo(SvcInfo svcInfo) /*-{
		this.svcInfo = svcInfo;
	}-*/;
	public final native SvcEnvr getSvcEnvr() /*-{
		return $wnd.cleanObject(svcEnvr);
	}-*/;
	public final native void setSvcEnvr(SvcEnvr svcEnvr) /*-{
		this.svcEnvr = svcEnvr;
	}-*/;
	public final native SvcStatus getSvcStatus() /*-{
		return $wnd.cleanObject(svcStatus);
	}-*/;
	public final native void setSvcStatus(SvcStatus svcStatus) /*-{
		this.svcStatus = svcStatus;
	}-*/;

}
