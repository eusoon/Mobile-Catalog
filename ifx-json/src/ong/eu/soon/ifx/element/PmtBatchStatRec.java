package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtBatchStatRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	PmtBatchStatId pmtBatchStatId;	 //	Identifier	 Required	 PmtBatch Status Identifier
	PmtBatchStatInfo pmtBatchStatInfo;	 //	Aggregate	 Required	 PmtBatch Status Information Aggregate
	PmtBatchStatEnvr pmtBatchStatEnvr;	 //	Aggregate	 Optional	 PmtBatch Status Environment Aggregate
	PmtBatchStatStatus pmtBatchStatStatus;	 //	Aggregate	 Required	 PmtBatch Status Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PmtBatchStatId getPmtBatchStatId() {
		return pmtBatchStatId;
	}
	public void setPmtBatchStatId(PmtBatchStatId pmtBatchStatId) {
		this.pmtBatchStatId = pmtBatchStatId;
	}
	public PmtBatchStatInfo getPmtBatchStatInfo() {
		return pmtBatchStatInfo;
	}
	public void setPmtBatchStatInfo(PmtBatchStatInfo pmtBatchStatInfo) {
		this.pmtBatchStatInfo = pmtBatchStatInfo;
	}
	public PmtBatchStatEnvr getPmtBatchStatEnvr() {
		return pmtBatchStatEnvr;
	}
	public void setPmtBatchStatEnvr(PmtBatchStatEnvr pmtBatchStatEnvr) {
		this.pmtBatchStatEnvr = pmtBatchStatEnvr;
	}
	public PmtBatchStatStatus getPmtBatchStatStatus() {
		return pmtBatchStatStatus;
	}
	public void setPmtBatchStatStatus(PmtBatchStatStatus pmtBatchStatStatus) {
		this.pmtBatchStatStatus = pmtBatchStatStatus;
	}
	
}
