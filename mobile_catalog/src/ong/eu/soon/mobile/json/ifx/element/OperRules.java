package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class OperRules extends IFXObject {
	protected OperRules(){	
	}
	public final native ProcessConcurrent getProcessConcurrent() /*-{
		return $wnd.cleanObject(processConcurrent);
	}-*/;
	public final native void setProcessConcurrent(ProcessConcurrent processConcurrent) /*-{
		this.processConcurrent = processConcurrent;
	}-*/;
	public final native OnWarning getOnWarning() /*-{
		return $wnd.cleanObject(onWarning);
	}-*/;
	public final native void setOnWarning(OnWarning onWarning) /*-{
		this.onWarning = onWarning;
	}-*/;
	public final native OnError getOnError() /*-{
		return $wnd.cleanObject(onError);
	}-*/;
	public final native void setOnError(OnError onError) /*-{
		this.onError = onError;
	}-*/;
}