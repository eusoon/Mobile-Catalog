package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DebitRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	DebitId[] debitId; //Identifier	Required	Debit Identifier
	DebitInfo[] debitInfo; //Aggregate	Required	Debit Information Aggregate
	DebitEnvr debitEnvr; //Aggregate	Optional	Debit Environment Aggregate
	DebitStatus[] debitStatus; //Aggregate	Required	Debit Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public DebitId[] getDebitId() {
		return debitId;
	}
	public void setDebitId(DebitId[] debitId) {
		this.debitId = debitId;
	}
	public DebitInfo[] getDebitInfo() {
		return debitInfo;
	}
	public void setDebitInfo(DebitInfo[] debitInfo) {
		this.debitInfo = debitInfo;
	}
	public DebitEnvr getDebitEnvr() {
		return debitEnvr;
	}
	public void setDebitEnvr(DebitEnvr debitEnvr) {
		this.debitEnvr = debitEnvr;
	}
	public DebitStatus[] getDebitStatus() {
		return debitStatus;
	}
	public void setDebitStatus(DebitStatus[] debitStatus) {
		this.debitStatus = debitStatus;
	}
}