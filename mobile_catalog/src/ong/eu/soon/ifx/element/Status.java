package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;


public class Status extends IFXObject {
	StatusCode statusCode;//Long	Required Response Status Code. Valid values depend on context. See Response Code List for a complete list of Response Status Codes.
	ServerStatusCode serverStatusCode;//C-20	Optional Server Status Code. The value placed here is used to allow the client to display the status code to the user. This allows the user to read the code to a customer service representative for debugging purposes.
	Severity Severity;//Closed Enum	Required Severity.Valid values: Error, Warn, Info
	StatusDesc statusDesc;//C-255	Optional Status Description. Explanatory text associated with the status code. The Status Description may be default text or Service Provider specific.
	SubjectElement[] subjectElement;//Aggregate	Optional Repeating Information about the element that corresponds to the status code. The aggregate is repeating to allow for a relationship between one or more elements such that the combination causes the status code (e.g. PartyId is not authorized to perform transaction on specific AcctId).
	AdditionalStatus additionalStatus;//Aggregate	Optional Repeating Additional statuses. The <StatusCode> above must contain the primary response code. This aggregate may appear once for each additional status that the server intends to provide. For example, if both an account number and a date are invalid, the <StatusCode> above may contain one of the two errors, and this aggregate may contain the other.
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
		return Severity;
	}
	public void setSeverity(Severity severity) {
		Severity = severity;
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
	public AdditionalStatus getAdditionalStatus() {
		return additionalStatus;
	}
	public void setAdditionalStatus(AdditionalStatus additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

}
