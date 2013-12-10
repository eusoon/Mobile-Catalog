package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class TaxWithheldData extends IFXObject {
	TaxYear taxYear; //Long	Required Tax Year
	TaxData[] taxData; //Aggregate	Required Repeatingn Tax Data
	TaxIdent taxIdent; //NC-12	Optional Tax Identifier
	public TaxYear getTaxYear() {
		return taxYear;
	}
	public void setTaxYear(TaxYear taxYear) {
		this.taxYear = taxYear;
	}
	public TaxData[] getTaxData() {
		return taxData;
	}
	public void setTaxData(TaxData[] taxData) {
		this.taxData = taxData;
	}
	public TaxIdent getTaxIdent() {
		return taxIdent;
	}
	public void setTaxIdent(TaxIdent taxIdent) {
		this.taxIdent = taxIdent;
	}

}
