package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcSel extends IFXObject {
	SvcKeys svcKeys;//Aggregate	Required Service Keys Aggregate

	public SvcKeys getSvcKeys() {
		return svcKeys;
	}

	public void setSvcKeys(SvcKeys svcKeys) {
		this.svcKeys = svcKeys;
	}
}
