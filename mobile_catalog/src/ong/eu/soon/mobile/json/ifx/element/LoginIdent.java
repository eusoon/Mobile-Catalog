package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class LoginIdent extends IFXObject {
	protected LoginIdent(){	
	}
	
	public final native  LoginAuthority getLoginAuthority()/*-{
		return $wnd.cleanObject(this.loginAuthority);
	}-*/;
	public final native  void setLoginAuthority(LoginAuthority loginAuthority)/*-{
		this.loginAuthority = loginAuthority;
	}-*/;
	public final native  LoginName getLoginName()/*-{
		return $wnd.cleanObject(this.loginName);
	}-*/;
	public final native  void setLoginName(LoginName loginName)/*-{
		this.loginName = loginName;
	}-*/;
}
