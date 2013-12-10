package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class InvoiceAdj extends IFXObject {

	InvoiceAdjNum invoiceAdjNum; //C-32	Optional	Adjustment Number.
	AdjType adjType; //Open Enum	Optional	Adjustment Type. This element describes the reason for the adjustment.	Defined values: Return, Damage
	CurAmt[] curAmt; //Aggregate	Required	Adjustment Currency Amount.
	EffDt effDt; //DateTime	Optional	Adjustment Date.
	Desc desc; //C-80	Optional	Adjustment Description. This is often a text representation of <AdjType>.
	
	public InvoiceAdjNum getInvoiceAdjNum() {
		return invoiceAdjNum;
	}
	public void setInvoiceAdjNum(InvoiceAdjNum invoiceAdjNum) {
		this.invoiceAdjNum = invoiceAdjNum;
	}
	public AdjType getAdjType() {
		return adjType;
	}
	public void setAdjType(AdjType adjType) {
		this.adjType = adjType;
	}
	public CurAmt[] getCurAmt() {
		return curAmt;
	}
	public void setCurAmt(CurAmt[] curAmt) {
		this.curAmt = curAmt;
	}
	public EffDt getEffDt() {
		return effDt;
	}
	public void setEffDt(EffDt effDt) {
		this.effDt = effDt;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}

}