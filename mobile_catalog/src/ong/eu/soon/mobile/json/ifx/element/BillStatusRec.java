package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class BillStatusRec extends IFXObject {

	protected BillStatusRec(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  BillId getBillId()/*-{
		return $wnd.cleanObject(this.billId);
	}-*/;
	public final native  void setBillId(BillId billId)/*-{
		this.billId = billId;
	}-*/;
	public final native  BillStatus getBillStatus()/*-{
		return $wnd.cleanObject(this.billStatus);
	}-*/;
	public final native  void setBillStatus(BillStatus billStatus)/*-{
		this.billStatus = billStatus;
	}-*/;
}
