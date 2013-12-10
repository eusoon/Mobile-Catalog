package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class CreditInfo extends IFXObject {

	protected CreditInfo(){	
	}
	
	public final native  CreditType getCreditType()/*-{
		return $wnd.cleanObject(this.CreditType);
	}-*/;
	public final native  void setCreditType(CreditType creditType)/*-{
		CreditType = creditType;
	}-*/;
	public final native  CompositeCurAmt getCompositeCurAmt()/*-{
		return $wnd.cleanObject(this.compositeCurAmt);
	}-*/;
	public final native  void setCompositeCurAmt(CompositeCurAmt compositeCurAmt)/*-{
		this.compositeCurAmt = compositeCurAmt;
	}-*/;
	public final native  AcctRef getAcctRef()/*-{
		return $wnd.cleanObject(this.acctRef);
	}-*/;
	public final native  void setAcctRef(AcctRef acctRef)/*-{
		this.acctRef = acctRef;
	}-*/;
	public final native  AthKeys getAthKeys()/*-{
		return $wnd.cleanObject(this.AthKeys);
	}-*/;
	public final native  void setAthKeys(AthKeys athKeys)/*-{
		AthKeys = athKeys;
	}-*/;
	public final native  CreditId getCreditId()/*-{
		return $wnd.cleanObject(this.creditId);
	}-*/;
	public final native  void setCreditId(CreditId creditId)/*-{
		this.creditId = creditId;
	}-*/;
	public final native  ClientChgCode getClientChgCode()/*-{
		return $wnd.cleanObject(this.ClientChgCode);
	}-*/;
	public final native  void setClientChgCode(ClientChgCode clientChgCode)/*-{
		ClientChgCode = clientChgCode;
	}-*/;
	public final native  JsArray<CreditMediaItem> getCreditMediaItem()/*-{
		return $wnd.cleanObject(this.CreditMediaItem);
	}-*/;
	public final native  void setCreditMediaItem(JsArray<CreditMediaItem> creditMediaItem)/*-{
		CreditMediaItem = creditMediaItem;
	}-*/;
}
