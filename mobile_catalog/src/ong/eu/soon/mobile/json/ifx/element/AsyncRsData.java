package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class AsyncRsData extends IFXObject {
	
	protected AsyncRsData(){	
	}
	
	public final native  AsyncRqUID getAsyncRqUID()/*-{
		return $wnd.cleanObject(this.asyncRqUID);
	}-*/;
	public final native  void setAsyncRqUID(AsyncRqUID asyncRqUID)/*-{
		this.asyncRqUID = asyncRqUID;
	}-*/;
	public final native  AvailDt getAvailDt()/*-{
		return $wnd.cleanObject(this.AvailDt);
	}-*/;
	public final native  void setAvailDt(AvailDt availDt)/*-{
		AvailDt = availDt;
	}-*/;
	public final native  ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native  void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;
}
