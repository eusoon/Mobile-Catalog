package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Duration extends IFXObject {
	Count count;
	Unit unit;
	public Count getCount() {
		return count;
	}
	public void setCount(Count count) {
		this.count = count;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}



}
