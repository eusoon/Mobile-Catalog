package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RecurPmtKeys extends IFXObject {
	protected RecurPmtKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native RecurPmtId getRecurPmtId() /*-{
		return $wnd.cleanObject(recurPmtId);
	}-*/;
	public final native void setRecurPmtId(RecurPmtId recurPmtId) /*-{
		this.recurPmtId = recurPmtId;
	}-*/;
	
}
