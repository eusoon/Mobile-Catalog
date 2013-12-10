package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class Term extends IFXObject {
	protected Term(){	
	}
	public final native Count getCount() /*-{
		return $wnd.cleanObject(count);
	}-*/;
	public final native void setCount(Count count) /*-{
		this.count = count;
	}-*/;
	public final native TermUnits getTermUnits() /*-{
		return $wnd.cleanObject(termUnits);
	}-*/;
	public final native void setTermUnits(TermUnits termUnits) /*-{
		this.termUnits = termUnits;
	}-*/;
	public final native Desc getDesc() /*-{
		return $wnd.cleanObject(desc);
	}-*/;
	public final native void setDesc(Desc desc) /*-{
		this.desc = desc;
	}-*/;
}
