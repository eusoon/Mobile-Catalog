package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;


public class SvcIdent extends IFXObject {
	SvcProviderName svcProviderName;
	SvcName svcName;
	
	public SvcProviderName getSvcProviderName() {
		return svcProviderName;
	}
	public void setSvcProviderName(SvcProviderName svcProviderName) {
		this.svcProviderName = svcProviderName;
	}
	public SvcName getSvcName() {
		return svcName;
	}
	public void setSvcName(SvcName svcName) {
		this.svcName = svcName;
	}

}
