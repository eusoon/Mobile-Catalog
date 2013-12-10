package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.DtRange;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.StmtGroup;
import ong.eu.soon.mobile.json.ifx.element.StmtType;

public class AcctStmtSel extends IFXObject {

	protected AcctStmtSel(){	
	}
	
	public final native  AcctStmtKeys getAcctStmtKeys()/*-{
		return $wnd.cleanObject(this.acctStmtKeys);
	}-*/;
	public final native  void setAcctStmtKeys(AcctStmtKeys acctStmtKeys)/*-{
		this.acctStmtKeys = acctStmtKeys;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native  PartyKeys getPartyKeys()/*-{
		return $wnd.cleanObject(this.partyKeys);
	}-*/;
	public final native  void setPartyKeys(PartyKeys partyKeys)/*-{
		this.partyKeys = partyKeys;
	}-*/;
	public final native  DtRange getDtRange()/*-{
		return $wnd.cleanObject(this.dtRange);
	}-*/;
	public final native  void setDtRange(DtRange dtRange)/*-{
		this.dtRange = dtRange;
	}-*/;
	public final native  StmtType getStmtType()/*-{
		return $wnd.cleanObject(this.stmtType);
	}-*/;
	public final native  void setStmtType(StmtType stmtType)/*-{
		this.stmtType = stmtType;
	}-*/;
	public final native  StmtGroup getStmtGroup()/*-{
		return $wnd.cleanObject(this.stmtGrou);
	}-*/;
	public final native  void setStmtGroup(StmtGroup stmtGroup)/*-{
		this.stmtGroup = stmtGroup;
	}-*/;	
}
