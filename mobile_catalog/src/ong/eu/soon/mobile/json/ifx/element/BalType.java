package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class BalType extends IFXObject {
	
	protected BalType(){	
	}
	
	public final native  BalTypeSource getBalTypeSource()/*-{
		return $wnd.cleanObject(this.balTypeSource);
	}-*/;
	public final native  void setBalTypeSource(BalTypeSource balTypeSource)/*-{
		this.balTypeSource = balTypeSource;
	}-*/;
	public final native  BalTypeValues getBalTypeValues()/*-{
		return $wnd.cleanObject(this.balTypeValues);
	}-*/;
	public final native  void setBalTypeValues(BalTypeValues balTypeValues)/*-{
		this.balTypeValues = balTypeValues;
	}-*/;
}
