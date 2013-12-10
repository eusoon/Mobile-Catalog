package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class BillSummSubAmt extends IFXObject {

	protected BillSummSubAmt(){	
	}
	
	public final native  BillSummAmtIdent getBillSummAmtIdent()/*-{
		return $wnd.cleanObject(this.billSummAmtIdent);
	}-*/;
	public final native  void setBillSummAmtIdent(BillSummAmtIdent billSummAmtIdent)/*-{
		this.billSummAmtIdent = billSummAmtIdent;
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
	public final native  AllocateAllowed getAllocateAllowed()/*-{
		return $wnd.cleanObject(this.allocateAllowed);
	}-*/;
	public final native  void setAllocateAllowed(AllocateAllowed allocateAllowed)/*-{
		this.allocateAllowed = allocateAllowed;
	}-*/;	
}
