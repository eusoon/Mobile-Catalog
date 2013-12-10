package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RecCtrlIn extends IFXObject {
	protected RecCtrlIn(){	
	}
	public final native RecCountLimit getRecCountLimit() /*-{
		return $wnd.cleanObject(RecCountLimit);
	}-*/;
	public final native void setRecCountLimit(RecCountLimit recCountLimit) /*-{
		RecCountLimit = recCountLimit;
	}-*/;
	public final native Cursor getCursor() /*-{
		return $wnd.cleanObject(cursor);
	}-*/;
	public final native void setCursor(Cursor cursor) /*-{
		this.cursor = cursor;
	}-*/;
	public final native Token getToken() /*-{
		return $wnd.cleanObject(token);
	}-*/;
	public final native void setToken(Token token) /*-{
		this.token = token;
	}-*/;
}