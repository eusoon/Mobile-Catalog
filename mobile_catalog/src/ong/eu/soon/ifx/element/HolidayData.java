package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class HolidayData extends IFXObject {
	Name name;//C-40	Required Name
	HolidayTimeframe holidayTimeframe;//Aggregate	Required Holiday Timeframe
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public HolidayTimeframe getHolidayTimeframe() {
		return holidayTimeframe;
	}
	public void setHolidayTimeframe(HolidayTimeframe holidayTimeframe) {
		this.holidayTimeframe = holidayTimeframe;
	}
}
