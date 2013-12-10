package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class DelinqAging extends IFXObject {

	protected DelinqAging(){
	}
	
	public final native  JsArray<Aging> getAging()/*-{
		return aging;
	}-*/;
	public final native  void setAging(JsArray<Aging> aging)/*-{
		this.aging = aging;
	}-*/;
	public final native  JsArray<CurAmt> getCurAmt()/*-{
		return curAmt;
	}-*/;
	public final native  void setCurAmt(JsArray<CurAmt> curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
}
