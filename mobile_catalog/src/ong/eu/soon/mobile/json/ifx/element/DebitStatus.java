package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class DebitStatus extends IFXObject {

	protected DebitStatus(){
	}
	
	public final native  JsArray<DebitStatusCode> getDebitStatusCode()/*-{
		return $wnd.cleanObject(this.debitStatusCode);
	}-*/;
	public final native  void setDebitStatusCode(JsArray<DebitStatusCode> debitStatusCode)/*-{
		this.debitStatusCode = debitStatusCode;
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
	public final native  ApprovalIdent getApprovalIdent()/*-{
		return $wnd.cleanObject(this.approvalIdent);
	}-*/;
	public final native  void setApprovalIdent(ApprovalIdent approvalIdent)/*-{
		this.approvalIdent = approvalIdent;
	}-*/;
	public final native  StatusModBy getStatusModBy()/*-{
		return $wnd.cleanObject(this.statusModBy);
	}-*/;
	public final native  void setStatusModBy(StatusModBy statusModBy)/*-{
		this.statusModBy = statusModBy;
	}-*/;
	public final native  StatusReason getStatusReason()/*-{
		return $wnd.cleanObject(this.statusReason);
	}-*/;
	public final native  void setStatusReason(StatusReason statusReason)/*-{
		this.statusReason = statusReason;
	}-*/;
}
