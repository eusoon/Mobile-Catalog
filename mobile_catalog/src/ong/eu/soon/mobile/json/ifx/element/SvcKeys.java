package ong.eu.soon.mobile.json.ifx.element;


public class SvcKeys extends BaseKeys {
	protected SvcKeys(){	
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
	public final native SvcName getSvcName() /*-{
		return $wnd.cleanObject(svcName);
	}-*/;
	public final native void setSvcName(SvcName svcName) /*-{
		this.svcName = svcName;
	}-*/;
}
