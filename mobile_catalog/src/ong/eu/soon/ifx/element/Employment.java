package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Employment extends IFXObject {
	EmploymentType employmentType;	 //	Open Enum	 Optional	 Employment TypeValid values include: Casual, Contract, Full, PartTime
	OrgData orgData;	 //	Aggregate	 Optional	 Organization Data
	Occupation occupation;	 //	C-50	 Optional	 Occupation
	AnnualIncome annualIncome;	 //	Aggregate	 Optional	 Annual Income Amount
	JobTitle jobTitle;	 //	C-32	 Optional	 Job Title.
	TimeFrame timeFrame;	 //	Aggregate	 Optional	 The period of time a person has been employed with this employer.
	
	public EmploymentType getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}
	public OrgData getOrgData() {
		return orgData;
	}
	public void setOrgData(OrgData orgData) {
		this.orgData = orgData;
	}
	public Occupation getOccupation() {
		return occupation;
	}
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	public AnnualIncome getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(AnnualIncome annualIncome) {
		this.annualIncome = annualIncome;
	}
	public JobTitle getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}
	public TimeFrame getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}
}
