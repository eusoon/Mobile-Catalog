package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class FeeRqHdr extends IFXObject {
	DebitRef debitRef; //	Aggregate	Required Debit Reference Aggregate
	CreditRef creditRef;//Aggregate	Required Credit Reference Aggregate
	AcctKeys acctKeys; //Aggregate	Required Account Keys Aggregate
	ChargeRegulation chargeRegulation;//Open Enum	Optional Charge Regulation Valid values include: Payee, Payer, Share
	public DebitRef getDebitRef() {
		return debitRef;
	}
	public void setDebitRef(DebitRef debitRef) {
		this.debitRef = debitRef;
	}
	public CreditRef getCreditRef() {
		return creditRef;
	}
	public void setCreditRef(CreditRef creditRef) {
		this.creditRef = creditRef;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public ChargeRegulation getChargeRegulation() {
		return chargeRegulation;
	}
	public void setChargeRegulation(ChargeRegulation chargeRegulation) {
		this.chargeRegulation = chargeRegulation;
	}









}
