package ong.eu.soon.ifx.payment;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.PmtBatchStatId;
import ong.eu.soon.ifx.element.PmtBatchStatStatus;
import ong.eu.soon.ifx.element.SvcIdent;

public class PmtBatchStatStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	PmtBatchStatId pmtBatchStatId; //Identifier	Required	PmtBatch Status Identifier
	PmtBatchStatStatus pmtBatchStatStatus; //Aggregate	Required	PmtBatch Status Status Aggregate
	
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
	public PmtBatchStatStatus getPmtBatchStatStatus() {
		return pmtBatchStatStatus;
	}
	public void setPmtBatchStatStatus(PmtBatchStatStatus pmtBatchStatStatus) {
		this.pmtBatchStatStatus = pmtBatchStatStatus;
	}
	
}
