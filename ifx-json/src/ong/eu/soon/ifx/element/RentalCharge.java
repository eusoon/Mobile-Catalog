package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RentalCharge extends IFXObject {
	RentalChargeType rentalChargeType;//Open Enum	Required Rental Charge Type Valid values include: BillingAdjustment, Extra, ExtraDistance, Fuel, Insurance, Late, OneWay, Other, RatePerDistance, RegDistance, RentalRate, Tax, Towing
	CurAmt curAmt;//Aggregate	RequiredCurrency Amount
	public RentalChargeType getRentalChargeType() {
		return rentalChargeType;
	}
	public void setRentalChargeType(RentalChargeType rentalChargeType) {
		this.rentalChargeType = rentalChargeType;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}

}
