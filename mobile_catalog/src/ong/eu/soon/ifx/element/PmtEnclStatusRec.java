package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtEnclStatusRec extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	PmtEnclId pmtEnclId; //Identifier	Required	Payment Enclosed Identifier
	PmtEnclStatus pmtEnclStatus; //Aggregate	Required	Payment Enclosed Status Aggregate
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
	public PmtEnclStatus getPmtEnclStatus() {
		return pmtEnclStatus;
	}
	public void setPmtEnclStatus(PmtEnclStatus pmtEnclStatus) {
		this.pmtEnclStatus = pmtEnclStatus;
	}

}
