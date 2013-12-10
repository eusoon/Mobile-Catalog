package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CreditStmtData extends IFXObject {
 
	protected CreditStmtData(){	
	}

	public final native  ExtAcctBal getExtAcctBal()/*-{
		return $wnd.cleanObject(this.extAcctBal);
	}-*/;
	public final native  void setExtAcctBal(ExtAcctBal extAcctBal)/*-{
		this.extAcctBal = extAcctBal;
	}-*/;
	public final native  DueDt getDueDt()/*-{
		return $wnd.cleanObject(this.dueDt);
	}-*/;
	public final native  void setDueDt(DueDt dueDt)/*-{
		this.dueDt = dueDt;
	}-*/;
	public final native  MinAmtDue getMinAmtDue()/*-{
		return $wnd.cleanObject(this.minAmtDue);
	}-*/;
	public final native  void setMinAmtDue(MinAmtDue minAmtDue)/*-{
		this.minAmtDue = minAmtDue;
	}-*/;
	public final native  DelinqAging getDelinqAging()/*-{
		return $wnd.cleanObject(this.delinqAging);
	}-*/;
	public final native  void setDelinqAging(DelinqAging delinqAging)/*-{
		this.delinqAging = delinqAging;
	}-*/;
}