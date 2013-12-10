package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AdditionalStatus extends IFXObject {
	StatusCode statusCode; //Long	Optional Response Status Code. Valid values depend on context. See Appendix A.
	ServerStatusCode serverStatusCode;//C-20	Optional Server Status Code. The value placed here is used to allow the client to display the status code to the user. This allows the user to read the code to a customer service representative for debugging purposes.
	Severity severity;//Closed Enum	Required Severity. Valid values: Error, Warn, Info
	StatusDesc statusDesc;//C-255	Optional Status Description. Explanatory text associated with the status code. The Status Description may be default text or Service Provider specific.
	SubjectElement[] subjectElement;//Aggregate	Optional Repeating Information about the element that corresponds to the status code. The aggregate is repeating to allow for a relationship between one or more elements such that the combination causes the status code (e.g. PartyId is not authorized to perform transaction on specific AcctId).
	OverrideException overrideException;//Aggregate	Optional Message exception that may be overridden.
	public StatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}
	public ServerStatusCode getServerStatusCode() {
		return serverStatusCode;
	}
	public void setServerStatusCode(ServerStatusCode serverStatusCode) {
		this.serverStatusCode = serverStatusCode;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	public StatusDesc getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(StatusDesc statusDesc) {
		this.statusDesc = statusDesc;
	}
	public SubjectElement[] getSubjectElement() {
		return subjectElement;
	}
	public void setSubjectElement(SubjectElement[] subjectElement) {
		this.subjectElement = subjectElement;
	}
	public OverrideException getOverrideException() {
		return overrideException;
	}
	public void setOverrideException(OverrideException overrideException) {
		this.overrideException = overrideException;
	}

}
