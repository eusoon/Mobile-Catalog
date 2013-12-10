package ong.eu.soon.mobile.json.ifx.element;

public class SvcProviderKeys extends BaseKeys {
	protected SvcProviderKeys(){	
	}
	public final native SvcProviderId getSvcProviderId() /*-{
		return $wnd.cleanObject(svcProviderId);
	}-*/;
	public final native void setSvcProviderId(SvcProviderId svcProviderId) /*-{
		this.svcProviderId = svcProviderId;
	}-*/;
	public final native SvcProviderName getSvcProviderName() /*-{
		return $wnd.cleanObject(svcProviderName);
	}-*/;
	public final native void setSvcProviderName(SvcProviderName svcProviderName) /*-{
		this.svcProviderName = svcProviderName;
	}-*/;
}
