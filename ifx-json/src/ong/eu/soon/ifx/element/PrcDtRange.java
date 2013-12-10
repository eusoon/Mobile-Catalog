package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PrcDtRange extends IFXObject {

	//begin-or	Required 
	StartDt startDt; //DateTime	Required	Selection Start Date.
	EndDt endDt; //DateTime	Required	Selection End Date.
	//end-or
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
	
}
