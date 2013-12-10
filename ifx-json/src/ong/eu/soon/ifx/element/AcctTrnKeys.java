package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctTrnId;
import ong.eu.soon.ifx.element.SvcIdent;

public class AcctTrnKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	AcctTrnId acctTrnId; //Identifier	Required	Account Transaction Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctTrnId getAcctTrnId() {
		return acctTrnId;
	}
	public void setAcctTrnId(AcctTrnId acctTrnId) {
		this.acctTrnId = acctTrnId;
	}
}