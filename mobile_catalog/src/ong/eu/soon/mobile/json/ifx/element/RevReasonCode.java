package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RevReasonCode extends IFXObject {
	protected RevReasonCode(){	
	}
	public final native RevReasonCodeValue getRevReasonCodeValue() /*-{
		return $wnd.cleanObject(revReasonCodeValue);
	}-*/;
	public final native void setRevReasonCodeValue(RevReasonCodeValue revReasonCodeValue) /*-{
		this.revReasonCodeValue = revReasonCodeValue;
	}-*/;
	public final native RevReasonCodeSource getRevReasonCodeSource() /*-{
		return $wnd.cleanObject(revReasonCodeSource);
	}-*/;
	public final native void setRevReasonCodeSource(RevReasonCodeSource revReasonCodeSource) /*-{
		this.revReasonCodeSource = revReasonCodeSource;
	}-*/;	
}