package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.bill.BillInqRq;
import ong.eu.soon.mobile.json.ifx.bill.BillStatusModRq;
import ong.eu.soon.mobile.json.ifx.element.RevRqUID;

public class BillRqMsg extends IFXObject {

	protected BillRqMsg(){	
	}
	
	public final native  BillInqRq getBillInqRq()/*-{
		return $wnd.cleanObject(this.billInqRq);
	}-*/;
	public final native  void setBillInqRq(BillInqRq billInqRq)/*-{
		this.billInqRq = billInqRq;
	}-*/;
	public final native  BillStatusModRq getBillStatusModRq()/*-{
		return $wnd.cleanObject(this.billStatusModRq);
	}-*/;
	public final native  void setBillStatusModRq(BillStatusModRq billStatusModRq)/*-{
		this.billStatusModRq = billStatusModRq;
	}-*/;
	public final native  RevRqUID getRevRqUID()/*-{
		return $wnd.cleanObject(this.revRqUID);
	}-*/;
	public final native  void setRevRqUID(RevRqUID revRqUID)/*-{
		this.revRqUID = revRqUID;
	}-*/;

}
