package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CurCode extends IFXObject {
	CurCodeType curCodeType;
	CurCodeValue curCodeValue;
	public CurCodeType getCurCodeType() {
		return curCodeType;
	}
	public void setCurCodeType(CurCodeType curCodeType) {
		this.curCodeType = curCodeType;
	}
	public CurCodeValue getCurCodeValue() {
		return curCodeValue;
	}
	public void setCurCodeValue(CurCodeValue curCodeValue) {
		this.curCodeValue = curCodeValue;
	}

}