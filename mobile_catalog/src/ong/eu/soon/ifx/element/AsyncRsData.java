package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class AsyncRsData extends IFXObject {
	AsyncRqUID asyncRqUID;//UUID	Required Asynchronous Request Identifier. This is the request identifier of the message which is asynchronously processed.
	AvailDt AvailDt;//DateTime	Optional Available DateTime. The projected time at which the response will be available.
	ExpDt expDt;//DateTime	Optional Expiration DateTime. The time at which the cached response will be purged at the server.
	public AsyncRqUID getAsyncRqUID() {
		return asyncRqUID;
	}
	public void setAsyncRqUID(AsyncRqUID asyncRqUID) {
		this.asyncRqUID = asyncRqUID;
	}
	public AvailDt getAvailDt() {
		return AvailDt;
	}
	public void setAvailDt(AvailDt availDt) {
		AvailDt = availDt;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}
}
