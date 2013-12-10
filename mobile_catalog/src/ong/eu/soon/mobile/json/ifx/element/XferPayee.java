package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class XferPayee extends IFXObject {
	protected XferPayee(){	
	}
	public final native ToAcctRef getToAcctRef() /*-{
		return $wnd.cleanObject(toAcctRef);
	}-*/;

	public final native void setToAcctRef(ToAcctRef toAcctRef) /*-{
		this.toAcctRef = toAcctRef;
	}-*/;

}
