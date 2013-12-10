package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtBatchKeys extends IFXObject {

	SvcIdent svcIdent;	 //	Aggregate	 Optional	 Service Identifier
	//begin-xor	Required
	PmtBatchId pmtBatchId;	 //	Identifier	 Required	 Payment Batch Identifier
	//end-xor
	
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
}
