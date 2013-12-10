package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class BillSummAmt extends IFXObject {

	protected BillSummAmt(){	
	}
	
	public final native  BillSummAmtIdent getBillSummAmtIdent()/*-{
		return $wnd.cleanObject(this.billSummAmtIdent);
	}-*/;
	public final native  void setBillSummAmtIdent(BillSummAmtIdent billSummAmtIdent)/*-{
		this.billSummAmtIdent = billSummAmtIdent;
	}-*/;
	public final native  BillSummAmtCode getBillSummAmtCode()/*-{
		return $wnd.cleanObject(this.billSummAmtCode);
	}-*/;
	public final native  void setBillSummAmtCode(BillSummAmtCode billSummAmtCode)/*-{
		this.billSummAmtCode = billSummAmtCode;
	}-*/;
	public final native  ShortDesc getShortDesc()/*-{
		return $wnd.cleanObject(this.shortDesc);
	}-*/;
	public final native  void setShortDesc(ShortDesc shortDesc)/*-{
		this.shortDesc = shortDesc;
	}-*/;
	public final native  Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native  void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;
	public final native  Memo getMemo()/*-{
		return $wnd.cleanObject(this.memo);
	}-*/;
	public final native  void setMemo(Memo memo)/*-{
		this.memo = memo;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  BillSummAmtType getBillSummAmtType()/*-{
		return $wnd.cleanObject(this.billSummAmtType);
	}-*/;
	public final native  void setBillSummAmtType(BillSummAmtType billSummAmtType)/*-{
		this.billSummAmtType = billSummAmtType;
	}-*/;
	public final native  JsArray<BillSummSubAmt> getBillSummSubAmt()/*-{
		return $wnd.cleanObject(this.billSummSubAmt);
	}-*/;
	public final native  void setBillSummSubAmt(JsArray<BillSummSubAmt> billSummSubAmt)/*-{
		this.billSummSubAmt = billSummSubAmt;
	}-*/;
}
