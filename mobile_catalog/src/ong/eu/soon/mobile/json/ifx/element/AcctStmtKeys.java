package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.PartyKeys;
import ong.eu.soon.mobile.json.ifx.element.StmtDt;
import ong.eu.soon.mobile.json.ifx.element.StmtGroup;
import ong.eu.soon.mobile.json.ifx.element.SvcIdent;

public class AcctStmtKeys extends IFXObject {

	protected AcctStmtKeys(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AcctStmtId getAcctStmtId()/*-{
		return $wnd.cleanObject(acctStmtId);
	}-*/;
	public final native  void setAcctStmtId(AcctStmtId acctStmtId)/*-{
		this.acctStmtId = acctStmtId;
	}-*/;
	public final native  StmtDt getStmtDt()/*-{
		return $wnd.cleanObject(stmtDtZ);
	}-*/;
	public final native  void setStmtDt(StmtDt stmtDt)/*-{
		this.stmtDt = stmtDt;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native  PartyKeys getPartyKeys()/*-{
		return $wnd.cleanObject(partyKeys);
	}-*/;
	public final native  void setPartyKeys(PartyKeys partyKeys)/*-{
		this.partyKeys = partyKeys;
	}-*/;
	public final native  StmtGroup getStmtGroup()/*-{
		return $wnd.cleanObject(stmtGroup);
	}-*/;
	public final native  void setStmtGroup(StmtGroup stmtGroup)/*-{
		this.stmtGroup = stmtGroup;
	}-*/;
}
