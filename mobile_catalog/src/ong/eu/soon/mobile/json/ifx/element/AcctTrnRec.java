package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class AcctTrnRec extends IFXObject {

	protected AcctTrnRec(){	
	}
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AcctTrnId getAcctTrnId()/*-{
		return $wnd.cleanObject(this.acctTrnId);
	}-*/;
	public final native  void setAcctTrnId(AcctTrnId acctTrnId)/*-{
		this.acctTrnId = acctTrnId;
	}-*/;
	public final native  AcctTrnInfo getAcctTrnInfo()/*-{
		return $wnd.cleanObject(this.acctTrnInfo);
	}-*/;
	public final native  void setAcctTrnInfo(AcctTrnInfo acctTrnInfo)/*-{
		this.acctTrnInfo = acctTrnInfo;
	}-*/;
	public final native  AcctTrnEnvr getAcctTrnEnvr()/*-{
		return $wnd.cleanObject(this.acctTrnEnvr);
	}-*/;
	public final native  void setAcctTrnEnvr(AcctTrnEnvr acctTrnEnvr)/*-{
		this.acctTrnEnvr = acctTrnEnvr;
	}-*/;
	public final native  AcctTrnStatus getAcctTrnStatus()/*-{
		return $wnd.cleanObject(this.acctTrnStatus);
	}-*/;
	public final native  void setAcctTrnStatus(AcctTrnStatus acctTrnStatus)/*-{
		this.acctTrnStatus = acctTrnStatus;
	}-*/;
}