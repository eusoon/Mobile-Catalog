package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class InvoiceLineItem extends IFXObject {

	InvoiceLineItemNum invoiceLineItemNum; //C-12	Required	Line Item Number
 	AdjType adjType; //Open Enum	Optional	Adjustment Type. This element describes the reason for the adjustment.	Defined values: Return, Damage
	CurAmt curAmt; //Aggregate	Required	Line Item Amount.
	Desc desc; //C-80	Optional	Line Item Description.
	
	public InvoiceLineItemNum getInvoiceLineItemNum() {
		return invoiceLineItemNum;
	}
	public void setInvoiceLineItemNum(InvoiceLineItemNum invoiceLineItemNum) {
		this.invoiceLineItemNum = invoiceLineItemNum;
	}
	public AdjType getAdjType() {
		return adjType;
	}
	public void setAdjType(AdjType adjType) {
		this.adjType = adjType;
	}
	public CurAmt getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt curAmt) {
		this.curAmt = curAmt;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}	
}