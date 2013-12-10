package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RefIdentRange extends IFXObject {
	protected RefIdentRange(){	
	}
	public final native RefIdentStart getRefIdentStart() /*-{
		return $wnd.cleanObject(refIdentStart);
	}-*/;
	public final native void setRefIdentStart(RefIdentStart refIdentStart) /*-{
		this.refIdentStart = refIdentStart;
	}-*/;
	public final native RefIdentEnd getRefIdentEnd() /*-{
		return $wnd.cleanObject(refIdentEnd);
	}-*/;
	public final native void setRefIdentEnd(RefIdentEnd refIdentEnd) /*-{
		this.refIdentEnd = refIdentEnd;
	}-*/;
	
}