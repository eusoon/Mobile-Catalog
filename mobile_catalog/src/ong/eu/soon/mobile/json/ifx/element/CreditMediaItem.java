package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CreditMediaItem extends IFXObject {

	protected CreditMediaItem(){	
	}
	
	public final native  CreditMediaItemIdent getCreditMediaItemIdent()/*-{
		return $wnd.cleanObject(this.CreditMediaItemIdent);
	}-*/;
	public final native  void setCreditMediaItemIdent(CreditMediaItemIdent creditMediaItemIdent)/*-{
		CreditMediaItemIdent = creditMediaItemIdent;
	}-*/;
	public final native  CreditMediaCashData getCreditMediaCashData()/*-{
		return $wnd.cleanObject(this.CreditMediaCashData);
	}-*/;
	public final native  void setCreditMediaCashData(CreditMediaCashData creditMediaCashData)/*-{
		CreditMediaCashData = creditMediaCashData;
	}-*/;
	public final native  CreditMediaChkData getCreditMediaChkData()/*-{
		return $wnd.cleanObject(this.CreditMediaChkData);
	}-*/;
	public final native  void setCreditMediaChkData(CreditMediaChkData creditMediaChkData)/*-{
		CreditMediaChkData = creditMediaChkData;
	}-*/;

}
