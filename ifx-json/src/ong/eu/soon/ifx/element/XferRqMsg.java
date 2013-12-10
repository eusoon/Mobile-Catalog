package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.transfer.XferAddRq;
import ong.eu.soon.ifx.transfer.XferAdviseRq;
import ong.eu.soon.ifx.transfer.XferAudRq;
import ong.eu.soon.ifx.transfer.XferCanRq;
import ong.eu.soon.ifx.transfer.XferInqRq;
import ong.eu.soon.ifx.transfer.XferModRq;
import ong.eu.soon.ifx.transfer.XferSyncRq;

public class XferRqMsg extends IFXObject {
	
//begin-xor Required
	XferAddRq xferAddRq;//Aggregate	Required Funds Transfer Add Request
	XferModRq xferModRq;//Aggregate	Required Funds Transfer Modify Request
	XferCanRq xferCanRq;//Aggregate	Required Funds Transfer Cancel Request
	XferInqRq xferInqRq;//Aggregate	Required Funds Transfer Inquiry Request
    XferAdviseRq xferAdviseRq;//Aggregate	Required Funds Transfer Advise Request
    XferAudRq xferAudRq;//Aggregate	Required Funds Transfer Audit Request
    XferSyncRq xferSyncRq;//Aggregate	Required Funds Transfer Sync Request
    XferStatusModRq xferStatusModRq;//Aggregate	Required Funds Transfer Status Modify Request
    RevRqUID revRqUID;//UUID	Required Reversal Request Unique ID
	public XferAddRq getXferAddRq() {
		return xferAddRq;
	}
	public void setXferAddRq(XferAddRq xferAddRq) {
		this.xferAddRq = xferAddRq;
	}
	public XferModRq getXferModRq() {
		return xferModRq;
	}
	public void setXferModRq(XferModRq xferModRq) {
		this.xferModRq = xferModRq;
	}
	public XferCanRq getXferCanRq() {
		return xferCanRq;
	}
	public void setXferCanRq(XferCanRq xferCanRq) {
		this.xferCanRq = xferCanRq;
	}
	public XferInqRq getXferInqRq() {
		return xferInqRq;
	}
	public void setXferInqRq(XferInqRq xferInqRq) {
		this.xferInqRq = xferInqRq;
	}
	public XferAdviseRq getXferAdviseRq() {
		return xferAdviseRq;
	}
	public void setXferAdviseRq(XferAdviseRq xferAdviseRq) {
		this.xferAdviseRq = xferAdviseRq;
	}
	public XferAudRq getXferAudRq() {
		return xferAudRq;
	}
	public void setXferAudRq(XferAudRq xferAudRq) {
		this.xferAudRq = xferAudRq;
	}
	public XferSyncRq getXferSyncRq() {
		return xferSyncRq;
	}
	public void setXferSyncRq(XferSyncRq xferSyncRq) {
		this.xferSyncRq = xferSyncRq;
	}
	public XferStatusModRq getXferStatusModRq() {
		return xferStatusModRq;
	}
	public void setXferStatusModRq(XferStatusModRq xferStatusModRq) {
		this.xferStatusModRq = xferStatusModRq;
	}
	public RevRqUID getRevRqUID() {
		return revRqUID;
	}
	public void setRevRqUID(RevRqUID revRqUID) {
		this.revRqUID = revRqUID;
	}
}