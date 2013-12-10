package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class BillSel extends IFXObject {

	protected BillSel(){	
	}
	
	public final native  BillKeys getBillKeys()/*-{
		return $wnd.cleanObject(this.billKeys);
	}-*/;

	public final native  void setBillKeys(BillKeys billKeys)/*-{
		this.billKeys = billKeys;
	}-*/;
}
