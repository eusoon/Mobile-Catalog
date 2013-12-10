package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctStmtId;
import ong.eu.soon.mobile.json.ifx.element.SvcIdent;

public class AcctStmtRec extends IFXObject {

	protected AcctStmtRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AcctStmtId getAcctStmtId()/*-{
		return $wnd.cleanObject(this.acctStmtId);
	}-*/;
	public final native  void setAcctStmtId(AcctStmtId acctStmtId)/*-{
		this.acctStmtId = acctStmtId;
	}-*/;
	public final native  AcctStmtInfo getAcctStmtInfo()/*-{
		return $wnd.cleanObject(this.acctStmtInfo);
	}-*/;
	public final native  void setAcctStmtInfo(AcctStmtInfo acctStmtInfo)/*-{
		this.acctStmtInfo = acctStmtInfo;
	}-*/;
	public final native  AcctStmtEnvr getAcctStmtEnvr()/*-{
		return $wnd.cleanObject(this.acctStmtEnvr);
	}-*/;
	public final native  void setAcctStmtEnvr(AcctStmtEnvr acctStmtEnvr)/*-{
		this.acctStmtEnvr = acctStmtEnvr;
	}-*/;
	public final native  AcctStmtStatus getAcctStmtStatus()/*-{
		return $wnd.cleanObject(this.acctStmtStatus);
	}-*/;
	public final native  void setAcctStmtStatus(AcctStmtStatus acctStmtStatus)/*-{
		this.acctStmtStatus = acctStmtStatus;
	}-*/;
}
