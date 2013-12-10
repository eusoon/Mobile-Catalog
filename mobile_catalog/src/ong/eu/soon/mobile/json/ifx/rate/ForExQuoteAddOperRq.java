package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.OperRqHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;

import com.google.gwt.core.client.JsArray;


public class ForExQuoteAddOperRq extends IFXObject {
	protected ForExQuoteAddOperRq(){	
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
	public final native JsArray<ForExQuoteAddRq> getForExQuoteAddRq() /*-{
		return $wnd.cleanObject(this.forExQuoteAddRq);
	}-*/;
	public final native void setForExQuoteAddRq(JsArray<ForExQuoteAddRq> forExQuoteAddRq) /*-{
		this.forExQuoteAddRq = forExQuoteAddRq;
	}-*/;

}