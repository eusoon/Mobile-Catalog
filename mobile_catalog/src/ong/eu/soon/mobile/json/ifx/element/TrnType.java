package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class TrnType extends IFXObject {
	protected TrnType(){	
	}
	public final native TrnTypeValue getTrnTypeValue() /*-{
		return $wnd.cleanObject(trnTypeValue);
	}-*/;
	public final native void setTrnTypeValue(TrnTypeValue trnTypeValue) /*-{
		this.trnTypeValue = trnTypeValue;
	}-*/;
	public final native TrnTypeSource getTrnTypeSource() /*-{
		return $wnd.cleanObject(trnTypeSource);
	}-*/;
	public final native void setTrnTypeSource(TrnTypeSource trnTypeSource) /*-{
		this.trnTypeSource = trnTypeSource;
	}-*/;
}
