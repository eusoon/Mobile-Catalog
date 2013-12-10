package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CurCode extends IFXObject {

	protected CurCode(){	
	}
	
	public final native  CurCodeType getCurCodeType()/*-{
		return $wnd.cleanObject(this.curCodeType);
	}-*/;
	public final native  void setCurCodeType(CurCodeType curCodeType)/*-{
		this.curCodeType = curCodeType;
	}-*/;
	public final native  CurCodeValue getCurCodeValue()/*-{
		return $wnd.cleanObject(this.curCodeValue);
	}-*/;
	public final native  void setCurCodeValue(CurCodeValue curCodeValue)/*-{
		this.curCodeValue = curCodeValue;
	}-*/;
}
