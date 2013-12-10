package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class Duration extends IFXObject {

	protected Duration(){
	}
	
	public final native  Count getCount()/*-{
		return $wnd.cleanObject(this.count);
	}-*/;
	public final native  void setCount(Count count)/*-{
		this.count = count;
	}-*/;
	public final native  Unit getUnit()/*-{
		return $wnd.cleanObject(this.unit);
	}-*/;
	public final native  void setUnit(Unit unit)/*-{
		this.unit = unit;
	}-*/;
}
