package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class EMVRsData extends IFXObject {

	protected EMVRsData(){
	}
	
	public final native  EMVRsRawData geteMVRsRawData()/*-{
		return $wnd.cleanObject(this.eMVRsRawData);
	}-*/;
	public final native  void seteMVRsRawData(EMVRsRawData eMVRsRawData)/*-{
		this.eMVRsRawData = eMVRsRawData;
	}-*/;
	public final native  AuthRsCode getAuthRsCode()/*-{
		return $wnd.cleanObject(this.authRsCode);
	}-*/;
	public final native  void setAuthRsCode(AuthRsCode authRsCode)/*-{
		this.authRsCode = authRsCode;
	}-*/;
}
