package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.AcctKeys;
import ong.eu.soon.ifx.element.DtRange;
import ong.eu.soon.ifx.element.PartyKeys;
import ong.eu.soon.ifx.element.StmtGroup;
import ong.eu.soon.ifx.element.StmtType;

public class AcctStmtSel extends IFXObject {

	//begin-xor	Required Repeating
	AcctStmtKeys acctStmtKeys; //Aggregate	Required	Account Statement Keys Aggregate
	//begin-block	Required
	AcctKeys acctKeys; //Aggregate	Optional	Account Keys Aggregate
	PartyKeys partyKeys; //Aggregate	Optional	Party Keys Aggregate
	DtRange dtRange; //Aggregate	Optional	Date Range
	StmtType stmtType; //Open Enum	Optional	Statement Type	Valid values include: Legal, Partial
	StmtGroup stmtGroup; //C-25	Optional	Statement Group
	
	public AcctStmtKeys getAcctStmtKeys() {
		return acctStmtKeys;
	}
	public void setAcctStmtKeys(AcctStmtKeys acctStmtKeys) {
		this.acctStmtKeys = acctStmtKeys;
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
	public DtRange getDtRange() {
		return dtRange;
	}
	public void setDtRange(DtRange dtRange) {
		this.dtRange = dtRange;
	}
	public StmtType getStmtType() {
		return stmtType;
	}
	public void setStmtType(StmtType stmtType) {
		this.stmtType = stmtType;
	}
	public StmtGroup getStmtGroup() {
		return stmtGroup;
	}
	public void setStmtGroup(StmtGroup stmtGroup) {
		this.stmtGroup = stmtGroup;
	}	
}
