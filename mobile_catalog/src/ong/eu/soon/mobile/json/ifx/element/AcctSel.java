package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class AcctSel extends IFXObject {

	protected AcctSel(){	
	}
	
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;

	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
}
