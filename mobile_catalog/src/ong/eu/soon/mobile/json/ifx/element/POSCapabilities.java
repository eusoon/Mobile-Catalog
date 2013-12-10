package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class POSCapabilities extends IFXObject {
	protected POSCapabilities(){	
	}
	public final native POSAttended getpOSAttended() /*-{
		return $wnd.cleanObject(pOSAttended);
	}-*/;
	public final native void setpOSAttended(POSAttended pOSAttended) /*-{
		this.pOSAttended = pOSAttended;
	}-*/;
	public final native JsArray<POSOperation> getpOSOperation() /*-{
		return $wnd.cleanObject(pOSOperation);
	}-*/;
	public final native void setpOSOperation(JsArray<POSOperation> pOSOperation) /*-{
		this.pOSOperation = pOSOperation;
	}-*/;
	public final native JsArray<POSEntryCapability> getpOSEntryCapability() /*-{
		return $wnd.cleanObject(pOSEntryCapability);
	}-*/;
	public final native void setpOSEntryCapability(JsArray<POSEntryCapability> pOSEntryCapability) /*-{
		this.pOSEntryCapability = pOSEntryCapability;
	}-*/;
	public final native POSCaptureCapability getpOSCaptureCapability() /*-{
		return $wnd.cleanObject(pOSCaptureCapability);
	}-*/;
	public final native void setpOSCaptureCapability(POSCaptureCapability pOSCaptureCapability) /*-{
		this.pOSCaptureCapability = pOSCaptureCapability;
	}-*/;
	public final native JsArray<POSVerifyCapability> getpOSVerifyCapability() /*-{
		return $wnd.cleanObject(pOSVerifyCapability);
	}-*/;
	public final native void setpOSVerifyCapability(JsArray<POSVerifyCapability> pOSVerifyCapability) /*-{
		this.pOSVerifyCapability = pOSVerifyCapability;
	}-*/;
	public final native JsArray<POSOutCapabilities> getpOSOutCapabilities() /*-{
		return $wnd.cleanObject(pOSOutCapabilities);
	}-*/;
	public final native void setpOSOutCapabilities(JsArray<POSOutCapabilities> pOSOutCapabilities) /*-{
		this.pOSOutCapabilities = pOSOutCapabilities;
	}-*/;
	
	
}
