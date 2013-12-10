package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CreditMediaCashData extends IFXObject {
	
	protected CreditMediaCashData(){	
	}
	
	public final native  CashAmt getCashAmt()/*-{
		return $wnd.cleanObject(this.cashAmt);
	}-*/;
	public final native  void setCashAmt(CashAmt cashAmt)/*-{
		this.cashAmt = cashAmt;
	}-*/;
	public final native  CashValidity getCashValidity()/*-{
		return $wnd.cleanObject(this.CashValidity);
	}-*/;
	public final native  void setCashValidity(CashValidity cashValidity)/*-{
		CashValidity = cashValidity;
	}-*/;
	public final native  CashQuality getCashQuality()/*-{
		return $wnd.cleanObject(this.CashQuality);
	}-*/;
	public final native  void setCashQuality(CashQuality cashQuality)/*-{
		CashQuality = cashQuality;
	}-*/;
}
