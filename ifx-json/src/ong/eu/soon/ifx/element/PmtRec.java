package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtRec extends IFXObject {
	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	PmtId pmtId;	 //	Identifier	 Required	 Payment Identifier
	PmtInfo pmtInfo;	 //	Aggregate	 Required	 Payment Information Aggregate
	PmtEnvr pmtEnvr;	 //	Aggregate	 Optional	 Payment Environment Aggregate
	PmtStatus pmtStatus;	 //	Aggregate	 Required	 Payment Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PmtId getPmtId() {
		return pmtId;
	}
	public void setPmtId(PmtId pmtId) {
		this.pmtId = pmtId;
	}
	public PmtInfo getPmtInfo() {
		return pmtInfo;
	}
	public void setPmtInfo(PmtInfo pmtInfo) {
		this.pmtInfo = pmtInfo;
	}
	public PmtEnvr getPmtEnvr() {
		return pmtEnvr;
	}
	public void setPmtEnvr(PmtEnvr pmtEnvr) {
		this.pmtEnvr = pmtEnvr;
	}
	public PmtStatus getPmtStatus() {
		return pmtStatus;
	}
	public void setPmtStatus(PmtStatus pmtStatus) {
		this.pmtStatus = pmtStatus;
	}
}
