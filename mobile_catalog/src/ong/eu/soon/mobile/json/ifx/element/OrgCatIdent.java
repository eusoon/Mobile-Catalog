package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class OrgCatIdent extends IFXObject {
	protected OrgCatIdent(){	
	}
	public final native OrgCatIdentSource getOrgCatIdentSource() /*-{
		return $wnd.cleanObject(orgCatIdentSource);
	}-*/;
	public final native void setOrgCatIdentSource(OrgCatIdentSource orgCatIdentSource) /*-{
		this.orgCatIdentSource = orgCatIdentSource;
	}-*/;
	public final native OrgCatIdentValue getOrgCatIdentValue() /*-{
		return $wnd.cleanObject(orgCatIdentValue);
	}-*/;
	public final native void setOrgCatIdentValue(OrgCatIdentValue orgCatIdentValue) /*-{
		this.orgCatIdentValue = orgCatIdentValue;
	}-*/;
}