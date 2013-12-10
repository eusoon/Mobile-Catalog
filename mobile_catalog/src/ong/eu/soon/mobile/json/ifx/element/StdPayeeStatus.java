package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class StdPayeeStatus extends IFXObject {
	protected StdPayeeStatus(){	
	}
	public final native StdPayeeStatusCode getStdPayeeStatusCode() /*-{
		return $wnd.cleanObject(stdPayeeStatusCode);
	}-*/;
	public final native void setStdPayeeStatusCode(StdPayeeStatusCode stdPayeeStatusCode) /*-{
		this.stdPayeeStatusCode = stdPayeeStatusCode;
	}-*/;
	public final native StatusDesc getStatusDesc() /*-{
		return $wnd.cleanObject(statusDesc);
	}-*/;
	public final native void setStatusDesc(StatusDesc statusDesc) /*-{
		this.statusDesc = statusDesc;
	}-*/;
	public final native EffDt getEffDt() /*-{
		return $wnd.cleanObject(effDt);
	}-*/;
	public final native void setEffDt(EffDt effDt) /*-{
		this.effDt = effDt;
	}-*/;
	public final native ApprovalIdent getApprovalIdent() /*-{
		return $wnd.cleanObject(approvalIdent);
	}-*/;
	public final native void setApprovalIdent(ApprovalIdent approvalIdent) /*-{
		this.approvalIdent = approvalIdent;
	}-*/;
	public final native StatusModBy getStatusModBy() /*-{
		return $wnd.cleanObject(statusModBy);
	}-*/;
	public final native void setStatusModBy(StatusModBy statusModBy) /*-{
		this.statusModBy = statusModBy;
	}-*/;
}