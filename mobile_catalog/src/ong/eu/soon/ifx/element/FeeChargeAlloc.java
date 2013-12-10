package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class FeeChargeAlloc extends IFXObject {

	ChargeRegulation chargeRegulation; //Open Enum	Required	Specify how the fee is distributed.
	Fee fee; //Aggregate	Required	Fee Charge info and amount.
	AcctKeys acctKeys; //Aggregate	Optional	Account from which the bank fee is drawn.
	
	public ChargeRegulation getChargeRegulation() {
		return chargeRegulation;
	}
	public void setChargeRegulation(ChargeRegulation chargeRegulation) {
		this.chargeRegulation = chargeRegulation;
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
		
}
