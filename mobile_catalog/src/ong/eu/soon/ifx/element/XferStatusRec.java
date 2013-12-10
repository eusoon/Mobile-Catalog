package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.SvcIdent;

public class XferStatusRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	XferId xferId;//Identifier	Required Funds Transfer Identifier
	XferStatus xferStatus;//	Aggregate		Required	Funds Transfer Status Aggregate
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
	public XferStatus getXferStatus() {
		return xferStatus;
	}
	public void setXferStatus(XferStatus xferStatus) {
		this.xferStatus = xferStatus;
	}
}
