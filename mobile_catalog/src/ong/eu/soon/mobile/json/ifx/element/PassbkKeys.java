package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PassbkKeys extends IFXObject {
	protected PassbkKeys(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native PassbkId getPassbkId() /*-{
		return $wnd.cleanObject(passbkId);
	}-*/;
	public final native void setPassbkId(PassbkId passbkId) /*-{
		this.passbkId = passbkId;
	}-*/;
	public final native AcctKeys getAcctKeys() /*-{
		return $wnd.cleanObject(acctKeys);
	}-*/;
	public final native void setAcctKeys(AcctKeys acctKeys) /*-{
		this.acctKeys = acctKeys;
	}-*/;


}