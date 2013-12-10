package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PmtSummAmt extends IFXObject {
	protected PmtSummAmt(){	
	}
	public final native BillSummAmtIdent getBillSummAmtIdent() /*-{
		return $wnd.cleanObject(billSummAmtIdent);
	}-*/;
	public final native void setBillSummAmtIdent(BillSummAmtIdent billSummAmtIdent) /*-{
		this.billSummAmtIdent = billSummAmtIdent;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;
	public final native JsArray<EquivCurAmt> getEquivCurAmt() /*-{
		return $wnd.cleanObject(equivCurAmt);
	}-*/;
	public final native void setEquivCurAmt(JsArray<EquivCurAmt> equivCurAmt) /*-{
		this.equivCurAmt = equivCurAmt;
	}-*/;
}
