package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class AcctIdent extends IFXObject {

	protected AcctIdent(){	
	}
	
	public final native  AcctIdentType getAcctIdentType()/*-{
		return $wnd.cleanObject(this.acctIdentType);
	}-*/;
	public final native  void setAcctIdentType(AcctIdentType acctIdentType)/*-{
		this.acctIdentType = acctIdentType;
	}-*/;
	public final native  AcctIdentValue getAcctIdentValue()/*-{
		return $wnd.cleanObject(this.acctIdentValue);
	}-*/;
	public final native  void setAcctIdentValue(AcctIdentValue acctIdentValue)/*-{
		this.acctIdentValue = acctIdentValue;
	}-*/;
}
