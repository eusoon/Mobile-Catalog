package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class LOCLoanData extends IFXObject {
	protected LOCLoanData(){	
	}
	
	public final native  LOCLimit getlOCLimit()/*-{
		return $wnd.cleanObject(this.lOCLimit);
	}-*/;
	public final native  void setlOCLimit(LOCLimit lOCLimit)/*-{
		this.lOCLimit = lOCLimit;
	}-*/;
	public final native  MinPmt getMinPmt()/*-{
		return $wnd.cleanObject(this.minPmt);
	}-*/;
	public final native  void setMinPmt(MinPmt minPmt)/*-{
		this.minPmt = minPmt;
	}-*/;
	public final native  ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native  void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;

}
