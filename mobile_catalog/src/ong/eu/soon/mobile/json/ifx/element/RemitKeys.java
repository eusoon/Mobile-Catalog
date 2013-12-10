package ong.eu.soon.mobile.json.ifx.element;

public class RemitKeys extends BaseKeys {
	protected RemitKeys(){	
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
}