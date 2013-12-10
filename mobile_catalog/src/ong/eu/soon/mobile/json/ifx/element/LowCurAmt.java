package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.Amt;
import ong.eu.soon.mobile.json.ifx.element.CurCode;

public class LowCurAmt extends IFXObject {
	protected LowCurAmt(){	
	}
	
	public final native  Amt getAmt()/*-{
		return $wnd.cleanObject(this.amt);
	}-*/;
	public final native  void setAmt(Amt amt)/*-{
		this.amt = amt;
	}-*/;
	public final native  CurCode getCurCode()/*-{
		return $wnd.cleanObject(this.curCode);
	}-*/;
	public final native  void setCurCode(CurCode curCode)/*-{
		this.curCode = curCode;
	}-*/;
}
