package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class StdPayeeKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	StdPayeeId stdPayeeId; //Identifier	Required	Standard Payee Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public StdPayeeId getStdPayeeId() {
		return stdPayeeId;
	}
	public void setStdPayeeId(StdPayeeId stdPayeeId) {
		this.stdPayeeId = stdPayeeId;
	}
	
}