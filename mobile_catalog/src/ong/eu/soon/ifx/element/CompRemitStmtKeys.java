package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CompRemitStmtKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	CompRemitStmtId compRemitStmtId; //Identifier	Required	Comprehensible Remittance Statement Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public CompRemitStmtId getCompRemitStmtId() {
		return compRemitStmtId;
	}
	public void setCompRemitStmtId(CompRemitStmtId compRemitStmtId) {
		this.compRemitStmtId = compRemitStmtId;
	}
	
}
