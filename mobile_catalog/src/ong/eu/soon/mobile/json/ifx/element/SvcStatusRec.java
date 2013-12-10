package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcStatusRec extends IFXObject {
	protected SvcStatusRec(){	
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
	public final native SvcStatus getSvcStatus() /*-{
		return $wnd.cleanObject(svcStatus);
	}-*/;
	public final native void setSvcStatus(SvcStatus svcStatus) /*-{
		this.svcStatus = svcStatus;
	}-*/;

}
