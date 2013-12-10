package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public  class Discount extends IFXObject {

	protected Discount(){
	}
	
	public final native  JsArray<Rate> getRate()/*-{
		return $wnd.cleanObject(this.rate);
	}-*/;
	public final native  void setRate(JsArray<Rate> rate)/*-{
		this.rate = rate;
	}-*/;
	public final native  JsArray<CurAmt> getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(JsArray<CurAmt> curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  EffDt getEffDt()/*-{
		return $wnd.cleanObject(this.effDt);
	}-*/;
	public final native  void setEffDt(EffDt effDt)/*-{
		this.effDt = effDt;
	}-*/;
	public final native  Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native  void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;
}
