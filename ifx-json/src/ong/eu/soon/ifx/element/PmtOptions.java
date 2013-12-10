package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtOptions extends IFXObject {
	PmtInstType pmtInstType;	 //	Closed Enum	 Required	 Payment type. Specifies the type of payment instruments that the biller is capable of accepting for electronic payment.Valid values: CheckAcct, CreditCard, ElectronicCash
	Brand brand;	 //	Open Enum	 Optional	 Accepted brand for a given payment type. If not specified, the client assumes that all brands of the given are acceptable.Defined values: AmEx, CarteBlanche, DinersClub, Discover, Europay, JCB, MasterCard.
	
	public PmtInstType getPmtInstType() {
		return pmtInstType;
	}
	public void setPmtInstType(PmtInstType pmtInstType) {
		this.pmtInstType = pmtInstType;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
}
