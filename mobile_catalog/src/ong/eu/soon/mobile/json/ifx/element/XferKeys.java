package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class XferKeys extends IFXObject {
	protected XferKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native XferId getXferId() /*-{
		return $wnd.cleanObject(xferId);
	}-*/;
	public final native void setXferId(XferId xferId) /*-{
		this.xferId = xferId;
	}-*/;	
}