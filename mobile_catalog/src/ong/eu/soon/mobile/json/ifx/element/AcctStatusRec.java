package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class AcctStatusRec extends IFXObject {

	protected AcctStatusRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AcctId getAacctId()/*-{
		return $wnd.cleanObject(this.AacctId);
	}-*/;
	public final native  void setAacctId(AcctId aacctId)/*-{
		AacctId = aacctId;
	}-*/;
	public final native  AcctStatus getAcctStatus()/*-{
		return $wnd.cleanObject(this.acctStatus);
	}-*/;
	public final native  void setAcctStatus(AcctStatus acctStatus)/*-{
		this.acctStatus = acctStatus;
	}-*/;
}
