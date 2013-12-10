package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtEnclRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	PmtEnclId pmtEnclId;	 //	Identifier	 Required	 Payment Enclosed Identifier
	PmtEnclInfo pmtEnclInfo;	 //	Aggregate	 Required	 Payment Enclosed Information Aggregate
	PmtEnclEnvr pmtEnclEnvr;	 //	Aggregate	 Optional	 Payment Enclosed Environment Aggregate
	PmtEnclStatus pmtEnclStatus;	 //	Aggregate	 Required	 Payment Enclosed Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PmtEnclId getPmtEnclId() {
		return pmtEnclId;
	}
	public void setPmtEnclId(PmtEnclId pmtEnclId) {
		this.pmtEnclId = pmtEnclId;
	}
	public PmtEnclInfo getPmtEnclInfo() {
		return pmtEnclInfo;
	}
	public void setPmtEnclInfo(PmtEnclInfo pmtEnclInfo) {
		this.pmtEnclInfo = pmtEnclInfo;
	}
	public PmtEnclEnvr getPmtEnclEnvr() {
		return pmtEnclEnvr;
	}
	public void setPmtEnclEnvr(PmtEnclEnvr pmtEnclEnvr) {
		this.pmtEnclEnvr = pmtEnclEnvr;
	}
	public PmtEnclStatus getPmtEnclStatus() {
		return pmtEnclStatus;
	}
	public void setPmtEnclStatus(PmtEnclStatus pmtEnclStatus) {
		this.pmtEnclStatus = pmtEnclStatus;
	}
	
}
