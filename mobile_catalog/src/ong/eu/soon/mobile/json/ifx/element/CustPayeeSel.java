package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class CustPayeeSel extends IFXObject {

	protected CustPayeeSel(){	
	}
	
	public final native  CustPayeeKeys getCustPayeeKeys()/*-{
		return $wnd.cleanObject(this.custPayeeKeys);
	}-*/;
	public final native  void setCustPayeeKeys(CustPayeeKeys custPayeeKeys)/*-{
		this.custPayeeKeys = custPayeeKeys;
	}-*/;
	public final native  JsArray<PayeeType> getPayeeType()/*-{
		return $wnd.cleanObject(this.payeeType);
	}-*/;
	public final native  void setPayeeType(JsArray<PayeeType> payeeType)/*-{
		this.payeeType = payeeType;
	}-*/;
}
