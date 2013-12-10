package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RecCtrlOut extends IFXObject {
	protected RecCtrlOut(){	
	}
	public final native SentRecCount getSentRecCount() /*-{
		return $wnd.cleanObject(sentRecCount);
	}-*/;
	public final native void setSentRecCount(SentRecCount sentRecCount) /*-{
		this.sentRecCount = sentRecCount;
	}-*/;
	public final native MatchedRecCount getMatchedRecCount() /*-{
		return $wnd.cleanObject(matchedRecCount);
	}-*/;
	public final native void setMatchedRecCount(MatchedRecCount matchedRecCount) /*-{
		this.matchedRecCount = matchedRecCount;
	}-*/;
	public final native RemainRecCount getRemainRecCount() /*-{
		return $wnd.cleanObject(remainRecCount);
	}-*/;
	public final native void setRemainRecCount(RemainRecCount remainRecCount) /*-{
		this.remainRecCount = remainRecCount;
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
