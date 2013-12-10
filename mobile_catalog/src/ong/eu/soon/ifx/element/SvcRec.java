package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	SvcId svcId;//Identifier	Required Service Identifier
	SvcInfo svcInfo;//Aggregate	Required Service Information Aggregate
	SvcEnvr svcEnvr;//Aggregate	Optional Service Environment Aggregate
	SvcStatus svcStatus;//Aggregate	Required Service Status Aggregate
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
	public SvcInfo getSvcInfo() {
		return svcInfo;
	}
	public void setSvcInfo(SvcInfo svcInfo) {
		this.svcInfo = svcInfo;
	}
	public SvcEnvr getSvcEnvr() {
		return svcEnvr;
	}
	public void setSvcEnvr(SvcEnvr svcEnvr) {
		this.svcEnvr = svcEnvr;
	}
	public SvcStatus getSvcStatus() {
		return svcStatus;
	}
	public void setSvcStatus(SvcStatus svcStatus) {
		this.svcStatus = svcStatus;
	}

}
