package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class OverrideException extends IFXObject {
	protected OverrideException(){	
	}
	public final native OvrdExceptionCode getOvrdExceptionCode() /*-{
		return $wnd.cleanObject(ovrdExceptionCode);
	}-*/;
	public final native void setOvrdExceptionCode(OvrdExceptionCode ovrdExceptionCode) /*-{
		this.ovrdExceptionCode = ovrdExceptionCode;
	}-*/;
	public final native OvrdExceptionType getOvrdExceptionType() /*-{
		return $wnd.cleanObject(ovrdExceptionType);
	}-*/;
	public final native void setOvrdExceptionType(OvrdExceptionType ovrdExceptionType) /*-{
		this.ovrdExceptionType = ovrdExceptionType;
	}-*/;
	public final native OvrdExceptionSecurityLevel getOvrdExceptionSecurityLevel() /*-{
		return $wnd.cleanObject(ovrdExceptionSecurityLevel);
	}-*/;
	public final native void setOvrdExceptionSecurityLevel(
			OvrdExceptionSecurityLevel ovrdExceptionSecurityLevel) /*-{
		this.ovrdExceptionSecurityLevel = ovrdExceptionSecurityLevel;
	}-*/;
	public final native OvrdExceptionStatInd getOvrdExceptionStatInd() /*-{
		return $wnd.cleanObject(ovrdExceptionStatInd);
	}-*/;
	public final native void setOvrdExceptionStatInd(OvrdExceptionStatInd ovrdExceptionStatInd) /*-{
		this.ovrdExceptionStatInd = ovrdExceptionStatInd;
	}-*/;
	public final native OvrdExceptionDesc getOvrdExceptionDesc() /*-{
		return $wnd.cleanObject(ovrdExceptionDesc);
	}-*/;
	public final native void setOvrdExceptionDesc(OvrdExceptionDesc ovrdExceptionDesc) /*-{
		this.ovrdExceptionDesc = ovrdExceptionDesc;
	}-*/;

}