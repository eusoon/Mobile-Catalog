package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtEnclPayeeInfo extends IFXObject {

	//begin-xor	Required
	StdPayeeId stdPayeeId;	 //	Identifier	 Required	 Customer's Payee Identifier. The Standard Payee as known to the CPP.
	PmtEnclPayee pmtEnclPayee;	 //	Aggregate	 Required	 Payee's Name and Address Aggregate.
	//end-xor
	IndustIdent industIdent;	 //	Aggregate	 Optional	 Industry Identifier. It provides standard codes by which industries are classified.
	
	public StdPayeeId getStdPayeeId() {
		return stdPayeeId;
	}
	public void setStdPayeeId(StdPayeeId stdPayeeId) {
		this.stdPayeeId = stdPayeeId;
	}
	public PmtEnclPayee getPmtEnclPayee() {
		return pmtEnclPayee;
	}
	public void setPmtEnclPayee(PmtEnclPayee pmtEnclPayee) {
		this.pmtEnclPayee = pmtEnclPayee;
	}
	public IndustIdent getIndustIdent() {
		return industIdent;
	}
	public void setIndustIdent(IndustIdent industIdent) {
		this.industIdent = industIdent;
	}
	
}
