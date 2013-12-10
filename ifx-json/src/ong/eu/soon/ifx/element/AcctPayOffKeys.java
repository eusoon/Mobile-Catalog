package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AcctPayOffKeys extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	//begin-xor	Required
	AcctPayOffId acctPayOffId;	 //	Identifier	 Required	 Account PayOff Identifier
	//begin-block	Required
	AcctKeys acctKeys;	 //	Aggregate	 Required	 Account Keys Aggregate
	PayOffEffDt payOffEffDt;	 //	Date	 Required	 Account PayOff Effective Date
	PayOffRequestDt payOffRequestDt;	 //	DateTime	 Required	 Account PayOff Request Date
	//end-block
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctPayOffId getAcctPayOffId() {
		return acctPayOffId;
	}
	public void setAcctPayOffId(AcctPayOffId acctPayOffId) {
		this.acctPayOffId = acctPayOffId;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public PayOffEffDt getPayOffEffDt() {
		return payOffEffDt;
	}
	public void setPayOffEffDt(PayOffEffDt payOffEffDt) {
		this.payOffEffDt = payOffEffDt;
	}
	public PayOffRequestDt getPayOffRequestDt() {
		return payOffRequestDt;
	}
	public void setPayOffRequestDt(PayOffRequestDt payOffRequestDt) {
		this.payOffRequestDt = payOffRequestDt;
	}
	
}
