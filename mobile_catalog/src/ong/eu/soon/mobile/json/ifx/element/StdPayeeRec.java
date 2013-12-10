package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class StdPayeeRec extends IFXObject {
	protected StdPayeeRec(){	
	}
	public final native SvcIdent getSvcIdent() /*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native void setSvcIdent(SvcIdent svcIdent) /*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native StdPayeeId getStdPayeeId() /*-{
		return $wnd.cleanObject(stdPayeeId);
	}-*/;
	public final native void setStdPayeeId(StdPayeeId stdPayeeId) /*-{
		this.stdPayeeId = stdPayeeId;
	}-*/;
	public final native StdPayeeInfo getStdPayeeInfo() /*-{
		return $wnd.cleanObject(stdPayeeInfo);
	}-*/;
	public final native void setStdPayeeInfo(StdPayeeInfo stdPayeeInfo) /*-{
		this.stdPayeeInfo = stdPayeeInfo;
	}-*/;
	public final native StdPayeeEnvr getStdPayeeEnvr() /*-{
		return $wnd.cleanObject(stdPayeeEnvr);
	}-*/;
	public final native void setStdPayeeEnvr(StdPayeeEnvr stdPayeeEnvr) /*-{
		this.stdPayeeEnvr = stdPayeeEnvr;
	}-*/;
	public final native StdPayeeStatus getStdPayeeStatus() /*-{
		return $wnd.cleanObject(stdPayeeStatus);
	}-*/;
	public final native void setStdPayeeStatus(StdPayeeStatus stdPayeeStatus) /*-{
		this.stdPayeeStatus = stdPayeeStatus;
	}-*/;
}