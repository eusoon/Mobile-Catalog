package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RecurRule extends IFXObject {
	RecurType recurType;//Closed Enum	Optional RecurType Valid values are limited to: Daily, Monthly, Weekly, Yearly

	RecurInterval recurInterval;//	Long	Optional Recurrence Interval
	RecurInstance recurInstance;//	Long	Optional Recurrence Instance
	DayOfWeek dayOfWeek;//Closed Enum	OptionalDay Of Week Valid values are limited to: Friday, Monday, Saturday, Sunday, Thursday, Tuesday, Wednesday

	DayOfMonth dayOfMonth;//Closed Enum	Optional Day Of Month Valid values are limited to: 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 3, 30, 31, 4, 5, 6, 7, 8, 9
	Month month;//Long	Optional Month

	TimeOfDay timeOfDay;//Time	Optional Time Of Day
	RecurStartDate recurStartDate;//Date	Optional Recurance Start Date
	
	//begin-xor Optional
	Occurrences occurrences;//Long	Required Occurrences
	RecurEndDate recurEndDate; //Date	Required Recurance End Date
	//end-xor

	AdjDays adjDays;//Long	Optional Adjustment Days
	AdjDaysBasis adjDaysBasis;// Open Enum	Optional Adjustment Days Basis Valid values include: DueDt, EndOfMonth, StmtDt Default Value: StmtDt
	public RecurType getRecurType() {
		return recurType;
	}
	public void setRecurType(RecurType recurType) {
		this.recurType = recurType;
	}
	public RecurInterval getRecurInterval() {
		return recurInterval;
	}
	public void setRecurInterval(RecurInterval recurInterval) {
		this.recurInterval = recurInterval;
	}
	public RecurInstance getRecurInstance() {
		return recurInstance;
	}
	public void setRecurInstance(RecurInstance recurInstance) {
		this.recurInstance = recurInstance;
	}
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public DayOfMonth getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth(DayOfMonth dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public TimeOfDay getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(TimeOfDay timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public RecurStartDate getRecurStartDate() {
		return recurStartDate;
	}
	public void setRecurStartDate(RecurStartDate recurStartDate) {
		this.recurStartDate = recurStartDate;
	}
	public Occurrences getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(Occurrences occurrences) {
		this.occurrences = occurrences;
	}
	public RecurEndDate getRecurEndDate() {
		return recurEndDate;
	}
	public void setRecurEndDate(RecurEndDate recurEndDate) {
		this.recurEndDate = recurEndDate;
	}
	public AdjDays getAdjDays() {
		return adjDays;
	}
	public void setAdjDays(AdjDays adjDays) {
		this.adjDays = adjDays;
	}
	public AdjDaysBasis getAdjDaysBasis() {
		return adjDaysBasis;
	}
	public void setAdjDaysBasis(AdjDaysBasis adjDaysBasis) {
		this.adjDaysBasis = adjDaysBasis;
	}




}
