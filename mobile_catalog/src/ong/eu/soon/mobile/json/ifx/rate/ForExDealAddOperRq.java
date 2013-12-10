package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.OperRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;


public class ForExDealAddOperRq extends IFXObject {
	protected ForExDealAddOperRq(){	
	}
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native OperRqHdr getOperRqHdr() /*-{
		return $wnd.cleanObject(this.operRqHdr);
	}-*/;
	public final native void setOperRqHdr(OperRqHdr operRqHdr) /*-{
		this.operRqHdr = operRqHdr;
	}-*/;
	public final native JsArray<ForExDealAddRq> getForExDealAddRq() /*-{
		return $wnd.cleanObject(this.forExDealAddRq);
	}-*/;
	public final native void setForExDealAddRq(JsArray<ForExDealAddRq> forExDealAddRq) /*-{
		this.forExDealAddRq = forExDealAddRq;
	}-*/;
}