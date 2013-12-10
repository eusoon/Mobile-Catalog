package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcStatusRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	SvcId svcId;//Identifier	Required Service Identifier
	SvcStatus svcStatus;//Aggregate	RequiredService Status Aggregate
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public SvcId getSvcId() {
		return svcId;
	}
	public void setSvcId(SvcId svcId) {
		this.svcId = svcId;
	}
	public SvcStatus getSvcStatus() {
		return svcStatus;
	}
	public void setSvcStatus(SvcStatus svcStatus) {
		this.svcStatus = svcStatus;
	}

}
