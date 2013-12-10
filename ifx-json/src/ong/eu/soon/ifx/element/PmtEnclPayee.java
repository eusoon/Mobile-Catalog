package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PmtEnclPayee extends IFXObject {

	Name name; //C-40	Required	Payee Name.
	PostAddr postAddr; //Aggregate	Required	Payee Address Aggregate.
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public PostAddr getPostAddr() {
		return postAddr;
	}
	public void setPostAddr(PostAddr postAddr) {
		this.postAddr = postAddr;
	}
	
}
