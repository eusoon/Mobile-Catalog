package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StmtTimeFrame extends IFXObject {

	StartDt startDt;// DateTime Optional Start Date

	// begin-xor Optional

	EndDt endDt; // DateTime Required End Date
	Duration duration; // Aggregate Required Duration
	// end-xor

	AllDayEvent allDayEvent;// Boolean OptionalAll Day Event
	RecurRule[] recurRule; // AggregateOptional Repeating Defines a rule for
							// events that recur in a specific defined pattern.
	RecurException[] recurException; // Aggregate Optional Repeating Indicates
										// an exception to the recurrence rule.

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

	public AllDayEvent getAllDayEvent() {
		return allDayEvent;
	}

	public void setAllDayEvent(AllDayEvent allDayEvent) {
		this.allDayEvent = allDayEvent;
	}

	public RecurRule[] getRecurRule() {
		return recurRule;
	}

	public void setRecurRule(RecurRule[] recurRule) {
		this.recurRule = recurRule;
	}

	public RecurException[] getRecurException() {
		return recurException;
	}

	public void setRecurException(RecurException[] recurException) {
		this.recurException = recurException;
	}

}
