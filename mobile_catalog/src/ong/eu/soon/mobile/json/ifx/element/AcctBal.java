package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class AcctBal extends IFXObject {

	protected AcctBal(){	
	}
	
	public final native BalType getBalType()/*-{
		return $wnd.cleanObject(this.balType);
	}-*/;
	public final native void setBalType(BalType balType)/*-{
		this.balType = balType;
	}-*/;
	public final native CurAmt getCurAmt()/*-{
		return $wnd.cleanObject(this.curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt)/*-{
		this.curAmt = curAmt;
	}-*/;
	
	public final native ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;
	public final native Desc getDesc()/*-{
		return $wnd.cleanObject(this.desc);
	}-*/;
	public final native void setDesc(Desc desc)/*-{
		this.desc = desc;
	}-*/;
}
