package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SelectDtRange extends IFXObject {

	//begin-or	Required
	StartDt startDt;	 //	DateTime	 Required	 Selection Start Date.
	EndDt endDt;	 //	DateTime	 Required	 Selection End Date.
	//end-or
	// end Elements from DtRange
	//begin Aggregate
	DateType dateType;	 //	C-80	 Optional	 Identifies the date to be used such as created date or expired date.
	public StartDt getStartDt() {
		return startDt;
	}
	public void setStartDt(StartDt startDt) {
		this.startDt = startDt;
	}
	public EndDt getEndDt() {
		return endDt;
	}
	public void setEndDt(EndDt endDt) {
		this.endDt = endDt;
	}
	public DateType getDateType() {
		return dateType;
	}
	public void setDateType(DateType dateType) {
		this.dateType = dateType;
	}
	
}
