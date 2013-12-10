package ong.eu.soon.mobile.json.ifx.element;

public class OrgPartyInfo extends PartyInfo {
	protected OrgPartyInfo(){	
	}
	public final native OrgData getOrgData() /*-{
		return $wnd.cleanObject(orgData);
	}-*/;
	public final native void setOrgData(OrgData orgData) /*-{
		this.orgData = orgData;
	}-*/;
	public final native TaxExempt getTaxExempt() /*-{
		return $wnd.cleanObject(taxExempt);
	}-*/;
	public final native void setTaxExempt(TaxExempt taxExempt) /*-{
		this.taxExempt = taxExempt;
	}-*/;
	public final native LegalForm getLegalForm() /*-{
		return $wnd.cleanObject(legalForm);
	}-*/;
	public final native void setLegalForm(LegalForm legalForm) /*-{
		this.legalForm = legalForm;
	}-*/;
	public final native OrgEstablishDt getOrgEstablishDt() /*-{
		return $wnd.cleanObject(orgEstablishDt);
	}-*/;
	public final native void setOrgEstablishDt(OrgEstablishDt orgEstablishDt) /*-{
		this.orgEstablishDt = orgEstablishDt;
	}-*/;
	public final native NumEmployees getNumEmployees() /*-{
		return $wnd.cleanObject(numEmployees);
	}-*/;
	public final native void setNumEmployees(NumEmployees numEmployees) /*-{
		this.numEmployees = numEmployees;
	}-*/;
	public final native FiscalYearEnd getFiscalYearEnd() /*-{
		return $wnd.cleanObject(fiscalYearEnd);
	}-*/;
	public final native void setFiscalYearEnd(FiscalYearEnd fiscalYearEnd) /*-{
		this.fiscalYearEnd = fiscalYearEnd;
	}-*/;
	public final native FinancialReportsURL getFinancialReportsURL() /*-{
		return $wnd.cleanObject(financialReportsURL);
	}-*/;
	public final native void setFinancialReportsURL(FinancialReportsURL financialReportsURL) /*-{
		this.financialReportsURL = financialReportsURL;
	}-*/;
}