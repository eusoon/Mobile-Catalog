package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class Contact extends IFXObject {
	Language language; //	NC-17		Optional	Language	
	Locator locator; //	Abstract Aggregate		Required	Locator	Valid Aggregates are:	Email	PhoneNum	PostAddr
	ResourceLocator resourceLocator;//URL	Required Location to access information about a person or organization.
	ContactType contactType;//Open Enum	Optional Contact Type Valid values include: CustSvc, Enroll, GeneralInfo, LostCard, Marketing, Other, Personal, PersonalRef, Statement, Tech
	PreferredInd preferredInd;//Boolean	Optional Indicates whether this particular contact is a preferred method of reaching the person or organization.
	ContactName contactName;//C-40		Optional	Name. Name of the person associated with the contact information. Typically, this is the name of the person within the business that the phone number, email address, and/or address is associated with.
	TimeFrame timeFrame; //Aggregate	Optional	The timeframe during which a particular contact should be used.
	JobTitle jobTitle;//C-32	Optional Job Title
	DoNotSolicitInd doNotSolicitInd;//Boolean	Optional Do Not Solicit Indicator
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Locator getLocator() {
		return locator;
	}
	public void setLocator(Locator locator) {
		this.locator = locator;
	}
	public ResourceLocator getResourceLocator() {
		return resourceLocator;
	}
	public void setResourceLocator(ResourceLocator resourceLocator) {
		this.resourceLocator = resourceLocator;
	}
	public ContactType getContactType() {
		return contactType;
	}
	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}
	public PreferredInd getPreferredInd() {
		return preferredInd;
	}
	public void setPreferredInd(PreferredInd preferredInd) {
		this.preferredInd = preferredInd;
	}
	public ContactName getContactName() {
		return contactName;
	}
	public void setContactName(ContactName contactName) {
		this.contactName = contactName;
	}
	public TimeFrame getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}
	public JobTitle getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}
	public DoNotSolicitInd getDoNotSolicitInd() {
		return doNotSolicitInd;
	}
	public void setDoNotSolicitInd(DoNotSolicitInd doNotSolicitInd) {
		this.doNotSolicitInd = doNotSolicitInd;
	}

}
