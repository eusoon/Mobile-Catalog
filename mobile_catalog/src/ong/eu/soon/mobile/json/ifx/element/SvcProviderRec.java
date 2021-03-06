package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.SvcIdent;
import ong.eu.soon.mobile.json.ifx.element.SvcProviderId;
import ong.eu.soon.mobile.json.ifx.element.SvcProviderInfo;

public class SvcProviderRec extends IFXObject {
	protected SvcProviderRec(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native SvcProviderId getSvcProviderId() /*-{
		return $wnd.cleanObject(svcProviderId);
	}-*/;
	public final native void setSvcProviderId(SvcProviderId svcProviderId) /*-{
		this.svcProviderId = svcProviderId;
	}-*/;
	public final native SvcProviderInfo getSvcProviderInfo() /*-{
		return $wnd.cleanObject(svcProviderInfo);
	}-*/;
	public final native void setSvcProviderInfo(SvcProviderInfo svcProviderInfo) /*-{
		this.svcProviderInfo = svcProviderInfo;
	}-*/;
	public final native SvcProviderEnvr getSvcProviderEnvr() /*-{
		return $wnd.cleanObject(svcProviderEnvr);
	}-*/;
	public final native void setSvcProviderEnvr(SvcProviderEnvr svcProviderEnvr) /*-{
		this.svcProviderEnvr = svcProviderEnvr;
	}-*/;
	public final native SvcProviderStatus getSvcProviderStatus() /*-{
		return $wnd.cleanObject(svcProviderStatus);
	}-*/;
	public final native void setSvcProviderStatus(SvcProviderStatus svcProviderStatus) /*-{
		this.svcProviderStatus = svcProviderStatus;
	}-*/;
}
