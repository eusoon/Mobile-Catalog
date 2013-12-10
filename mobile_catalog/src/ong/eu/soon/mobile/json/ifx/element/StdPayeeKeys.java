package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class StdPayeeKeys extends IFXObject {
	protected StdPayeeKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native StdPayeeId getStdPayeeId() /*-{
		return $wnd.cleanObject(stdPayeeId);
	}-*/;
	public final native void setStdPayeeId(StdPayeeId stdPayeeId) /*-{
		this.stdPayeeId = stdPayeeId;
	}-*/;
}