package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctInfo;
import ong.eu.soon.mobile.json.ifx.element.AcctKeys;
import ong.eu.soon.mobile.json.ifx.element.AcctRec;

public class SubAcctRef extends IFXObject {
	protected SubAcctRef(){	
	}
	public final native AcctKeys getAcctKeys() /*-{
		return $wnd.cleanObject(acctKeys);
	}-*/;
	public final native void setAcctKeys(AcctKeys acctKeys) /*-{
		this.acctKeys = acctKeys;
	}-*/;
	public final native AcctRec getAcctRec() /*-{
		return $wnd.cleanObject(acctRec);
	}-*/;
	public final native void setAcctRec(AcctRec acctRec) /*-{
		this.acctRec = acctRec;
	}-*/;
	public final native AcctInfo getAcctInfo() /*-{
		return $wnd.cleanObject(acctInfo);
	}-*/;
	public final native void setAcctInfo(AcctInfo acctInfo) /*-{
		this.acctInfo = acctInfo;
	}-*/;
}