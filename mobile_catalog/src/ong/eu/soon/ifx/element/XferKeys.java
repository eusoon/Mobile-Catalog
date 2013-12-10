package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class XferKeys extends IFXObject {

	SvcIdent svcIdent; //Aggregate	Optional	Service Identifier
	//begin-xor	Required
	XferId xferId; //Identifier	Required	Funds Transfer Identifier
	//end-xor
	
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public XferId getXferId() {
		return xferId;
	}
	public void setXferId(XferId xferId) {
		this.xferId = xferId;
	}	
}