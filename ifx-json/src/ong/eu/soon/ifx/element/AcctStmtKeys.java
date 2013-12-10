package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctKeys;
import ong.eu.soon.ifx.element.PartyKeys;
import ong.eu.soon.ifx.element.StmtDt;
import ong.eu.soon.ifx.element.StmtGroup;
import ong.eu.soon.ifx.element.SvcIdent;

public class AcctStmtKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	 
	AcctStmtId acctStmtId; //Identifier	Required	Account Statement Identifier
	//begin-block	Required
	 
	StmtDt stmtDt; //Date	Required	Statement Date
	AcctKeys acctKeys; //Aggregate	Required	Account Keys Aggregate
	PartyKeys partyKeys; //Aggregate	Optional	Party Keys Aggregate
	StmtGroup stmtGroup; //C-25	Required	Statement Group
	//end-block
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public AcctStmtId getAcctStmtId() {
		return acctStmtId;
	}
	public void setAcctStmtId(AcctStmtId acctStmtId) {
		this.acctStmtId = acctStmtId;
	}
	public StmtDt getStmtDt() {
		return stmtDt;
	}
	public void setStmtDt(StmtDt stmtDt) {
		this.stmtDt = stmtDt;
	}
	public AcctKeys getAcctKeys() {
		return acctKeys;
	}
	public void setAcctKeys(AcctKeys acctKeys) {
		this.acctKeys = acctKeys;
	}
	public PartyKeys getPartyKeys() {
		return partyKeys;
	}
	public void setPartyKeys(PartyKeys partyKeys) {
		this.partyKeys = partyKeys;
	}
	public StmtGroup getStmtGroup() {
		return stmtGroup;
	}
	public void setStmtGroup(StmtGroup stmtGroup) {
		this.stmtGroup = stmtGroup;
	}

}
