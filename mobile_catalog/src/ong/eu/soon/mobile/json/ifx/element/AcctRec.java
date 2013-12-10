package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;


public class AcctRec extends IFXObject {

	protected AcctRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AcctId getAcctId()/*-{
		return $wnd.cleanObject(this.acctId);
	}-*/;
	public final native  void setAcctId(AcctId acctId)/*-{
		this.acctId = acctId;
	}-*/;
	public final native  AcctInfo getAcctInfo()/*-{
		return $wnd.cleanObject(this.acctInfo);
	}-*/;
	public final native  void setAcctInfo(AcctInfo acctInfo)/*-{
		this.acctInfo = acctInfo;
	}-*/;
	public final native  AcctEnvr getAcctEnvr()/*-{
		return $wnd.cleanObject(this.acctEnvr);
	}-*/;
	public final native  void setAcctEnvr(AcctEnvr acctEnvr)/*-{
		this.acctEnvr = acctEnvr;
	}-*/;
	public final native  AcctStatus getAcctStatus()/*-{
		return $wnd.cleanObject(this.acctStatus);
	}-*/;
	public final native  void setAcctStatus(AcctStatus acctStatus)/*-{
		this.acctStatus = acctStatus;
	}-*/;
}
