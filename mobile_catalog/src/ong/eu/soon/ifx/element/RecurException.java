package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RecurException extends IFXObject {

	RecurExceptionType recurExceptionType;
	SkipNextN skipNextN;
	StartDt startDt;
	EndDt endDt;
	Duration duration;
	public RecurExceptionType getRecurExceptionType() {
		return recurExceptionType;
	}
	public void setRecurExceptionType(RecurExceptionType recurExceptionType) {
		this.recurExceptionType = recurExceptionType;
	}
	public SkipNextN getSkipNextN() {
		return skipNextN;
	}
	public void setSkipNextN(SkipNextN skipNextN) {
		this.skipNextN = skipNextN;
	}
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
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

}
