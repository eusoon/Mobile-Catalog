package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CustPayeeRec extends IFXObject {

	protected CustPayeeRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CustPayeeId getCustPayeeId()/*-{
		return $wnd.cleanObject(this.custPayeeId);
	}-*/;
	public final native  void setCustPayeeId(CustPayeeId custPayeeId)/*-{
		this.custPayeeId = custPayeeId;
	}-*/;
	public final native  CustPayeeInfo getCustPayeeInfo()/*-{
		return $wnd.cleanObject(this.custPayeeInfo);
	}-*/;
	public final native  void setCustPayeeInfo(CustPayeeInfo custPayeeInfo)/*-{
		this.custPayeeInfo = custPayeeInfo;
	}-*/;
	public final native  CustPayeeEnvr getCustPayeeEnvr()/*-{
		return $wnd.cleanObject(this.custPayeeEnvr);
	}-*/;
	public final native  void setCustPayeeEnvr(CustPayeeEnvr custPayeeEnvr)/*-{
		this.custPayeeEnvr = custPayeeEnvr;
	}-*/;
	public final native  CustPayeeStatus getCustPayeeStatus()/*-{
		return $wnd.cleanObject(this.custPayeeStatus);
	}-*/;
	public final native  void setCustPayeeStatus(CustPayeeStatus custPayeeStatus)/*-{
		this.custPayeeStatus = custPayeeStatus;
	}-*/;
}
