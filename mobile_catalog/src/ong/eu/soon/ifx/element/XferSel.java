package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class XferSel extends IFXObject {
	XferKeys xferKeys;//Aggregate	Required Funds Transfer Keys Aggregate

	public XferKeys getXferKeys() {
		return xferKeys;
	}

	public void setXferKeys(XferKeys xferKeys) {
		this.xferKeys = xferKeys;
	}

}
