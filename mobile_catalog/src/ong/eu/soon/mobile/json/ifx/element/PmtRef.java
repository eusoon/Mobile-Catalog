package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtRef extends IFXObject {
	protected PmtRef(){	
	}
	public final native PmtKeys getPmtKeys() /*-{
		return $wnd.cleanObject(pmtKeys);
	}-*/;
	public final native void setPmtKeys(PmtKeys pmtKeys) /*-{
		this.pmtKeys = pmtKeys;
	}-*/;
	public final native PmtRec getPmtRec() /*-{
		return $wnd.cleanObject(pmtRec);
	}-*/;
	public final native void setPmtRec(PmtRec pmtRec) /*-{
		this.pmtRec = pmtRec;
	}-*/;
	public final native PmtInfo getPmtInfo() /*-{
		return $wnd.cleanObject(pmtInfo);
	}-*/;
	public final native void setPmtInfo(PmtInfo pmtInfo) /*-{
		this.pmtInfo = pmtInfo;
	}-*/;
}