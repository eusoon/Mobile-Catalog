package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class BillStatus extends IFXObject {

	protected BillStatus(){	
	}
	
	public final native  BillStatusCode getBillStatusCode()/*-{
		return $wnd.cleanObject(this.billStatusCode);
	}-*/;
	public final native  void setBillStatusCode(BillStatusCode billStatusCode)/*-{
		this.billStatusCode = billStatusCode;
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
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
}
