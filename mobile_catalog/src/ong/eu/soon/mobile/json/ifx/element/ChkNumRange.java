package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class ChkNumRange extends IFXObject {

	protected ChkNumRange(){
	}
	
	public final native ChkNumStart getChkNumStart()/*-{
		return $wnd.cleanObject(this.chkNumStart);
	}-*/;
	public final native  void setChkNumStart(ChkNumStart chkNumStart)/*-{
		this.chkNumStart = chkNumStart;
	}-*/;
	public final native  ChkNumEnd getChkNumEnd()/*-{
		return $wnd.cleanObject(this.chkNumEnd);
	}-*/;
	public final native  void setChkNumEnd(ChkNumEnd chkNumEnd)/*-{
		this.chkNumEnd = chkNumEnd;
	}-*/;

}
