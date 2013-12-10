package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;


public class AcctRef extends IFXObject {
	
	protected AcctRef(){	
	}
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native  AcctRec getAcctRec()/*-{
		return $wnd.cleanObject(this.acctRec);
	}-*/;
	public final native  void setAcctRec(AcctRec acctRec)/*-{
		this.acctRec = acctRec;
	}-*/;
	public final native  AcctInfo getAcctInfo()/*-{
		return $wnd.cleanObject(this.acctInfo);
	}-*/;
	public final native  void setAcctInfo(AcctInfo acctInfo)/*-{
		this.acctInfo = acctInfo;
	}-*/;
}
