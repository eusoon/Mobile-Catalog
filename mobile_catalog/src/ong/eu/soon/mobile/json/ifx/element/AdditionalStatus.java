package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class AdditionalStatus extends IFXObject {
	
	protected AdditionalStatus() {
	}
	
	public final native  StatusCode getStatusCode()/*-{
		return $wnd.cleanObject(statusCode);
	}-*/;
	public final native  void setStatusCode(StatusCode statusCode)/*-{
		this.statusCode = statusCode;
	}-*/;
	public final native  ServerStatusCode getServerStatusCode()/*-{
		return $wnd.cleanObject(serverStatusCode);
	}-*/;
	public final native  void setServerStatusCode(ServerStatusCode serverStatusCode)/*-{
		this.serverStatusCode = serverStatusCode;
	}-*/;
	public final native  Severity getSeverity()/*-{
		return $wnd.cleanObject(severity);
	}-*/;
	public final native  void setSeverity(Severity severity)/*-{
		this.severity = severity;
	}-*/;
	public final native  StatusDesc getStatusDesc()/*-{
		return $wnd.cleanObject(statusDesc);
	}-*/;
	public final native  void setStatusDesc(StatusDesc statusDesc)/*-{
		this.statusDesc = statusDesc;
	}-*/;
	public final native  JsArray<SubjectElement> getSubjectElement()/*-{
		return $wnd.cleanObject(subjectElement);
	}-*/;
	public final native  void setSubjectElement(JsArray<SubjectElement> subjectElement)/*-{
		this.subjectElement = subjectElement;
	}-*/;
	public final native  OverrideException getOverrideException()/*-{
		return $wnd.cleanObject(overrideException);
	}-*/;
	public final native  void setOverrideException(OverrideException overrideException)/*-{
		this.overrideException = overrideException;
	}-*/;

}
