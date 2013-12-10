package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AthKeys extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier 
	AthId athId;//Identifier	Required Authorization Identifier
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AthId getAthId() {
		return athId;
	}
	public void setAthId(AthId athId) {
		this.athId = athId;
	}

}
