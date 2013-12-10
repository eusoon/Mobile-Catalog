package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CardPrefTrn extends IFXObject {

	protected CardPrefTrn(){
	}
	
	public final native  TrnType getTrnType()/*-{
		return $wnd.cleanObject(this.trnType);
	}-*/;
	public final native  void setTrnType(TrnType trnType)/*-{
		this.trnType = trnType;
	}-*/;
	public final native  AcctId getAcctId()/*-{
		return $wnd.cleanObject(this.acctId);
	}-*/;
	public final native  void setAcctId(AcctId acctId)/*-{
		this.acctId = acctId;
	}-*/;
	public final native  CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  PrintReceipt getPrintReceipt()/*-{
		return $wnd.cleanObject(this.printReceipt);
	}-*/;
	public final native  void setPrintReceipt(PrintReceipt printReceipt)/*-{
		this.printReceipt = printReceipt;
	}-*/;
}
