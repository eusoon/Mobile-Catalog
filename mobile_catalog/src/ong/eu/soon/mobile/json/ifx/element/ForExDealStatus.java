package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExDealStatus extends IFXObject {

	protected ForExDealStatus(){
	}
	
	public final native  ForExDealStatusCode getForExDealStatusCode()/*-{
		return $wnd.cleanObject(this.forExDealStatusCode);
	}-*/;
	public final native  void setForExDealStatusCode(ForExDealStatusCode forExDealStatusCode)/*-{
		this.forExDealStatusCode = forExDealStatusCode;
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
}
