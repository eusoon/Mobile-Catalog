package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class InvoiceLineItem extends IFXObject {
	protected InvoiceLineItem(){	
	}
	
	public final native  InvoiceLineItemNum getInvoiceLineItemNum()/*-{
		return $wnd.cleanObject(this.invoiceLineItemNum);
	}-*/;
	public final native  void setInvoiceLineItemNum(InvoiceLineItemNum invoiceLineItemNum)/*-{
		this.invoiceLineItemNum = invoiceLineItemNum;
	}-*/;
	public final native  AdjType getAdjType()/*-{
		return $wnd.cleanObject(this.adjType);
	}-*/;
	public final native  void setAdjType(AdjType adjType)/*-{
		this.adjType = adjType;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native  void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;	
}