package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class LoginIdent extends IFXObject {
	LoginAuthority loginAuthority;
	LoginName loginName;
	public LoginAuthority getLoginAuthority() {
		return loginAuthority;
	}
	public void setLoginAuthority(LoginAuthority loginAuthority) {
		this.loginAuthority = loginAuthority;
	}
	public LoginName getLoginName() {
		return loginName;
	}
	public void setLoginName(LoginName loginName) {
		this.loginName = loginName;
	}


}
