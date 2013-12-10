package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.CurAmt;
import ong.eu.soon.mobile.json.ifx.element.Desc;
import ong.eu.soon.mobile.json.ifx.element.EffDt;
import ong.eu.soon.mobile.json.ifx.element.ExpDt;

import com.google.gwt.core.client.JsArray;


public  class ExtAcctBal extends IFXObject {

	protected ExtAcctBal(){
	}
	
	public final native  JsArray<ExtBalType> getExtBalType()/*-{
		return $wnd.cleanObject(this.extBalType);
	}-*/;
	public final native  void setExtBalType(JsArray<ExtBalType> extBalType)/*-{
		this.extBalType = extBalType;
	}-*/;
	public final native  JsArray<CurAmt> getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native  void setCurAmt(JsArray<CurAmt> curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	public final native  JsArray<EffDt> getEffDt()/*-{
		return $wnd.cleanObject(this.effDt);
	}-*/;
	public final native  void setEffDt(JsArray<EffDt> effDt)/*-{
		this.effDt = effDt;
	}-*/;
	public final native  ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native  void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;
	public final native  Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native  void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;
}
