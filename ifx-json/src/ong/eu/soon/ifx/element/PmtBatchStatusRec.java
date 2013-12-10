package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtBatchStatusRec extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	PmtBatchId pmtBatchId;	 //	Identifier	 Required	 Payment Batch Identifier
	PmtBatchStatus pmtBatchStatus;	 //	Aggregate	 Required	 Payment Batch Status Aggregate
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public PmtBatchId getPmtBatchId() {
		return pmtBatchId;
	}
	public void setPmtBatchId(PmtBatchId pmtBatchId) {
		this.pmtBatchId = pmtBatchId;
	}
	public PmtBatchStatus getPmtBatchStatus() {
		return pmtBatchStatus;
	}
	public void setPmtBatchStatus(PmtBatchStatus pmtBatchStatus) {
		this.pmtBatchStatus = pmtBatchStatus;
	}
	
}
