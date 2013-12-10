package ong.eu.soon.mobile.json.ifx.element;

public class RecurXferKeys extends BaseKeys {
	protected RecurXferKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(SvcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		SvcIdent = svcIdent;
	}-*/;
	public final native RecurXferId getRecurXferId() /*-{
		return $wnd.cleanObject(recurXferId);
	}-*/;
	public final native void setRecurXferId(RecurXferId recurXferId) /*-{
		this.recurXferId = recurXferId;
	}-*/;

}
