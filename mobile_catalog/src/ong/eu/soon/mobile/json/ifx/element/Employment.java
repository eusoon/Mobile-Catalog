package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class Employment extends IFXObject {

	protected Employment(){
	}
	
	public final native  EmploymentType getEmploymentType()/*-{
		return $wnd.cleanObject(this.employmentType);
	}-*/;
	public final native  void setEmploymentType(EmploymentType employmentType)/*-{
		this.employmentType = employmentType;
	}-*/;
	public final native  OrgData getOrgData()/*-{
		return $wnd.cleanObject(this.orgData);
	}-*/;
	public final native  void setOrgData(OrgData orgData)/*-{
		this.orgData = orgData;
	}-*/;
	public final native  Occupation getOccupation()/*-{
		return $wnd.cleanObject(this.occupation);
	}-*/;
	public final native  void setOccupation(Occupation occupation)/*-{
		this.occupation = occupation;
	}-*/;
	public final native  AnnualIncome getAnnualIncome()/*-{
		return $wnd.cleanObject(this.annualIncome);
	}-*/;
	public final native  void setAnnualIncome(AnnualIncome annualIncome)/*-{
		this.annualIncome = annualIncome;
	}-*/;
	public final native  JobTitle getJobTitle()/*-{
		return $wnd.cleanObject(this.jobTitle);
	}-*/;
	public final native  void setJobTitle(JobTitle jobTitle)/*-{
		this.jobTitle = jobTitle;
	}-*/;
	public final native  TimeFrame getTimeFrame()/*-{
		return $wnd.cleanObject(this.timeFrame);
	}-*/;
	public final native  void setTimeFrame(TimeFrame timeFrame)/*-{
		this.timeFrame = timeFrame;
	}-*/;
}
