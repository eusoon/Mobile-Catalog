package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CardStatus extends IFXObject {

	protected CardStatus(){
	}
	
	public final native  CardStatusCode getCardStatusCode()/*-{
		return $wnd.cleanObject(this.cardStatusCode);
	}-*/;
	public final native  void setCardStatusCode(CardStatusCode cardStatusCode)/*-{
		this.cardStatusCode = cardStatusCode;
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
	public final native  CardStatusAction getCardStatusAction()/*-{
		return $wnd.cleanObject(this.cardStatusAction);
	}-*/;
	public final native  void setCardStatusAction(CardStatusAction cardStatusAction)/*-{
		this.cardStatusAction = cardStatusAction;
	}-*/;
	public final native  StatusReason getStatusReason()/*-{
		return $wnd.cleanObject(this.statusReason);
	}-*/;
	public final native  void setStatusReason(StatusReason statusReason)/*-{
		this.statusReason = statusReason;
	}-*/;	
}
