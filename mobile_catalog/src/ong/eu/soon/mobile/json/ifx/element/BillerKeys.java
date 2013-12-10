package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class BillerKeys extends IFXObject {

	protected BillerKeys(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  JsArray<BillerId> getBillerId()/*-{
		return $wnd.cleanObject(this.billerId);
	}-*/;
	public final native  void setBillerId(JsArray<BillerId> billerId)/*-{
		this.billerId = billerId;
	}-*/;
}
