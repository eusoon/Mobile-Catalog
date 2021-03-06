package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class TaxData extends IFXObject {
	Org org ;//Identifier	Optional Organization. Organization defining this name space. Usage is Tax Authority (e.g., state or country).
	TaxType taxType;//Open Enum	Optional Tax Type Valid values include: NonResWithHoldTax, ResWithholdTax, WithholdingTax
	TaxAmount taxAmount; //Aggregate	Required Tax Amount (+ paid by customer, - earned by customer).
	Rate rate; //	Decimal Required Tax Rate. Usage is a percentage (e.g., a value of 5.2 = 5.2%). (+ paid by customer, - earned by customer)
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	public TaxType getTaxType() {
		return taxType;
	}
	public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}
	public TaxAmount getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(TaxAmount taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}
}
