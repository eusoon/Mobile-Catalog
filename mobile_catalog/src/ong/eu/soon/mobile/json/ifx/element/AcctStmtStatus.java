package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.EffDt;
import ong.eu.soon.mobile.json.ifx.element.StatusDesc;

public class AcctStmtStatus extends IFXObject {
	protected AcctStmtStatus(){	
	}
	
	public final native AcctStmtStatusCode getAcctStmtStatusCode()/*-{
		return $wnd.cleanObject(this.acctStmtStatusCode);
	}-*/;
	public final native  void setAcctStmtStatusCode(AcctStmtStatusCode acctStmtStatusCode)/*-{
		this.acctStmtStatusCode = acctStmtStatusCode;
	}-*/;
	public final native  StatusDesc getStatusDesc()/*-{
		return $wnd.cleanObject(this.statusDesc);
	}-*/;
	public final native  void setStatusDesc(StatusDesc statusDesc)/*-{
		this.statusDesc = statusDesc;
	}-*/;
	public final native  EffDt getEffDt()/*-{
		return $wnd.cleanObject(this.effDt);
	}-*/;
	public final native  void setEffDt(EffDt effDt)/*-{
		this.effDt = effDt;
	}-*/;
	public final native  StatusModBy getStatusModBy()/*-{
		return $wnd.cleanObject(this.statusModBy);
	}-*/;
	public final native  void setStatusModBy(StatusModBy statusModBy)/*-{
		this.statusModBy = statusModBy;
	}-*/;
	
}
