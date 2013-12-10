package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BillerKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	BillerId[] billerId; //Identifier	Required	Biller Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public BillerId[] getBillerId() {
		return billerId;
	}
	public void setBillerId(BillerId[] billerId) {
		this.billerId = billerId;
	}
}