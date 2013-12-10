package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	PmtId pmtId; //Identifier	Required	Payment Identifier
	//end-xor
	
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
}