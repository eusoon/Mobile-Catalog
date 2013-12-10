package ong.eu.soon.ifx.element;

public class SvcProviderKeys extends BaseKeys {
	SvcProviderId svcProviderId;//Identifier	Required Service Provider Identifier
	SvcProviderName svcProviderName;//URL	Required The Service Provider Name element is a globally unique identifier for a service provider.
	public SvcProviderId getSvcProviderId() {
		return svcProviderId;
	}
	public void setSvcProviderId(SvcProviderId svcProviderId) {
		this.svcProviderId = svcProviderId;
	}
	public SvcProviderName getSvcProviderName() {
		return svcProviderName;
	}
	public void setSvcProviderName(SvcProviderName svcProviderName) {
		this.svcProviderName = svcProviderName;
	}
}
