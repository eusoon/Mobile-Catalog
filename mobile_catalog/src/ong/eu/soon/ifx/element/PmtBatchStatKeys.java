package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtBatchStatKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	PmtBatchStatId pmtBatchStatId; //Identifier	Required	PmtBatch Status Identifier
	//end-xor
	
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
	
}
