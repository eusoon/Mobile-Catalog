package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CreditRec extends IFXObject {
	
	protected CreditRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CreditId getCreditId()/*-{
		return $wnd.cleanObject(this.creditId);
	}-*/;
	public final native  void setCreditId(CreditId creditId)/*-{
		this.creditId = creditId;
	}-*/;
	public final native  CreditInfo getCreditInfo()/*-{
		return $wnd.cleanObject(this.creditInfo);
	}-*/;
	public final native  void setCreditInfo(CreditInfo creditInfo)/*-{
		this.creditInfo = creditInfo;
	}-*/;
	public final native  CreditEnvr getCreditEnvr()/*-{
		return $wnd.cleanObject(this.creditEnvr);
	}-*/;
	public final native  void setCreditEnvr(CreditEnvr creditEnvr)/*-{
		this.creditEnvr = creditEnvr;
	}-*/;
	public final native  CreditStatus getCreditStatus()/*-{
		return $wnd.cleanObject(this.creditStatus);
	}-*/;
	public final native  void setCreditStatus(CreditStatus creditStatus)/*-{
		this.creditStatus = creditStatus;
	}-*/;
}
