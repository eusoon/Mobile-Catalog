package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PercentBalType extends IFXObject {
	protected PercentBalType(){	
	}
	public final native BalTypeSource getBalTypeSource() /*-{
		return $wnd.cleanObject(balTypeSource);
	}-*/;
	public final native void setBalTypeSource(BalTypeSource balTypeSource) /*-{
		this.balTypeSource = balTypeSource;
	}-*/;
	public final native BalTypeValues getBalTypeValues() /*-{
		return $wnd.cleanObject(balTypeValues);
	}-*/;
	public final native void setBalTypeValues(BalTypeValues balTypeValues) /*-{
		this.balTypeValues = balTypeValues;
	}-*/;
}