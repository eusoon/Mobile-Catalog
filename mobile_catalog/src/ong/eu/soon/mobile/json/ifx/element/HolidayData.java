package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class HolidayData extends IFXObject {
	
	protected HolidayData(){
	}
	
	public final native  Name getName()/*-{
		return $wnd.cleanObject(this.name);
	}-*/;
	public final native  void setName(Name name)/*-{
		this.name = name;
	}-*/;
	public final native  HolidayTimeframe getHolidayTimeframe()/*-{
		return $wnd.cleanObject(this.holidayTimeframe);
	}-*/;
	public final native  void setHolidayTimeframe(HolidayTimeframe holidayTimeframe)/*-{
		this.holidayTimeframe = holidayTimeframe;
	}-*/;
}
