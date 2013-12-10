package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public abstract class PartyInfo extends IFXObject {
	PartyPref partyPref;//Aggregate	Optional Party Preference
	FinancialData[] FinancialData;//Aggregate	Optional Repeating Financial Data
	EstablishedDt establishedDt;//Date	Optional Established Date
	ServiceLevel serviceLevel;//Open Enum	Optional Service Level
	//Valid values include: BusinessClass, Coach, FirstClass, Gold, Platinum, Silver
	OriginatingBranch originatingBranch;//C-32	Optional Originating Branch
	OriginatingBank originatingBank;//C-32	Optional Originating Bank
	PreferredBranch preferredBranch;//C-32	Optional Preferred Branch
	PreferredBank preferredBank;//C-32	Optional Preferred Bank
	ResponsibleBranch responsibleBranch;//C-32	Optional Responsible Branch
	ResponsibleBank responsibleBank;//C-32	Optional Responsible Bank
	ResidenceCountry residenceCountry;//Aggregate	Optional ResidenceCountry
	TaxResidenceCountry taxResidenceCountry;//Aggregate	Optional TaxResidence Country
	LastContactDt lastContactDt;//DateTime	Optional Last Contact Date
	LastPrivacyNoteDt lastPrivacyNoteDt;//Date	Optional Last Privacy Note Date
	ClosedDt closedDt;//Date	Optional Closed Date
	CloseReason closeReason;//C-80	Optional Close Reason
	PartyAffiliateData[] partyAffiliateData;//Aggregate	Optional Repeating Party Affiliate Data
	CreditRisk[] creditRisk;//Aggregate	Optional Repeating Credit Risk
	CreditReviewTimeFrame creditReviewTimeFrame;//Aggregate	Optional Credit Review Time Frame
	Correspondence[] correspondence;//Aggregate	Optional Repeating Correspondence
	RelationshipMgr[] relationshipMgr;//Aggregate	Optional Repeating Relationship Manager
	ServicesProvided servicesProvided;//C-80	Optional Services Provided
	HouseHoldAddr houseHoldAddr;//Aggregate	Optional House Hold Address
	BankruptcyInd bankruptcyInd;//Boolean	Optional Bankruptcy Indicator
	BankruptcyData[] BankruptcyData;//Aggregate	Optional Repeating Bankruptcy Data
	public PartyPref getPartyPref() {
		return partyPref;
	}
	public void setPartyPref(PartyPref partyPref) {
		this.partyPref = partyPref;
	}
	public FinancialData[] getFinancialData() {
		return FinancialData;
	}
	public void setFinancialData(FinancialData[] financialData) {
		FinancialData = financialData;
	}
	public EstablishedDt getEstablishedDt() {
		return establishedDt;
	}
	public void setEstablishedDt(EstablishedDt establishedDt) {
		this.establishedDt = establishedDt;
	}
	public ServiceLevel getServiceLevel() {
		return serviceLevel;
	}
	public void setServiceLevel(ServiceLevel serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	public OriginatingBranch getOriginatingBranch() {
		return originatingBranch;
	}
	public void setOriginatingBranch(OriginatingBranch originatingBranch) {
		this.originatingBranch = originatingBranch;
	}
	public OriginatingBank getOriginatingBank() {
		return originatingBank;
	}
	public void setOriginatingBank(OriginatingBank originatingBank) {
		this.originatingBank = originatingBank;
	}
	public PreferredBranch getPreferredBranch() {
		return preferredBranch;
	}
	public void setPreferredBranch(PreferredBranch preferredBranch) {
		this.preferredBranch = preferredBranch;
	}
	public PreferredBank getPreferredBank() {
		return preferredBank;
	}
	public void setPreferredBank(PreferredBank preferredBank) {
		this.preferredBank = preferredBank;
	}
	public ResponsibleBranch getResponsibleBranch() {
		return responsibleBranch;
	}
	public void setResponsibleBranch(ResponsibleBranch responsibleBranch) {
		this.responsibleBranch = responsibleBranch;
	}
	public ResponsibleBank getResponsibleBank() {
		return responsibleBank;
	}
	public void setResponsibleBank(ResponsibleBank responsibleBank) {
		this.responsibleBank = responsibleBank;
	}
	public ResidenceCountry getResidenceCountry() {
		return residenceCountry;
	}
	public void setResidenceCountry(ResidenceCountry residenceCountry) {
		this.residenceCountry = residenceCountry;
	}
	public TaxResidenceCountry getTaxResidenceCountry() {
		return taxResidenceCountry;
	}
	public void setTaxResidenceCountry(TaxResidenceCountry taxResidenceCountry) {
		this.taxResidenceCountry = taxResidenceCountry;
	}
	public LastContactDt getLastContactDt() {
		return lastContactDt;
	}
	public void setLastContactDt(LastContactDt lastContactDt) {
		this.lastContactDt = lastContactDt;
	}
	public LastPrivacyNoteDt getLastPrivacyNoteDt() {
		return lastPrivacyNoteDt;
	}
	public void setLastPrivacyNoteDt(LastPrivacyNoteDt lastPrivacyNoteDt) {
		this.lastPrivacyNoteDt = lastPrivacyNoteDt;
	}
	public ClosedDt getClosedDt() {
		return closedDt;
	}
	public void setClosedDt(ClosedDt closedDt) {
		this.closedDt = closedDt;
	}
	public CloseReason getCloseReason() {
		return closeReason;
	}
	public void setCloseReason(CloseReason closeReason) {
		this.closeReason = closeReason;
	}
	public PartyAffiliateData[] getPartyAffiliateData() {
		return partyAffiliateData;
	}
	public void setPartyAffiliateData(PartyAffiliateData[] partyAffiliateData) {
		this.partyAffiliateData = partyAffiliateData;
	}
	public CreditRisk[] getCreditRisk() {
		return creditRisk;
	}
	public void setCreditRisk(CreditRisk[] creditRisk) {
		this.creditRisk = creditRisk;
	}
	public CreditReviewTimeFrame getCreditReviewTimeFrame() {
		return creditReviewTimeFrame;
	}
	public void setCreditReviewTimeFrame(CreditReviewTimeFrame creditReviewTimeFrame) {
		this.creditReviewTimeFrame = creditReviewTimeFrame;
	}
	public Correspondence[] getCorrespondence() {
		return correspondence;
	}
	public void setCorrespondence(Correspondence[] correspondence) {
		this.correspondence = correspondence;
	}
	public RelationshipMgr[] getRelationshipMgr() {
		return relationshipMgr;
	}
	public void setRelationshipMgr(RelationshipMgr[] relationshipMgr) {
		this.relationshipMgr = relationshipMgr;
	}
	public ServicesProvided getServicesProvided() {
		return servicesProvided;
	}
	public void setServicesProvided(ServicesProvided servicesProvided) {
		this.servicesProvided = servicesProvided;
	}
	public HouseHoldAddr getHouseHoldAddr() {
		return houseHoldAddr;
	}
	public void setHouseHoldAddr(HouseHoldAddr houseHoldAddr) {
		this.houseHoldAddr = houseHoldAddr;
	}
	public BankruptcyInd getBankruptcyInd() {
		return bankruptcyInd;
	}
	public void setBankruptcyInd(BankruptcyInd bankruptcyInd) {
		this.bankruptcyInd = bankruptcyInd;
	}
	public BankruptcyData[] getBankruptcyData() {
		return BankruptcyData;
	}
	public void setBankruptcyData(BankruptcyData[] bankruptcyData) {
		BankruptcyData = bankruptcyData;
	}
}