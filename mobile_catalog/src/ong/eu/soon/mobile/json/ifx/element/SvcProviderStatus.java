package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class SvcProviderStatus extends IFXObject {
	protected SvcProviderStatus(){	
	}
	public final native SvcProviderStatusCode getSvcProviderStatusCode() /*-{
		return $wnd.cleanObject(svcProviderStatusCode);
	}-*/;
	public final native void setSvcProviderStatusCode(SvcProviderStatusCode svcProviderStatusCode) /*-{
		this.svcProviderStatusCode = svcProviderStatusCode;
	}-*/;
	public final native StatusDesc getStatusDesc() /*-{
		return $wnd.cleanObject(statusDesc);
	}-*/;
	public final native void setStatusDesc(StatusDesc statusDesc) /*-{
		this.statusDesc = statusDesc;
	}-*/;
	public final native EffDt getEffDt() /*-{
		return $wnd.cleanObject(effDt);
	}-*/;
	public final native void setEffDt(EffDt effDt) /*-{
		this.effDt = effDt;
	}-*/;
	public final native StatusModBy getStatusModBy() /*-{
		return $wnd.cleanObject(statusModBy);
	}-*/;
	public final native void setStatusModBy(StatusModBy statusModBy) /*-{
		this.statusModBy = statusModBy;
	}-*/;
}
