package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class BillRef extends IFXObject {

	protected BillRef(){	
	}
	
	public final native  BillKeys getBillKeys()/*-{
		return $wnd.cleanObject(this.billKeys);
	}-*/;
	public final native  void setBillKeys(BillKeys billKeys)/*-{
		this.billKeys = billKeys;
	}-*/;
	public final native  BillRec getBillRec()/*-{
		return $wnd.cleanObject(this.billRec);
	}-*/;
	public final native  void setBillRec(BillRec billRec)/*-{
		this.billRec = billRec;
	}-*/;
	public final native  BillInfo getBillInfo()/*-{
		return $wnd.cleanObject(this.billInfo);
	}-*/;
	public final native  void setBillInfo(BillInfo billInfo)/*-{
		this.billInfo = billInfo;
	}-*/;
}
