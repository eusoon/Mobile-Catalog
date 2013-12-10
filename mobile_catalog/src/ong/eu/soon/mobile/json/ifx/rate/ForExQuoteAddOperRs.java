package ong.eu.soon.mobile.json.ifx.rate;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.OperRsHdr;
import ong.eu.soon.mobile.json.ifx.element.RqUID;
import ong.eu.soon.mobile.json.ifx.element.Status;

import com.google.gwt.core.client.JsArray;


public class ForExQuoteAddOperRs extends IFXObject{
	protected ForExQuoteAddOperRs(){	
	}
	public final native Status getStatus() /*-{
		return $wnd.cleanObject(this.status);
	}-*/;
	public final native void setStatus(Status status) /*-{
		this.status = status;
	}-*/;
	public final native RqUID getRqUID() /*-{
		return $wnd.cleanObject(this.rqUID);
	}-*/;
	public final native void setRqUID(RqUID rqUID) /*-{
		this.rqUID = rqUID;
	}-*/;
	public final native OperRsHdr getOperRsHdr() /*-{
		return $wnd.cleanObject(this.operRsHdr);
	}-*/;
	public final native void setOperRsHdr(OperRsHdr operRsHdr) /*-{
		this.operRsHdr = operRsHdr;
	}-*/;
	public final native JsArray<ForExQuoteAddRs> getForExQuoteAddRs() /*-{
		return $wnd.cleanObject(this.forExQuoteAddRs);
	}-*/;
	public final native void setForExQuoteAddRs(JsArray<ForExQuoteAddRs> forExQuoteAddRs) /*-{
		this.forExQuoteAddRs = forExQuoteAddRs;
	}-*/;

}