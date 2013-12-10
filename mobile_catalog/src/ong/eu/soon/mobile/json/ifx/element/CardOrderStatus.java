package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CardOrderStatus extends IFXObject {

	protected CardOrderStatus(){
	}
	
	public final native  CardOrderStatusCode getCardOrderStatusCode()/*-{
		return $wnd.cleanObject(this.cardOrderStatusCode);
	}-*/;
	public final native  void setCardOrderStatusCode(CardOrderStatusCode cardOrderStatusCode)/*-{
		this.cardOrderStatusCode = cardOrderStatusCode;
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
