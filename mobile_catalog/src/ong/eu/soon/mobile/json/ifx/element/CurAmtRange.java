package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CurAmtRange extends IFXObject {

	protected CurAmtRange(){	
	}
	
	public final native  LowCurAmt getLowCurAmt()/*-{
		return $wnd.cleanObject(this.lowCurAmt);
	}-*/;
	public final native  void setLowCurAmt(LowCurAmt lowCurAmt)/*-{
		this.lowCurAmt = lowCurAmt;
	}-*/;
	public final native  HighCurAmt getHighCurAmt()/*-{
		return $wnd.cleanObject(this.highCurAmt);
	}-*/;
	public final native  void setHighCurAmt(HighCurAmt highCurAmt)/*-{
		this.highCurAmt = highCurAmt;
	}-*/;
}
