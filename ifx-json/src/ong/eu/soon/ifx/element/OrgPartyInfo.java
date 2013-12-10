package ong.eu.soon.ifx.element;

public class OrgPartyInfo extends PartyInfo {
	OrgData orgData;	 //	Aggregate	 Required	 Organization Data
	TaxExempt taxExempt;	 //	Open Enum	 Optional	 Tax ExemptValid values include: Government, NonProfit, NotTaxExemptDefault Value: NotTaxExempt
	LegalForm legalForm;	 //	Open Enum	 Optional	 Legal FormValid values include: Club, LimitedLiabilityPartnership, Partnership, PrivateLimitedCompany, PublicLimitedCompany, Society, SoleTraders
	OrgEstablishDt orgEstablishDt;	 //	Date	 Optional	 Organization Establish Date
	NumEmployees numEmployees;	 //	Long	 Optional	 Number of Employees
	FiscalYearEnd fiscalYearEnd;	 //	Date	 Optional	 Fiscal Year End
	FinancialReportsURL financialReportsURL;	 //	URL	 Optional	 Financial Reports URL
	
	public OrgData getOrgData() {
		return orgData;
	}
	public void setOrgData(OrgData orgData) {
		this.orgData = orgData;
	}
	public TaxExempt getTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(TaxExempt taxExempt) {
		this.taxExempt = taxExempt;
	}
	public LegalForm getLegalForm() {
		return legalForm;
	}
	public void setLegalForm(LegalForm legalForm) {
		this.legalForm = legalForm;
	}
	public OrgEstablishDt getOrgEstablishDt() {
		return orgEstablishDt;
	}
	public void setOrgEstablishDt(OrgEstablishDt orgEstablishDt) {
		this.orgEstablishDt = orgEstablishDt;
	}
	public NumEmployees getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(NumEmployees numEmployees) {
		this.numEmployees = numEmployees;
	}
	public FiscalYearEnd getFiscalYearEnd() {
		return fiscalYearEnd;
	}
	public void setFiscalYearEnd(FiscalYearEnd fiscalYearEnd) {
		this.fiscalYearEnd = fiscalYearEnd;
	}
	public FinancialReportsURL getFinancialReportsURL() {
		return financialReportsURL;
	}
	public void setFinancialReportsURL(FinancialReportsURL financialReportsURL) {
		this.financialReportsURL = financialReportsURL;
	}
}
