package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SvcProviderSel extends IFXObject {
	SvcProviderKeys svcProviderKeys;//Aggregate	Required Service Provider Keys Aggregate

	public SvcProviderKeys getSvcProviderKeys() {
		return svcProviderKeys;
	}

	public void setSvcProviderKeys(SvcProviderKeys svcProviderKeys) {
		this.svcProviderKeys = svcProviderKeys;
	}

}
