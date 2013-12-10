package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PaidCurAmt extends IFXObject {
	protected PaidCurAmt(){	
	}
	public final native Amt getAmt() /*-{
		return $wnd.cleanObject(amt);
	}-*/;
	public final native void setAmt(Amt amt) /*-{
		this.amt = amt;
	}-*/;
	public final native CurCode getCurCode() /*-{
		return $wnd.cleanObject(curCode);
	}-*/;
	public final native void setCurCode(CurCode curCode) /*-{
		this.curCode = curCode;
	}-*/;
}