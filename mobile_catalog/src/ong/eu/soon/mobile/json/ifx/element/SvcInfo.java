package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class SvcInfo extends IFXObject {
	protected SvcInfo(){	
	}
	public final native SvcName getSvcName() /*-{
		return $wnd.cleanObject(SvcName);
	}-*/;
	public final native void setSvcName(SvcName svcName) /*-{
		SvcName = svcName;
	}-*/;
	public final native Version getVersion() /*-{
		return $wnd.cleanObject(Version);
	}-*/;
	public final native void setVersion(Version version) /*-{
		Version = version;
	}-*/;
	public final native PrcSched getPrcSched() /*-{
		return $wnd.cleanObject(PrcSched);
	}-*/;
	public final native void setPrcSched(PrcSched prcSched) /*-{
		PrcSched = prcSched;
	}-*/;
	public final native JsArray<MsgSupt> getMsgSupt() /*-{
		return $wnd.cleanObject(MsgSupt);
	}-*/;
	public final native void setMsgSupt(JsArray<MsgSupt> msgSupt) /*-{
		MsgSupt = msgSupt;
	}-*/;
	public final native JsArray<OperSupt> getOperSupt() /*-{
		return $wnd.cleanObject(OperSupt);
	}-*/;
	public final native void setOperSupt(JsArray<OperSupt> operSupt) /*-{
		OperSupt = operSupt;
	}-*/;
	public final native JsArray<DiscRef> getDiscRef() /*-{
		return $wnd.cleanObject(discRef);
	}-*/;
	public final native void setDiscRef(JsArray<DiscRef> discRef) /*-{
		this.discRef = discRef;
	}-*/;
	public final native SvcStatusDt getSvcStatusDt() /*-{
		return $wnd.cleanObject(svcStatusDt);
	}-*/;
	public final native void setSvcStatusDt(SvcStatusDt svcStatusDt) /*-{
		this.svcStatusDt = svcStatusDt;
	}-*/;

}
