package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PartyStatus extends IFXObject {
	protected PartyStatus(){	
	}
	public final native PartyStatusCode getPartyStatusCode() /*-{
		return $wnd.cleanObject(PartyStatusCode);
	}-*/;
	public final native void setPartyStatusCode(PartyStatusCode partyStatusCode) /*-{
		PartyStatusCode = partyStatusCode;
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