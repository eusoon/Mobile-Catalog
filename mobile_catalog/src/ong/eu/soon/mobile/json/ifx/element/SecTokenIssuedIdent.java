package ong.eu.soon.mobile.json.ifx.element;

public class SecTokenIssuedIdent extends SecToken {

	protected SecTokenIssuedIdent(){	
	}
	
	public final native IssuedIdent getIssuedIdent() /*-{
		return $wnd.cleanObject(issuedIdent);
	}-*/;

	public final native void setIssuedIdent(IssuedIdent issuedIdent) /*-{
		this.issuedIdent = issuedIdent;
	}-*/;
}