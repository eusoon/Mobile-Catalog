package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class OverrideException extends IFXObject {
	OvrdExceptionCode ovrdExceptionCode;//C-40	Required Identifies an exception that requires an override or acknowledgement.
	OvrdExceptionType ovrdExceptionType;//Open Enum	OptionalCategorization of the exception code.Valid values include: Limit, Policy
	OvrdExceptionSecurityLevel ovrdExceptionSecurityLevel;//C-40	Optional Repeating The minimum or valid security level with authority to override the exception.
	OvrdExceptionStatInd ovrdExceptionStatInd;//Boolean	Optional Indicates if credentials were authorized to override the exception.
	OvrdExceptionDesc ovrdExceptionDesc;//C-255	Optional Explanatory text associated with the override exception code.
	public OvrdExceptionCode getOvrdExceptionCode() {
		return ovrdExceptionCode;
	}
	public void setOvrdExceptionCode(OvrdExceptionCode ovrdExceptionCode) {
		this.ovrdExceptionCode = ovrdExceptionCode;
	}
	public OvrdExceptionType getOvrdExceptionType() {
		return ovrdExceptionType;
	}
	public void setOvrdExceptionType(OvrdExceptionType ovrdExceptionType) {
		this.ovrdExceptionType = ovrdExceptionType;
	}
	public OvrdExceptionSecurityLevel getOvrdExceptionSecurityLevel() {
		return ovrdExceptionSecurityLevel;
	}
	public void setOvrdExceptionSecurityLevel(
			OvrdExceptionSecurityLevel ovrdExceptionSecurityLevel) {
		this.ovrdExceptionSecurityLevel = ovrdExceptionSecurityLevel;
	}
	public OvrdExceptionStatInd getOvrdExceptionStatInd() {
		return ovrdExceptionStatInd;
	}
	public void setOvrdExceptionStatInd(OvrdExceptionStatInd ovrdExceptionStatInd) {
		this.ovrdExceptionStatInd = ovrdExceptionStatInd;
	}
	public OvrdExceptionDesc getOvrdExceptionDesc() {
		return ovrdExceptionDesc;
	}
	public void setOvrdExceptionDesc(OvrdExceptionDesc ovrdExceptionDesc) {
		this.ovrdExceptionDesc = ovrdExceptionDesc;
	}

}
